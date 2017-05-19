package com.by.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    var adapter:RecyclerViewAdapter  ?= null

//    var adapter:RecyclerViewAdapter  = null!!


    var list =ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        initView()
    }

    fun initView() {
        for (i in 0 ..20){
            list.add("木子饼干" + i)
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = RecyclerViewAdapter(this,list)
        recyclerView.adapter = adapter

    }
}
