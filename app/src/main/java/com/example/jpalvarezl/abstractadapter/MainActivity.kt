package com.example.jpalvarezl.abstractadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.jpalvarezl.abstractadapter.base.GenericAdapter
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder
import com.example.jpalvarezl.abstractadapter.model.TopHeader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = list as RecyclerView
        list.layoutManager = LinearLayoutManager(this)
        val topheaders = arrayOf(TopHeader(), TopHeader(), TopHeader()).asList()
        val adapter = GenericAdapter<TopHeader, TopHeaderViewHolder>()
        list.adapter = adapter
        adapter.setItems(topheaders)
        adapter.notifyDataSetChanged()
    }
}
