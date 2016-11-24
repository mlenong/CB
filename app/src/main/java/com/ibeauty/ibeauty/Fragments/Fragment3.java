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

public class Fragment3 extends Fragment{

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fragment3, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerview3);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyAdapter(this.getActivity(),getFragment3()));

        return rootView;
    }

    private ArrayList<ItemObjek> getFragment3() {

        ArrayList<ItemObjek> itemObjeks = new ArrayList<>();
        ItemObjek itemObjek = new ItemObjek("Parafin", "Rp. 29.000,-", R.drawable.parafin);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Pedikur", "Rp. 28.000,-", R.drawable.manikur);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Manikur", "Rp. 27.000,-", R.drawable.kuku2);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Spa Kuku", "Rp. 26.000,-", R.drawable.spa_kuku);
        itemObjeks.add(itemObjek);



        return itemObjeks;
    }

    //memberi nama tabs
//    @Override
//    public String toString() {
//        return "Fragment 3";
//    }
}