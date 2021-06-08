package com.dicoding.picodiploma.tanimerceapp.ui.tabArticle

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.tanimerceapp.R
import com.dicoding.picodiploma.tanimerceapp.data.ArticleEntity
import com.dicoding.picodiploma.tanimerceapp.databinding.ItemArticleBinding
import com.dicoding.picodiploma.tanimerceapp.ui.detailArticle.DetailArticleActivity

class ArticleAdapter : RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder>() {
    private val listArticle = ArrayList<ArticleEntity>()

    fun setArticles(articles: List<ArticleEntity>) {
        this.listArticle.clear()
        this.listArticle.addAll(articles)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = ItemArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val articles = listArticle[position]
        holder.bind(articles)
    }

    override fun getItemCount(): Int = listArticle.size

    class ArticleViewHolder(private val binding: ItemArticleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(articles: ArticleEntity) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(articles.articleImgSrc)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgArticle)
                tvTitle.text = articles.articleTitle
                tvDescription.text = articles.articleDescription

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailArticleActivity::class.java)
                    intent.putExtra(DetailArticleActivity.EXTRA_ARTICLE, articles.articleId)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}