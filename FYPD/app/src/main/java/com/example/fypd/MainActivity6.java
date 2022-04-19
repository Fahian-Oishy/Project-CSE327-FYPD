package com.example.fypd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
private TextView tv;
private Button btnx ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        tv = (TextView)findViewById(R.id.textView5);
        btnx = (Button)findViewById(R.id.button3);
String tmpcol = getIntent().getStringExtra("col");
        String tmpbmi = getIntent().getStringExtra("bmi");
        double db = Double.parseDouble(tmpbmi);
if(tmpcol.equals("1")){
    if(db<25) {
        tv.setText("\nDAY\uD83C\uDF1E" + "\n" + "\nHave seasonal fruits at 11:00 am\n" +  "\nDon't forget to do prayer\n" + "\nLunch - 12:30 PM\n\n" + "Menu\n" + ">Take Medicine if need\n" + "1. Rice\n" + "2. Vegetable\n" + "3. Chicken\n" + ">Take Medicine if need\n\n" + "Snacks-5.00 p.m.\n"+ "Menu-boiled egg, bread, black tea \n\n"+ "Watch TV\n");
    }
    else{
        tv.setText("\nDAY\uD83C\uDF1E" + "\n" + "\nHave seasonal fruits at 11:00 am\n" +  "\nDon't forget to do prayer\n" + "\nLunch - 12:30 PM\n\n" + "Menu\n" + ">Take Medicine if need\n" + "1. Bread\n" + "2. Vegetable\n" + "3. Chicken\n" + ">Take Medicine if need\n\n" + "Snacks-5.00 p.m.\n"+ "Menu-boiled egg, bread, black tea \n\n"+ "Watch TV\n");
    }
    }else {
    if(db<25) {
        tv.setText("\nDAY\uD83C\uDF1E" + "\n" + "\nHave seasonal fruits at 11:00 am\n" +  "\nDon't forget to do prayer\n" + "\nLunch - 12:30 PM\n\n" + "Menu\n" + ">Take Medicine if need\n" + "1. Rice\n" + "2. Vegetable\n" + "3. Chicken or Beef\n" + ">Take Medicine if need\n\n" + "Snacks-5.00 p.m.\n"+ "Menu-boiled egg, bread, black tea \n\n"+ "Watch TV\n");
    }
    else{
        tv.setText("\nDAY\uD83C\uDF1E" + "\n" + "\nHave seasonal fruits at 11:00 am\n" + "\nDon't forget to do prayer\n" + "\nLunch - 12:30 PM\n\n" + "Menu\n" + ">Take Medicine if need\n" + "1. Bread\n" + "2. Vegetable\n" + "3. Chicken or Beef\n" + ">Take Medicine if need\n\n" + "Snacks-5.00 p.m.\n"+ "Menu-boiled egg, bread, black tea \n\n"+ "Watch TV\n");
    }
    }
btnx.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity6.this,MainActivity7.class);
        startActivity(intent);
    }
});
    }
}