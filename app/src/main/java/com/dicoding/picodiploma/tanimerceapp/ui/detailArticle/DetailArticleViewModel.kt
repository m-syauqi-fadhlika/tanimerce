package com.dicoding.picodiploma.tanimerceapp.ui.detailArticle

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.tanimerceapp.data.ArticleEntity
import com.dicoding.picodiploma.tanimerceapp.utils.DataDummy

class DetailArticleViewModel : ViewModel() {
    private lateinit var articleId: String

    fun setSelectedArticle(articleId: String) {
        this.articleId = articleId
    }

    fun getArticle(): ArticleEntity {
        lateinit var article: ArticleEntity
        val articleEntities = DataDummy.generateArticle()
        for (articleEntity in articleEntities) {
            if (articleEntity.articleId == articleId) {
                article = articleEntity
            }
        }
        return article
    }
}