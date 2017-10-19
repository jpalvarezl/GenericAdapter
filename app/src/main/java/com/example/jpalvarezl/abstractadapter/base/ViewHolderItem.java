package com.example.jpalvarezl.abstractadapter.base;


import android.support.v7.widget.RecyclerView;
import android.view.View;

abstract class ViewHolderItem<T> extends RecyclerView.ViewHolder{
    public ViewHolderItem(View itemView) {
        super(itemView);
    }

    public abstract void bind(T item);
}
