package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        findViewById<Button>(R.id.btnGo).setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent);
        }
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}