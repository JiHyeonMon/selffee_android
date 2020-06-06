//package com.danmin.sopkerton.mainRecycler
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.danmin.sopkerton.R
//
//class MainAdapter (private val context: Context):RecyclerView.Adapter<MainViewHolder>(){
//
//    var datas = mutableListOf<MainData>()
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
//        val view = LayoutInflater.from(context).inflate(R.layout.item_main,parent,false)
//        return MainViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return datas.size
//    }
//
//    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
//        holder.bind(datas[position])
//    }
//}