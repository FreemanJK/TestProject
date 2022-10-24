package com.olzhas.testproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signUpbtn: Button = findViewById(R.id.signUp)
        signUpbtn.setOnClickListener {
            Intent(this, RegisterActivity::class.java).also { startActivity(it) }
        }

    }
}