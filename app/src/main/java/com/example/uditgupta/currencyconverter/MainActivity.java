package com.example.uditgupta.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertorClick(View view){
        EditText editText = findViewById(R.id.editText);
        Log.i("Enter the Amount", editText.getText().toString());
        Double amountDollar = Double.parseDouble(editText.getText().toString());
        Double amountRupees = (amountDollar * 72.66);
        Toast.makeText(MainActivity.this, "Rs. "+ amountRupees.toString(),Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
