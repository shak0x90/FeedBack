package com.example.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.feedback.adapters.OrderHistroryAdapter
import com.example.feedback.databinding.OrderHistoryBinding
import com.example.feedback.models.OrderHistoryData

class orderHistory : AppCompatActivity() {
    lateinit var binding: OrderHistoryBinding
    lateinit var dataList:ArrayList<OrderHistoryData>
    lateinit var orderHistoryAdater:OrderHistroryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = OrderHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)

        dataList = ArrayList<OrderHistoryData>()

        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))
        dataList.add(OrderHistoryData("Shakil",124.00,"11:1 Am","20 july,2022","#12338499"))

        orderHistoryAdater = OrderHistroryAdapter(dataList,this)

        binding.RecylerOrderHIstory.layoutManager = LinearLayoutManager(this)
        binding.RecylerOrderHIstory.adapter = orderHistoryAdater


    }
}