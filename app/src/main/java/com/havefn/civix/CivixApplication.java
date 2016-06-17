package com.havefn.civix;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by murizaro on 16/06/16.
 */
public class CivixApplication extends Application {

    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}

