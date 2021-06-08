package com.dicoding.picodiploma.tanimerceapp.ui.tabList

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.picodiploma.tanimerceapp.data.ArticleEntity
import com.dicoding.picodiploma.tanimerceapp.databinding.ItemListArticleBinding
import com.dicoding.picodiploma.tanimerceapp.ui.detailArticle.DetailArticleActivity


class ListArticleAdapter : RecyclerView.Adapter<ListArticleAdapter.ListArticleViewHolder>() {
    private val listArticle = ArrayList<ArticleEntity>()

    fun setArticles(articles: List<ArticleEntity>) {
        this.listArticle.clear()
        this.listArticle.addAll(articles)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListArticleViewHolder {
        val binding = ItemListArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListArticleViewHolder, position: Int) {
        val articles = listArticle[position]
        holder.bind(articles)
    }

    override fun getItemCount(): Int = listArticle.size

    class ListArticleViewHolder(private val binding: ItemListArticleBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(articles: ArticleEntity) {
            with(binding) {
                tvTitle.text = articles.articleTitle
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailArticleActivity::class.java)
                    intent.putExtra(DetailArticleActivity.EXTRA_ARTICLE, articles.articleId)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}