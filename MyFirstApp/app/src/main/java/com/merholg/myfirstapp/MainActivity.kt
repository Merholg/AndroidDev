package com.merholg.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//private const val TAG = "MainActivity"
private const val LIFE_CYCLE_LOG_TAG = "LifeCycleLog"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LIFE_CYCLE_LOG_TAG, retString())
    }

    override fun onStart() {
        super.onStart()
        Log.d(LIFE_CYCLE_LOG_TAG, retString())
    }

    override fun onResume() {
        super.onResume()
        Log.d(LIFE_CYCLE_LOG_TAG, retString())
    }

    override fun onPause() {
        super.onPause()
        Log.d(LIFE_CYCLE_LOG_TAG, retString())
    }

    override fun onStop() {
        super.onStop()
        Log.d(LIFE_CYCLE_LOG_TAG, retString())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LIFE_CYCLE_LOG_TAG, retString())
    }

    private val poemStrings = listOf(
        "Ты видел деву на скале\nВ одежде белой над волнами",
        "Когда, бушуя в бурной мгле,\nИграло море с берегами,",
        "Когда луч молний озарял\nЕе всечасно блеском алым",
        "И ветер бился и летал\nС ее летучим покрывалом?",
        "Прекрасно море в бурной мгле\nИ небо в блесках без лазури;",
        "Но верь мне: дева на скале\nПрекрасней волн, небес и бури."
    )
    private val poemIterator = poemStrings.iterator()
    private fun retString(): String {
        if(poemIterator.hasNext()) return poemIterator.next()
        else return "-"
    }
}