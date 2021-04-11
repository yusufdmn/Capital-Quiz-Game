package com.yusufduman.worldculture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContinentActivity extends AppCompatActivity {

    public ConstraintLayout constraintLayout;
    public Button easyButton,hardButton,europeButton;
    public String mode,continent;
    public String difficulty;
    public TextView modeText;

    @Override
    protected void onDestroy() {
        finish();
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continent);

        modeText = findViewById(R.id.modeTextId);
        constraintLayout = findViewById(R.id.layoutId);
        easyButton=findViewById(R.id.easyId);
        hardButton = findViewById(R.id.hardId);
        europeButton = findViewById(R.id.europeButtonId);
     //   getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);


        Intent intent = getIntent();
        mode = intent.getStringExtra("mode");
        if (mode.equals("Capital")){
            modeText.setText(R.string.chosen_capital);
        }else{
            modeText.setText(R.string.chosen_country);
        }
        try {
            SQLiteDatabase database = this.openOrCreateDatabase("liste" , MODE_PRIVATE , null);
            database.execSQL("CREATE TABLE IF NOT EXISTS bests(name VARCHAR, skor INTEGER)");
            database.execSQL("CREATE TABLE IF NOT EXISTS list(name VARCHAR)");
            database.execSQL("DELETE FROM list");
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.ydumann.worldculture", Context.MODE_PRIVATE);
        //SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ContinentActivity.this);

        //sharedPreferences.edit().putInt("true" , 0).apply();
        //sharedPreferences.edit().putInt("false", 0).apply();

        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                difficulty = "Easy";
                Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
                intent.putExtra("continent" , continent);
                intent.putExtra("mode" , mode);
                intent.putExtra("difficulty" , difficulty);
                intent.putExtra("lang" , europeButton.getText().toString());
                startActivity(intent);
                finish();
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                difficulty = "Hard";
                Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
                intent.putExtra("continent" , continent);
                intent.putExtra("mode" , mode);
                intent.putExtra("difficulty" , difficulty);
                intent.putExtra("lang" , europeButton.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }



    public void aaa(View view){
        easyButton.setVisibility(View.INVISIBLE);
        hardButton.setVisibility(View.INVISIBLE);
    }




    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void allF(View view){
        easyButton.setVisibility(View.INVISIBLE);
        hardButton.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                easyButton.setVisibility(View.VISIBLE);
                hardButton.setVisibility(View.VISIBLE);
            }
        }, 100);


        continent = "All";
        //  Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
   //     intent.putExtra("continent" , "all");
     //   intent.putExtra("mode" , mode);
       // startActivity(intent);
        //finish();
    }
    public void europeF(View view){
        easyButton.setVisibility(View.INVISIBLE);
        hardButton.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                easyButton.setVisibility(View.VISIBLE);
                hardButton.setVisibility(View.VISIBLE);
            }
        }, 100);
        continent = "Europe";
//        Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
  //      intent.putExtra("continent" , "europe");
    //    intent.putExtra("mode" , mode);
      //  startActivity(intent);
        //finish();
    }
    public void asiaF(View view){
        easyButton.setVisibility(View.INVISIBLE);
        hardButton.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                easyButton.setVisibility(View.VISIBLE);
                hardButton.setVisibility(View.VISIBLE);
            }
        }, 100);
        continent = "Asia";

//        System.out.println(mode);
  //      Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
    //    intent.putExtra("continent" , "asia");
      //  intent.putExtra("mode" , mode);
        //startActivity(intent);
        //finish();
    }
    public void northAmericaF(View view){
        easyButton.setVisibility(View.INVISIBLE);
        hardButton.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                easyButton.setVisibility(View.VISIBLE);
                hardButton.setVisibility(View.VISIBLE);
            }
        }, 100);
        continent = "North America";

//        Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
  //      intent.putExtra("continent" , "north");
    //    intent.putExtra("mode" , mode);
      //  startActivity(intent);
        //finish();
    }
    public void southAmericaF(View view){
        easyButton.setVisibility(View.INVISIBLE);
        hardButton.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                easyButton.setVisibility(View.VISIBLE);
                hardButton.setVisibility(View.VISIBLE);
            }
        }, 100);
        continent = "South America";

//        Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
  //      intent.putExtra("continent" , "south");
    //    intent.putExtra("mode" , mode);
      //  startActivity(intent);
        //finish();
    }
    public void africaF(View view){
        easyButton.setVisibility(View.INVISIBLE);
        hardButton.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                easyButton.setVisibility(View.VISIBLE);
                hardButton.setVisibility(View.VISIBLE);
            }
        }, 100);
        continent = "Africa";

//        Intent intent = new Intent(ContinentActivity.this , TextActivity.class);
  //      intent.putExtra("continent" , "africa");
    //    intent.putExtra("mode" , mode);
      //  startActivity(intent);
        //finish();
    }


    public void backF(View view){
       Intent intent = new Intent(ContinentActivity.this , MenuActivity.class);
       intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        startActivity(intent);
        finish();
    }
}
