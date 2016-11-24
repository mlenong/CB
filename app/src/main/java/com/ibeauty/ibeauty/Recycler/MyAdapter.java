package com.ibeauty.ibeauty.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ibeauty.ibeauty.R;

import java.util.ArrayList;

/**
 * Created by Anang on 24/10/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    Context c;
    ArrayList<ItemObjek> itemObjeks;

    public MyAdapter(Context c, ArrayList<ItemObjek> itemObjeks) {
        this.c = c;
        this.itemObjeks = itemObjeks;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tv1.setText(itemObjeks.get(position).getName());
        holder.tv2.setText(itemObjeks.get(position).getHarga());
        holder.imageView.setImageResource(itemObjeks.get(position).getImage());


        //listener
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Toast.makeText(c, itemObjeks.get(pos).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        }


    @Override
    public int getItemCount() {
        return itemObjeks.size();
    }
}
