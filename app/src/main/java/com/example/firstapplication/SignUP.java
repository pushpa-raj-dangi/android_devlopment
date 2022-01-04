package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SignUP extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btn = findViewById(R.id.clickMe);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUP.this,MainActivity.class);
                startActivity(intent);

            }

        });
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