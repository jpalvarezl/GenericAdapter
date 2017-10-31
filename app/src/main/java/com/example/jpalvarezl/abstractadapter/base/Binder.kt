package com.example.jpalvarezl.abstractadapter.base

import android.support.annotation.LayoutRes
import android.view.View

class Binder<out T : BaseViewHolder<*>>(val viewHolderConstructor: (view: View) -> T, @LayoutRes val viewType: Int) {
    fun new(view: View) = viewHolderConstructor(view)

    fun handlesViewType(viewType: Int) = this.viewType == viewType
}