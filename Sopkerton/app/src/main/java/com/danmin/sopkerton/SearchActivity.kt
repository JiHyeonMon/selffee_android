package com.danmin.sopkerton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.danmin.sopkerton.searchRecycler.SearchAdapter
import com.danmin.sopkerton.searchRecycler.SearchData
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    lateinit var searchAdapter: SearchAdapter
    val datas = mutableListOf<SearchData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        btn_left.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_search.setOnClickListener {
            rv_search.visibility = View.GONE
            linearLayout.visibility = View.VISIBLE
            edit_search.setText("")

        }

        btn_hash1.setOnClickListener {
            edit_search.setText(btn_hash1.text)
            rv_search.visibility = View.VISIBLE
            linearLayout.visibility = View.GONE
        }
        btn_hash2.setOnClickListener {
            edit_search.setText(btn_hash2.text)
            rv_search.visibility = View.VISIBLE
            linearLayout.visibility = View.GONE
        }


        searchAdapter = SearchAdapter(this)
        rv_search.run {
            adapter = searchAdapter
            layoutManager = GridLayoutManager(this@SearchActivity, 2)


        }

        datas.apply {
            add(
                SearchData(
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~",
                    txt_tag = "디카페인",
                    like = true
                )
            )
            add(
                SearchData(
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~",
                    txt_tag = "디카페인",
                    like = true
                )
            )
            add(
                SearchData(
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~",
                    txt_tag = "디카페인",
                    like = true
                )
            )
            add(
                SearchData(
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~",
                    txt_tag = "디카페인",
                    like = true
                )
            )
            add(
                SearchData(
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~",
                    txt_tag = "디카페인",
                    like = true
                )
            )
            add(
                SearchData(
                    img_content = "https://img.insight.co.kr/static/2018/09/15/700/747cl3tq51cz06846r5u.jpg",
                    content = "우와~~~~",
                    txt_tag = "디카페인",
                    like = true
                )
            )
        }
        searchAdapter.datas = datas
        searchAdapter.notifyDataSetChanged()

    }

}
