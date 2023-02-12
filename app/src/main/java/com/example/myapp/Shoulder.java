package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
    }

    public void buttonshoulder(View view){
        Intent i = new Intent(this,CaloriesBurnt.class);
        startActivity(i);
    }
}