package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.nio.file.Files;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    final ImageView balldisplay=(ImageView) findViewById(R.id.image_eightball);
    final int[] ballarray={
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
    Button myButton=(Button)findViewById(R.id.askbutton);
    myButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("magic-8-ball","the button has been pressd");
            Random randomNumberGenerator=new Random();
            int number=randomNumberGenerator.nextInt(5);
            Log.d("magic-8-ball","The random number is" + number);
            balldisplay.setImageResource(ballarray[number]);

        }
    });
}}

