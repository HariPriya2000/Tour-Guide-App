package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class VisakhapatnamAdapter extends ArrayAdapter<Visakhapatnam> {
    private int mColorResourceId;

    // Initialize ViewHolder.
    public static class ViewHolder {
        TextView textViewVenue;
        TextView textViewHours;
        ImageView imageViewPhoto;
        RelativeLayout textContainer;
    }

    // Initialize the ArrayAdapter's internal storage.
    // Resource "0" because it's a custom adapter for more then one TextView.
    public VisakhapatnamAdapter(Activity context, ArrayList<Visakhapatnam> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list.
        Visakhapatnam currentVisakhapatnam = getItem(position);

        // Create new ViewHolder for text views.
        ViewHolder holder = new ViewHolder();
        holder.textViewVenue = convertView.findViewById(R.id.list_view_venue_title);
        holder.textViewVenue.setText(currentVisakhapatnam.getVenueTitle());
        holder.textViewHours = convertView.findViewById(R.id.list_view_working_hours);
        holder.textViewHours.setText(currentVisakhapatnam.getWorkingHours());

        // Handle an image.
        holder.imageViewPhoto = convertView.findViewById(R.id.list_view_venue_image);
        holder.imageViewPhoto.setImageResource(currentVisakhapatnam.getVenueImage());

        // Set color of the container.
        holder.textContainer = convertView.findViewById(R.id.list_view_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        holder.textContainer.setBackgroundColor(color);

        // Return the whole list item layout.
        return convertView;
    }
}
