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


class Singer2Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        val rv = view.findViewById<RecyclerView>(R.id.Singer2Rv)
        val items = mutableListOf<String>()
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")
        items.add("사랑은 늘 도망가")
        items.add("별빛 같은 사랑")

        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)
        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            findNavController().navigate(R.id.action_singer2Fragment2_to_singer1Fragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            findNavController().navigate(R.id.action_singer2Fragment2_to_singer3Fragment)
        }



        return view
    }

}