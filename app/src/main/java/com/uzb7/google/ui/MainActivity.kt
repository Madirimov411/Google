package com.uzb7.google.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.google.R
import com.uzb7.google.adapter.NewsAdapter
import com.uzb7.google.model.News

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        var rvnews=findViewById<RecyclerView>(R.id.rv_news)
        list=loadMyList()
        val newsAdapter=NewsAdapter(this,list)
        val layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvnews.adapter=newsAdapter
        rvnews.layoutManager=layoutManager
    }

    private fun loadMyList(): ArrayList<News> {
        val mylist = ArrayList<News>()
        mylist.add(
            News(
                "https://xabar.uz/static/crop/2/7/532_356_95_272800685.jpg",
                "Газ қазишга олдин берилган барча лицензиялар қайта кўриб чиқилади – Шавкат Мирзиёев",
                R.drawable.facebook,
                "Mahalliy",
                "today"
            )
        )
        mylist.add(
            News(
                "https://xabar.uz/static/crop/3/7/920__95_3799943329.jpg",
                "Ўсимлик ёғида учувчи самолёт Атлантика океанини кесиб ўтади",
                R.drawable.telegram,
                "Texnologiya",
                "today"
            )
        )
        mylist.add(
            News(
                "https://xabar.uz/static/crop/3/7/920__95_3799943329.jpg",
                "Ўсимлик ёғида учувчи самолёт Атлантика океанини кесиб ўтади",
                R.drawable.telegram,
                "Texnologiya",
                "today"
            )
        )
        return mylist
    }
}