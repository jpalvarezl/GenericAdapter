package com.example.jpalvarezl.abstractadapter.base;

import android.support.v7.widget.RecyclerView;


import java.util.List;

public abstract class AbstractAdapter<T extends ViewHolderItem> extends RecyclerView.Adapter<ViewHolderItem<T>>{

    private List<T> items;

    @Override
    public void onBindViewHolder(ViewHolderItem<T> holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(List<T> items) {
        this.items = items;
        notifyDataSetChanged();
    }
}
