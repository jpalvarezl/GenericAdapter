package com.example.jpalvarezl.abstractadapter.base

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class BaseAdapter(private val factory: BaseViewHolderFactory) : RecyclerView.Adapter<BaseViewHolder<Any>>() {

    private lateinit var items: List<*>

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder<Any> =
            factory.newViewHolderFromViewType(viewType, parent)

    override fun onBindViewHolder(holder: BaseViewHolder<Any>?, position: Int) {
        holder!!.bind(items[position]!!)
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = factory.viewTypeFromItem(items[position]!!)

    fun setItems(items: List<*>) {
        this.items = items
        notifyDataSetChanged()
    }
}