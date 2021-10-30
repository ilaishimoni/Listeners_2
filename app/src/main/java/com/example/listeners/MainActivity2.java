package com.example.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Tv;
    int blue;
    int red;
    Intent gi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Tv = (TextView) findViewById(R.id.Tv);
        gi = getIntent();

        red = gi.getIntExtra("red",-10);
        blue = gi.getIntExtra("blue",-10);

        if (red>blue){
            Tv.setText( "red player clicked: " + red + " , blue player clicked : " + blue +  "\n red won!");
        }
        else if (blue>red){
            Tv.setText( "red player clicked: " + red + " , blue player clicked : " + blue + "\n blue won!");
        }
        else{
            Tv.setText( "red player clicked: " + red + " , blue player clicked : " + blue + "\n tie!");

        }

    }



    public void go_back(View view) {
        setResult(RESULT_OK,gi);
        finish();
    }
}