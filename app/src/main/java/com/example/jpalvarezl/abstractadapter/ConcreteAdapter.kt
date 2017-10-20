package com.example.jpalvarezl.abstractadapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

import com.example.jpalvarezl.abstractadapter.base.AbstractAdapter
import com.example.jpalvarezl.abstractadapter.base.ViewHolderItem
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder
import com.example.jpalvarezl.abstractadapter.model.TopHeader

class ConcreteAdapter(override var items: List<TopHeader>) : AbstractAdapter<TopHeader>() {

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        val viewHolder = holder as TopHeaderViewHolder
        viewHolder.bind(items[position])
    }
}
