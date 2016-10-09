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
public class EventsHappeningFragment extends Fragment {


    public EventsHappeningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<infoClass> infoEvents = new ArrayList<infoClass>();
        infoEvents.add(new infoClass(R.drawable.event_arijit_singh, getString(R.string.events_name_arijitsingh), getString(R.string.events_address_arijitsingh), getString(R.string.events_date_arijitsingh)));
        infoEvents.add(new infoClass(R.drawable.event_buddy_daddy_family_bash, getString(R.string.events_name_buddyDaddy),
                getString(R.string.events_name_buddyDaddy), getString(R.string.events_date_buddyDaddy)));
        infoEvents.add(new infoClass(R.drawable.event_diwali_mela, getString(R.string.events_name_diwaliMela),
                getString(R.string.events_address_diwaliMela), getString(R.string.events_date_diwaliMela)));
        infoEvents.add(new infoClass(R.drawable.event_dj_yudi, getString(R.string.events_name_djYudi), getString(R.string.events_name_djYudi),
                getString(R.string.events_date_djYudi)));
        infoEvents.add(new infoClass(R.drawable.event_dushera_flea_market, getString(R.string.events_name_dusheraflea),
                getString(R.string.events_address_dusheraflea), getString(R.string.events_date_dusheraflea)));
        infoEvents.add(new infoClass(R.drawable.event_inner_voice, getString(R.string.events_name_innerVoice), getString(R.string.events_address_innerVoice), getString(R.string.events_date_innerVoice)));
        infoEvents.add(new infoClass(R.drawable.event_marathon, getString(R.string.events_name_marathon), getString(R.string.events_address_marathon), getString(R.string.events_date_marathon)));
        infoEvents.add(new infoClass(R.drawable.event_mentor_hours_pushpendra_thakur, getString(R.string.events_name_mentorHour)
                , getString(R.string.events_address_innerVoice),
                getString(R.string.events_date_innerVoice)));
        infoEvents.add(new infoClass(R.drawable.event_property_expo, getString(R.string.events_name_propertyExpo),
                getString(R.string.events_address_propertyExpo), getString(R.string.events_date_propertyExpo)));
        infoEvents.add(new infoClass(R.drawable.event_unleashes, getString(R.string.events_name_unleaashed), getString(R.string.events_address_unleaashed), getString(R.string.events_date_unleaashed)));
        infoAdapter adapter = new infoAdapter(getActivity(), infoEvents, R.color.colorEvents);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);


        return rootView;
    }

}
