package com.danmin.sopkerton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.danmin.sopkerton.mainRecycler.MainAdapter
import com.danmin.sopkerton.mainRecycler.MainData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mainAdapter: MainAdapter
    val datas = mutableListOf<MainData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainAdapter = MainAdapter(this)
        rv_home.run {
            adapter = mainAdapter
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
        datas.apply {
            add(
                MainData(
                    title = "한가로운 오후엔 코코넛 라떼",
                    username = "by yemini90",
                    img_content = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/10F31776-9AEB-4351-804F-9966491D6395.png",
                    content = "마끼야또가 먹고 싶은 오늘은 브런치로 크로 ...더보기"
                )
            )
            add(
                MainData(
                    title = "직접 담근 딸기청에이드",
                    username = "by 딸기요정",
                    img_content = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/4CE05DFA-67E1-485A-A933-288BE3C2DFEB.png",
                    content = "딸기 철이 지나기 전에 담근 딸기청으로 상큼 ...더보기"
                )
            )
        }
        mainAdapter.datas = datas
        mainAdapter.notifyDataSetChanged()

        btn_my.setOnClickListener {
            val intent = Intent(this, MypageActivity::class.java)
            startActivity(intent)
        }

        btn_search.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
    }
}
