package com.danmin.sopkerton.searchRecycler

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopkerton.DetailActivity
import com.danmin.sopkerton.R


class SearchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val img_content = itemView.findViewById<ImageView>(R.id.img_content)
    val content = itemView.findViewById<TextView>(R.id.content)
    val like = itemView.findViewById<Button>(R.id.btn_like)
    val txt_recipe = itemView.findViewById<TextView>(R.id.txt_recipe)


    fun bind(searchData: SearchData){
        content.text = searchData.content
        txt_recipe.text = searchData.txt_recipe
        Glide.with(itemView).load(searchData.img_content).into(img_content)

        if(searchData.like){
            like.setBackgroundResource(R.drawable.icon_heart_selected)
        }else
            like.setBackgroundResource(R.drawable.icon_heart_unselected)

        like.setOnClickListener {
            if(searchData.like){
                like.setBackgroundResource(R.drawable.icon_heart_unselected)
                searchData.like = false
            }else {
                like.setBackgroundResource(R.drawable.icon_heart_selected)
                searchData.like = true
            }
        }

        itemView.setOnClickListener {
            val intent =  Intent(itemView.context, DetailActivity::class.java)

            itemView.getContext().startActivity(intent)

        }


    }

}