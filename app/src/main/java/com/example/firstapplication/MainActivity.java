package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ListView createLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        createLists = findViewById(R.id.cities);

        ArrayList<String> citiest = new ArrayList<>();
        citiest.add("Ram");
        citiest.add("Hari");
        citiest.add("Gopal");
        citiest.add("Stia");
        citiest.add("Rita");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");
        citiest.add("Ram");

        ArrayAdapter<String> citiesAdaptor = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,citiest);
        createLists.setAdapter(citiesAdaptor);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Oncreate","started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("OnResume","started");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("OnStop","stared");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("OnDestroy","Destroed started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Restart","stared");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e( "OnPause","started");
    }
}