package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {
    private Button btnSubmit;
    private int score;
    private RadioGroup rdOne, rdTwo;
    private EditText txtQuiz;
    private CheckBox chkOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        rdOne = findViewById(R.id.rd_quiz_one);
        rdTwo = findViewById(R.id.rd_quiz_two);
        txtQuiz = findViewById(R.id.ed_storm);
        chkOne = findViewById(R.id.chk_shaggy);
        btnSubmit = findViewById(R.id.submit_button);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if (rdOne.getCheckedRadioButtonId() == R.id.rd_led) {
                    score++;
                }
                if (rdTwo.getCheckedRadioButtonId() == R.id.rd_black_sabbath) {
                    score++;
                }
                String userAnswer = txtQuiz.getText().toString();
                if (userAnswer.equalsIgnoreCase("stormzy")) {
                    score++;
                }
                if (chkOne.isChecked()) {
                    score++;
                }
                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE", Integer.toString(score));
                startActivity(intent);
            }
        });
    }
}




