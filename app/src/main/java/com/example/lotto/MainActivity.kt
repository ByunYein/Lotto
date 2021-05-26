package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val CVCostellation = findViewById<CardView>(R.id.btnConstellation)
        val NameCardView = findViewById<CardView>(R.id.NameCardView)



        CVCostellation.setOnClickListener {
            val intent = Intent(this,ConstellationActivity::class.java )
            startActivity(intent)

        }
        NameCardView.setOnClickListener {
            startActivity(Intent(this,NameActivity::class.java))
        }
        findViewById<CardView>(R.id.randomCard).setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)


        }

    }
}

fun getRandomLottoNumber(): Int{

    return Random().nextInt(45)+1
}

fun getRandomLottoNumbers(): MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()
    while(true) {
        var number: Int = getRandomLottoNumber()
        var flag_existing: Int = 0
        for (j in 0..lottoNumbers.size) {
            if (number.equals(lottoNumbers[j])) {
                flag_existing = 1
                break;
            }
        }
        if (flag_existing.equals(1))
            continue
        else
            lottoNumbers.add(number)
        if (lottoNumbers.size >= 6)
            break;

    }

    return lottoNumbers
}
