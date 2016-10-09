package com.example.ashis.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ashis on 10/7/2016.
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CompaniesFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new EventsHappeningFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_company);
        } else if (position == 1) {
            return mContext.getString(R.string.category_restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.category_attraction);
        } else {
            return mContext.getString(R.string.category_events);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
