package com.example.secondproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondproject)

        // Find the submit button by its ID
        val submitButton = findViewById<Button>(R.id.button2)

        // Set an OnClickListener for the submit button
        submitButton.setOnClickListener {
            // Create an AlertDialog.Builder instance
            val builder = AlertDialog.Builder(this)

            // Set the title and message for the dialog
            builder.setTitle("Confirmation")
                .setMessage("Are you sure you want to submit?")

            // Set the positive button and its click listener
            builder.setPositiveButton("Yes") { dialog, _ ->
                // Handle the positive button click
                dialog.dismiss()
                // Proceed with the submission logic
            }

            // Set the negative button and its click listener
            builder.setNegativeButton("No") { dialog, _ ->
                // Handle the negative button click
                dialog.dismiss()
            }

            // Create and show the AlertDialog
            val alertDialog = builder.create()
            alertDialog.show()
        }
    }
}