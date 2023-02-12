package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WeeklyGoals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_goals);

        Spinner s1 = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> a1 = new ArrayAdapter<String>(WeeklyGoals.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.wtd));
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(a1);


        Spinner s2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> a2 = new ArrayAdapter<String>(WeeklyGoals.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.fdw));
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(a2);
    }

    public void button6(View view){
        Intent i = new Intent(this,Home.class);
        startActivity(i);
    }

    public void buttonst(View view){
        Intent i = new Intent(this,TimePicker.class);
        startActivity(i);
    }
}