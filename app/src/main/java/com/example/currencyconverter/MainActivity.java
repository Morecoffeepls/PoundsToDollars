package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convert(View view){


        Log.i("Info", "Button pressed");

        EditText editText =  (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInPounds = editText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);

        double amountInDollarsDouble = amountInPoundsDouble * 1.3;

        String amountInDollarsString = String.format("%.2f",amountInDollarsDouble);

        Log.i("Amount in Dollars", amountInDollarsString);

        Toast.makeText(this, "Pounds" + amountInPounds + "Is $ "+ amountInDollarsString,Toast.LENGTH_LONG).show();




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}