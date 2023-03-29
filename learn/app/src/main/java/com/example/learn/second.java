package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent prominent = getIntent();
        //String title = prominent.getStringExtra("title");
        //String name = prominent.getStringExtra("Student Name");
        //int roll = prominent.getIntExtra("Roll No" , 0);
        TextView studentname,rollNO;
        rollNO = findViewById(R.id.studentrollno);
        studentname = findViewById(R.id.studnetname);
        studentname.setText("Name:- " + prominent.getStringExtra("Student Name"));
        rollNO.setText("roll No is:- "+prominent.getIntExtra("Roll No",0));



    }
}