package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

// constant for the persistence key
private const val LAST_VECTOR_VALUE = "LAST_VECTOR_VALUE"
class DosFragment : Fragment() {

    // early initialization of the bottom navigation bar
    private lateinit var dosImageView: ImageView
    private lateinit var dosBeginButton: Button

    private var directValue = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dos, container, false)
        dosImageView = view.findViewById(R.id.dos_image_view)
        dosBeginButton = view.findViewById(R.id.dos_begin_button)

        if (savedInstanceState != null)
            vector(savedInstanceState.getInt(LAST_VECTOR_VALUE))

        dosBeginButton.setOnClickListener {
            directValue = Random.nextInt(1, 6)
            vector(directValue)
        }

        return view
    }

    private fun vector(directValue: Int) {
       dosImageView.setImageResource(
            when (directValue) {
                1 -> R.drawable.sauvons
                2 -> R.drawable.sauvons
                3 -> R.drawable.sauvons
                4 -> R.drawable.sauvons
                5 -> R.drawable.sauvons
                6 -> R.drawable.sauvons
                else -> R.drawable.sauvons
            }
        )
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_VECTOR_VALUE, directValue)
        super.onSaveInstanceState(outState)
    }
}