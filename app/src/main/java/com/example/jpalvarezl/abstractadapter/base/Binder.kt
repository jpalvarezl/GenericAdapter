package com.example.jpalvarezl.abstractadapter.base

import android.support.annotation.LayoutRes
import android.view.View

class Binder<T, out VH : BaseViewHolder<*>>
constructor(private val viewHolderConstructor: (view: View) -> VH,
            @LayoutRes val viewType: Int,
            private val itemHandled: Class<T>) {

    fun new(view: View) = viewHolderConstructor(view)

    fun handlesViewType(viewType: Int) = this.viewType == viewType

    fun handlesType(item: Any) = item::class.java == itemHandled
}