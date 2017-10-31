package com.example.jpalvarezl.abstractadapter.items

import android.view.View
import android.widget.TextView
import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.base.BaseViewHolder
import com.example.jpalvarezl.abstractadapter.model.Header1


class Header1ViewHolder(itemView: View?) : BaseViewHolder<Header1>(itemView) {

    private val header1: TextView = itemView!!.findViewById(R.id.header1Text)

    override fun bind(item: Header1) {
        header1.text = item.text
    }
}
