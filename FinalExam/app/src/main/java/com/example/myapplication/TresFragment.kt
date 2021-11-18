package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView

class TresFragment : Fragment() {

    // early initialization of the bottom navigation bar
    //private lateinit var tresImageView: ImageView
    //private lateinit var tresInfoTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tres, container, false)
        // only from view called findViewById in Fragments
        //tresImageView = view.findViewById(R.id.tres_image_view)
        //tresInfoTextView = view.findViewById(R.id.tres_info_text_view)

        //tresImageView.setImageResource(R.drawable.sauvons)
        return view
    }
}