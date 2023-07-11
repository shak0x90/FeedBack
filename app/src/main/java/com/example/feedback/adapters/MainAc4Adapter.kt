package com.example.feedback.adapters

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.feedback.databinding.Activity4cardBinding

import com.example.feedback.models.Cardv4D

class MainAc4Adapter(var datalist:ArrayList<Cardv4D>,var context: Context):
    RecyclerView.Adapter<MainAc4Adapter.Card4ViewHolder>() {
    class Card4ViewHolder(var binding: Activity4cardBinding):RecyclerView.ViewHolder(binding.root) {


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Card4ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Card4ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}