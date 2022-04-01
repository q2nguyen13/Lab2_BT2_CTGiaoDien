package com.example.lab2_ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    public TextView red;
    public TextView green;
    public TextView grey;
    public TextView blue;
    public RelativeLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = (TextView) findViewById(R.id.red);
        green = (TextView) findViewById(R.id.green);
        grey =  (TextView) findViewById(R.id.grey);
        blue = (TextView) findViewById(R.id.blue);
        background = (RelativeLayout)findViewById(R.id.background_color);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#FF4321"));
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#3BE015"));
            }
        });

        grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#4B4B4C"));
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#0E16C2"));
            }
        });
    }

}