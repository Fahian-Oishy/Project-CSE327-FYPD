package com.example.fypd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
private TextView lasttv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        lasttv= (TextView)findViewById(R.id.textView6);
        lasttv.setText("\n\nNIGHT \uD83C\uDF19"+"\n\n"+"Dinner - 08:30 PM\n\n"+ "Menu-\n" + ">Take Medicine if need\n" +"1. Red Bread\n"+"2. Fish \n"+"3.Seasonal Vegetable\n"+ ">Take Medicine if need\n\n" + "Do Prayer\n\n" + "Do Light Exercise or Light Walk\n" +"Go For Sleep at 10:00 PM\n\n" +"Have A Sound Sleep\n"+ "GOOD NIGHT\uD83C\uDF03");

    }
}