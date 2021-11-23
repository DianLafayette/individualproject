package com.example.hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostPopularActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_most_popular)

        val most = findViewById<TextView>(R.id.most)
        most.setOnClickListener{
            startActivity(Intent(this, AccActivity::class.java))

    }
}
}