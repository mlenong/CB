package com.ibeauty.ibeauty.Fragments;

/**
 * Created by Anang on 24/10/2016.
 */


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ibeauty.ibeauty.Recycler.ItemObjek;
import com.ibeauty.ibeauty.Recycler.MyAdapter;
import com.ibeauty.ibeauty.R;

import java.util.ArrayList;

/**
 * Created by Anang on 24/10/2016.
 */

public class Fragment4 extends Fragment{

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fragment4, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerview4);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyAdapter(this.getActivity(),getFragment4()));

        return rootView;
    }

    private ArrayList<ItemObjek> getFragment4() {

        ArrayList<ItemObjek> itemObjeks = new ArrayList<>();
        ItemObjek itemObjek = new ItemObjek("Kode Antrian : Qu001", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Kode Antrian : Qu002", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Kode Antrian : Qu003", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Kode Antrian : Qu004", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Kode Antrian : Qu005", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Kode Antrian : Qu006", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Kode Antrian : Qu007", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Kode Antrian : Qu008", "", R.drawable.qr_code);
        itemObjeks.add(itemObjek);

        return itemObjeks;
    }

    //memberi nama tabs
//    @Override
//    public String toString() {
//        return "Fragment 4";
//    }
}