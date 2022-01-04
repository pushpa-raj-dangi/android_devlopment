package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListExample extends AppCompatActivity {
private ListView listView;
private Spinner citiesSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);
        listView = findViewById(R.id.myList);
        citiesSpinner = findViewById(R.id.citiesSpinner);

//        ArrayList<String> citiesList = new ArrayList<>();
//        citiesList.add("Naya cities");
//        citiesList.add("Naya cities");
//        citiesList.add("Naya cities");
//        citiesList.add("Another cities");
//
//        ArrayAdapter<String> newCitiesAdapter = new ArrayAdapter<>(
//              k  this, android.R.layout.simple_spinner_dropdown_item,
//                citiesList
//
//        );

//        citiesSpinner.setAdapter(newCitiesAdapter);

        citiesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListExample.this,citiesSpinner.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kathmandu");
        cities.add("Pokhara");
        cities.add("Dang");
        cities.add("Dharan"); cities.add("Pokhara");
        cities.add("Dang");
        cities.add("Dharan");
        cities.add("Kathmandu");
        cities.add("Pokhara");
        cities.add("Dang");
        cities.add("Dharan"); cities.add("Dang");
        cities.add("Dharan");
        cities.add("Kathmandu");
        cities.add("Pokhara");
        cities.add("Dang");
        cities.add("Dharan");
        cities.add("Kathmandu");
        cities.add("Pokhara");
        cities.add("Dang");
        cities.add("Dharan");

        final ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,cities);
        listView.setAdapter(citiesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(ListExample.this,cities.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}