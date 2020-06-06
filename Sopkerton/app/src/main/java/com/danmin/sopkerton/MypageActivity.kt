package com.danmin.sopkerton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.danmin.sopkerton.myRecycler.MyAdapter
import kotlinx.android.synthetic.main.activity_mypage.*

class MypageActivity : AppCompatActivity() {


    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)


        MyViewPager.adapter = MypageAdapter(supportFragmentManager)
        myTab.setupWithViewPager(MyViewPager)


    }
}
