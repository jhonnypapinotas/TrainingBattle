package com.papinotas.trainingbattle.views.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.papinotas.trainingbattle.R;
import com.papinotas.trainingbattle.db.models.Exercise;

import java.util.List;

/**
 * Created by Jhonny Barrios on 01-03-17.
 */
public class ExerciseAdapter extends ArrayAdapter<Exercise> {

    private final LayoutInflater inflater;
    private List<Exercise> items;

    public ExerciseAdapter(Context context, List<Exercise> items) {
        super(context, android.R.layout.simple_spinner_item, items);
        this.items = items;
        inflater=(LayoutInflater) context.getSystemService(  Context.LAYOUT_INFLATER_SERVICE );
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Nullable
    @Override
    public Exercise getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_exercise, parent, false));
        Exercise item = getItem(position);
        holder.tvName.setText(item.getName());
        assert item != null;
        holder.ivIcon
                .setImageDrawable(TextDrawable.builder()
                        .buildRound(String.valueOf(item.getName().charAt(0)).toUpperCase(), ColorGenerator.MATERIAL.getColor(item)));
        return holder.getView();
    }

    private class ViewHolder{
        ImageView ivIcon;
        TextView tvName;
        View view;

        ViewHolder(View view) {
            this.view=view;
            tvName=(TextView) view.findViewById(R.id.tvName);
            ivIcon=(ImageView) view.findViewById(R.id.ivIcon);
        }

        View getView() {
            return view;
        }
    }

}