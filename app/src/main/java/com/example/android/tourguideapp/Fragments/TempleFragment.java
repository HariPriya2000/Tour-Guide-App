package com.example.android.tourguideapp.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.Visakhapatnam;
import com.example.android.tourguideapp.VisakhapatnamAdapter;

import java.util.ArrayList;

public class TempleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Create an ArrayList for Temples fragment.
        // Populate string arrays with information from strings.xml.
        String[] temple_venues = getResources().getStringArray(R.array.temple_venues);
        String[] temple_working_hours = getResources().getStringArray(R.array.temple_working_hours);
        String[] temple_address = getResources().getStringArray(R.array.temple_address);

        // Get number of venues.
        // It's a counter for loops below.
        int venuesNameSize = temple_venues.length;

        // Populate int array with drawables ID's.
        int[] temple_photo = new int[venuesNameSize];
        for (int i = 0; i < venuesNameSize; i++)
            temple_photo[i] = getResources().getIdentifier("t_" + String.valueOf(i + 1), "drawable", getActivity().getPackageName());

        // Create Array List for Temples.
        final ArrayList<Visakhapatnam> visakhapatnams = new ArrayList<>();
        for (int i = 0; i < venuesNameSize; i++) {
            String venue_name = temple_venues[i];
            String working_hours = temple_working_hours[i];
            String address = temple_address[i];
            int photo = temple_photo[i];
            visakhapatnams.add(new Visakhapatnam(venue_name, working_hours, address, photo));
        }

        // Use VisakhapatnamAdapter.
        VisakhapatnamAdapter adapter = new VisakhapatnamAdapter(getActivity(), visakhapatnams, R.color.category_temple);
        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        ListView listView = rootView.findViewById(R.id.visakhapatnam);
        if (listView != null) {
            listView.setAdapter(adapter);

            // Handle clicks on items in ListView.
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    // Get the Visakhapatnam object at the given position the user clicked on.
                    Visakhapatnam visakhapatnam = visakhapatnams.get(position);
                    // Open link in the browser.
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(visakhapatnam.getAddress()));
                    startActivity(browserIntent);
                }
            });
        }
        return rootView;
    }
}
