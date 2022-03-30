package com.developer.labb_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBtn = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.userName1)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)


        loginBtn.setOnClickListener {
            val email = emailInput.text.toString()
            val intent = Intent(this, MainActivity::class.java).apply{
                putExtra("userName", email)

            }
            startActivity(intent)
        }





        /* TODO - Add missing LOGIN button to activity_login.xml */
        /* TODO - Input type should be: Password and Email types. (check XML)   */
        /* TODO - .apply to send user information from input field BACK to MainActivity */
    }
}