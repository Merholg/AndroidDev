package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UnoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_uno, container, false)
       val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
       recyclerView.layoutManager = LinearLayoutManager(context)
       recyclerView.adapter = StateRecyclerAdapter(StateSingleton.stateList)

       return view
    }
 }