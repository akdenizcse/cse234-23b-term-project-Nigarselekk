package com.example.vehicleticketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ChooseSeat : AppCompatActivity() {

    private lateinit var seatNumberEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_seat)

        /**
         * After the user enter the seat choice, choose seat button is clicked.
         * So user will go to the payment section.
         */

        val chooseseatbutton: Button = findViewById(R.id.choose_seat_button)

        chooseseatbutton.setOnClickListener{
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }





    }
}