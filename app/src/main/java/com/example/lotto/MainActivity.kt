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
    fun getRandomLottoNumber(): Int{

        return Random().nextInt(45)+1
    }

    fun getRandomLottoNumbers(): MutableList<Int> {
        val lottoNumbers = mutableListOf<Int>()
        for(i in 1..6){

            var number = 0

            do{
                number = getRandomLottoNumber()
            }while(lottoNumbers.contains(number))
            lottoNumbers.add(number)
        }

        return lottoNumbers
    }

}


