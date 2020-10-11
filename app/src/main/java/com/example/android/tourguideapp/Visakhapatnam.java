package com.example.android.tourguideapp;

public class Visakhapatnam {

    /**
     * Venue title.
     */
    private String mVenueTitle;

    /**
     * Working Hours.
     */
    private String mWorkingHours;

    /**
     * Address
     */
    private String mAddress;

    /**
     * Image of the venue.
     */
    private int mVenueImage;

    public Visakhapatnam(String venueTitle, String workingHours, String address, int venueImage) {
        mVenueTitle = venueTitle;
        mWorkingHours = workingHours;
        mAddress = address;
        mVenueImage = venueImage;
    }

    /**
     * Get the venue title.
     */
    public String getVenueTitle() {
        return mVenueTitle;
    }

    /**
     * Get the working hours.
     */
    public String getWorkingHours() {
        return mWorkingHours;
    }

    /**
     * Get the address.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the photo of venue.
     */
    public int getVenueImage() {
        return mVenueImage;
    }

}
