package com.example.burgerorder

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.ca1prac.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the UI components
        val burgerRadioGroup: RadioGroup = findViewById(R.id.a2)
        val deliveryRadioGroup: RadioGroup = findViewById(R.id.a5)
        val termsCheckBox: CheckBox = findViewById(R.id.a4)
        val orderButton: Button = findViewById(R.id.button2)

        // Set click listener for the order button
        orderButton.setOnClickListener {
            // Get selected burger
            val selectedBurgerId = burgerRadioGroup.checkedRadioButtonId
            val selectedBurger: RadioButton? = findViewById(selectedBurgerId)

            // Get selected delivery type
            val selectedDeliveryId = deliveryRadioGroup.checkedRadioButtonId
            val selectedDelivery: RadioButton? = findViewById(selectedDeliveryId)

            // Check if terms and conditions are accepted
            if (!termsCheckBox.isChecked) {
                Toast.makeText(this, "Please accept the Terms and Conditions", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Ensure both burger and delivery options are selected
            if (selectedBurger == null || selectedDelivery == null) {
                Toast.makeText(this, "Please select a burger and delivery type", Toast.LENGTH_SHORT).show()
            } else {
                // Proceed with the order
                val orderMessage = "Order: ${selectedBurger.text} with ${selectedDelivery.text}"
                Toast.makeText(this, orderMessage, Toast.LENGTH_LONG).show()
            }
        }
    }
}
