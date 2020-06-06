package com.danmin.sopkerton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
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
            layoutManager = GridLayoutManager(this@SearchActivity, 2)

        }

        datas.apply {
            add(
                SearchData(
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~"
                )
            )
        }
        searchAdapter.datas = datas
        searchAdapter.notifyDataSetChanged()
    }
}
