package com.libienz.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


class Singer2Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            findNavController().navigate(R.id.action_singer2Fragment2_to_singer1Fragment)
        }
        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            findNavController().navigate(R.id.action_singer2Fragment2_to_singer3Fragment)
        }

        return view
    }

}