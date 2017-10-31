package com.example.jpalvarezl.abstractadapter.base

import android.view.ViewGroup

abstract class BaseViewHolderFactory {

    abstract fun newViewHolderFromViewType(viewType: Int, parent: ViewGroup?): BaseViewHolder<Any>

    abstract fun viewTypeFromViewHolder(viewHolder: BaseViewHolder<*>): Int

    abstract fun viewTypeFromItem(item: Any): Int
}