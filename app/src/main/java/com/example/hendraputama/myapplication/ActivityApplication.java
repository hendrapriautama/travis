package com.example.hendraputama.myapplication;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

/**
 * Created by Hendra P Utama on 3/14/2018.
 */

public class ActivityApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        final Fabric fabric = new Fabric.Builder(this)
                .kits(new Crashlytics())
                .debuggable(true)
                .build();
        Fabric.with(fabric);
    }
}
