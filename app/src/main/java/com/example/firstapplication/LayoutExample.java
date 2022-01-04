package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class LayoutExample extends AppCompatActivity {

    Button b;
    TextView resultText;
    TextView text;
    Button minus;
    Button go;
//    EditText input;
    Button reset;

    int a =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_example);

        b = findViewById(R.id.addBtn);
        text = findViewById(R.id.show);
        resultText = findViewById(R.id.result);
        minus = findViewById(R.id.minusBtn);
        reset = findViewById(R.id.reset);
        go = findViewById(R.id.go);



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a--;
                resultText.setText(Integer.toString(a));
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultText.setText(0+"");
                text.setText("");
            }
        });


        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent( LayoutExample.this, NavigationExample.class);
                startActivity(i);
            }
        });



    }




    public  void add(View view)
    {
        a++;

        if(a==5)
        {
            text.setText("Boom");
        }

        resultText.setText(Integer.toString(a));

    }


}