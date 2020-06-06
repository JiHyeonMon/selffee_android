package com.danmin.sopkerton.mainRecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopkerton.R

class MainViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val username = itemView.findViewById<TextView>(R.id.username)
    val img_profile = itemView.findViewById<ImageView>(R.id.img_profile)
    val img_content = itemView.findViewById<ImageView>(R.id.img_content)

    fun bind(mainData: MainData){
        username.text = mainData.username
        Glide.with(itemView).load(mainData.img_profile).into(img_profile)
        Glide.with(itemView).load(mainData.img_content).into(img_content)
    }
}