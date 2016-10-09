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
public class CompaniesFragment extends Fragment {


    public CompaniesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view,container,false);
        final ArrayList<infoClass> infoCompany = new ArrayList<infoClass>();
        infoCompany.add(new infoClass(R.drawable.company_amazon,"AMAZON INDIA","Brigade Gateway,8th floor, Gurgaon"));
        infoCompany.add(new infoClass(R.drawable.company_cognizant,"COGNIZANT","Building No. 3, Unitech Realty Projects" +
                " Limited, Ground, 1st & 2nd floor, IT & ITES village, Gurgaon"));
        infoCompany.add(new infoClass(R.drawable.company_flipkart,"FLIPKART","A 17,APM Tower,Mantra Office, Gurgaon - 122001"));
        infoCompany.add(new infoClass(R.drawable.company_google,"GOOGLE INDIA","Unitech Signature Tower-II , Tower-B, Sector-15 ," +
                "Part-II Village Silokhera, Gurgaon 122001 ,India"));
        infoCompany.add(new infoClass(R.drawable.company_hp,"HEWLETT-PACKARD","Building No-02, DLF CYBERGREEN Phase - III," +
                " GURGAON - 122 022,INDIA"));
        infoCompany.add(new infoClass(R.drawable.company_huawei,"HUAWEI INDIA","4th Floor, DLF Square, Jacaranda Marg, M Block," +
                " DLF City, Phase-II, Gurgaon 122 022,INDIA"));
        infoCompany.add(new infoClass(R.drawable.company_nagaro,"NAGARRO","Electronic City, Udyog Vihar, Gurgaon 122015, India"));
        infoCompany.add(new infoClass(R.drawable.company_nsn,"Nokia Siemens","7th Floor, Building 9A, DLF Cyber city Phase III," +
                " Gurgaon – 122 002, Haryana, India"));
        infoCompany.add(new infoClass(R.drawable.company_oyo,"OYO ROOMS","325,Spaze Tech Park Tower B,Sohna Road, Gurgaon,INDIA"));
        infoCompany.add(new infoClass(R.drawable.company_snapdeal,"SNAPDEAL","Plot No. 249 D And E, ASF Tower I & II, Udyog Vihar Phase IV," +
                " Sector 18, Jwala Mill Road, Gurgaon , INDIA"));
        infoAdapter infoAdapter = new infoAdapter(getActivity(),infoCompany,R.color.colorCompanies);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(infoAdapter);
        return rootView;
    }

}
