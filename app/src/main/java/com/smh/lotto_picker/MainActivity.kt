package com.smh.lotto_picker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomNum()
    }

    fun randomNum() {

        val random = Random(45)
        val numberSet = mutableSetOf<Int>() // 중복숙자 x

        while(numberSet.size < 6) {
            val randomNumber = random.nextInt() + 1
            numberSet.add(randomNumber)
        }
    }
}