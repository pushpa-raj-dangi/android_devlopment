package com.example.firstapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class PassValue extends AppCompatActivity {

    private TextView idText,videText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_value);

        idText = findViewById(R.id.idText);
        videText = findViewById(R.id.videoText);

        String videoId = getIntent().getExtras().getString("id");
        int textid = getIntent().getExtras().getInt("ph");
        idText.setText(videoId);
        videText.setText(String.valueOf(textid));

    }
}