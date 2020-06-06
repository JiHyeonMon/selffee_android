package com.danmin.sopkerton.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danmin.sopkerton.R
import com.danmin.sopkerton.myRecycler.MyAdapter
import com.danmin.sopkerton.myRecycler.MyData
import kotlinx.android.synthetic.main.fragment_write.*

class WriteFragment : Fragment() {

    lateinit var myAdapter: MyAdapter
    val datas = mutableListOf<MyData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_write, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myAdapter = MyAdapter(view.context)
        rv_my.run {
            adapter = myAdapter
            layoutManager = GridLayoutManager(view.context, 3)
        }
        loadData()
    }

    private fun loadData() {
        datas.apply {
            add(
                MyData(
                    img_my = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/8829AB2D-53D4-4980-86D3-BB163A0F61B2.png"
                )
            )
            add(
                MyData(
                    img_my = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/548853F2-D7E4-4168-9250-59988D83666D.png"
                )
            )
            add(
                MyData(
                    img_my = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/2213EADA-B36B-46B2-84D6-7DF5CD52BA8F.png"
                )
            )
            add(
                MyData(
                    img_my = "https://cdn.zeplin.io/5edbc8a5387b91b3276e3984/assets/3E2882D2-779D-4357-9015-B3E03D2A93E3.png"
                )
            )
        }
        myAdapter.datas = datas
        myAdapter.notifyDataSetChanged()
    }

}