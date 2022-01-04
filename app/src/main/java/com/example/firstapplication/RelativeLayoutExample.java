package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RelativeLayoutExample extends AppCompatActivity {
private CheckBox ram,hari,gopal;
private RadioGroup radioGroup;
private ProgressBar pbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_example);

        ram = findViewById(R.id.ram);
        hari = findViewById(R.id.hari);
        gopal = findViewById(R.id.gopal);

        pbar = findViewById(R.id.progressbar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    pbar.incrementProgressBy(10);
                    SystemClock.sleep(500);
                }
            }
        });

        thread.start();
    //pbar.getProgress();

        radioGroup = findViewById(R.id.radioStatus);


        int checkedBtn = radioGroup.getCheckedRadioButtonId();

        switch (checkedBtn){
            case R.id.married:
                Toast.makeText(RelativeLayoutExample.this,"married",Toast.LENGTH_SHORT).show();
                break;
            case R.id.single:
                Toast.makeText(RelativeLayoutExample.this,"single",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId)
                {
                    case R.id.married:
                        Toast.makeText(RelativeLayoutExample.this,"married",Toast.LENGTH_SHORT).show();
                        pbar.setVisibility(View.VISIBLE);
                        break;
                    case R.id.single:
                        Toast.makeText(RelativeLayoutExample.this,"single",Toast.LENGTH_SHORT).show();
                        pbar.setVisibility(View.GONE);
                        break;

                    default:
                        break;

                }
            }
        });

        if(ram.isChecked()){
            Toast.makeText(RelativeLayoutExample.this,"You watched Hari",Toast.LENGTH_SHORT).show();
        }

        hari.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(RelativeLayoutExample.this,"You watched Hari",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RelativeLayoutExample.this,"You need to watch Hari",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}