package com.example.vehicleticketapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import android.content.Intent
import android.widget.Toast
import com.example.vehicleticketapp.databinding.ActivityLoginPageBinding
import com.example.vehicleticketapp.databinding.ActivityRegisterPageBinding

//import com.codingstuff.loginandsignup.databinding.ActivitySignInBinding


class LoginPage : AppCompatActivity() {

    /**
     * Created binding as private
     */
    private lateinit var binding: ActivityLoginPageBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * We access to the login page using Binding.
         */
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        binding.textView.setOnClickListener {
            val intent = Intent(this, ActivityRegisterPageBinding::class.java)
            startActivity(intent)
        }
        /**
         * When we click button
         */
        binding.button.setOnClickListener {
            /**
             * This code takes email and password with text type then we convert string.
             */
            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()



            if (email.isNotEmpty() && pass.isNotEmpty()) {
                /**
                 * this codes performs a login with an email and password using firebase Authentication
                 */
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        /**
                         * İntent will be created that determines which activity will run.
                         *
                         */
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                    }
                }
            }
            /**
             * if user does not enter information so email and password empty,show a message to the user by using Toast.
             */
            else {
                Toast.makeText(this, "Please enter information!!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    /**
     * Checks if the user is logged in. When logged in, user is directed to the MainActivity
     */
    override fun onStart() {
        super.onStart()

        if(firebaseAuth.currentUser != null){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}