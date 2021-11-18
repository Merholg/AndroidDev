package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class DosFragment : Fragment() {

    // early initialization of the bottom navigation bar
    private lateinit var dosBeginButton: Button
    private lateinit var dosInfoTextView: TextView

    private var dosSelectNumber = 1
    private var dosSelectWord = "NoOne"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dos, container, false)

        dosBeginButton = view.findViewById(R.id.dos_begin_button)
        dosInfoTextView = view.findViewById(R.id.dos_info_text_view)

        if (savedInstanceState != null) {
            dosSelectNumber = savedInstanceState.getInt("DOS_SELECT_VALUE")
            dosSelectWord = savedInstanceState.getString("DOS_SELECT_WORD")!!
        }

        val textSelectNumber = dosSelectNumber.toString()
        dosInfoTextView.text = "$dosSelectWord $textSelectNumber"

        val dosURL = "https://www.google.com/search?q=$dosSelectWord"
        val dosIntent = Intent()
        dosIntent.action = Intent.ACTION_VIEW
        dosIntent.data = Uri.parse(dosURL)
        dosIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        dosBeginButton.setOnClickListener {
            val chooser = Intent.createChooser(dosIntent, "@string/what_see")
            startActivity(chooser)
        }

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        // save current value
        outState.putInt("DOS_SELECT_VALUE", dosSelectNumber)
        outState.putString("DOS_SELECT_WORD", dosSelectWord)
        super.onSaveInstanceState(outState)
    }
}

