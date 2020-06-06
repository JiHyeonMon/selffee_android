package com.danmin.sopkerton.mainRecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopkerton.R
import com.danmin.sopkerton.data.ResponseMainData


class MainViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val title = itemView.findViewById<TextView>(R.id.title)
    val username = itemView.findViewById<TextView>(R.id.username)
    val img_content = itemView.findViewById<ImageView>(R.id.img_content)

    fun bind(mainData: MainData){
        title.text = mainData.title
        username.text = mainData.username
        Glide.with(itemView).load(mainData.img_content).into(img_content)

    }

}