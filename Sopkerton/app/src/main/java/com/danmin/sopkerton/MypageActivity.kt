package com.danmin.sopkerton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.danmin.sopkerton.myRecycler.Adapter1
import kotlinx.android.synthetic.main.activity_mypage.*

class MypageActivity : AppCompatActivity() {

    lateinit var adapter1: Adapter1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        rv_my.adapter = adapter1
        rv_my.layoutManager = GridLayoutManager(this, 3)

    }
}
