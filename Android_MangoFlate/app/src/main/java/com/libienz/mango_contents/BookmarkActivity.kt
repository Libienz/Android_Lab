package com.libienz.mango_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class BookmarkActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth
    private val contentsModels = mutableListOf<ContentsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {

        auth = Firebase.auth

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)

        val database = Firebase.database
        val myBookmarkRef = database.getReference("bookmark_ref")

        myBookmarkRef
            .child(auth.currentUser!!.uid)
            .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    for (dataModel in snapshot.children) {
                        Log.d("datamodel",dataModel.toString())
                        contentsModels.add(dataModel.getValue(ContentsModel::class.java)!!)
                    }

                }

                override fun onCancelled(error: DatabaseError) {
                    Log.e("Bookmark","dbError") //실패할경우
                }

            })

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val rvAdapter = RVAdapter(baseContext, contentsModels)
        recyclerView.adapter = rvAdapter

        rvAdapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val intent = Intent(baseContext,ViewActivity::class.java)
                intent.putExtra("url",contentsModels[position].url)
                intent.putExtra("imgurl",contentsModels[position].ImageUrl)
                intent.putExtra("title",contentsModels[position].titleText)

                startActivity(intent)
            }
        }
        recyclerView.layoutManager  = GridLayoutManager(this,2)
    }
}