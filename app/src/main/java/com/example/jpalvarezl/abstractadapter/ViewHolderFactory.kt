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
            0 -> Header1ViewHolder(inflater.inflate(R.layout.header1_layout, parent, false))
            1 -> TopHeaderViewHolder(inflater.inflate(R.layout.top_header_layout, parent, false))
            2 -> Header2ViewHolder(inflater.inflate(R.layout.header2_layout, parent, false))
            else -> null
        } as BaseViewHolder<Any>
    }

    override fun viewTypeFromViewHolder(viewHolder: BaseViewHolder<*>): Int {
        if (viewHolder is Header1ViewHolder) return 0
        if (viewHolder is TopHeaderViewHolder) return 1
        if (viewHolder is Header2ViewHolder) return 2
        return -1
    }

    override fun viewTypeFromItem(item: Any): Int {
        if (item is Header1) return 0
        if (item is TopHeader) return 1
        if (item is Header2) return 2
        return -1
    }
}