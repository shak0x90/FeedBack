package com.example.feedback

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import com.example.feedback.databinding.AlerrtDialogBoxBinding
import com.example.feedback.databinding.OtpSreenBinding

class OtpActivity : AppCompatActivity() {
    private lateinit var binding: OtpSreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = OtpSreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        binding.otpverifyContunueId.setOnClickListener {
            customAlertDialog()
            Toast.makeText(this, "Its a toast!", Toast.LENGTH_SHORT).show()

        }


    }

    private fun customAlertDialog() {
        val dialog = Dialog(this)


        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        val binding: AlerrtDialogBoxBinding = AlerrtDialogBoxBinding.inflate(layoutInflater)

        dialog.setContentView(binding.root)

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.netxtBtnId.setOnClickListener {
            val profile = Intent(this,LoginActivity::class.java)
            startActivity(profile)
        }
    }
}