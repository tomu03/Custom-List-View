package com.webcode.customlistview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    val profileName = arrayOf(
        "Tamim Iqbal",
        "Sakib Al Hasan",
        "Musfiqur Rahim",
        "mahmudulllah Riyad",
        "Masrafi din Mutraza"
    )

    val profileDec = arrayOf(
        "Left hand batter",
        "No 1 All rounder",
        "Right hand batter and wicketkeeper",
        "All rounder",
        "Captain fantastic"
    )

    val images = arrayOf<Int>(
        R.drawable.tamim,
        R.drawable.sakib,
        R.drawable.musfiq,
        R.drawable.mahmudllah,
        R.drawable.mash
    )

    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val myListAdapter = MyListAdapter(this, profileName, profileDec, images)

        listView.adapter = myListAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this,
                "Item Clicked${parent.getItemAtPosition(position)}",
                android.widget.Toast.LENGTH_SHORT
            ).show()
        }
    }
}