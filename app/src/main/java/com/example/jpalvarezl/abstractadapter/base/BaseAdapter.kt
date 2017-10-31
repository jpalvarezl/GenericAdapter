package com.example.jpalvarezl.abstractadapter.base

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class BaseAdapter
private constructor(private val factory: ViewHolderFactory) : RecyclerView.Adapter<BaseViewHolder<Any>>() {

    constructor(vararg binders: Binder<*, *>) : this(ViewHolderFactory(binders.toList()))

    constructor(binders: List<Binder<*, *>>) : this(ViewHolderFactory(binders.toList()))

    private lateinit var items: List<*>


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) =
            factory.newViewHolder(viewType, parent) as BaseViewHolder<Any>

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