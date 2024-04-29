package com.example.petapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.petRio)
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.getStarted)
        button.setOnClickListener {
            // Navigate to the next activity
            val intent = Intent(this, NextActivity2::class.java)
            startActivity(intent)
        }
    }
}







