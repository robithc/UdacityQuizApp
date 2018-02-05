package com.example.android.udacityquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by RO221D on 2018-02-05.
 */

public class question1 extends AppCompatActivity {

    //The string that will carry the key that will be put in the intent
    public static final String  question1Answer= "com.example.android.udacityquizapp.Answer1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
    }

    /**
     * this method is called when the user clickes the button to go to question2
     */
    public void goToQuestion2(View view) {
        //get the answer of the current question
        String answer = ((EditText)findViewById(R.id.question_1_edit_text)).getText().toString();

        //create a new intent , fill it with current question answer and starts the next question
        Intent intent = new Intent(this, question2.class);
        intent.putExtra(question1Answer , answer);
        startActivity(intent);
    }
}