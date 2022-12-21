package com.libienz.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Singer3Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_singer3, container, false)

        val rv = view.findViewById<RecyclerView>(R.id.Singer3Rv)
        val items : MutableList<String> = mutableListOf<String>()
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")
        items.add("진정인가요")
        items.add("내마음의 사진")
        items.add("가인이어라")


        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image2).setOnClickListener {
            findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment)
        }
        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }

        return view
    }


}