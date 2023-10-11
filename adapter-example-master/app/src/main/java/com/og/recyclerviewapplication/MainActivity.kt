package com.og.recyclerviewapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList: List<String> = listOf("Maxim", "Ivan", "Olga", "Elena", "Andrey", "Oleg")

        val carList: List<Car> = listOf(
            Car("Audi", "Red", 300),
            Car("BMW", "Blue", 350),
            Car("Ferrari", "White", 450)
        )

        val usersRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        usersRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
//        usersRecyclerView.adapter = UserAdapter(userNameList)
        usersRecyclerView.adapter = CarAdapter(carList)

    }
}