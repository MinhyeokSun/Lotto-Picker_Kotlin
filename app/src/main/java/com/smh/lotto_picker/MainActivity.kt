package com.smh.lotto_picker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomNum()
    }

    fun randomNum() {

        val random = Random(45)
        val list = mutableListOf<Int>().apply {
            for (i in 1..45) {

            }
        }

        list.shuffle()
        println(list.subList(0, 6))
        Log.e("print","${list.subList(0,6)}")
    }
}