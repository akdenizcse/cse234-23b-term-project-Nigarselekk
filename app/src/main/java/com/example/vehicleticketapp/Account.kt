package com.example.vehicleticketapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)


        var myticketbutton:Button = findViewById(R.id.myTickets_button)

        myticketbutton.setOnClickListener{
            val intent = Intent(this, MyTickets::class.java)
            startActivity(intent)

        }

        var ticketcancellationbutton : Button = findViewById(R.id.ticketCancellation_button)

        myticketbutton.setOnClickListener{
            val intent = Intent(this, TicketCancellation::class.java)
            startActivity(intent)


        }

        var logoutbutton: Button = findViewById(R.id.logout_button)

        logoutbutton.setOnClickListener{
            val intent = Intent(this, TicketCancellation::class.java)
            startActivity(intent)


        }
}}