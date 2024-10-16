package com.example.frontend

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class practice1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practice1)
        var user_name=findViewById<EditText>(R.id.ET1)
        var password=findViewById<EditText>(R.id.ET2)
        var btn=findViewById<Button>(R.id.fbtn1)
        var tv2=findViewById<TextView>(R.id.tv2)

       btn.setOnClickListener {
           var a=user_name.text.toString()
           var b=password.text.toString()
           tv2.text="Your name  "+a+"Password "+b
       }
    }
}