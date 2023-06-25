package com.example.feedback.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.feedback.R
import com.example.feedback.models.ViewpagerImgData

class VewPageradapter(var list: ArrayList<ViewpagerImgData>,var context: Context):RecyclerView.Adapter<VewPageradapter.ViewHolder>() {
    class ViewHolder(itemView:View ):RecyclerView.ViewHolder(itemView) {
        val  sliferimg : ImageView = itemView.findViewById(R.id.sliderimgId)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sliderlayout,parent,false)
        return ViewHolder(view)
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        list.size
    }
}