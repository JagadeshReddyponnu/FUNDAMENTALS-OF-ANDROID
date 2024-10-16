package com.example.android2

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class logcat : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logcat)
        var btnlogentry=findViewById<Button>(R.id.btn)
        btnlogentry.setOnClickListener {
            Log.v(TAG,"Verbose log:lowest priority,detailed entry,no use during production")
            Log.d(TAG,"Debug log:high priority,information,this is used to debug the app")
            Log.i(TAG,"Info log:moderate level importance,they give information of the app")
            Log.w(TAG,"warning log:this is a warning message for unexpected behaviour")

        }
    }
}