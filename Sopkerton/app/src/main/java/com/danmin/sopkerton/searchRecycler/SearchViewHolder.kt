package com.danmin.sopkerton.searchRecycler

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopkerton.R

class SearchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val img_profile = itemView.findViewById<ImageView>(R.id.img_profile)
    val img_content = itemView.findViewById<ImageView>(R.id.img_content)
    val content = itemView.findViewById<TextView>(R.id.content)

    fun bind(searchData: SearchData){

        content.text = searchData.content
        Glide.with(itemView).load(searchData.img_profile).into(img_profile)
        Glide.with(itemView).load(searchData.img_content).into(img_content)
    }
}