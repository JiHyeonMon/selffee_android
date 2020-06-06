package com.danmin.sopkerton.searchRecycler

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopkerton.R

class SearchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val img_search = itemView.findViewById<ImageView>(R.id.img_search)

    fun bind(searchData: SearchData){
        Glide.with(itemView).load(searchData.img_search).into(img_search)
    }
}