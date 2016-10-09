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
        View rootView = inflater.inflate(R.layout.list_view,container,false);
        final ArrayList<infoClass> infoAttraction = new ArrayList<infoClass>();
        infoAttraction.add(new infoClass(R.drawable.attraction_ambience_mall,"Ambience Mall Gurgaon",
                "Ambience Mall NH- 8,, Ambience Island, DLF Phase 3, Sector 24, Gurgaon," +
                        " Haryana 122002, INDIA"));
       infoAttraction.add(new infoClass(R.drawable.attraction_cyber_hub,"DLF Cyber Hub",
                "DLF Cyber City, Phase 3, NH 8, Gurgaon, Haryana 122002 , IDNIA"));
        infoAttraction.add(new infoClass(R.drawable.attraction_damdama_lake,"The Gateway Resort Damdama" +
                " Lake Gurgaon","Off Sohna-Gurgaon Road"));
        infoAttraction.add(new infoClass(R.drawable.attraction_fun_n_food,"Fun N Food Village",
                "Old Delhi, Gurgaon Road, Kapshera, New Delhi, Delhi 110097, INDIA"));
        infoAttraction.add(new infoClass(R.drawable.attraction_kingdon_of_dreams,"Kingdom Of Dreams","Auditorium" +
                " Complex, Near IFFCO Metro Station, Sector 29, Gurgaon, Haryana 122001, INDIA"));
        infoAttraction.add(new infoClass(R.drawable.attraction_leisure_valley,"Leisure Valley","287," +
                " NH 8, Sector 29, Gurgaon, Haryana 122021, INDIA"));
        infoAttraction.add(new infoClass(R.drawable.attraction_mgf,"MGF MALL","A1/59, AIT Chowk," +
                " Sushant Lok Phase I, Sector 55, Gurgaon, Haryana, INDIA"));
        infoAttraction.add(new infoClass(R.drawable.attraction_oyster_beach,"Oyester Beach Water Park"
                ," Sector 29, Huda City Metro Station, Gurgaon, Haryana 122009, INDIA"));
        infoAttraction.add(new infoClass(R.drawable.attraction_sai_ka_aangan,"Sai Ka Aangan","E-Block," +
                " Sushant Lok, Phase-I, Opp. Paras Hospital, Gurgaon, Haryana 122003, INDIA"));
        infoAttraction.add(new infoClass(R.drawable.attraction_sheetla_mata_mandir,"Sheetla Mata " +
                "Mandir","Sheetla Mata Road, Sector 6, Gurgaon, Haryana 122001, INDIA"));
       infoAdapter adapter = new infoAdapter(getActivity(),infoAttraction,R.color.colorAttractions);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);



        return rootView;
    }

}
