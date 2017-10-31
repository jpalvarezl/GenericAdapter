package com.example.jpalvarezl.abstractadapter.base

import android.view.View

class ViewHolderFactory(vararg private val binders:Binder<*>) {

    fun newViewHolder(viewType: Int, parent: View?) =
            binders.filter { binder -> binder.handlesViewType(viewType) }[0].new(parent!!)

}