package com.danmin.sopkerton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danmin.sopkerton.mainRecycler.MainAdapter
import com.danmin.sopkerton.mainRecycler.MainData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainAdapter: MainAdapter
    val datas = mutableListOf<MainData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_search.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
        btn_mypage.setOnClickListener {
            val intent = Intent(this, MypageActivity::class.java)
            startActivity(intent)
        }
        mainAdapter = MainAdapter(this)
        rv_home.run {
            adapter = mainAdapter
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
        datas.apply {
            add(
                MainData(
                    username = "이정민",
//                    img_profile = "https://avatars1.githubusercontent.com/u/50590192?s=460&u=e6a104455a4e61cb4b4693e1be8debc48bb955f6&v=4",
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~"
                )
            )
        }
        mainAdapter.datas = datas
        mainAdapter.notifyDataSetChanged()
    }
}
