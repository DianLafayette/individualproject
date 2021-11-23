package com.example.hw2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val welcome = findViewById<TextView>(R.id.welcome)
        welcome.setOnClickListener{
            startActivity(Intent(this, MostPopularActivity::class.java)
        )}
    }
}