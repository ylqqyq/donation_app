package com.example.donation_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
 DonationManager donationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("donation_app","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("donation_app","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("donation_app","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("donation_app","onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("donation_app","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("donation_app","onDestroy");
    }
}