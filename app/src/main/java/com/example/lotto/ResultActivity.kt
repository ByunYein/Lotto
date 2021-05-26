package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    val lottoBallImageStartId = R.drawable.ball_01
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultLabel = findViewById<TextView>(R.id.resultLabel)

        val result = intent.getIntegerArrayListExtra("result")
       val result_sorted = result?.sorted()
        //println("result id $result")
       // result.sort()
       //println("result sorted is $result")

      // val result_sorted = result.sortedBy { it }
       // println("result_sorted is" + result_sorted)



        val imageView1 = findViewById<ImageView>(R.id.imageView3)
        val imageView2 = findViewById<ImageView>(R.id.imageView4)
        val imageView3 = findViewById<ImageView>(R.id.imageView5)
        val imageView4 = findViewById<ImageView>(R.id.imageView6)
        val imageView5 = findViewById<ImageView>(R.id.imageView7)
        val imageView6 = findViewById<ImageView>(R.id.imageView8)

        imageView1.setImageResource(lottoBallImageStartId+result_sorted!![0]-1)
        imageView2.setImageResource(lottoBallImageStartId+result_sorted[0]-1)
        imageView3.setImageResource(lottoBallImageStartId+result_sorted[0]-1)
        imageView4.setImageResource(lottoBallImageStartId+result_sorted[0]-1)
        imageView5.setImageResource(lottoBallImageStartId+result_sorted[0]-1)
        imageView6.setImageResource(lottoBallImageStartId+result_sorted[0]-1)



    }
}