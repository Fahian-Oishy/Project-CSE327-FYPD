package com.example.fypd;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity2 extends AppCompatActivity {
private Button btn2;
private TextView age,name,height,weight,number;
    private DatabaseReference df;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2 = (Button)findViewById(R.id.button2);
        age = (TextView)findViewById(R.id.age);
        name = (TextView)findViewById(R.id.name);
        height = (TextView)findViewById(R.id.height);
        weight = (TextView)findViewById(R.id.weight);
        number = (TextView)findViewById(R.id.editTextNumber);
        df = FirebaseDatabase.getInstance().getReference("Data");
       btn2.setOnClickListener(new View.OnClickListener() {


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        String tmp = age.getText().toString().trim();
        String tn = name.getText().toString().trim();
        String th = height.getText().toString().trim();
        String tw = weight.getText().toString().trim();
String tnn = number.getText().toString().trim();

        String key = df.push().getKey();
        df.child(key).setValue("1. Name : "+tn+" 2. Age : "+tmp+" 3. Height : "+th+" 4. Weight : "
                +tw+" 5. Number : "+tnn);
        Toast.makeText(MainActivity2.this, "Data Added Successfully ", Toast.LENGTH_SHORT).show();
        intent.putExtra("keyage",tmp);
        intent.putExtra("keyname",tn);
        intent.putExtra("keyheight",th);
        intent.putExtra("keyweight",tw);
        startActivity(intent);



    }
});

    }
}