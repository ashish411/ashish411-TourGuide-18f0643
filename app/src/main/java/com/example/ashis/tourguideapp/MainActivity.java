package com.example.ashis.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentAdapter adapter = new FragmentAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tl = (TabLayout) findViewById(R.id.slidingTabs);
        tl.setupWithViewPager(viewPager);
    }
}
