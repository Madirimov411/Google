package com.uzb7.google.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uzb7.google.R
import com.uzb7.google.model.News

class NewsAdapter(val context: Context, val list: ArrayList<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = list[position]
        holder.apply {
            tvtitle.text = news.title
            tvname.text = news.name
            tvtime.text = news.time
            ivprofil.setImageResource(news.icon)
            Glide.with(context).load(news.imgUrl).into(ivnews)
            ivmore.setOnClickListener {
                Toast.makeText(context, "$position bosildi", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount() = list.size


    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivnews = view.findViewById<ImageView>(R.id.iv_newsimage)
        val tvtitle = view.findViewById<TextView>(R.id.tv_title)
        val tvname = view.findViewById<TextView>(R.id.tv_name)
        val tvtime = view.findViewById<TextView>(R.id.tv_when_whom)
        val ivprofil = view.findViewById<ImageView>(R.id.iv_profil)
        val ivmore = view.findViewById<ImageView>(R.id.iv_more)
        val ivshare = view.findViewById<ImageView>(R.id.iv_share)
    }
}