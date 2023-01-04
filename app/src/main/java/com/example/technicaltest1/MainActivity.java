package com.example.technicaltest1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;

import com.clevertap.android.sdk.CleverTapAPI;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());

        CleverTapAPI.createNotificationChannel(getApplicationContext(),"YourChannelId","Your Channel Name","Your Channel Description", NotificationManager.IMPORTANCE_MAX,true);

        // each of the below mentioned fields are optional
        HashMap<String, Object> profileUpdate = new HashMap<String, Object>();

        profileUpdate.put("Name", "Russelle Pineda");    // String
        profileUpdate.put("Email", "russellepineda@gmail.com"); // Email address of the user
        profileUpdate.put("Gender", "M");             // Can be either M or F

        clevertapDefaultInstance.onUserLogin(profileUpdate);
    }


}