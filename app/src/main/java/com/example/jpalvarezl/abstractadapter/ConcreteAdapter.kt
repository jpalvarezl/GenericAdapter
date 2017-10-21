package com.example.jpalvarezl.abstractadapter

import com.example.jpalvarezl.abstractadapter.base.AbstractAdapter
import com.example.jpalvarezl.abstractadapter.base.ViewHolderItem
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder
import com.example.jpalvarezl.abstractadapter.model.TopHeader

class ConcreteAdapter(override var items: List<TopHeader>) : AbstractAdapter<TopHeader>() {

    init {
        notifyDataSetChanged()
    }

    override fun layoutId(): Int {
        return  R.layout.top_header_layout
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        val viewHolder = holder as TopHeaderViewHolder
        viewHolder.bind(items[position])
    }
}
