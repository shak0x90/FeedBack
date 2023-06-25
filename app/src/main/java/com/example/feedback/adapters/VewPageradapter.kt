package com.example.feedback.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.feedback.R
import com.example.feedback.models.ViewpagerImgData
import java.util.Collections.list


class VewPageradapter(var list: ArrayList<ViewpagerImgData>,var context: Context):RecyclerView.Adapter<VewPageradapter.ViewHolder>() {
    class ViewHolder(itemView:View ):RecyclerView.ViewHolder(itemView) {
        val  sliferimg : ImageView = itemView.findViewById(R.id.sliderimgId)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sliderlayout,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        var currentItem = list(position)
//            Glide.with(context.applicationContext).load(currentItem.image).into

    }
}