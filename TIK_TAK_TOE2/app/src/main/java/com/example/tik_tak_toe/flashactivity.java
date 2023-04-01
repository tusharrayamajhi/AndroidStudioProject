package com.example.tik_tak_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class flashactivity extends AppCompatActivity {
TextView headding;
ImageView load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashactivity);

        load = findViewById(R.id.imageView);
        headding = findViewById(R.id.headtext);
        Animation rotate = AnimationUtils.loadAnimation(this,R.anim.rotate);
        load.setAnimation(rotate);
        Intent innext = new Intent(flashactivity.this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(innext);
                finish();
            }
        },3000);
    }
}