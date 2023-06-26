package com.example.feedback

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView.RecyclerListener
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2


class ImageAdapter (private val imageList: AbstractList<Int>,private val viewPager2: ViewPager2) :
    RecyclerView.Adapter<ImageAdapter.ImageViewholder>() {
    class ImageViewholder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ImageView:ImageView = itemView.findViewById(R.id.sliderimgId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewholder {
        val view = (LayoutInflater.from(parent.context).inflate(R.layout.sliderlayout,parent))

        return ImageViewholder(view)
    }



  override fun onBindViewHolder(holder: ImageViewholder, position: Int) {
//        holder.ImageView.setImageResource(imageList[position])
//        if (position==imageList.size-1){
//            viewPager2.post(runnable)
//        }
//
     }
    override fun getItemCount(): Int {
        return imageList.size
    }

//    private val runnable = Runnable {  imageList. }
//    notifyDataSetChanged()
//    }
}