package com.example.jpalvarezl.abstractadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.jpalvarezl.abstractadapter.base.BaseAdapter
import com.example.jpalvarezl.abstractadapter.base.Binder
import com.example.jpalvarezl.abstractadapter.base.ViewHolderFactory
import com.example.jpalvarezl.abstractadapter.items.Header1ViewHolder
import com.example.jpalvarezl.abstractadapter.items.Header2ViewHolder
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder
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
        val elements = arrayOf(TopHeader(), Header1(), TopHeader(), Header2(), TopHeader(), TopHeader(), Header1(), TopHeader()).asList()
        val adapter = BaseAdapter(getFactory())
        list.adapter = adapter
        adapter.setItems(elements)
    }

    fun getFactory(): ViewHolderFactory = ViewHolderFactory(Binder(::TopHeaderViewHolder, R.layout.top_header_layout, TopHeader::class.java),
            Binder(::Header1ViewHolder, R.layout.header1_layout, Header1::class.java),
            Binder(::Header2ViewHolder, R.layout.header2_layout, Header2::class.java))

}
