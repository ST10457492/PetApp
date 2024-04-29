package com.example.petapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity2 : AppCompatActivity() {
    private fun updateStatus() {

        val play: Button = findViewById(R.id.playButton)
        val feed: Button = findViewById(R.id.feedButton)
        val clean: Button = findViewById(R.id.cleanButton)
        val textView: TextView = findViewById(R.id.statusTextView)
        val imageView: ImageView = findViewById(R.id.imageView)

        var health = 100
        var hunger = 0
        var cleanliness = 100
        lateinit var statusTextView: TextView

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_next2)

            updateStatus()
        }

        fun play(view: android.view.View) {
            health -= 10
            hunger += 10
            cleanliness -= 5
            updateStatus()
        }

        fun feed(view: android.view.View) {
            hunger -= 20
            updateStatus()
        }

        fun clean(view: android.view.View) {
            cleanliness = 100
            updateStatus()
        }

        fun updateStatus() {
            statusTextView.text = "Health: $health\nHunger: $hunger\nCleanliness: $cleanliness"
            if (health <= 0) {
                statusTextView.append("\nYour pet has died!")
            }
        }
    }
}


