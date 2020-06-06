package com.danmin.sopkerton

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(private val context : Context) : RecyclerView.Adapter<RecipeViewHolder>(){
    var datas= mutableListOf<Related_Recipe_Data>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        Log.d("어댑터 실행","어댑터")
        val view = LayoutInflater.from(context).inflate(R.layout.item_detail,parent,false)
        return RecipeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(datas[position])
    }


}