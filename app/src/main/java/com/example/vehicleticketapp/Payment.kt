package com.example.vehicleticketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vehicleticketapp.fragments.AccountFragment
import com.example.vehicleticketapp.fragments.PastTravelsFragment
import com.example.vehicleticketapp.fragments.SearchTicketFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        /**
         * After the enter all payment information, is clicked pay button for go to next page.
         */

        val paybutton: Button = findViewById(R.id.pay_button)

       paybutton.setOnClickListener{
            val intent = Intent(this, PaymentSuccess::class.java)
            startActivity(intent)
        }




    }


    }






