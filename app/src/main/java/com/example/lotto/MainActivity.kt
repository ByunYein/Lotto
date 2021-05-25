package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CVCostellation = findViewById<CardView>(R.id.btnConstellation)
        val NameCardView = findViewById<CardView>(R.id.NameCardView)
        val randomCard = findViewById<CardView>(R.id.randomCard)


        CVCostellation.setOnClickListener {
            val intent = Intent(this,ConstellationActivity::class.java )
            startActivity(intent)

        }
        NameCardView.setOnClickListener {
            startActivity(Intent(this,NameActivity::class.java))
        }
        randomCard.setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))
        }

    }
}