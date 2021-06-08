package com.dicoding.picodiploma.tanimerceapp.ui.tabArticle

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.tanimerceapp.data.ArticleEntity
import com.dicoding.picodiploma.tanimerceapp.utils.DataDummy


class ArticleViewModel: ViewModel() {
    fun getArticle(): ArrayList<ArticleEntity> = DataDummy.generateArticle()
}