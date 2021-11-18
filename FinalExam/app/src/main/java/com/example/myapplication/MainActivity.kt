package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

// constant for the persistence key
private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"
class MainActivity : AppCompatActivity() {

    // early initialization of the bottom navigation bar
    private lateinit var bottomNavigationMenu: BottomNavigationView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)

        // setting clicks on elements of the bottom navigation bar
        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when(item.itemId) {
                R.id.uno->{
                    fragment = UnoFragment()
                }
                R.id.dos->{
                    fragment = DosFragment()
                }
                R.id.tres->{
                    fragment = TresFragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }

        // restoring the state of the bottom navigation bar
        // R.id.uno if not saved
        bottomNavigationMenu.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.uno
    }

    // saving the state of the last clicked element of the bottom navigation bar
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, bottomNavigationMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

    // function of replacing fragments with supportFragmentManager
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}