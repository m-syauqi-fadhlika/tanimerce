package com.dicoding.picodiploma.tanimerceapp.ui.tabList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.picodiploma.tanimerceapp.R
import kotlinx.android.synthetic.main.fragment_list_article.*

class ListArticleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[ListArticleViewModel::class.java]
            val articles = viewModel.getArticle()

            val adapter = ListArticleAdapter()
            adapter.setArticles(articles)

            rv_list_article.layoutManager = LinearLayoutManager(context)
            rv_list_article.setHasFixedSize(true)
            rv_list_article.adapter = adapter
        }
    }
}