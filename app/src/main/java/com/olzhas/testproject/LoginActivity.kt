package com.olzhas.testproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signUptxt : TextView = findViewById(R.id.signUp)
        signUptxt.setOnClickListener {
            Intent(this, MainActivity::class.java).also { startActivity(it) }
        }

    }
}