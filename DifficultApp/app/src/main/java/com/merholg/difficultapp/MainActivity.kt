package com.merholg.difficultapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private fun getStateList(): List<State> {
        return listOf(
            State(0, "Москва", "Москва", 12655050),
            State(0, "Санкт-Петербург", "Санкт-Петербург", 5384342),
            State(0, "Новосибирская область", "Новосибирск", 1620162),
            State(0, "Свердловская область", "Екатеринбург", 1495066),
            State(0, "Татарстан", "Казань", 1257341),
            State(0, "Нижегородская область", "Нижний Новгород", 1244254),
            State(0, "Челябинская область", "Челябинск", 1187960),
            State(0, "Омская область", "Омск", 1139897),
            State(0, "Самарская область", "Самара", 1144759),
            State(0, "Ростовская область", "Ростов-на-Дону", 1137704),
            State(0, "Башкортостан", "Уфа", 1125933),
            State(0, "Красноярский край", "Красноярск", 1092851),
            State(0, "Пермский край", "Пермь", 1049199),
            State(0, "Воронежская область", "Воронеж", 1050602),
            State(0, "Волгоградская область", "Волгоград", 1004763)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val stateList = getStateList()
        val stateIterator = stateList.iterator()
        while (stateIterator.hasNext()) {
            Log.d("APP_LOG", stateIterator.next().capital)
        }

        recyclerView.adapter = StateRecyclerAdapter(stateList)


    }
}