package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FFragment,firstFragment)
            commit()
        }

        val btn1 = findViewById<Button>(R.id.btn_1)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FFragment,firstFragment)
                commit()
            }
        }

        val btn2 = findViewById<Button>(R.id.btn_2)
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FFragment,secondFragment)
                commit()
            }
        }
    }
}