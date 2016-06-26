package com.example.macbookair.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String question1 = "1.Does Jetta belong to Volkswagon company?";
    private String question2 = "2.Which of the following is a car name?";
    private String question3 = "3.Country of origin of Ferrari company?";
    private String question4 = "4.Mercedes Benz is a german company?";
    private String question5 = "5.Find cars Belonging to Honda?";
    private String question6 = "6.Corrola car belongs to which company?";
    private String answer1 = "yes";
    private String answer2a = "evoque";
    private String answer2b = "camaro";
    private String answer3 = "italy";
    private String answer4 = "yes";
    private String answer5a = "civic";
    private String answer5b = "brio";
    private String answer6 = "toyota";
    private int score = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView q1 = (TextView) findViewById(R.id.q1);
        TextView q2 = (TextView) findViewById(R.id.q2);
        TextView q3 = (TextView) findViewById(R.id.q3);
        TextView q4 = (TextView) findViewById(R.id.q4);
        TextView q5 = (TextView) findViewById(R.id.q5);
        TextView q6 = (TextView) findViewById(R.id.q6);
        RadioButton r1 = (RadioButton) findViewById(R.id.q1radio1);
        RadioButton r2 = (RadioButton) findViewById(R.id.q1radio2);
        RadioButton r3 = (RadioButton) findViewById(R.id.q2radio1);
        RadioButton r4 = (RadioButton) findViewById(R.id.q2radio2);
        CheckBox q1c1 = (CheckBox) findViewById(R.id.q1cb1);
        CheckBox q1c2 = (CheckBox) findViewById(R.id.q1cb2);
        CheckBox q1c3 = (CheckBox) findViewById(R.id.q1cb3);
        CheckBox q1c4 = (CheckBox) findViewById(R.id.q1cb4);
        CheckBox q2c1 = (CheckBox) findViewById(R.id.q2cb1);
        CheckBox q2c2 = (CheckBox) findViewById(R.id.q2cb2);
        CheckBox q2c3 = (CheckBox) findViewById(R.id.q2cb3);
        CheckBox q2c4 = (CheckBox) findViewById(R.id.q2cb4);


        q1.setText(question1);
        r1.setText("Yes");
        r2.setText("No");
        q2.setText(question2);
        q1c1.setText("Evoque");
        q1c2.setText("Iron 883");
        q1c3.setText("Camaro");
        q1c4.setText("Panigale");
        q3.setText(question3);
        q4.setText(question4);
        r3.setText("Yes");
        r4.setText("No");
        q5.setText(question5);
        q2c1.setText("Chiron");
        q2c2.setText("Civic");
        q2c3.setText("Brio");
        q2c4.setText("Huracan");
        q6.setText(question6);

    }

    public void findscore(View v) {
        String result = "Your Score Out of 6 : ";
        result += calcscore();
        Toast toast = Toast.makeText(this, result, Toast.LENGTH_LONG);
        toast.show();
        score = 0;
    }

    public int calcscore() {
        String temp = "";
        RadioButton ob1 = (RadioButton) findViewById(R.id.q1radio1);
        RadioButton ob2 = (RadioButton) findViewById(R.id.q2radio1);
        CheckBox cb1 = (CheckBox) findViewById(R.id.q1cb1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.q1cb3);
        CheckBox cb3 = (CheckBox) findViewById(R.id.q2cb2);
        CheckBox cb4 = (CheckBox) findViewById(R.id.q2cb3);
        CheckBox cb5 = (CheckBox) findViewById(R.id.q1cb2);
        CheckBox cb6 = (CheckBox) findViewById(R.id.q1cb4);
        CheckBox cb7 = (CheckBox) findViewById(R.id.q2cb1);
        CheckBox cb8 = (CheckBox) findViewById(R.id.q2cb4);
        EditText eb1 = (EditText) findViewById(R.id.editText);
        EditText eb2 = (EditText) findViewById(R.id.editText2);
        if (ob1.isChecked()) {
            score += 1;
            temp += score;
            Log.i("score:", temp);
        }
        if (ob2.isChecked()) {
            score += 1;
            temp += score;
            Log.i("score:", temp);
        }
        if ((cb1.isChecked() == true) && (cb2.isChecked() == true) && (cb5.isChecked() == false) && (cb6.isChecked() == false)) {
            score += 1;
            temp += score;
            Log.i("score:", temp);
        }
        if ((cb3.isChecked() == true) && (cb4.isChecked() == true) && (cb7.isChecked() == false) && (cb8.isChecked() == false)) {
            score += 1;
            temp += score;
            Log.i("score:", temp);
        }
        if (answer3.equals(eb1.getText().toString().toLowerCase())) {
            score += 1;
            temp += score;
            Log.i("score:", temp);
        }
        if (answer6.equals(eb2.getText().toString().toLowerCase())) {
            score += 1;
            temp += score;
            Log.i("score:", temp);
        }
        return score;
    }

}
