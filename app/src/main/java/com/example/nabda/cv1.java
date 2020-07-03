package com.example.nabda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class cv1 extends AppCompatActivity implements View.OnClickListener {
    private CardView cv11 , cv12,cv13,cv14,cv15,cv16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv1);
        GridLayout gridLayout=findViewById(R.id.gradview);
        cv11=(CardView)findViewById(R.id.cv11);
        cv12=(CardView)findViewById(R.id.cv12);
        cv13=(CardView)findViewById(R.id.cv13);
        cv14=(CardView)findViewById(R.id.cv14);
        cv15=(CardView)findViewById(R.id.cv15);
        cv16=(CardView)findViewById(R.id.cv16);
        cv11.setOnClickListener(this);
        cv12.setOnClickListener(this);
        cv13.setOnClickListener(this);
        cv14.setOnClickListener(this);
        cv15.setOnClickListener(this);
        cv16.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cv11:i=new Intent(this,Cv11.class);startActivity(i);  break;
            case R.id.cv12:i=new Intent(this,Cv12.class);startActivity(i);break;
            case R.id.cv13:i=new Intent(this,Cv13.class);startActivity(i);break;
            case R.id.cv14:i=new Intent(this,Cv14.class);startActivity(i);break;
            case R.id.cv15:i=new Intent(this,Cv15.class);startActivity(i);break;
            case R.id.cv16:i=new Intent(this,Cv16.class);startActivity(i);break;

            default:break;



        }
    }
}
