package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import  android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //player representative
    // 0 = x
    // 1 = o;
    int activeplayer = 0;
    int[] gamestae = {2,2,2,2,2,2,2,2,2};
    //state meaning
    //1=o
    //0=x
    //2=null
    public void Playertab(View view){

    ImageView img = (ImageView) view;
    int tappedImage = Integer.parseInt(img.getTag().toString());
    if(gamestae[tappedImage] == 2){
        gamestae[tappedImage] = activeplayer;
        img.setTranslationY(-1000f);
        if(activeplayer == 0){
            img.setImageResource(R.drawable.x);
            activeplayer = 1;
        }else{
            img.setImageResource(R.drawable.o);
            activeplayer = 0;
        }
    }
    img.animate().translationYBy(1000f).setDuration(300);
    }
}