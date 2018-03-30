package com.example.mohammadfaizan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Add = (Button) findViewById(R.id.Add);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numONE = (EditText) findViewById(R.id.numOne);
                EditText numTwo = (EditText) findViewById(R.id.numTwo);
                TextView result = (TextView) findViewById(R.id.result);

                float num1 = Float.parseFloat(numONE.getText().toString());
                float num2 = Float.parseFloat(numTwo.getText().toString());
                float res = (num1 + num2) / 4;
                result.setText(res + "kcals");
            }
        });
        Button protTextview = (Button) findViewById(R.id.protTextveiw);
        protTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numONE = (EditText) findViewById(R.id.numOne);
                EditText numTwo = (EditText) findViewById(R.id.numTwo);
                TextView result = (TextView) findViewById(R.id.result);

                float num1 = Float.parseFloat(numONE.getText().toString());
                float num2 = Float.parseFloat(numTwo.getText().toString());
                double res = (num2)*(0.8);
                result.setText(res + "grams");
            }

        });


        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),SecondActivity.class);
                startActivity(i);
            }
        });
    }
    }

