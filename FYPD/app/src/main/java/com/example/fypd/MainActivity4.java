package com.example.fypd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity4 extends AppCompatActivity {

    private Button btn ;
    private CheckBox ch1,ch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn = (Button)findViewById(R.id.btn10);
        ch1 = (CheckBox)findViewById(R.id.checkBox4);
        ch2 = (CheckBox)findViewById(R.id.checkBox6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity4.this,MainActivity5.class);

                String soo = getIntent().getStringExtra("key2age");
                String soo2 = getIntent().getStringExtra("key2name");
                String soo3 = getIntent().getStringExtra("key2height");
                String soo4 = getIntent().getStringExtra("key2weight");
                intent.putExtra("keyage2",soo);
                intent.putExtra("keyname2",soo2);
                intent.putExtra("keyheight2",soo3);
                intent.putExtra("keyweight2",soo4);
                if(ch1.isChecked()){
                    intent.putExtra("col","1");
                }
                else{
                    intent.putExtra("col","0");
                }
                if(ch2.isChecked()){
                    intent.putExtra("dai","1");
                }
                else{
                    intent.putExtra("dai","0");
                }
                startActivity(intent);


            }
        });
    }
}