package com.example.fypd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {
private Button btn3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn3 = (Button)findViewById(R.id.next);


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Radio Group
                Intent intent = new Intent(MainActivity3.this,MainActivity4.class);

                String tmp2 = getIntent().getStringExtra("keyage");
                String tmp3 = getIntent().getStringExtra("keyname");
                String tmp4 = getIntent().getStringExtra("keyheight");
                String tmp5 = getIntent().getStringExtra("keyweight");

                intent.putExtra("key2age",tmp2);
                intent.putExtra("key2name",tmp3);
                intent.putExtra("key2height",tmp4);
                intent.putExtra("key2weight",tmp5);

                startActivity(intent);


            }
        });


    }
}