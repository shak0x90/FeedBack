package com.example.feedback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedback.databinding.ActivityReportIssueBinding

class ReportIssueActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReportIssueBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityReportIssueBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ReportIsuueIDContinue.setOnClickListener {
            val trackIsuue = Intent(this,TrackIssueActiviry::class.java)
            startActivity(trackIsuue)
        }
    }
}