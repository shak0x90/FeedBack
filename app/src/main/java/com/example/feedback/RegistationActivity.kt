package com.example.feedback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedback.databinding.RegistationScreenBinding

class RegistationActivity : AppCompatActivity() {
    private lateinit var binding: RegistationScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = RegistationScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        binding.regisBtnBottomId.setOnClickListener {
            val otpverify = Intent(this,OtpActivity::class.java)
            startActivity(otpverify)
        }
    }
}