package com.example.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feedback.adapters.NotificationAdapter
import com.example.feedback.databinding.NotificatonBinding
import com.example.feedback.models.notificationData

class NotificationsAc : AppCompatActivity() {
    private lateinit var binding: NotificatonBinding
    private lateinit var notificationAdapter:NotificationAdapter
    private lateinit var notificationData: ArrayList<notificationData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = NotificatonBinding.inflate(layoutInflater)
        setContentView(binding.root)
        notificationData = ArrayList<notificationData>()

        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","Just Now"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","10 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))
        notificationData.add(notificationData("You have a new order on 27th may\nfrom Joykub Gouce ","12 hours ago"))

        notificationAdapter = NotificationAdapter(notificationData,this)

        binding.newsetReclerVid.layoutManager = LinearLayoutManager(this)
        binding.newsetReclerVid.adapter=notificationAdapter

        binding.previousRcVID.layoutManager = LinearLayoutManager(this)
        binding.previousRcVID.adapter=notificationAdapter

    }

}