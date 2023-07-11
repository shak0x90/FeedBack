package com.example.feedback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedback.databinding.ForgetpasswordScreenBinding

class ForgetPassWordActivity : AppCompatActivity() {
    private lateinit var binding: ForgetpasswordScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ForgetpasswordScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        binding.sendBtnID.setOnClickListener {
            val otp = Intent(this,OtpActivity::class.java)
            startActivity(otp)
        }
    }
}