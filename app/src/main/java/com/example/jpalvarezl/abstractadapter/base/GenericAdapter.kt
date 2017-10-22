package com.example.jpalvarezl.abstractadapter.base

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.items.Header1ViewHolder
import com.example.jpalvarezl.abstractadapter.items.Header2ViewHolder
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder
import com.example.jpalvarezl.abstractadapter.model.Header1
import com.example.jpalvarezl.abstractadapter.model.Header2
import com.example.jpalvarezl.abstractadapter.model.TopHeader

class GenericAdapter<VH : BaseViewHolder<Any>>(var items: List<Any>) : RecyclerView.Adapter<VH>() {

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent?.context)
        return when (viewType) {
            0 -> TopHeaderViewHolder(inflater.inflate(R.layout.top_header_layout, parent, false))
            1 -> Header1ViewHolder(inflater.inflate(R.layout.header1_layout, parent, false))
            2 -> Header2ViewHolder(inflater.inflate(R.layout.header2_layout, parent, false))
            else -> null
        } as VH
    }

    override fun onBindViewHolder(holder: VH?, position: Int) {
        holder?.bind(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        if (items[position] is TopHeader) return 0
        if (items[position] is Header1) return 1
        if (items[position] is Header2) return 2
        return -1
    }
}
