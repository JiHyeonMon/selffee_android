package com.danmin.sopkerton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.danmin.sopkerton.fragment.WriteFragment
import com.danmin.sopkerton.myRecycler.MyAdapter
import kotlinx.android.synthetic.main.activity_mypage.*
import kotlinx.android.synthetic.main.fragment_write.*
import kotlinx.android.synthetic.main.item_my.*

class MypageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        MyViewPager.adapter = MypageAdapter(supportFragmentManager)
        myTab.setupWithViewPager(MyViewPager)

        btn_write.setOnClickListener {
            val intent = Intent(this, UploadActivity::class.java)
            startActivity(intent)
        }
    }
}
