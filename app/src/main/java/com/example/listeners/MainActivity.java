package com.example.listeners;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {

    Button btn_blue;
    Button btn_red;
    int counter_red, counter_blue = 0;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn_blue = (Button) findViewById(R.id.btn_blue);
        btn_red = (Button) findViewById(R.id.btn_red);
        btn_red.setOnLongClickListener(this);

        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_blue++;
            }
        });

    }

    @Override
    public boolean onLongClick(View view) {
        counter_red = counter_red + 2;

        return false;
    }

    public void activity(View view) {
        si = new Intent(this, MainActivity2.class);
        si.putExtra("blue", counter_blue);
        si.putExtra("red", counter_red);
        startActivity(si);
        counter_red = 0;
        counter_blue = 0;
    }

    @Override
    protected void onActivityResult (int source, int good ,@Nullable Intent data_back) {
        super.onActivityResult(source, good, data_back);
        {
            counter_red = 0;
            counter_blue = 0;
        }
    }






}