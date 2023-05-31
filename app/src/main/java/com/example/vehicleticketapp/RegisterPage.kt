package com.example.vehicleticketapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.vehicleticketapp.databinding.ActivityLoginPageBinding
import com.example.vehicleticketapp.databinding.ActivityMainBinding
import com.example.vehicleticketapp.databinding.ActivityRegisterPageBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RegisterPage : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterPageBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
        * I created binding
        * */
        binding = ActivityRegisterPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /**
         *Firebase authentication
         */
        firebaseAuth = FirebaseAuth.getInstance()

        binding.textView.setOnClickListener {
            val intent = Intent(this,LoginPage::class.java)
            startActivity(intent)
        }
        /**
         * it takes email and password
         */
        binding.button.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()
            val confirmPass = binding.confirmPassEt.text.toString()
            /**
             * İf values is not empty, user enter informations and password compatible then firebase connection is exist.
             *
             */
            if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (pass == confirmPass) {

                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            /**
                             * İntent will be created that determines which activity will run.
                             * And also user registrated.
                             */
                            val intent = Intent(this, LoginPage::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }
                }

                /**
                 *When password is not compatible or user does not any information,warning message will appear using Toast
                 */
                else {
                    Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter information !!", Toast.LENGTH_SHORT).show()

            }
        }
    }
}

