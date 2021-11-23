package com.example.hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AccActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acc)


        val acc = findViewById<TextView>(R.id.acc)
        acc.setOnClickListener{
            startActivity(Intent(this, CreateActivity::class.java))




    }
}}
