package com.example.feedback.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feedback.databinding.OrderHistoryCardBinding
import com.example.feedback.models.OrderHistoryData


class OrderHistroryAdapter(var dataList:ArrayList<OrderHistoryData>,var context: Context):
    RecyclerView.Adapter<OrderHistroryAdapter.OrderHistotViewHolder>() {
    class OrderHistotViewHolder(var binding: OrderHistoryCardBinding):RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderHistotViewHolder {
        var binding = OrderHistoryCardBinding.inflate(LayoutInflater.from(context),parent,false)
        return OrderHistotViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: OrderHistotViewHolder, position: Int) {
        holder.binding.nameTvid.text = dataList[position].name
        holder.binding.timetexTVid.text = dataList[position].time
        holder.binding.datetextTv.text = dataList[position].date
        holder.binding.sramountTvid.text = dataList[position].srvalue.toString()
        holder.binding.ordersTracktvID.text = dataList[position].trackId
    }
}