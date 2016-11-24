package com.ibeauty.ibeauty.Fragments;

/**
 * Created by Anang on 24/10/2016.
 */


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
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

public class Fragment1 extends Fragment{

    MyAdapter adapter;
    StringBuffer sb;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerview1);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyAdapter(this.getActivity(),getFragment1()));

        adapter = new MyAdapter(this.getActivity(),getFragment1());


        return rootView;
    }

    private ArrayList<ItemObjek> getFragment1() {

        ArrayList<ItemObjek> itemObjeks = new ArrayList<>();
        ItemObjek itemObjek = new ItemObjek("Hair Coloring", "Rp. 20.000,-", R.drawable.ptg);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Hair Toning", "Rp. 20.500,-", R.drawable.ptg);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Bleaching", "Rp. 20.600,-", R.drawable.ptg);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Rebonding", "Rp. 20.700,-", R.drawable.he);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Creambath", "Rp. 20.800,-", R.drawable.ptg);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Blow", "Rp. 20.800,-", R.drawable.ptg);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Catok", "Rp. 20.900,-", R.drawable.ptg);
        itemObjeks.add(itemObjek);

        itemObjek = new ItemObjek("Styling", "Rp. 21.000,-", R.drawable.poni);
        itemObjeks.add(itemObjek);

        return itemObjeks;
    }

    //memberi nama tabs
//    @Override
//    public String toString() {
//        return "Fragment 1";
//    }
}