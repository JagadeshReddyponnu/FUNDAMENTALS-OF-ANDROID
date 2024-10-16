package com.example.frontend

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class checkboxradiobutton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_checkboxradiobutton)
        // Declare the views from XML
        val pizzaTypeGroup = findViewById<RadioGroup>(R.id.radiogrouprg)
        val pizzaSizeGroup = findViewById<RadioGroup>(R.id.radiogrouprg2)
        val extraCheeseCheckbox = findViewById<CheckBox>(R.id.CB1)
        val pepperoniCheckbox = findViewById<CheckBox>(R.id.CB2)
        val submitButton = findViewById<Button>(R.id.bt1)

        // Action for when submit button is clicked
        submitButton.setOnClickListener {
            // Get selected pizza type
            val selectedTypeId = pizzaTypeGroup.checkedRadioButtonId
            val pizzaType = when (selectedTypeId) {
                R.id.RB1 -> "Paneer Pizza"
                R.id.RB2 -> "Chicken Pizza"
                R.id.RB3 -> "Veg Pizza"
                else -> ""
            }

            // Get selected pizza size
            val selectedSizeId = pizzaSizeGroup.checkedRadioButtonId
            val pizzaSize = when (selectedSizeId) {
                R.id.RB4 -> "Small"
                R.id.RB5 -> "Medium"
                R.id.RB6 -> "Large"
                else -> ""
            }

            // Get selected toppings
            val toppings = mutableListOf<String>()
            if (extraCheeseCheckbox.isChecked) toppings.add("Extra Cheese")
            if (pepperoniCheckbox.isChecked) toppings.add("Pepperoni")

            // Create a summary of the order
            val orderSummary = "You ordered a $pizzaSize $pizzaType with toppings: ${toppings.joinToString(", ")}"

            // Show the order summary as a Toast message
            Toast.makeText(this, orderSummary, Toast.LENGTH_LONG).show()
        }
    }
}
