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
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<infoClass> infoCompany = new ArrayList<infoClass>();
        infoCompany.add(new infoClass(R.drawable.company_amazon, getString(R.string.company_name_amazon), getString(R.string.company_address_amazon)));
        infoCompany.add(new infoClass(R.drawable.company_cognizant, getString(R.string.company_name_cognizant), getString(R.string.company_address_cognizant)));
        infoCompany.add(new infoClass(R.drawable.company_flipkart, getString(R.string.company_name_flipkart), getString(R.string.company_address_flipkart)));
        infoCompany.add(new infoClass(R.drawable.company_google, getString(R.string.company_name_google), getString(R.string.company_address_google)));
        infoCompany.add(new infoClass(R.drawable.company_hp, getString(R.string.company_name_hp), getString(R.string.company_address_hp)));
        infoCompany.add(new infoClass(R.drawable.company_huawei, getString(R.string.company_name_huawei), getString(R.string.company_address_huawei)));
        infoCompany.add(new infoClass(R.drawable.company_nagaro, getString(R.string.company_name_nagaro), getString(R.string.company_address_nagaro)));
        infoCompany.add(new infoClass(R.drawable.company_nsn, getString(R.string.company_name_nsn), getString(R.string.company_address_nsn)));
        infoCompany.add(new infoClass(R.drawable.company_oyo, getString(R.string.company_name_oyo), getString(R.string.company_address_oyo)));
        infoCompany.add(new infoClass(R.drawable.company_snapdeal, getString(R.string.company_name_snapdeal), getString(R.string.company_address_snapdeal)));
        infoAdapter infoAdapter = new infoAdapter(getActivity(), infoCompany, R.color.colorCompanies);
        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        listView.setAdapter(infoAdapter);
        return rootView;
    }

}
