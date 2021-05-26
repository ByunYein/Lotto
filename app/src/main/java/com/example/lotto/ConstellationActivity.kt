package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)



        val btnGoResult = findViewById<Button>(R.id.btnGoResultConstell)
        btnGoResult.setOnClickListener {
            val intent= Intent(this,ResultActivity::class.java)
            startActivity(intent)

        }
    }
}