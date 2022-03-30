package com.libienz.bts_imageview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //화면이 클릭되었다는 것을 알아야 함
        val bts_1 = findViewById<ImageView>(R.id.BtsImage_1)
        bts_1.setOnClickListener {
            Toast.makeText(this, "1번사진 클릭 완료", Toast.LENGTH_SHORT).show()
            //화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌

            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)

        }
        val bts_2 = findViewById<ImageView>(R.id.BtsImage_2)
        bts_2.setOnClickListener {
            Toast.makeText(this,"2번 사진 클릭 완료",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Bts2Activity::class.java)
            startActivity(intent)
        }
        val bts_3 = findViewById<ImageView>(R.id.BtsImage_3)
        bts_3.setOnClickListener {
            Toast.makeText(this,"3번 사진 클릭 완료",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Bts3Activity::class.java)
            startActivity(intent)
        }
        val bts_4 = findViewById<ImageView>(R.id.BtsImage_4)
        bts_4.setOnClickListener {
            Toast.makeText(this,"4번 사진 클릭 완료",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Bts4Activity::class.java)
            startActivity(intent)
        }
        val bts_5 = findViewById<ImageView>(R.id.BtsImage_5)
        bts_5.setOnClickListener {
            Toast.makeText(this,"5번 사진 클릭 완료",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Bts5Activity::class.java)
            startActivity(intent)
        }
        val bts_6 = findViewById<ImageView>(R.id.BtsImage_6)
        bts_6.setOnClickListener {
            Toast.makeText(this,"6번 사진 클릭 완료",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Bts6Activity::class.java)
            startActivity(intent)
        }

        val bts_7 = findViewById<ImageView>(R.id.BtsImage_7)
        bts_7.setOnClickListener {
            Toast.makeText(this,"7번 사진 클릭 완료",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,Bts7Activity::class.java)
            startActivity(intent)
        }
    }
}