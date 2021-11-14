package com.merholg.difficultapp

import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class StateViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bind(state: State) {
        val pennantImageView: ImageView = itemView.findViewById(R.id.pennant)
        val regionTextView: TextView = itemView.findViewById(R.id.region)
        val capitalTextView: TextView = itemView.findViewById(R.id.capital)

        capitalTextView.text = state.capital
        regionTextView.text = state.region
    //    pennantImageView.setImageResource(R.drawable.ic_launcher_foreground)

        capitalTextView.setOnClickListener{
            val toast = Toast.makeText(itemView.context, "${state.population} чел.", Toast.LENGTH_SHORT)
            val location = IntArray(2)
            capitalTextView.getLocationOnScreen(location)
            toast.setGravity(Gravity.TOP,0,location[1])
            toast.show()
        }

    }
}