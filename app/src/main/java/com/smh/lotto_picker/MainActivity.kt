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
        val list = mutableListOf<Int>()

        while(list.size < 6) {
            val randomNumber = random.nextInt(45) + 1
            if (list.contains (randomNumber)) {
                continue
            }
            list.add(randomNumber)
        }
    }
}