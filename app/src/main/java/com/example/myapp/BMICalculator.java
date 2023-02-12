package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BMICalculator extends AppCompatActivity {

    EditText heightcm,weightkg;
    TextView result;
    String calculation,BMIresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i_calculator);

        weightkg = findViewById(R.id.weightkg);
        heightcm = findViewById(R.id.heightcm);
        result = findViewById(R.id.result);


    }

    public void calculateBMI(View view){
        String S1 = weightkg.getText().toString();
        String S2 = heightcm.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2) / 100;

        float bmi = weightValue / (heightValue * heightValue);

        if(bmi < 16){
            BMIresult = "Severely Under Weight";
        }
        else if(bmi < 18.5){
            BMIresult = "Underweight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            BMIresult = "Normal Weight";
        }
        else if(bmi >= 25 && bmi <= 29.9){
            BMIresult = "Overweight";
        }
        else{
            BMIresult = "Obese";
        }

        calculation = "Result:\n\n" + bmi + "\n" + BMIresult;
        result.setText(calculation);

    }




}