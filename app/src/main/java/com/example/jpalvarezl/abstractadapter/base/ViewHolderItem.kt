package com.example.jpalvarezl.abstractadapter.base


import android.support.v7.widget.RecyclerView
import android.view.View

abstract class ViewHolderItem<in T>(protected var view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item: T)
}
