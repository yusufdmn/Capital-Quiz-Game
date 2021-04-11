package com.yusufduman.worldculture;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;


public class firstFragment extends Fragment {

    MediaPlayer mediaPlayerCorrect , mediaPlayerWrong;
    Button choice1,choice2,choice3,choice4,question;
    public SharedPreferences sharedPreferences;
    public HashMap<String,String> countriess;
    public HashMap<String,String> countriesFakee;
    public ArrayList<String> keys;
    public ArrayList<String> keysFake;
    public ArrayList<String> array = new ArrayList<>();
    TextActivity textActivity = new TextActivity();
    public SQLiteDatabase database;
    public int a;
    public TextView questionNumberText , trueNumberText , falseNumberText;
    public int questionNumber , trueNumber , falseNumber;
    public Lists lists;
    public String mode;
    public  Intent intent;
    public int bestNumber;
    public TextView bestText;
    public String pageInfo;
    public String difficulty;
    public String lang;
    private AdView mAdView;

    public firstFragment() {
    }


///////////////////////////////////////////////////////////////////////////////////
    public static firstFragment newInstance() {
        firstFragment fragment = new firstFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mediaPlayerCorrect = MediaPlayer.create(getActivity().getApplicationContext() , R.raw.correct);
        mediaPlayerWrong = MediaPlayer.create(getActivity().getApplicationContext() , R.raw.wrong);

        countriess = new HashMap<>();
        countriesFakee = new HashMap<>();
        keys = new ArrayList<>();
        keysFake = new ArrayList<>();

        sharedPreferences = getActivity().getApplicationContext().getSharedPreferences("com.yusufduman.worldculture",Context.MODE_PRIVATE);
        //sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());

        trueNumber = sharedPreferences.getInt("true" , 0);
        falseNumber = sharedPreferences.getInt("false" , 0 );

        try {
            database=getActivity().openOrCreateDatabase("liste" , Context.MODE_PRIVATE , null);

            database.execSQL("CREATE TABLE IF NOT EXISTS list(name VARCHAR)");
            Cursor cursor = database.rawQuery("SELECT * FROM list",null);
            int nameIndex = cursor.getColumnIndex("name");

            while (cursor.moveToNext()){
                array.add(cursor.getString(nameIndex).toString());
            }
            cursor.close();
        }catch (Exception e ){
            System.out.println(e.getLocalizedMessage());
        }


        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

///////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        bestText = view.findViewById(R.id.bestId);
        questionNumberText = view.findViewById(R.id.questionOrderId);
        trueNumberText = view.findViewById(R.id.trueId);
        falseNumberText = view.findViewById(R.id.falseId);
        choice1 = view.findViewById(R.id.choice1Id);
        choice2 = view.findViewById(R.id.choice2Id);
        choice3 = view.findViewById(R.id.choice3Id);
        choice4 = view.findViewById(R.id.choice4Id);
        question = view.findViewById(R.id.questionId);
        /////////////////////////////////////////////

        mAdView = view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        /////////////////////////////////////////////


        Lists lists = new Lists();
        Intent intent = getActivity().getIntent();
        mode = intent.getStringExtra("mode");
        difficulty = intent.getStringExtra("difficulty");
        lang = intent.getStringExtra("lang");

        if (intent.getStringExtra("continent").equals("Europe")){
            lists.setEurope(difficulty,lang);
            countriess = lists.getEurope(mode);
            countriesFakee.putAll(countriess);
            if (mode.equals("Country")){
                if (difficulty.equals("Easy")){
                    pageInfo = "europe1E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "europe1H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            else {
                if (difficulty.equals("Easy")){
                    pageInfo = "europe2E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "europe2H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            bestText.setText("Best: " + bestNumber + "✓");



        }else if (intent.getStringExtra("continent").equals("Asia")){
            lists.setAsia(difficulty,lang);
            countriess = lists.getAsia(mode);
            countriesFakee.putAll(countriess);

            if (mode.equals("Country")){
                if (difficulty.equals("Easy")){
                    pageInfo = "asia1E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "asia1H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            else {
                if (difficulty.equals("Easy")){
                    pageInfo = "asia2E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "asia2H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            bestText.setText("Best: " + bestNumber + "✓");



        }else if (intent.getStringExtra("continent").equals("North America")){
            lists.setNorth(difficulty , lang);
            countriess = lists.getNorth(mode);
            countriesFakee.putAll(countriess);

            if (mode.equals("Country")){
                if (difficulty.equals("Easy")){
                    pageInfo = "north1E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "north1H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            else {
                if (difficulty.equals("Easy")){
                    pageInfo = "north2E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "north2H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            bestText.setText("Best: " + bestNumber + "✓");


        }else if (intent.getStringExtra("continent").equals("South America")){
            lists.setSouth(difficulty , lang);
            countriess = lists.getSouth(mode);
            countriesFakee.putAll(countriess);

            if (mode.equals("Country")){
                if (difficulty.equals("Easy")){
                    pageInfo = "south1E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "south1H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            else {
                if (difficulty.equals("Easy")){
                    pageInfo = "south2E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "south2H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            bestText.setText("Best: " + bestNumber + "✓");


        }else if (intent.getStringExtra("continent").equals("Africa")){
            lists.setAfrica(difficulty , lang);
            countriess = lists.getAfrica(mode);
            countriesFakee.putAll(countriess);

            if (mode.equals("Country")){
                if (difficulty.equals("Easy")){
                    pageInfo = "africa1E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "africa1H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            else {
                if (difficulty.equals("Easy")){
                    pageInfo = "africa2E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "africa2H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            bestText.setText("Best: " + bestNumber + "✓");


        }else if (intent.getStringExtra("continent").equals("All")){
            lists.setAll(difficulty , lang);
            countriess = lists.getAll(mode);
            countriesFakee.putAll(countriess);

            if (mode.equals("Country")){
                if (difficulty.equals("Easy")){
                    pageInfo = "all1E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "all1H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            else {
                if (difficulty.equals("Easy")){
                    pageInfo = "all2E";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }
                else{
                    pageInfo = "all2H";
                    bestNumber = sharedPreferences.getInt(pageInfo , 0);
                }

            }
            bestText.setText("Best: " + bestNumber + "✓");
        }


        keys = new ArrayList<>(countriess.keySet());
        keysFake = new ArrayList<>(countriesFakee.keySet());
        ArrayList arrayList = new ArrayList<>(countriesFakee.keySet());
        Collections.shuffle(keys);
        Collections.shuffle(keysFake);

        if (array.size() > 0){
            for (String k : array){
                keys.remove(k);
                if (keysFake.size()>4){
                    keysFake.remove(k);
                }
            }
        }
        showTexts();


        questionNumberText.setText(String.valueOf(trueNumber+falseNumber+1) + "/" + countriess.size());

        try {
            String sqlString = "INSERT INTO list (name) VALUES (?)";
            SQLiteStatement sqLiteStatement = database.compileStatement(sqlString);
            sqLiteStatement.bindString(1,keys.get(0));
            sqLiteStatement.execute();

        }catch (Exception e){

        }

///////////////////////////////////////////////////ON CLİCK////////////////////////////////////////////////////////////////////////////
        question.setEnabled(false);

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a ==0){
                    mediaPlayerCorrect.start();
                    choice1.setBackgroundColor(Color.GREEN);
                    trueNumber++;
                }else {
                    mediaPlayerWrong.start();
                    falseNumber++;
                    choice1.setBackgroundColor(Color.RED);
                    if (a==1){
                        choice2.setBackgroundColor(Color.GREEN);
                    }else if (a==2){
                        choice3.setBackgroundColor(Color.GREEN);
                    }else{
                        choice4.setBackgroundColor(Color.GREEN);
                    }
                }
                aaa(v);
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 1){
                    mediaPlayerCorrect.start();
                    trueNumber++;
                    choice2.setBackgroundColor(Color.GREEN);
                }else {
                    mediaPlayerWrong.start();
                    falseNumber++;
                    choice2.setBackgroundColor(Color.RED);
                    if (a==0){
                        choice1.setBackgroundColor(Color.GREEN);
                    }else if (a==2){
                        choice3.setBackgroundColor(Color.GREEN);
                    }else{
                        choice4.setBackgroundColor(Color.GREEN);
                    }
                }
                aaa(v);
            }
        });
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 2){
                    mediaPlayerCorrect.start();
                    trueNumber++;
                    choice3.setBackgroundColor(Color.GREEN);
                }else {
                    mediaPlayerWrong.start();
                    falseNumber++;
                    choice3.setBackgroundColor(Color.RED);
                    if (a==1){
                        choice2.setBackgroundColor(Color.GREEN);
                    }else if (a==0){
                        choice1.setBackgroundColor(Color.GREEN);
                    }else{
                        choice4.setBackgroundColor(Color.GREEN);
                    }
                }
                aaa(v);
            }
        });
        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 3){
                    mediaPlayerCorrect.start();
                    trueNumber++;
                    choice4.setBackgroundColor(Color.GREEN);
                }else {
                    mediaPlayerWrong.start();
                    falseNumber++;
                    choice4.setBackgroundColor(Color.RED);
                    if (a==1){
                        choice2.setBackgroundColor(Color.GREEN);
                    }else if (a==2){
                        choice3.setBackgroundColor(Color.GREEN);
                    }else {
                        choice1.setBackgroundColor(Color.GREEN);
                    }
                }
                aaa(v);
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
    //    database.execSQL("DELETE FROM list");
        sharedPreferences.edit().putInt("true" , 0).apply();
        sharedPreferences.edit().putInt("false" , 0).apply();
        super.onDestroy();
    }

    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////


    @SuppressLint("ResourceAsColor")
    public void aaa(View view){

        trueNumberText.setText(String.valueOf(trueNumber));
        falseNumberText.setText(String.valueOf(falseNumber));

        sharedPreferences.edit().putInt("true" , trueNumber).apply();
        sharedPreferences.edit().putInt("false" , falseNumber).apply();

        choice1.setClickable(false);
        choice2.setClickable(false);
        choice3.setClickable(false);
        choice4.setClickable(false);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (keys.size()>1){
                    NavDirections action = firstFragmentDirections.actionFirstFragmentToSecondFragment();
                    Navigation.findNavController(view).navigate(action);
                }
                else{
                    AlertDialog.Builder alert2 = new AlertDialog.Builder(getActivity());

                if (trueNumber>bestNumber){
                    sharedPreferences.edit().putInt(pageInfo , trueNumber).apply();
                    alert2.setTitle("NEW RECORD!");
                    alert2.setMessage("Congrats! Your new record: " + trueNumber);
                }
                else{
                    alert2.setTitle("Congrats");
                    alert2.setMessage("You finished the quiz. Correct answer: " + String.valueOf(trueNumber));
                }


                    alert2.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {



                            Intent intent = new Intent(getActivity().getApplicationContext() , MenuActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            getActivity().finish();
                        }
                    });
                    alert2.setCancelable(false);
                    alert2.show();

                    sharedPreferences.edit().putInt("true" , 0).apply();
                    sharedPreferences.edit().putInt("false" , 0).apply();
                    try {
                        database.execSQL("DELETE FROM list");
                    }catch (Exception e){
                        System.out.println(e.getLocalizedMessage());
                    }
                }

            }
        }, 1500);

    }



    public void showTexts(){
        //////////////////////////////// ŞIKLAR VE SORU YAZILARI ///////////////////////////////////////////
        question.setText(keys.get(0));
        trueNumberText.setText(String.valueOf(trueNumber));
        falseNumberText.setText(String.valueOf(falseNumber));

        Random random = new Random();
        a = random.nextInt(4);

        if (a==0){
            choice1.setText(countriess.get(keys.get(0)));
            keysFake.remove(keys.get(0));
            choice2.setText(countriesFakee.get(keysFake.get(0)));
            choice3.setText(countriesFakee.get(keysFake.get(1)));
            choice4.setText(countriesFakee.get(keysFake.get(2)));
        }
        else if(a==1){
            choice2.setText(countriess.get(keys.get(0)));
            keysFake.remove(keys.get(0));
            choice1.setText(countriesFakee.get(keysFake.get(0)));
            choice3.setText(countriesFakee.get(keysFake.get(1)));
            choice4.setText(countriesFakee.get(keysFake.get(2)));
        }
        else if(a==2){
            choice3.setText(countriess.get(keys.get(0)));
            keysFake.remove(keys.get(0));
            choice1.setText(countriesFakee.get(keysFake.get(0)));
            choice2.setText(countriesFakee.get(keysFake.get(1)));
            choice4.setText(countriesFakee.get(keysFake.get(2)));
        }
        else if(a==3){
            choice4.setText(countriess.get(keys.get(0)));
            keysFake.remove(keys.get(0));
            choice1.setText(countriesFakee.get(keysFake.get(0)));
            choice3.setText(countriesFakee.get(keysFake.get(1)));
            choice2.setText(countriesFakee.get(keysFake.get(2)));
        }

    }

}