package com.example.jpalvarezl.abstractadapter.base

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder

abstract class AbstractAdapter<T> : RecyclerView.Adapter<ViewHolderItem>() {

    protected abstract var items: List<T>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val inflater = LayoutInflater.from(parent.context)
        return TopHeaderViewHolder(inflater.inflate(layoutId(), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    abstract fun layoutId(): Int
}
