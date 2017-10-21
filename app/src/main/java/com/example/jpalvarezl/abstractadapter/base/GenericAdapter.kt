package com.example.jpalvarezl.abstractadapter.base

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.jpalvarezl.abstractadapter.R
import com.example.jpalvarezl.abstractadapter.items.TopHeaderViewHolder
import java.util.*

class GenericAdapter<in T, VH : ViewHolderItem<T>> : RecyclerView.Adapter<VH>() {
    private var items: List<T> = Collections.emptyList()

    override fun onBindViewHolder(holder: VH?, position: Int) {
        holder?.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent?.context)
        return TopHeaderViewHolder(inflater.inflate(R.layout.top_header_layout, parent, false)) as VH
    }

    fun setItems(items: List<T>) {
        this.items = items
    }
}
