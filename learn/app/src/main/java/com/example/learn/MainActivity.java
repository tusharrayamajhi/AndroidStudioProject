package com.example.learn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        btn = findViewById(R.id.btn1);
        Intent inext = new Intent(MainActivity.this,second.class);
        inext.putExtra("title","Home Page");
        inext.putExtra("student","Ram");
        inext.putExtra("Roll No", 10);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(inext);
            }
        });
    }
}