package com.og.recyclerviewapplication

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(userName: String) {
        val userNameTextView: TextView = itemView.findViewById(R.id.user_name_text_view)
        userNameTextView.text = userName


        val toastButton: Button = itemView.findViewById(R.id.toast_button)
        toastButton.setOnClickListener {
            Toast.makeText(itemView.context, userName, Toast.LENGTH_LONG).show()
        }
    }


}