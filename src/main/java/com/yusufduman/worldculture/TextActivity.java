package com.yusufduman.worldculture;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.ads.AdError;
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

import java.util.ArrayList;
import java.util.HashMap;

public class TextActivity extends AppCompatActivity {
    public ArrayList<String> arrayListText=new ArrayList<>();

    public void setMode() {
        Intent intent = getIntent();
        mode = intent.getStringExtra("mode");
    }

    public String mode,continent,difficulty;


    @Override
    protected void onDestroy() {


        if (mInterstitialAd !=null) {
            mInterstitialAd.show(TextActivity.this);
            System.out.println(2);
        } else {
            System.out.println(1);
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }

        System.out.println(3);
        finish();
        super.onDestroy();
    }

    public String getMode() {
        return mode;
    }

    public SQLiteDatabase getDatabase() {
        return database;
    }

    public SQLiteDatabase database;
    public Lists lists = new Lists();



    public HashMap<String,String> countries = new HashMap<>();
    public HashMap<String,String> countriesFake = new HashMap<>();



    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                createId();
            }
        });


 //       getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        mode = intent.getStringExtra("mode");
        continent = intent.getStringExtra("continent");
        difficulty = intent.getStringExtra("difficulty");

        getSupportActionBar().setTitle(continent + " " + difficulty + " " + mode);

        try {
            database=this.openOrCreateDatabase("liste" , Context.MODE_PRIVATE , null);
            database.execSQL("CREATE TABLE IF NOT EXISTS list(name VARCHAR)");
            database.execSQL("DELETE FROM list");
        }catch (Exception e ){
            System.out.println("TEXT : " + e.getLocalizedMessage());
        }

    }


    public void setCountries(String key){
        countries.remove(key);
    }




    private void createId() {
        AdRequest adRequest = new AdRequest.Builder().build();
        createAd(adRequest);
    }

    private void createAd(AdRequest adRequest){


        //ca-app-pub-2309141602496848/6815463204
        InterstitialAd.load(this , "ca-app-pub-3940256099942544/1033173712" , adRequest , new InterstitialAdLoadCallback(){

            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                super.onAdLoaded(interstitialAd);
                mInterstitialAd = interstitialAd;

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        super.onAdFailedToShowFullScreenContent(adError);
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                        mInterstitialAd=null;
                    }

                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                mInterstitialAd = null;
            }
        });


    }






}