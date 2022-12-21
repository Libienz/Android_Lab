package com.libienz.twice_imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class InsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)

        val getData = intent.getStringExtra("data") //어떤 거 눌렀는지
        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        //val src = "@drawable/member_" + getData 요런식의 코딩은 안되나..
        if (getData == "1") {
            memberImage.setImageResource(R.drawable.member_1)
        }
        else if (getData == "2") {
            memberImage.setImageResource(R.drawable.member_2)
        }
        else if (getData == "3") {
            memberImage.setImageResource(R.drawable.member_3)
        }
        else if (getData == "4") {
            memberImage.setImageResource(R.drawable.member_4)
        }
        else if (getData == "5") {
            memberImage.setImageResource(R.drawable.member_5)
        }
        else if (getData == "6") {
            memberImage.setImageResource(R.drawable.member_6)
        }
        else if (getData == "7") {
            memberImage.setImageResource(R.drawable.member_2)
        }
        else if (getData == "8") {
            memberImage.setImageResource(R.drawable.member_8)
        }
        else if (getData == "9") {
            memberImage.setImageResource(R.drawable.member_9)
        }


        //Toast.makeText(this,getData,Toast.LENGTH_SHORT).show()
    }
}