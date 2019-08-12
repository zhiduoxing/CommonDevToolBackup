package com.lanson.commondevtools.adapter.recyclerview.base;

import com.lanson.commondevtools.adapter.recyclerview.ViewHolder;

public interface ItemViewDelegate<T>
{

    int getItemViewLayoutId();

    boolean isForViewType(T item, int position);

    void convert(ViewHolder holder, T t, int position);

}