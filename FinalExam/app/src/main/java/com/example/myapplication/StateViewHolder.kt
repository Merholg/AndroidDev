package com.example.myapplication

import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class StateViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bind(state: State) {
        val pennantImageView: ImageView = itemView.findViewById(R.id.pennant)
        val regionTextView: TextView = itemView.findViewById(R.id.region)
        val capitalTextView: TextView = itemView.findViewById(R.id.capital)

        capitalTextView.text = state.capital
        regionTextView.text = state.region
        pennantImageView.setImageResource(R.drawable.sauvons)

        pennantImageView.setOnClickListener{
            StateSingleton.selectCapital = state.capital
            StateSingleton.selectRegion = state.region
            StateSingleton.selectPopulation = state.population
            val toast = Toast.makeText(itemView.context, "${state.population} чел.", Toast.LENGTH_SHORT)
            val location = IntArray(2)
            capitalTextView.getLocationOnScreen(location)
            toast.setGravity(Gravity.TOP,0,location[1])
            toast.show()

        }
        capitalTextView.setOnClickListener{
            StateSingleton.selectCapital = state.capital
            StateSingleton.selectRegion = state.region
            StateSingleton.selectPopulation = state.population

            val activity: AppCompatActivity = itemView.context as AppCompatActivity
            val fragManager: FragmentManager = activity.supportFragmentManager
                    fragManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, DosFragment())
                        .addToBackStack(null)
                        .commit()

        }

    }
}