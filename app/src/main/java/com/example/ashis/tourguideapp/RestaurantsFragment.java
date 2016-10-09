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
        View rootView = inflater.inflate(R.layout.list_view,container,false);
        final ArrayList<infoClass> infoRestaurant = new ArrayList<infoClass>();
        infoRestaurant.add(new infoClass(R.drawable.restaurant_burger_king,"BURGER KING","City Center Mall," +
                " Sector 28, MG Road, DLF City, Gurgaon, Haryana 122002 , INDIA"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_cafe_delhi_height,"CAFE DELHI HEIGHT","Ambience Mall," +
                " 3rd Floor, 301 & 302, Ambience Mall, NH8, Gurgaon, Haryana 122016, INDIA"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_dominos,"DOMINO'S","SCF-82, Ground Floor," +
                " Sector 22, Gurgaon, Haryana 122015, INDIA"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_farzi_cafe,"FARZI CAFE","7-8, Ground Floor," +
                "DLF Cyber Hub, Cyber City, Gurgaon, Haryana 122001 ,INDIA"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_impromptu,"IMPROMPTU","Vatika Tower Gurgaon," +
                " Vatika Towers, BLC-143,Sector 54, Gurgaon, Haryana"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_mcdonalds,"McDonald's"," Shop No.: AGF-02 and RFF-101," +
                " Ansal Triangle, Palam Vihar, Gurgaon, Haryana 122017, INDIA"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_pind_baluchi,"Pind Balluchi Restaurant & Bar","Vatika Grand," +
                " Leisure Valley, Sector 29, Gurgaon, Haryana 122002, INDIA"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_pirates_of_grill,"Pirates Of Grill","MGF Metropolitan Mall," +
                " Shop No. 7 - 10, Ground Floor, MGF Mega City Mall, MG Road, Gurgaon"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_pizza_hut,"Pizza Hut","A2, Cybergreens Cybercity, DLF Ph 3, Gurgaon, HR 122001, INDIA"));
        infoRestaurant.add(new infoClass(R.drawable.restaurant_the_monk_cafe,"The Monk","Galaxy Hotel, National Highway 8, Sector 15, Part-2, Gurgaon," +
                " Haryana 122001, INDIA"));

        infoAdapter infoAdapter = new infoAdapter(getActivity(),infoRestaurant,R.color.colorRestaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(infoAdapter);



        return rootView;
    }

}
