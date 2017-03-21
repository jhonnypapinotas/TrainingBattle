package com.papinotas.trainingbattle.views.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.papinotas.trainingbattle.R;
import com.papinotas.trainingbattle.db.models.Register;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tecnomei on 01-03-17.
 */
public abstract class BaseListAdapter<T,V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V>{


    private final ArrayList<T> list;

    public BaseListAdapter(ArrayList<T> list) {
        this.list=list;
    }

    @Override
    public V onCreateViewHolder(ViewGroup parent, int viewType) {
        return getNewViewHolder(LayoutInflater.from(parent.getContext()).inflate(getLayoutIdByType(viewType),parent,false));
    }

    protected abstract V getNewViewHolder(View inflate);

    protected abstract int getLayoutIdByType(int viewType);

    @Override
    public void onBindViewHolder(V holder, int position) {
        bindViewHolder(holder,position,getItem(position));
    }

    private T getItem(int position) {
        return list.get(position);
    }

    protected abstract void bindViewHolder(V holder, int position, T item);


    @Override
    public int getItemCount() {
        return list.size();
    }
}