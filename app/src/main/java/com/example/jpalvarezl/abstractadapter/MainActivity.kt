package com.example.jpalvarezl.abstractadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.jpalvarezl.abstractadapter.base.GenericAdapter
import com.example.jpalvarezl.abstractadapter.model.Header1
import com.example.jpalvarezl.abstractadapter.model.Header2
import com.example.jpalvarezl.abstractadapter.model.TopHeader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = list as RecyclerView
        list.layoutManager = LinearLayoutManager(this)
        val elements = arrayOf(TopHeader(), Header1(), TopHeader(), Header2(), TopHeader(), TopHeader()).asList()
        val adapter = GenericAdapter(elements)
        list.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}
