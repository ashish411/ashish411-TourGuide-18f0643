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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<infoClass> infoRestaurant = new ArrayList<infoClass>();
        infoRestaurant.add(new infoClass(R.drawable.restaurant_burger_king, getString(R.string.rest_name_bk), getString(R.string.rest_add_bk)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_cafe_delhi_height, getString(R.string.rest_name_cdh), getString(R.string.rest_add_cdh)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_dominos, getString(R.string.rest_name_domi), getString(R.string.rest_add_domi)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_farzi_cafe, getString(R.string.rest_name_farzi), getString(R.string.rest_add_farzi)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_impromptu, getString(R.string.rest_name_impromptu), getString(R.string.rest_add_impromptu)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_mcdonalds, getString(R.string.rest_name_mcd), getString(R.string.rest_add_mcd)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_pind_baluchi, getString(R.string.rest_name_pindBalluchi), getString(R.string.rest_add_pindBalluchi)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_pirates_of_grill, getString(R.string.rest_name_pog), getString(R.string.rest_add_pog)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_pizza_hut, getString(R.string.rest_name_pizzahut), getString(R.string.rest_add_pizzahut)));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_the_monk_cafe, getString(R.string.rest_name_monk), getString(R.string.rest_add_monk)));

        infoAdapter infoAdapter = new infoAdapter(getActivity(), infoRestaurant, R.color.colorRestaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(infoAdapter);


        return rootView;
    }

}
