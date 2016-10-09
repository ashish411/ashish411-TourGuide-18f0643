package com.example.ashis.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<infoClass> infoAttraction = new ArrayList<infoClass>();
        infoAttraction.add(new infoClass(R.drawable.attraction_ambience_mall,
                getString(R.string.attraction_name_ambience), getString(R.string.attraction_address_ambience)));
        infoAttraction.add(new infoClass(R.drawable.attraction_cyber_hub,
                getString(R.string.attraction_name_cyber_hub), getString(R.string.attraction_address_cyber_hub)));
        infoAttraction.add(new infoClass(R.drawable.attraction_damdama_lake, getString(R.string.attraction_name_damdama),
                getString(R.string.attraction_address_damdama)));
        infoAttraction.add(new infoClass(R.drawable.attraction_fun_n_food, getString(R.string.attraction_name_fun_n_food),
                getString(R.string.attraction_address_funnfood)));
        infoAttraction.add(new infoClass(R.drawable.attraction_kingdon_of_dreams, getString(R.string.attraction_name_kod), getString(R.string.attraction_address_kod)));
        infoAttraction.add(new infoClass(R.drawable.attraction_leisure_valley, getString(R.string.attraction_name_leisure), getString(R.string.attraction_address_leisure)));
        infoAttraction.add(new infoClass(R.drawable.attraction_mgf, getString(R.string.attraction_name_mgf), getString(R.string.attraction_address_mgf)));
        infoAttraction.add(new infoClass(R.drawable.attraction_oyster_beach, getString(R.string.attraction_name_oyster)
                , getString(R.string.attraction_address_oyster)));
        infoAttraction.add(new infoClass(R.drawable.attraction_sai_ka_aangan,
                getString(R.string.attraction_name_sai), getString(R.string.attraction_address_sai)));
        infoAttraction.add(new infoClass(R.drawable.attraction_sheetla_mata_mandir, getString(R.string.attraction_name_sheetla), getString(R.string.attraction_address_sheetla)));
        infoAdapter adapter = new infoAdapter(getActivity(), infoAttraction, R.color.colorAttractions);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);


        return rootView;
    }

}
