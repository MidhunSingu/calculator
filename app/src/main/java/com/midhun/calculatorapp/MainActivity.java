package com.midhun.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private TextView ans;
    private EditText input;
    private Button add_btn;
    private Button sub_btn;
    private Button multi_btn;
    private Button div_btn;
    private Button equal_btn;
    private float final_res;

    //Buttons
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button clear;
    private Button dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final_res = 0;

         ans = findViewById(R.id.ans);
         input = findViewById(R.id.input);
         add_btn = findViewById(R.id.add);
         sub_btn = findViewById(R.id.sub);
         multi_btn = findViewById(R.id.multi);
         div_btn = findViewById(R.id.divide);
         equal_btn = findViewById(R.id.equals);

         one = findViewById(R.id.one);
         two = findViewById(R.id.two);
         three = findViewById(R.id.three);
         four = findViewById(R.id.four);
         five = findViewById(R.id.five);
         six = findViewById(R.id.six);
         seven = findViewById(R.id.seven);
         eight = findViewById(R.id.eight);
         nine = findViewById(R.id.nine);
         zero = findViewById(R.id.zero);
         dot = findViewById(R.id.dot);
         clear = findViewById(R.id.clear);

        input.setText("100");

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 1;
                input.setText(currVal);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 2;
                input.setText(currVal);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 3;
                input.setText(currVal);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 4;
                input.setText(currVal);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 5;
                input.setText(currVal);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 6;
                input.setText(currVal);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 7;
                input.setText(currVal);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 8;
                input.setText(currVal);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 9;
                input.setText(currVal);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + 0;
                input.setText(currVal);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currVal = input.getText().toString();
                currVal = currVal + ".";
                input.setText(currVal);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.getText().clear();
            }
        });

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    float val = Float.parseFloat(input.getText().toString());
                    final_res = final_res + val;
                    ans.setText(final_res+"");
                    input.getText().clear();
                }catch (Exception e){

                }
            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    float val = Float.parseFloat(input.getText().toString());
                    final_res = final_res - val;
                    ans.setText(final_res+"");
                    input.getText().clear();
                }catch (Exception e){

                }
            }
        });

        multi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    float val = Float.parseFloat(input.getText().toString());
                    final_res = final_res * val;
                    ans.setText(final_res+"");
                    input.getText().clear();
                }catch (Exception e){

                }

            }
        });

        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    float val = Float.parseFloat(input.getText().toString());
                    final_res = final_res / val;
                    ans.setText(final_res+"");
                    input.getText().clear();
                }catch (Exception e){

                }
            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans.setText(final_res+"");
            }
        });

    }
}