package com.example.nabda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class cv2 extends AppCompatActivity {
   CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8;
   TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv2);
        textView=findViewById(R.id.check);
        checkBox1=findViewById(R.id.box1);
        checkBox2=findViewById(R.id.box2);
        checkBox3=findViewById(R.id.box3);
        checkBox4=findViewById(R.id.box4);
        checkBox5=findViewById(R.id.box5);
        checkBox6=findViewById(R.id.box6);
        checkBox7=findViewById(R.id.box7);
        checkBox8=findViewById(R.id.box8);


    }
}
