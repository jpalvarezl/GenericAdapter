package com.example.jpalvarezl.abstractadapter.base

import android.view.LayoutInflater
import android.view.ViewGroup

class ViewHolderFactory(vararg private val binders: Binder<*, *>) {

    fun newViewHolder(viewType: Int, parent: ViewGroup?): BaseViewHolder<*>? {
        binders.filter { it.handlesViewType(viewType) }
                .forEach { return it.new(LayoutInflater.from(parent!!.context).inflate(it.viewType, parent, false)) }
        return null
    }

    fun viewTypeFromItem(item: Any): Int {
        binders.filter { it.handlesType(item) }
                .forEach { return it.viewType }
        return -1
    }
}