package com.danmin.sopkerton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.danmin.sopkerton.mainRecycler.MainAdapter
import com.danmin.sopkerton.mainRecycler.MainData
import com.danmin.sopkerton.network.RequestMainToServer
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
                    username = "예리니짱",
                    img_content = "https://data.whicdn.com/images/309898232/original.jpg",
                    content = "마끼야또가 먹고 싶은 오늘은 브런치로 크로 ...더보기"
                )
            )
            add(
                MainData(
                    title = "너무 더울 땐 생자몽에이드 냠냠",
                    username = "유리미짱",
                    img_content = "https://cdn.seogwipo.co.kr/news/photo/201907/157716_120177_513.jpg",
                    content = "그나저나 벌써 이렇게 덥다고요? 그래서 준 ...더보기"
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
