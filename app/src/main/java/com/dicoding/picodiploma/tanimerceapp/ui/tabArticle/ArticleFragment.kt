package com.dicoding.picodiploma.tanimerceapp.ui.tabArticle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.picodiploma.tanimerceapp.R
import kotlinx.android.synthetic.main.fragment_article.*

class AritcleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[ArticleViewModel::class.java]
            val articles = viewModel.getArticle()

            val adapter = ArticleAdapter()
            adapter.setArticles(articles)

            rv_article.layoutManager = LinearLayoutManager(context)
            rv_article.setHasFixedSize(true)
            rv_article.adapter = adapter
        }
    }
}
