package com.developer.labb_2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider



class MainActivity : AppCompatActivity() {

    private lateinit var userViewModel: UserViewModel

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val aboutBtn = findViewById<Button>(R.id.about_btn)
        val userName = findViewById<TextView>(R.id.userName)
        val email = intent.getStringExtra("userName")


        val firstUser = User()
        userName.text = email

        // Connection to ViewModel + Instantiating
        userViewModel = ViewModelProvider(this)[UserViewModel::class.java]

        // Implementing setOnClick to take us to LoginActivity
        loginBtn.setOnClickListener {

            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
            }

        // A button that take us to First Fragment
        aboutBtn.setOnClickListener{
            val firstFragment= FirstFragment()
            val fragment : Fragment? =
                supportFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)
            if (fragment !is FirstFragment){
                supportFragmentManager.beginTransaction()
                    .add(R.id.fragmentContainerView2, firstFragment, FirstFragment::class.java.simpleName)
                    .commit()

            }
            aboutBtn.visibility = View.GONE
            loginBtn.visibility = View.GONE
        }

        }


    }


