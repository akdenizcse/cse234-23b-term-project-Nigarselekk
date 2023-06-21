package com.example.vehicleticketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Tickets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tickets)

        /**
         * After the ticket choice, go to Choose Seat page.
         */

        val chooseone: Button = findViewById(R.id.city1)

        chooseone.setOnClickListener{
                val intent = Intent(this, ChooseSeat::class.java)
                startActivity(intent)

        }
        val choosetwo: Button = findViewById(R.id.city2)

        choosetwo.setOnClickListener{
            val intent = Intent(this, ChooseSeat::class.java)
            startActivity(intent)
        }

        val chooseThree: Button= findViewById(R.id.city3)

        chooseThree.setOnClickListener{
            val intent = Intent(this, ChooseSeat::class.java)
            startActivity(intent)
        }
        val chooseFour: Button = findViewById(R.id.city4)

        chooseFour.setOnClickListener{
            val intent = Intent(this, ChooseSeat::class.java)
            startActivity(intent)
        }

        val chooseFive: Button = findViewById(R.id.city5)

        chooseFive.setOnClickListener{
            val intent = Intent(this, ChooseSeat::class.java)
            startActivity(intent)
        }

    }
}