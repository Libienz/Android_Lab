package com.libienz.mango_contents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class ViewActivity : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)


        val webView = findViewById<WebView>(R.id.webView)
        val url = intent.getStringExtra("url").toString()
        val imgurl = intent.getStringExtra("imgurl").toString()
        val title = intent.getStringExtra("title").toString()
        val content = ContentsModel(url,imgurl,title)

        webView.loadUrl(url)

        val database = Firebase.database
        val myBookmarkRef = database.getReference("bookmark_ref") //저장 경로 말하고 있는 거임

        val saveBtn = findViewById<Button>(R.id.saveBtn)
        saveBtn.setOnClickListener {
            myBookmarkRef
            .child(auth.currentUser!!.uid)
                .push()
            .setValue(content)
        }
    }

}