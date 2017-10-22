package com.example.jpalvarezl.abstractadapter.items

import android.view.View
import android.widget.TextView
import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.base.BaseViewHolder
import com.example.jpalvarezl.abstractadapter.model.TopHeader

class TopHeaderViewHolder(view: View) : BaseViewHolder<TopHeader>(view) {

    private val subTitle: TextView = view.findViewById(R.id.subTitle)
    private val mainTitle: TextView = view.findViewById(R.id.mainTitle)

    override fun bind(item: TopHeader) {
        mainTitle.text = item.mainTitle
        subTitle.text = item.subTitle
    }
}
