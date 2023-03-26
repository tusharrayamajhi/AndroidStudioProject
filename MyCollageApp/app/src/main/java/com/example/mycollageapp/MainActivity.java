package com.example.mycollageapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                EditText edtweight,edtheightft,edtheightinc;
                Button BIMcalulate;
                TextView txtresult;
                LinearLayout mainll;



                edtweight = findViewById(R.id.person_WT);
                edtheightft = findViewById(R.id.PERSON_Height_ft);
                edtheightinc = findViewById(R.id.height_in_inch);
                BIMcalulate = findViewById(R.id.bton);
                txtresult = findViewById(R.id.textView);
                mainll = findViewById(R.id.mainl);
                BIMcalulate.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                                int weight = Integer.parseInt(edtweight.getText().toString());
                                int ft = Integer.parseInt(edtheightft.getText().toString());
                                int in = Integer.parseInt(edtheightinc.getText().toString());
                                double totalm = ((ft * 12 + in) * 2.53)/100;
                                double bmi = weight/(totalm*totalm);
                                if(bmi>25){
                                        txtresult.setText("Yout are Overweight");
                                        mainll.setBackgroundColor(getResources().getColor(R.color.overweight));
                                } else if (bmi<18) {
                                        txtresult.setText("Yout are Underweight");
                                        mainll.setBackgroundColor(getResources().getColor(R.color.underweight));

                                }else{
                                        txtresult.setText("You are Healthy");
                                        mainll.setBackgroundColor(getResources().getColor(R.color.Healthy));

                                }
                        }
                });
        }
        }