package com.example.feedback.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatRadioButton
import androidx.recyclerview.widget.RecyclerView
import com.example.feedback.R
import com.example.feedback.databinding.NotificaionslidercardBinding
import com.example.feedback.models.notificationData

class NotificationAdapter(var dataList:ArrayList<notificationData>,var context:Context):RecyclerView.Adapter<NotificationAdapter.MyviewHolder>() {
    class MyviewHolder(var binding: NotificaionslidercardBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
//        var view = LayoutInflater.from(context).inflate(R.layout.notificaton,parent,false)
//
//        return MyviewHolder()
        var binding = NotificaionslidercardBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyviewHolder(binding)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        holder.binding.radiobtnbId.text= dataList.get(position).notiText
        holder.binding.timetextid.text= dataList.get(position).timeText
    }
}


