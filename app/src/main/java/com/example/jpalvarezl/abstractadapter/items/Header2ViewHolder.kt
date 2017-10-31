package com.example.jpalvarezl.abstractadapter.items

import android.view.View
import android.widget.TextView
import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.base.BaseViewHolder
import com.example.jpalvarezl.abstractadapter.model.Header2

class Header2ViewHolder(itemView: View?) : BaseViewHolder<Header2>(itemView) {

    private val header2: TextView = itemView!!.findViewById(R.id.header2Text)

    override fun handlesItem(item: Any) = item is Header2

    override fun bind(item: Header2) {
        header2.text = item.test
    }

}