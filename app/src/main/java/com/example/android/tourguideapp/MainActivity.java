package com.example.android.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        viewPager.setAdapter(new VisakhapatnamFragmentPagerAdapter(getSupportFragmentManager()));

        // Create an adapter that knows which fragment should be shown on each page
        VisakhapatnamFragmentPagerAdapter adapter = new VisakhapatnamFragmentPagerAdapter(getSupportFragmentManager());

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
    }
}
