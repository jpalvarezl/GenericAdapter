package com.example.jpalvarezl.abstractadapter.items

import android.view.View
import android.widget.TextView

import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.base.ViewHolderItem
import com.example.jpalvarezl.abstractadapter.model.TopHeader

class TopHeaderViewHolder(view: View) : ViewHolderItem(view) {

    private val subTitle: TextView = view.findViewById<TextView>(R.id.subTitle)
    private val mainTitle: TextView = view.findViewById<TextView>(R.id.mainTitle)

    fun bind(topHeader: TopHeader) {
        mainTitle.text = topHeader.mainTitle
        subTitle.text = topHeader.subTitle
    }
}
