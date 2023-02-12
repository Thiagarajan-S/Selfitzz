package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Yoga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
    }

    public void button10(View view){
        Intent i = new Intent(this,Kidsyoga.class);
        startActivity(i);
    }

    public void button11(View view){
        Intent i = new Intent(this,yoganormal.class);
        startActivity(i);
    }
}