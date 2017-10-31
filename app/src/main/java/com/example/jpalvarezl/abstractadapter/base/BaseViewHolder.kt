package com.example.jpalvarezl.abstractadapter.base

import android.support.v7.widget.RecyclerView
import android.view.View


abstract class BaseViewHolder<in T>(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(item: T)

    abstract fun handlesItem(item: Any): Boolean
}