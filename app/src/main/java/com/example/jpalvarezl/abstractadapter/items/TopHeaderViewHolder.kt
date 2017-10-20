package com.example.jpalvarezl.abstractadapter.items

import android.view.View
import android.widget.TextView

import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.base.ViewHolderItem
import com.example.jpalvarezl.abstractadapter.model.TopHeader

class TopHeaderViewHolder(private val view: View) : ViewHolderItem(view) {

    fun bind(topHeader: TopHeader) {
        val mainTitle = view.findViewById<TextView>(R.id.mainTitle)
        val subTitle = view.findViewById<TextView>(R.id.subTitle)
        mainTitle.text = topHeader.mainTitle
        subTitle.text = topHeader.subTitle
    }
}
