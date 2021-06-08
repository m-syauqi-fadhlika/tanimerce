package com.dicoding.picodiploma.tanimerceapp.ui.tabList

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.tanimerceapp.data.ArticleEntity
import com.dicoding.picodiploma.tanimerceapp.utils.DataDummy

class ListArticleViewModel: ViewModel() {
    fun getArticle(): ArrayList<ArticleEntity> = DataDummy.generateArticle()
}