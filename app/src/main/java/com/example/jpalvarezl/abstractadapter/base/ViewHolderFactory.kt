package com.example.jpalvarezl.abstractadapter.base

import android.view.LayoutInflater
import android.view.ViewGroup

class ViewHolderFactory(vararg private val binders: Binder<*, *>) {

    fun newViewHolder(viewType: Int, parent: ViewGroup?): BaseViewHolder<*>? {
        var viewHolder: BaseViewHolder<*>? = null
        for (binder in binders) {
            if (binder.handlesViewType(viewType)) {
                viewHolder = binder.new(LayoutInflater.from(parent!!.context).inflate(binder.viewType, parent, false))
            }
        }
        return viewHolder
    }

    fun viewTypeFromItem(item: Any): Int {
        var viewType = -1
        for (binder in binders) {
            if (binder.handlesType(item)) {
                viewType = binder.viewType
            }
        }
        return viewType
    }
}