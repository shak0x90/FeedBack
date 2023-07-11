package com.example.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.feedback.databinding.ActivityMain2Binding
import com.example.feedback.databinding.ActivityMain3Binding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMain3Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navigationView:BottomNavigationView = binding.navViewtest
        val navController:NavController = Navigation.findNavController(this,R.id.fragmentContainerView3)

        NavigationUI.setupWithNavController(navigationView,navController)
    }
}