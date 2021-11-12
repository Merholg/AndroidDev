package com.merholg.difficultapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private fun getStateList(): List<State> {
        val states: MutableList<State> = mutableListOf()
        val stateItem = State("", "" , 0)
        val capitals: List<String> = this.resources.getStringArray(R.array.capital_names).toList()
        val capitalsIterator = capitals.iterator()
        val regions: List<String> = this.resources.getStringArray(R.array.region_names).toList()
        val regionsIterator = regions.iterator()
        val pennants: List<Int> = this.resources.getIntArray(R.array.pennant_values).toList()
        val pennantIterator = pennants.iterator()

        while (capitalsIterator.hasNext()) {
            stateItem.capital = capitalsIterator.next()
            stateItem.region = regionsIterator.next()
            stateItem.pennant = pennantIterator.next()
            states.add(stateItem)
        }
        return states
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(getStateList())


    }
}