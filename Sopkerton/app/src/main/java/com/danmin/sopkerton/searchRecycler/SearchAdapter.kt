package com.danmin.sopkerton.searchRecycler

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.danmin.sopkerton.DetailActivity
import com.danmin.sopkerton.MypageActivity
import com.danmin.sopkerton.R

class SearchAdapter (private val context: Context): RecyclerView.Adapter<SearchViewHolder>(){

    var datas = mutableListOf<SearchData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_search,parent,false)
        return SearchViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.bind(datas[position])

    }


}