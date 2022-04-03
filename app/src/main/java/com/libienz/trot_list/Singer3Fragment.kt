package com.libienz.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


class Singer3Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_singer3, container, false)

        view.findViewById<ImageView>(R.id.image2).setOnClickListener {
            findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment)
        }
        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }

        return view
    }


}