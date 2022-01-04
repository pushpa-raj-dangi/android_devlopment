package com.example.firstapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.Buffer;

public class Calculator extends AppCompatActivity {

    EditText editText;
    TextView one,two,three,four,five,six,seven,eight,nine,div,mul,sub,modulo,minus,plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText = findViewById(R.id.resultScreen);
        editText.setShowSoftInputOnFocus(false);

        modulo = findViewById(R.id.modulo);
        div = findViewById(R.id.div);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        mul = findViewById(R.id.mul);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);

    }


    public void onHistoryClick(View view)
    {
        Log.e("history","clicked" );
    }

    public  void delClick(View view)
    {
        editText.setText(deleteText());
        Log.e("delClick: clicked", String.valueOf(editText.getText()));
    }

    public   void clearResultScreen(View view)
    {
        editText.setText("");
    }
    private String deleteText()
    {
      try {
          String text =  String.valueOf(editText.getText());
          String a = String.valueOf(text.charAt(0));
          if(text.length() >= 0)
          {
              text = text.trim().replace(a,"");

          };

          return text;
      }catch (Exception exception)
      {
          Log.e(exception.getMessage(),"called");
          return  null;
      }
    }

    public void handleModulo(View view)
    {
        try {
       setScreenText(getScreenText().toString());

        }catch (Exception ex)
        {
            Log.e(ex.getMessage(),ex.getMessage());
        }
    }

    public  void handleDivision(View view)
    {
        setScreenText(getScreenText()+div.getText());
    }


    public  void handleSeven(View view)
    {
        setScreenText(getScreenText()+seven.getText());
        Log.e(seven.getText().toString(),"sdf" );
    }

    public  void handleSix(View view)
    {
        setScreenText(getScreenText()+six.getText());
        Log.e(seven.getText().toString(),"sdf" );
    }



    public  void handleEight(View view)
    {
        setScreenText(getScreenText()+eight.getText());
        Log.e(seven.getText().toString(),"sdf" );
    }

    public  void handleNine(View view)
    {
        setScreenText(getScreenText()+nine.getText());
        Log.e(seven.getText().toString(),"sdf" );
    }


    public  void handleOne(View view)
    {
        setScreenText(getScreenText()+one.getText());
    }

 public  void handleTwo(View view)
    {
        setScreenText(getScreenText()+two.getText());
    }



    public  void handleThree(View view)
    {
        setScreenText(getScreenText()+three.getText());
    }


    public  void handleFour(View view)
    {
        setScreenText(getScreenText()+four.getText());
    }

   public  void handleFive(View view)
    {
        setScreenText(getScreenText()+five.getText());
    }

    public  void handleMultiply(View view)
    {
        setScreenText(getScreenText()+mul.getText());
        Log.e(seven.getText().toString(),"sdf" );
    }





    public String getScreenText() {
        try {
            if(editText.getText().toString().length() > 0)
            {
                return editText.getText().toString();
            }

        }catch (Exception ex)
        {
            Log.e(ex.getMessage(),ex.getMessage());
        }
        return "";
    }

    public void setScreenText(String text) {

            try {
                this.editText.setText(text);
            } catch (Exception ex)
            {
                Log.e(ex.getMessage(),ex.getMessage() );
            }

    }
}