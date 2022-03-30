package com.libienz.bts_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bts_1 = findViewById<ImageView>(R.id.BtsImage_1)
        bts_1.setOnClickListener {
            Toast.makeText(this, "1번사진 클릭 완료", Toast.LENGTH_SHORT).show()
        }
    }
}