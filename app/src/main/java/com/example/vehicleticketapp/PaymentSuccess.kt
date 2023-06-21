package com.example.vehicleticketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaymentSuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_success)


        /**
         * İf payment is is success, Payment message and travel informations is appear to user.
         * Then user come back to Find Ticket page again.
         */

        val continuebutton: Button = findViewById(R.id.continue_button)

        continuebutton.setOnClickListener{
            val intent = Intent(this, Account::class.java)
            startActivity(intent)
        }





    }
}