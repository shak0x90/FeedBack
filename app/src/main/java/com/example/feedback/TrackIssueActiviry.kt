package com.example.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.feedback.adapters.TrackIssueAdapter
import com.example.feedback.databinding.ActivityReportIssueBinding
import com.example.feedback.databinding.ActivityTrackIssueActiviryBinding
import com.example.feedback.models.TrackIssueData

class TrackIssueActiviry : AppCompatActivity() {
    private lateinit var binding: ActivityTrackIssueActiviryBinding
    private lateinit var dataList:ArrayList<TrackIssueData>
    private lateinit var adapter: TrackIssueAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTrackIssueActiviryBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dataList = arrayListOf<TrackIssueData>()

        dataList.add(TrackIssueData("Pending","I cant’ track my order","Jan 23, 2021","Lorem ipsum dolor sit amet,consectetur adipiscing elit. Orci consequat pharetra egestas amet, volutpat eu massa velit. Ultrices sed quam vitae morbi. Mi sdd sd egestas quam massa blandit maecenas felis. Purus pellentesque ornare porta ipsum integer.",false))
        dataList.add(TrackIssueData("Solved","I cant’ track my order","Jan 23, 2021","Lorem ipsum dolor sit amet,consectetur adipiscing elit. Orci consequat pharetra egestas amet, volutpat eu massa velit. Ultrices sed quam vitae morbi. Mi sdd sd egestas quam massa blandit maecenas felis. Purus pellentesque ornare porta ipsum integer.",true))

        adapter = TrackIssueAdapter(dataList,this)

        binding.recylerv1.layoutManager=LinearLayoutManager(this)
        binding.recylerv1.adapter = adapter

    }
}