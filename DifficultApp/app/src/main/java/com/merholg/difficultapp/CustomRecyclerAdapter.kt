package com.merholg.difficultapp

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayoutStates
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter(private val states: List<State>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var pennantImageView: ImageView? = null
        var regionTextView: TextView? = null
        var capitalTextView: TextView? = null

        init {
            pennantImageView = itemView.findViewById(R.id.pennant) as ImageView?
            regionTextView = itemView.findViewById(R.id.region) as TextView?
            capitalTextView = itemView.findViewById(R.id.capital) as TextView?

            capitalTextView?.setOnClickListener{
                val toast = Toast.makeText(itemView.context, "city.population.toString()", Toast.LENGTH_SHORT)
                val location = IntArray(2)
                capitalTextView?.getLocationOnScreen(location)
//            Log.d("DEBUG_MSG", location[1].toString())
                toast.setGravity(Gravity.TOP,0,location[1])
                toast.show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.pennantImageView?.setImageResource(R.drawable.ic_launcher_foreground)
        holder.regionTextView?.text = states[position].region
        holder.capitalTextView?.text = states[position].capital
    }

    override fun getItemCount() = states.size
}
