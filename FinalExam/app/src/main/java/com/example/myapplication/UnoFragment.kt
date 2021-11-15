package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

// constant for the persistence key
private const val LAST_SCALAR_VALUE = "LAST_SCALAR_VALUE"
class UnoFragment : Fragment() {

    // early initialization of the bottom navigation bar
    private lateinit var unoResultTextView: TextView
    private lateinit var unoRunButton: Button

    private var sizeValue: Int = 1

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_uno, container, false)
       // only from view called findViewById in Fragments
       unoResultTextView = view.findViewById(R.id.uno_result_text_view)
       unoRunButton = view.findViewById(R.id.uno_run_button)

       // load if state saved
       if (savedInstanceState != null) {
           sizeValue = savedInstanceState.getInt(LAST_SCALAR_VALUE)
           unoResultTextView.text = sizeValue.toString()
       }
       // get new if no
       else
           scalar()
       // get new if button pressed
       unoRunButton.setOnClickListener {scalar()}
       return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // save current value
        outState.putInt(LAST_SCALAR_VALUE, sizeValue)
        super.onSaveInstanceState(outState)
    }

    private fun scalar() {
        sizeValue = Random.nextInt(100)
        unoResultTextView.text =  sizeValue.toString()
    }
 }