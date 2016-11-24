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

public class Fragment2 extends Fragment{

        public Fragment2() {
                // Required empty public constructor
        }


        @Override
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);



        }

        @Override
        public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

                View rootView = inflater.inflate(R.layout.fragment_fragment2, container, false);

                RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.recyclerview2);
                rv.setHasFixedSize(true);
                LinearLayoutManager llm = new LinearLayoutManager(getActivity());
                rv.setLayoutManager(llm);
                rv.setAdapter(new MyAdapter(this.getActivity(),getFragment2()));

                return rootView;
        }

        private ArrayList<ItemObjek> getFragment2() {

                ArrayList<ItemObjek> itemObjeks = new ArrayList<>();
                ItemObjek itemObjek = new ItemObjek("Deep Cleansing", "Rp. 21.000,-", R.drawable.face);
                itemObjeks.add(itemObjek);

                itemObjek = new ItemObjek("Hydrating Facial", "Rp. 22.000,-", R.drawable.face_mask);
                itemObjeks.add(itemObjek);

                itemObjek = new ItemObjek("Anti Aging Facial", "Rp. 23.000,-", R.drawable.icon_masker);
                itemObjeks.add(itemObjek);

                itemObjek = new ItemObjek("Acne Treatment", "Rp. 24.000,-", R.drawable.icon_face);
                itemObjeks.add(itemObjek);


                return itemObjeks;
        }


}