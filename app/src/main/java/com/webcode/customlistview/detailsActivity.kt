package com.webcode.customlistview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailsActivity : AppCompatActivity() {

    lateinit var profileName: TextView
    lateinit var profileImg: ImageView
    lateinit var profileDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        profileName = findViewById(R.id.profileName)
        profileImg = findViewById(R.id.profileImg)
        profileDesc = findViewById(R.id.profileDesc)

        var name = intent.getStringExtra("name")
        var img = intent.getIntExtra("image", R.drawable.tamim)
        var desc = intent.getStringExtra("longdesc")

        profileDesc.text = desc
        profileName.text = name
        profileImg.setImageResource(img)
        }
    }