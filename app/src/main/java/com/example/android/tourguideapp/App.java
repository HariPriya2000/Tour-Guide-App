package com.example.android.tourguideapp;

import android.content.Context;

public class App extends android.app.Application {
    private static App mApp = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
    }

    public static Context context() {
        return mApp.getApplicationContext();
    }
}
