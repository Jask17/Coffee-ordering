package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int clicks=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickdecrement(View view) {
        if(clicks==0)
        {

            display(0);
        }
        else {
            clicks--;
            display(clicks);
        }
    }
    public void onClickincrement(View view) {
        clicks++;
        display(clicks);
    }
    public void disPrice(View view) {
        String priceMessage = "Total: "+"$ "+(clicks*5)+ "\nThank You!";
        displayTwo(priceMessage);


    }




    private void display(int number)
    {
        TextView  quantitytext=(TextView) findViewById(R.id.quantity_text_view);

        quantitytext.setText(""+number);


    }
    private void displayTwo(String  message)
    {
        TextView pricetext=(TextView) findViewById(R.id.price_text_view);

        pricetext.setText(message);
    }



}