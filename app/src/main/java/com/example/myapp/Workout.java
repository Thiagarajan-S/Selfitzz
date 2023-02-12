package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }


    public void button12(View view){
        Intent i = new Intent(this,Abs.class);
        startActivity(i);
    }

    public void button13(View view){
        Intent i = new Intent(this,Arm.class);
        startActivity(i);
    }

    public void button14(View view){
        Intent i = new Intent(this,Chest.class);
        startActivity(i);
    }

    public void button15(View view){
        Intent i = new Intent(this,Legs.class);
        startActivity(i);
    }

    public void button16(View view){
        Intent i = new Intent(this,Shoulder.class);
        startActivity(i);
    }
}