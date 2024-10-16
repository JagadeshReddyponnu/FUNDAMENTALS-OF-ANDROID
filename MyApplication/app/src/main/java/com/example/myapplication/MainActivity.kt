package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a= findViewById<EditText>(R.id.editTextText)
        var b= findViewById<EditText>(R.id.editTextText2)
        var btn = findViewById<Button>(R.id.button)
        var txtvw = findViewById<TextView>(R.id.textView)
        btn.setOnClickListener {
            var c=a.text.toString()
            var d=b.text.toString()
            txtvw.text="Your name  "+c+"Phone Number "+d
        }
    }
}
