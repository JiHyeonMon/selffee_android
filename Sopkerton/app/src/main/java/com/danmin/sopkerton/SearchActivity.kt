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
                    img_content = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/C11EE686-9970-40AE-A419-2F7DFD77953B.png",
                    content = "오후엔 코코넛 라떼",
                    txt_tag = "디카페인",
                    like = false,
                    txt_recipe = "오늘의 인기 레시피"
                )
            )
            add(
                SearchData(
                    img_content = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/D4086013-D722-4E40-BACC-D1E0DDF37A6D.png",
                    content = "직접 담근 딸기청에이드",
                    txt_tag = "디카페인",
                    like = true,
                    txt_recipe = "오늘의 추천 레시피"

                )
            )
            add(
                SearchData(
                    img_content = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/359B87C3-8BCB-46C1-92EB-800495C93304.png",
                    content = "아메리카노랑 찰떡 브라우니",
                    txt_tag = "디카페인",
                    like = false,
                    txt_recipe = "오늘의 인기 레시피"

                )
            )
            add(
                SearchData(
                    img_content = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/CF580D9B-89E0-4171-A426-D4131DAE2162.png",
                    content = "크로와상 맛있게 만드는 법",
                    txt_tag = "디카페인",
                    like = true,
                    txt_recipe = "오늘의 인기 레시피"

                )
            )

        }
        searchAdapter.datas = datas
        searchAdapter.notifyDataSetChanged()

    }

}
