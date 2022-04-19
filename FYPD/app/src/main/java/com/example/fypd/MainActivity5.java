package com.example.fypd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
private TextView name100,tv3,tv4;
private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        String age = getIntent().getStringExtra("keyage2");
        String name = getIntent().getStringExtra("keyname2");
        String height = getIntent().getStringExtra("keyheight2");
        String weight = getIntent().getStringExtra("keyweight2");
        String cl = getIntent().getStringExtra("col");
        String db = getIntent().getStringExtra("dai");
        name100 = (TextView) findViewById(R.id.name100);
        button4 = (Button)findViewById(R.id.button4);
tv3 = (TextView)findViewById(R.id.textView3);
        tv4 = (TextView)findViewById(R.id.textView4);
        name100.setText("Hello "+name+" \uD83D\uDC4B"+"\n"+"Here is your daily routine\n");
int aa = Integer.parseInt(age);
        if(aa<40) {
            tv3.setText("1. Get Up at 5:50 am; Get fresh; Do prayer\n" + "2. Have 3 Glasses of Water\n" + "3. Do Yoga or Do walk");
        }
        else{
            tv3.setText("1. Get Up at 5:50 am; Get fresh; Do prayer\n" + "2. Have 3 Glasses of Water\n" + "3. Do light walk");
        }

double bmi = Double.parseDouble(weight)/((Double.parseDouble(height)*0.3048)*(Double.parseDouble(height)*0.3048));
if(bmi>=25) {
    if(db.equals("1")){
        tv4.setText("\n Breakfast-7.00 am \n Menu - \n" + ">Take Medicine if need\n" + "> 1.Egg,\n 2.Bread,\n 3.Green tea(without sugar)\n" + "> Take Medicine if need\n\n" + "Now read newspaper and Take Rest \n");
    }else {
        tv4.setText("\n Breakfast-7.00 am \n Menu - \n" + ">Take Medicine if need\n" + "> 1.Egg,\n 2.Bread,\n 3.milk & Green tea\n" + "> Take Medicine if need\n\n" + "Now read newspaper and Take Rest \n");
    }
}
else{
    if(db.equals("1")){
        tv4.setText("\n Breakfast-7.00 am \n Menu - \n" + ">Take Medicine if need\n" + "> 1.Egg,\n 2.Bread,\n 3.Fruit juice(without sugar)\n" + "> Take Medicine if need\n\n" + "Now read newspaper and Take Rest \n");
    }else {
        tv4.setText("\n Breakfast-7.00 am \n Menu - \n" + ">Take Medicine if need\n" + "> 1.Egg,\n 2.Bread and butter,\n 3.Fruit juice\n" + "> Take Medicine if need\n\n" + "Now read newspaper and Take Rest \n");
    }
}

button4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
        intent.putExtra("bmi",(bmi+""));
        intent.putExtra("col",cl);
        startActivity(intent);


    }
});


    }
}