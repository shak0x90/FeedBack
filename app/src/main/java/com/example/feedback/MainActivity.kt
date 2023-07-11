package com.example.feedback

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.ProgressBar
import com.example.feedback.databinding.SplashScreenBinding
import com.example.feedback.ui.dashboard.DashboardFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: SplashScreenBinding

    private val spashTime:Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = SplashScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
       var progressbar = binding.Progressbar
        progressbar.max=100

        val currentprogress =60
        ObjectAnimator.ofInt(progressbar,"progress",currentprogress)
            .setDuration(spashTime).start()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginActivityMain::class.java)
            startActivity(intent)

        }, spashTime)
    }
}