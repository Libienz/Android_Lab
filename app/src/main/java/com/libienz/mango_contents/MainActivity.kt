package com.libienz.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/HrBaIZj2EXJH",
                "https://mp-seoul-image-production-s3.mangoplate.com/411974/1157298_1602939485186_11752?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "경성초밥"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/0my2hMzHlOYD",
                "https://mp-seoul-image-production-s3.mangoplate.com/283682/1761156_1648810904086_3716?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "당도"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/L6LQdsD4NSLy",
                "https://mp-seoul-image-production-s3.mangoplate.com/419195/720385_1600098040669_16153?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "시홍쓰"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/HrBaIZj2EXJH",
                "https://mp-seoul-image-production-s3.mangoplate.com/411974/1157298_1602939485186_11752?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "경성초밥"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/0my2hMzHlOYD",
                "https://mp-seoul-image-production-s3.mangoplate.com/283682/1761156_1648810904086_3716?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "당도"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/L6LQdsD4NSLy",
                "https://mp-seoul-image-production-s3.mangoplate.com/419195/720385_1600098040669_16153?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "시홍쓰"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/HrBaIZj2EXJH",
                "https://mp-seoul-image-production-s3.mangoplate.com/411974/1157298_1602939485186_11752?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "경성초밥"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/0my2hMzHlOYD",
                "https://mp-seoul-image-production-s3.mangoplate.com/283682/1761156_1648810904086_3716?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "당도"
            )
        )
        items.add(
            ContentsModel(
                "https://www.mangoplate.com/restaurants/L6LQdsD4NSLy",
                "https://mp-seoul-image-production-s3.mangoplate.com/419195/720385_1600098040669_16153?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80"
                , "시홍쓰"
            )
        )
        val bookmarkBtn = findViewById<TextView>(R.id.bookmarkBtn)
        bookmarkBtn.setOnClickListener{
            val intent = Intent(this,BookmarkActivity::class.java)
            startActivity(intent)
        }
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, items)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(baseContext,ViewActivity::class.java)
                intent.putExtra("url",items[position].url)
                intent.putExtra("imgurl",items[position].ImageUrl)
                intent.putExtra("title",items[position].titleText)

                startActivity(intent)
            }
        }
        recyclerView.layoutManager  = GridLayoutManager(this,2)
    }
}