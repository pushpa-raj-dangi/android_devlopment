package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NavigationExample extends AppCompatActivity {

    private  Button back, toList, goToLists,passValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_navigation_example);
        back = findViewById(R.id.back);
        toList = findViewById(R.id.goToList);
        goToLists = findViewById(R.id.goToListCompo);
        passValue = findViewById(R.id.passValue);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent( NavigationExample.this, LayoutExample.class);
                startActivity(i);
            }
        });


        toList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://www.google.com";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        goToLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NavigationExample.this,ListExample.class);
                startActivity(intent);
            }
        });

        passValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NavigationExample.this,PassValue.class);

                String videoId = "VideoId : 023leoi4234l28";
                int phone = 923843294;
                Bundle b = new Bundle();

                b.putString("id",videoId);
                b.putInt("ph",phone);

                intent.putExtras(b);
                startActivity(intent);
            }
        });



    }
}