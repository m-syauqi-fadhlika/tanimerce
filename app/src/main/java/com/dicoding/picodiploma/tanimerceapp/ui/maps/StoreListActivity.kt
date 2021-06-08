package com.dicoding.picodiploma.tanimerceapp.ui.maps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.ui.tabArticle.ArticleAdapter
import com.dicoding.picodiploma.tanimerceapp.ui.tabArticle.ArticleViewModel
import kotlinx.android.synthetic.main.fragment_article.*

class StoreListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_list)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[StoreListViewModel::class.java]
        val storeList = viewModel.getStoreList()

        val adapter = StoreListAdapter()
        adapter.setStoreLists(storeList)

        rv_article.layoutManager = LinearLayoutManager(applicationContext)
        rv_article.setHasFixedSize(true)
        rv_article.adapter = adapter
    }
}