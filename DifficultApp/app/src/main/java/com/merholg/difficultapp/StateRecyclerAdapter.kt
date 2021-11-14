package com.merholg.difficultapp

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StateRecyclerAdapter(private val stateList: List<State>) :
    RecyclerView.Adapter<StateViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateViewHolder {
        val stateListItemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return StateViewHolder(stateListItemView)
    }

    override fun onBindViewHolder(holder: StateViewHolder, position: Int) {
        val state = stateList.elementAt(position)

        holder.bind(state)
    }

    override fun getItemCount(): Int {
        return stateList.size
    }

}