package com.example.jpalvarezl.abstractadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jpalvarezl.abstractadapter.base.BaseViewHolder
import com.example.jpalvarezl.abstractadapter.base.BaseViewHolderFactory
import com.example.jpalvarezl.abstractadapter.items.Header1ViewHolder
import com.example.jpalvarezl.abstractadapter.items.Header2ViewHolder
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder
import com.example.jpalvarezl.abstractadapter.model.Header1
import com.example.jpalvarezl.abstractadapter.model.Header2
import com.example.jpalvarezl.abstractadapter.model.TopHeader


class ViewHolderFactory : BaseViewHolderFactory() {
    override fun newViewHolderFromViewType(viewType: Int, parent: ViewGroup?): BaseViewHolder<Any> {
        val inflater = LayoutInflater.from(parent!!.context)
        return when (viewType) {
            R.layout.header1_layout -> Header1ViewHolder(inflater.inflate(viewType, parent, false))
            R.layout.top_header_layout -> TopHeaderViewHolder(inflater.inflate(viewType, parent, false))
            R.layout.header2_layout -> Header2ViewHolder(inflater.inflate(viewType, parent, false))
            else -> null
        } as BaseViewHolder<Any>
    }

    override fun viewTypeFromItem(item: Any): Int {
        if (item is Header1) return R.layout.header1_layout
        if (item is TopHeader) return R.layout.top_header_layout
        if (item is Header2) return R.layout.header2_layout
        return -1
    }
}