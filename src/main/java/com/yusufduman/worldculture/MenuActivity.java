package com.yusufduman.worldculture;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MenuActivity extends AppCompatActivity {

    public ImageButton enButton,trButton,starButton;
    private AdView mAdView;

    NotificationManager notificationManager;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {

            SharedPreferences sharedPreferences = this.getSharedPreferences("com.yusufduman.worldculture" ,MODE_PRIVATE);

            if (sharedPreferences.getBoolean("a" , true)){


                Constraints constraints = new Constraints.Builder().build();


                WorkRequest workRequest = new PeriodicWorkRequest.Builder(notificationClass.class , 2 , TimeUnit.DAYS )
                        .setConstraints(constraints)
                        .setInitialDelay(1 , TimeUnit.DAYS)
                        .build();

                WorkManager.getInstance(this).enqueue(workRequest);
                sharedPreferences.edit().putBoolean("a" , false).apply();

            }
        }catch (Exception e){

        }





        super.onCreate(savedInstanceState);

        Locale locale = new Locale(getLocaleSharedPreferances());// shared preferances'a en son hangi dil değerini yazmışsak, uygulamayı o dilde açıyor, uygulama ilk defa açılıyorsa, default olan Türkçe ile açılıyor.
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        setContentView(R.layout.activity_menu);

        starButton = findViewById(R.id.starId);
        enButton = findViewById(R.id.engId);
        trButton = findViewById(R.id.trId);

        starButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.yusufduman.worldculture&gl=TR")));
            }
        });




        enButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("");
            }
        });

        trButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("tr");
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }


    public void capitalF(View view){
        Intent intent = new Intent(MenuActivity.this , ContinentActivity.class);
        intent.putExtra("mode" , "Country");
        startActivity(intent);
    }
    public void countryF(View view){
        Intent intent = new Intent(MenuActivity.this , ContinentActivity.class);
        intent.putExtra("mode" , "Capital");
        startActivity(intent);
    }



    public void setLocale(String selectedLocale)
    {
        Locale locale = new Locale(selectedLocale); //butonlar içerisinden fonksiyonumuz çağırılırken, gönderdiğimiz parametreye göre lokalimizi ayarladık.
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        writeLocaleSharedPreferances(selectedLocale);//dil seçimini cihaza kaydedecek fonksiyonu çağırıyoruz.
        finish();//mevcut acivity i bitir.
        startActivity(getIntent());//activity i baştan yükle
    }

    public  void writeLocaleSharedPreferances(String selectedLocale)
    {
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("selectedLocale", selectedLocale);// seçilen dili shared preferances'a yazıyoruz ki, uygulamamız sonraki açılışlarda en son seçilen dil ile açılsın.
        editor.commit();
    }
    public String getLocaleSharedPreferances()
    {
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        String savedString = sharedPref.getString("selectedLocale","");//shared preferances'a yazılan dili getiriyor, eğer uygulama ilk defa açılmışsa, çift tırnak yani default dil değerini döndürüyor
        return savedString;
    }
}