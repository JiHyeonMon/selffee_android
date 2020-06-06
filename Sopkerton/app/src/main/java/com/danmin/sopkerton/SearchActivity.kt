package com.danmin.sopkerton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.danmin.sopkerton.searchRecycler.SearchAdapter
import com.danmin.sopkerton.searchRecycler.SearchData
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    lateinit var searchAdapter: SearchAdapter
    val datas = mutableListOf<SearchData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        searchAdapter = SearchAdapter(this)
        rv_search.run {
            adapter = searchAdapter
            layoutManager =
                LinearLayoutManager(this@SearchActivity, LinearLayoutManager.VERTICAL, false)
        }
        datas.apply {
            add(
                SearchData(
                    img_profile = "https://avatars1.githubusercontent.com/u/50590192?s=460&u=e6a104455a4e61cb4b4693e1be8debc48bb955f6&v=4",
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~"
                )
            )
        }
        searchAdapter.datas = datas
        searchAdapter.notifyDataSetChanged()
    }
}
