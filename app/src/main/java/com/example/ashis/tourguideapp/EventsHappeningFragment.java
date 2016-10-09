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
        View rootView = inflater.inflate(R.layout.list_view,container,false);
        final ArrayList<infoClass> infoEvents = new ArrayList<infoClass>();
        infoEvents.add(new infoClass(R.drawable.event_arijit_singh,"Rhythm Redefined - A Musical" +
                " Tour with *Arijit Singh*","Leisure valley HUDA Ground, Gurgaon, India",
                "Oct 22 2016 at 06:00 pm to Sat Oct 22 2016 at 10:00 pm "));
        infoEvents.add(new infoClass(R.drawable.event_buddy_daddy_family_bash,"Buddy Daddy Family Bash",
                "Oysters Water Park Appu Ghar Gurgaon, Sector 29, Gurgaon, India","Fri Nov 11 2016"));
        infoEvents.add(new infoClass(R.drawable.event_diwali_mela,"GRAND DIWALI MELA",
                "RWA Regency Park 1,Gurgaon, India","Oct 21 2016 04:00 pm "));
        infoEvents.add(new infoClass(R.drawable.event_dj_yudi,"Commercial Night with DJ Yudi","" +
                " Sense Of Spirits, 11,12 Leisure Valley Road,Gurgaon, India",
                "Oct 15 2016 20:00 hr"));
        infoEvents.add(new infoClass(R.drawable.event_dushera_flea_market,"Dussehra Flea Market",
                " HUDA CITY metro station"," Oct 11 2016 16:00"));
        infoEvents.add(new infoClass(R.drawable.event_inner_voice,"A Silence, A Scream: Explore The" +
                " World Of Inner Voice","DLF Phase 5,Gurgaon","Oct 16 2016 15:00 hr"));
        infoEvents.add(new infoClass(R.drawable.event_marathon,"Millennium City Marathon 2nd Edition," +
                " Gurgaon","Gurgaon, India","Oct 23 2016 04:30 hr"));
        infoEvents.add(new infoClass(R.drawable.event_mentor_hours_pushpendra_thakur,"Mentor Hours with Pushpendra Thakur"
                ,"91springboard, Plot 23, Maruti Industrial Area, Sector 18, Gurgaon, India",
                "Oct 22 2016 10:30 hr"));
        infoEvents.add(new infoClass(R.drawable.event_property_expo,"Biggest Property Expo-2016",
                "Epicentre,Gurgaon, India","Sat Oct 08 2016 at 11:00 am"));
        infoEvents.add(new infoClass(R.drawable.event_unleashes,"Unleashed","Leisure valley HUDA Ground," +
                " Gurgaon, Gurgaon, Haryana"," Sat Nov 05 2016 at 06:00 pm"));
        infoAdapter adapter = new infoAdapter(getActivity(),infoEvents,R.color.colorEvents);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);




        return rootView;
    }

}
