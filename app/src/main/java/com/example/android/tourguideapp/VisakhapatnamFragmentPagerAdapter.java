package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguideapp.Fragments.BeachFragment;
import com.example.android.tourguideapp.Fragments.ParkFragment;
import com.example.android.tourguideapp.Fragments.RestaurantFragment;
import com.example.android.tourguideapp.Fragments.TempleFragment;


public class VisakhapatnamFragmentPagerAdapter extends  FragmentPagerAdapter{
    @SuppressWarnings("FieldCanBeLocal")
    final private int PAGE_COUNT = 4;

    public VisakhapatnamFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    // Get right fragments.
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BeachFragment();
        } else if (position == 1) {
            return new ParkFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new TempleFragment();
        }
    }

    // Generate title based on item position.
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {

            case 0:
                return App.context().getString(R.string.category_beach);

            case 1:
                return App.context().getString(R.string.category_park);

            case 2:
                return App.context().getString(R.string.category_restaurant);

            case 3:
                return App.context().getString(R.string.category_temple);
        }

        return null;
    }

}
