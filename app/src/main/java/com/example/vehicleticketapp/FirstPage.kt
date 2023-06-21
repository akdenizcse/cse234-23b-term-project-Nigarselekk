package com.example.vehicleticketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)


        val startbutton: Button = findViewById(R.id.start_button)
        /**
         * App start with first page.When user click start button,Register page is appear.
         */

        startbutton.setOnClickListener {

            val intent = Intent(this@FirstPage, RegisterPage::class.java)
            startActivity(intent)

        }

    }

}