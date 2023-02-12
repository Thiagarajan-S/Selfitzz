package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Toast.makeText(Home.this, "Enjoy your fitness", Toast.LENGTH_SHORT).show();
    }

    public void button2(View view){
        Intent i = new Intent(this,BMICalculator.class);
        startActivity(i);
    }

    public void button4(View view){
        Intent i1 = new Intent(this,WeeklyGoals.class);
        startActivity(i1);
    }

    public void button7(View view){
        Intent i1 = new Intent(this,Workout.class);
        startActivity(i1);
    }

    public void button8(View view){
        Intent i1 = new Intent(this,Yoga.class);
        startActivity(i1);
    }

    public void button9(View view){
        Intent i1 = new Intent(this,Meditation.class);
        startActivity(i1);
    }

    public void button17(View view){
        Intent i1 = new Intent(this,StepCounter.class);
        startActivity(i1);
    }



}