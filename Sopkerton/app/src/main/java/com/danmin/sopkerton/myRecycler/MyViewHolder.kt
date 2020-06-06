package com.danmin.sopkerton.myRecycler

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopkerton.R

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val img_my = itemView.findViewById<ImageView>(R.id.img_my)

    fun bind(myData: MyData) {
        Glide.with(itemView).load(myData.img_my).into(img_my)
    }
}