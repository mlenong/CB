package com.ibeauty.ibeauty.Recycler;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.ibeauty.ibeauty.R;

/**
 * Created by Anang on 24/10/2016.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    TextView tv1,tv2;
    ImageView imageView;
    ItemClickListener itemClickListener;
    CheckBox checkBox;
    CardView cardView;

    public RecyclerViewHolder(View itemView){
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.daftar_judul);
        //menampilkan text dari widget cardview pada id daftar judul
        tv2 = (TextView) itemView.findViewById(R.id.daftar_harga);
        //menampilkan text deskripsi dari widget CardView pada id daftar_harga
        imageView = (ImageView) itemView.findViewById(R.id.daftar_icon);
        //menampilkan gambar atau icon pada widget Cardview pada id daftar_icon
        checkBox = (CheckBox) itemView.findViewById(R.id.chkSelected);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        itemView.setOnClickListener(this);
    }
    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v, getLayoutPosition());
    }
}
