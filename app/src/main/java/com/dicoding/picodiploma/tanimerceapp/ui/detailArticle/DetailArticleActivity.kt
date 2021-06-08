package com.dicoding.picodiploma.tanimerceapp.ui.detailArticle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.data.ArticleEntity
import com.dicoding.picodiploma.tanimerceapp.ui.tabArticle.ArticleViewModel
import kotlinx.android.synthetic.main.activity_detail_article.*
import kotlinx.android.synthetic.main.item_article.*
import kotlinx.android.synthetic.main.item_article.tv_title

class DetailArticleActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ARTICLE = "extra_article"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_article)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) //tombol back yang di kiri atas

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailArticleViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val articleId = extras.getString(EXTRA_ARTICLE)
            if (articleId != null) {
                viewModel.setSelectedArticle(articleId)
                populateArticle(viewModel.getArticle())
            }
        }
    }

    private fun populateArticle(articleEntity: ArticleEntity) {
        Glide.with(this)
            .load(articleEntity.articleImgSrc)
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(img_poster)
        tv_title.text = articleEntity.articleTitle
        tv_source.text = articleEntity.articleSource
        tv_duration.text = articleEntity.articleDuration
        tv_content.text = articleEntity.articleContent
    }
}