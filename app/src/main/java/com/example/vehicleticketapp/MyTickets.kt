package com.example.vehicleticketapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MyTickets : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_tickets)

        /**
         * When cancellation button is clicked, Ticket cancellation page is open.
         */
        val cancellation_ticket : Button = findViewById(R.id.myticketCancelbutton)

        cancellation_ticket.setOnClickListener{
            val intent = Intent(this, TicketCancellation::class.java)
            startActivity(intent)


        }
    }
}
