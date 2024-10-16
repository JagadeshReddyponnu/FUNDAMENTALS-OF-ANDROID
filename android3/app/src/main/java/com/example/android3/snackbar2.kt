package com.example.snackbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.example.android3.MainActivity
import com.example.android3.R
import com.google.android.material.snackbar.Snackbar


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar2)
        enableEdgeToEdge()

        val x = findViewById<ImageButton>(R.id.imageButton5)
        val y = findViewById<ImageButton>(R.id.imageButton6)
        val z = findViewById<ImageButton>(R.id.imageButton7)
        val a = findViewById<ImageButton>(R.id.imageButton8)
        x.setOnClickListener {
            val i= Intent(this, MainActivity::class.java)
            startActivity(i)
        }


    }
}