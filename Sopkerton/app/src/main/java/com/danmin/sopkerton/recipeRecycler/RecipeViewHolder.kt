package com.danmin.sopkerton.recipeRecycler

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danmin.sopkerton.R

class RecipeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    val img_recipe : ImageView = itemView.findViewById(R.id.img_recipe)

    fun bind(Related_Recipe_Data: Related_Recipe_Data){
        Glide.with(itemView).load(Related_Recipe_Data.img_receipe).into(img_recipe)
    }
}