package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class DosFragment : Fragment() {

    // early initialization of the bottom navigation bar
    private lateinit var dosBeginButton: Button
    private lateinit var dosInfoTextView: TextView

    private var dosSelectCapital: String = StateSingleton.selectCapital
    private var dosSelectRegion: String = StateSingleton.selectRegion
    private var dosSelectPopulation: Int = StateSingleton.selectPopulation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dos, container, false)

        dosBeginButton = view.findViewById(R.id.dos_begin_button)
        dosInfoTextView = view.findViewById(R.id.dos_info_text_view)

        val dosJoinedInfo: String = listOf<String>("Capital: $dosSelectCapital",
                                        "Region: $dosSelectRegion",
                                        "Population: ${dosSelectPopulation.toString()}")
                                        .joinToString(separator = "\n")
        dosInfoTextView.text = dosJoinedInfo
        val dosJoinedCapital: String = dosSelectCapital.split(" ").joinToString(separator = "+")
        val dosURL = "https://www.google.com/search?q=$dosJoinedCapital"
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

//    override fun onSaveInstanceState(outState: Bundle) {
        // save current value
//        outState.putInt("DOS_SELECT_VALUE", dosSelectNumber)
//        outState.putString("DOS_SELECT_WORD", dosSelectWord)
//        super.onSaveInstanceState(outState)
//    }
}

