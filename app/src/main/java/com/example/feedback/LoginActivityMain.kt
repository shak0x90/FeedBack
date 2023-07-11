package com.example.feedback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedback.databinding.LoginScreenBinding

class LoginActivityMain : AppCompatActivity() {
    private lateinit var binding: LoginScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = LoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        binding.logintbtn.setOnClickListener {
            val home = Intent(this,MainActivity2::class.java)
            startActivity(home)
        }

        binding.borwseAsguestArrow.setOnClickListener {
            val home = Intent(this,MainActivity2::class.java)
            startActivity(home)
        }

        binding.forgotpaasbtn.setOnClickListener {
            val forgetacc = Intent(this,ForgetPassWordActivity::class.java)
            startActivity(forgetacc)
        }

        binding.registertxtBtn.setOnClickListener{
            val regac = Intent(this,RegistationActivity::class.java)
            startActivity(regac)
        }
    }
}