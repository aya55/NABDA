package com.example.nabda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView cv1 , cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gridLayout=findViewById(R.id.grad);
        cv1=(CardView)findViewById(R.id.cv1);
        cv2=(CardView)findViewById(R.id.cv2);
        cv3=(CardView)findViewById(R.id.cv3);
        cv4=(CardView)findViewById(R.id.cv4);
        cv5=(CardView)findViewById(R.id.cv5);
        cv6=(CardView)findViewById(R.id.cv6);
        cv7=(CardView)findViewById(R.id.cv7);
        cv8=(CardView)findViewById(R.id.cv8);
        cv9=(CardView)findViewById(R.id.cv9);
        cv10=(CardView)findViewById(R.id.cv10);
        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
        cv4.setOnClickListener(this);
        cv5.setOnClickListener(this);
        cv6.setOnClickListener(this);
        cv7.setOnClickListener(this);
        cv8.setOnClickListener(this);
        cv9.setOnClickListener(this);
        cv10.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cv1:i=new Intent(this,cv1.class);startActivity(i);  break;
            case R.id.cv2:i=new Intent(this,cv2.class);startActivity(i);break;
            case R.id.cv3:i=new Intent(this,CV3.class);startActivity(i);break;
            case R.id.cv4:i=new Intent(this,CV4.class);startActivity(i);break;
            case R.id.cv5:i=new Intent(this,CV5.class);startActivity(i);break;
            case R.id.cv6:i=new Intent(this,CV6.class);startActivity(i);break;
            case R.id.cv7:i=new Intent(this,CV7.class);startActivity(i);break;
            case R.id.cv8:i=new Intent(this,CV8.class);startActivity(i);break;
            default:break;



        }

    }
}
