package com.example.jpalvarezl.abstractadapter.base

import android.support.v7.widget.RecyclerView

abstract class BaseAdapter<T, VH : BaseViewHolder<T>> : RecyclerView.Adapter<VH>()
