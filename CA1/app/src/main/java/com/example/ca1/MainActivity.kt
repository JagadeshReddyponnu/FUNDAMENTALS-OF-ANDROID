package com.example.yourapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ca1.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by ID
        val imageView: ImageView = findViewById(R.id.imgv1)
        val textView: TextView = findViewById(R.id.txtv1)
        val editUsername: EditText = findViewById(R.id.edt1)
        val editPassword: EditText = findViewById(R.id.edt2)
        val loginButton: Button = findViewById(R.id.btn1)

        // Example login button click listener with Toast
        loginButton.setOnClickListener {
            val username = editUsername.text.toString()
            val password = editPassword.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login successful! Welcome, $username", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
