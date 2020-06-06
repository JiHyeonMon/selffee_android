package com.danmin.sopkerton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    lateinit var RecipeAdapter : RecipeAdapter
    val datas = mutableListOf<Related_Recipe_Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        RecipeAdapter = RecipeAdapter(this)
        rv_Related_recipe.adapter = RecipeAdapter
        loadDatas()

    }

    fun loadDatas(){
        datas.apply{
            add(
                Related_Recipe_Data(
                    img_receipe = "https://post-phinf.pstatic.net/MjAxNzEwMjBfMjIy/MDAxNTA4NDg0NjMyMDA5.N47vV6lH9jF6bzHhwxkz8_zxweHJhIcKptpRh3LJcMog.gJBUpzUqr3XTCZxZ377dZBR88Mr7R-gOXWEzVgUnqVgg.JPEG/%EB%B8%94%EB%9E%99%EC%BB%A4%ED%94%BC.jpg?type=w1200"
                )
            )
            add(
                Related_Recipe_Data(
                    img_receipe = "https://post-phinf.pstatic.net/MjAxNzEwMjBfMjIy/MDAxNTA4NDg0NjMyMDA5.N47vV6lH9jF6bzHhwxkz8_zxweHJhIcKptpRh3LJcMog.gJBUpzUqr3XTCZxZ377dZBR88Mr7R-gOXWEzVgUnqVgg.JPEG/%EB%B8%94%EB%9E%99%EC%BB%A4%ED%94%BC.jpg?type=w1200"
                )
            )
            add(
                Related_Recipe_Data(
                    img_receipe = "https://post-phinf.pstatic.net/MjAxNzEwMjBfMjIy/MDAxNTA4NDg0NjMyMDA5.N47vV6lH9jF6bzHhwxkz8_zxweHJhIcKptpRh3LJcMog.gJBUpzUqr3XTCZxZ377dZBR88Mr7R-gOXWEzVgUnqVgg.JPEG/%EB%B8%94%EB%9E%99%EC%BB%A4%ED%94%BC.jpg?type=w1200"
                )
            )
            add(
                Related_Recipe_Data(
                    img_receipe = "https://post-phinf.pstatic.net/MjAxNzEwMjBfMjIy/MDAxNTA4NDg0NjMyMDA5.N47vV6lH9jF6bzHhwxkz8_zxweHJhIcKptpRh3LJcMog.gJBUpzUqr3XTCZxZ377dZBR88Mr7R-gOXWEzVgUnqVgg.JPEG/%EB%B8%94%EB%9E%99%EC%BB%A4%ED%94%BC.jpg?type=w1200"
                )
            )
            add(
                Related_Recipe_Data(
                    img_receipe = "https://post-phinf.pstatic.net/MjAxNzEwMjBfMjIy/MDAxNTA4NDg0NjMyMDA5.N47vV6lH9jF6bzHhwxkz8_zxweHJhIcKptpRh3LJcMog.gJBUpzUqr3XTCZxZ377dZBR88Mr7R-gOXWEzVgUnqVgg.JPEG/%EB%B8%94%EB%9E%99%EC%BB%A4%ED%94%BC.jpg?type=w1200"
                )
            )
            RecipeAdapter.datas = datas
            RecipeAdapter.notifyDataSetChanged()        }
    }

}
