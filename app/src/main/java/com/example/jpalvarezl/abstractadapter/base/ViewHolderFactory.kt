package com.example.jpalvarezl.abstractadapter.base

import android.view.LayoutInflater
import android.view.ViewGroup

internal class ViewHolderFactory(private val binders: List<Binder<*, *>>) {

    fun newViewHolder(viewType: Int, parent: ViewGroup?): BaseViewHolder<*>? {
        binders.filter { it.handlesViewType(viewType) }
                .forEach { return it.new(LayoutInflater.from(parent!!.context).inflate(it.viewType, parent, false)) }
        throw IllegalStateException("ViewHolder not found")
    }

    fun viewTypeFromItem(item: Any): Int {
        binders.filter { it.handlesType(item) }
                .forEach { return it.viewType }
        throw IllegalStateException("Item type not handled")
    }
}