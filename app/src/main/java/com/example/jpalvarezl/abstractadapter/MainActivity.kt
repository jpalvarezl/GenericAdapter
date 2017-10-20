package com.example.jpalvarezl.abstractadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

import com.example.jpalvarezl.abstractadapter.model.TopHeader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = list as RecyclerView
        val topheaders = arrayOf(TopHeader(), TopHeader(), TopHeader()).asList()
        val adapter = ConcreteAdapter(topheaders)
        list.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}