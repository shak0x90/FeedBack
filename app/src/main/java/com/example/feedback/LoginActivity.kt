package com.example.feedback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedback.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.lgbt1.setOnClickListener {
            val login = Intent(this,LoginActivityMain::class.java)
            startActivity(login)
        }
        binding.btnSignup.setOnClickListener {
            val signup =  Intent(this,RegistationActivity::class.java)
            startActivity(signup)
        }
    }
}