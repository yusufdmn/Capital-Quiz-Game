package com.yusufduman.worldculture;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ca-app-pub-2309141602496848~7528386443  app

        //ca-app-pub-2309141602496848/9802555369  banner

        //ca-app-pub-3940256099942544/6300978111  banner Test

        //ca-app-pub-2309141602496848/6815463204  tam ekran

        /*
        <meta-data
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="ca-app-pub-2309141602496848~7528386443"/>
         */


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent homeIntent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(homeIntent);
                finish();


            }
        }, 1500);

    }

}