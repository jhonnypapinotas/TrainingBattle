package com.papinotas.trainingbattle.views.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.papinotas.trainingbattle.R;
import com.papinotas.trainingbattle.db.models.Register;
import java.util.ArrayList;

/**
 * Created by tecnomei on 01-03-17.
 */
public class RegisterAdapter extends BaseListAdapter<Register,RegisterAdapter.ViewHolder>{

    public RegisterAdapter(ArrayList<Register> list) {
        super(list);
    }

    @Override
    protected ViewHolder getNewViewHolder(View inflate) {
        return new ViewHolder(inflate);
    }

    @Override
    protected int getLayoutIdByType(int viewType) {
        return R.layout.item_register;
    }

    @Override
    protected void bindViewHolder(ViewHolder holder, int position, Register item) {
        holder.tvDay.setText(item.getDay());
        holder.tvMonth.setText(item.getMonth());
        holder.tvHour.setText(item.getHour());
        holder.ivIcon
                .setImageDrawable(TextDrawable.builder()
                        .buildRound(String.valueOf(item.getQuantity()).toUpperCase(), ColorGenerator.MATERIAL.getColor(item)));
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvDay,tvMonth,tvHour;
        ImageView ivIcon;
        public ViewHolder(View itemView) {
            super(itemView);
            tvDay= (TextView) itemView.findViewById(R.id.tvDay);
            tvMonth= (TextView) itemView.findViewById(R.id.tvMonth);
            tvHour= (TextView) itemView.findViewById(R.id.tvHour);
            ivIcon= (ImageView) itemView.findViewById(R.id.ivIcon);
        }
    }
}