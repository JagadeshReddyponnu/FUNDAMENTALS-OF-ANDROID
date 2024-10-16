package com.example.android2

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class implicitintent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicitintent)
        val btn1=findViewById<Button>(R.id.button)
        val btn2=findViewById<Button>(R.id.button2)
        val btn3=findViewById<Button>(R.id.button3)
        val btn4=findViewById<Button>(R.id.button4)
        val btn5=findViewById<Button>(R.id.button5)
        val btn6=findViewById<Button>(R.id.button6)
        btn1.setOnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i)
        }
        btn2.setOnClickListener {
            val i2=Intent(Intent.ACTION_DIAL, Uri.parse("tel:9876543210"))
            startActivity(i2)
        }
        btn3.setOnClickListener {
            val i3=Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California"))
            startActivity(i3)
        }
        btn4.setOnClickListener {
            val i4 = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(i4)
        }
        btn5.setOnClickListener {
            val i5 = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"))
            startActivity(i5)
        }
        btn6.setOnClickListener {
            val i6 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(i6)
        }
    }
}