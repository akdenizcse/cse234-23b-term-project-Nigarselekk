package com.example.vehicleticketapp


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import android.content.Intent
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.vehicleticketapp.databinding.ActivityLoginPageBinding
import com.example.vehicleticketapp.databinding.ActivityRegisterPageBinding

//import com.codingstuff.loginandsignup.databinding.ActivitySignInBinding


class LoginPage : AppCompatActivity() {

    /**
     * Created binding as private
     */
    private lateinit var binding: ActivityLoginPageBinding

    private lateinit var firebaseAuth: FirebaseAuth

    private lateinit var  actionBar: ActionBar

   // private lateinit var progressDialog:ProgressDialog

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * We access to the login page using Binding.
         */
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            /**
             * This code takes email and password with text type then we convert string.
             */



            val email = binding.emailEt.text.toString()
            val pass = binding.passET.text.toString()

            intent.getStringExtra(email)

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                /**
                 * this codes performs a login with an email and password using firebase Authentication
                 */
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {


                        val intent = Intent(this@LoginPage, FindTicket::class.java)
                            startActivity(intent)

                        Toast.makeText(this, "Login ", Toast.LENGTH_SHORT).show()

                }
            }
            /**
             * if user does not enter information so email and password empty,show a message to the user by using Toast.
             */
            else {
                Toast.makeText(this, "Please enter information!!", Toast.LENGTH_SHORT).show()
            }

            if(firebaseAuth.currentUser != null){
                val intent = Intent(this, FindTicket::class.java)
                startActivity(intent)
            }

        }
        val noAccountTextView: TextView = findViewById(R.id.noAccount)

        noAccountTextView.setOnClickListener() {
            val intent = Intent(this@LoginPage, RegisterPage::class.java)
            startActivity(intent)

        }




    }

    override fun onStart() {
        super.onStart()


    }


}