package com.example.mustafasidiqi.apptaskguessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int correctNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guessBtn = (Button) findViewById(R.id.mainBtn);
        guessBtn.setOnClickListener(this);

        correctNum = (int) (Math.random()*10) + 1;


    }

    @Override
    public void onClick(View view) {
        EditText guessNumber = (EditText) findViewById(R.id.numberEdit);
        EditText text = (EditText) findViewById(R.id.textEdit);

        int num = Integer.parseInt(guessNumber.getText().toString());

        if(num < correctNum) {
            text.setText("You have guessed too low!");
        } else if (num > correctNum) {
            text.setText("You have guessed too high!");
        } else {
            text.setText("You have guessed correct!");
        }
    }
}
