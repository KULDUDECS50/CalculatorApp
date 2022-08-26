package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private String sign;
    private Double numET1, numET2;
    private double output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //this makes sure that the keyboard doesnt pop up
        //https://stackoverflow.com/questions/2496901/android-on-screen-keyboard-auto-popping-up

    }


    public void calc(View view) {
        EditText numberSumTV = findViewById(R.id.calculation);


        numET2 = Double.parseDouble((numberSumTV.getText().toString()));
        //takes in second number
        if(!numberSumTV.getText().toString().equals("")) {
            // each does the computational stuff
            if (sign.equals("+")) {
                output = numET1 + numET2;
                sign = "";
            } else if (sign.equals("-")) {
                output = numET1 - numET2;
                sign = "";
            } else if (sign.equals("/")) {
                output = numET1 / numET2;
                sign = "";
            } else if (sign.equals("*")) {
                output = numET1 * numET2;
                sign = "";
            }else if (sign.equals("%")) {
                numET1 = output;
                output = numET1 * 0.01;
                sign = "";
            }


        }
        numberSumTV.setText("" + output);

        }


    public void findSum(View view) {
//        EditText number1ET = findViewById(R.id.num1ET);
//        EditText number2ET = findViewById(R.id.num2ET);
        EditText numberSumTV = (EditText)findViewById(R.id.calculation);
        if(!numberSumTV.getText().toString().equals("")) {
            numET1 = Double.parseDouble((numberSumTV.getText().toString()));
        }

        sign ="+";

        numberSumTV.setText("");
    }
    public void findDiff(View view) {
        EditText numberSumTV = (EditText)findViewById(R.id.calculation);
        if(!numberSumTV.getText().equals("")) {
            numET1 = Double.parseDouble((numberSumTV.getText().toString()));
        }

        sign ="-";

        numberSumTV.setText("");
    }
    public void findDiv(View view) {
        EditText numberSumTV = (EditText)findViewById(R.id.calculation);
        if(!numberSumTV.getText().toString().equals("")) {
            numET1 = Double.parseDouble((numberSumTV.getText().toString()));
        }

        sign ="/";

        numberSumTV.setText("");
    }
    public void findProd(View view) {
        EditText numberSumTV = (EditText)findViewById(R.id.calculation);
        if(!numberSumTV.getText().toString().equals("")) {
            numET1 = Double.parseDouble(String.valueOf(numberSumTV.getText()));
        }


        sign ="*";

        numberSumTV.setText("");
    }
    public void findPercent(View view) {
        EditText numberSumTV = (EditText)findViewById(R.id.calculation);
        if(!numberSumTV.getText().toString().equals("")) {
            numET1 = Double.parseDouble((numberSumTV.getText().toString()));
        }
        else{
            numET1  = 0.0;
        }
        output = numET1 * 0.01;
        sign = "";

        numberSumTV.setText(""+ output);
    }
    //found out how to enter button text
    // Courtesy of Jaden in my P6 class
    public void one(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "1");


    }
    public void two(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "2");
    }
    public void three(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "3");
    }
    public void four(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "4");
    }
    public void five(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "5");
    }
    public void six(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "6");
    }
    public void seven(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "7");
    }
    public void eight(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "8");
    }
    public void nine(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "9");
    }
    public void zero(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText(field.getText() + "0");
    }
    public void clear(View view){
        EditText field = (EditText)findViewById(R.id.calculation);
        field.setText("");
    }







}