package com.example.ca1prac

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isEmpty

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a =findViewById<RadioGroup>(R.id.rg1)
        var button1=findViewById<RadioButton>(R.id.btn1)
        var button2=findViewById<RadioButton>(R.id.btn2)
        var button3=findViewById<Button>(R.id.btn3)

        var orderType1=""
        a.setOnCheckedChangeListener { _, checkedId ->
            orderType1=when(checkedId){
                R.id.btn1 -> "Online Order"
                R.id.btn2 -> "Take Away"
                else -> ""
            }
        }

       button3.setOnClickListener {
           if(a.isEmpty())
           {
               showToast("Select Bouque Order type...")
           }
           else
           {
               showToast("Selected Bouque type is $orderType1")
           }
       }
    }
    private fun showToast(message: String){
        android.widget.Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}