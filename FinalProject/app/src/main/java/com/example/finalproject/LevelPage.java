package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.ImageView;


public class LevelPage extends AppCompatActivity {


    Button adventuretime;
   ImageView  Tdrama;
   ImageView Atime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page);

        Atime = findViewById(R.id.Atime);
        Tdrama = findViewById(R.id.Tdrama);

        
        Tdrama.setImageResource(R.drawable.total);


        adventuretime = findViewById(R.id.adventuretime);
        adventuretime.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {
                goToAdventureTimeQuiz();
            }
        });

        Atime.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
    }


    public void goToAdventureTimeQuiz() {

        Intent i = new Intent(this, AdventureTimeQuiz.class);
        startActivity(i);
    }}