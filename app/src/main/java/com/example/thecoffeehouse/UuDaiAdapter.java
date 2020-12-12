package com.example.thecoffeehouse;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UuDaiAdapter extends RecyclerView.Adapter<UuDaiAdapter.viewHoder> {

    ArrayList<UuDai> listUuDai;
    Context context;
    int layout;

    public UuDaiAdapter(ArrayList<UuDai> listUuDai, Context context, int layout) {
        this.listUuDai = listUuDai;
        this.context = context;
        this.layout = layout;
    }

    @NonNull
    @Override
    public viewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(layout, parent, false);
        return new viewHoder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHoder holder, int position) {
        holder.tvName.setText(listUuDai.get(position).getName());
        holder.img.setImageResource(listUuDai.get(position).getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
    }

    @Override
    public int getItemCount() {
        return listUuDai.size();
    }

    public class viewHoder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView img;

        public viewHoder(@NonNull View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_uudai);
            img = (ImageView) itemView.findViewById(R.id.img_uudai);
        }
    }
}
