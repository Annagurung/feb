package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore = 0, teamBScore = 0;
    private TextView textViewTeamA;
    private TextView textViewTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeamA = findViewById(R.id.team_a_score);
        textViewTeamB = findViewById(R.id.team_b_score);
    }

    public void add1ForTeamA(View view) {
        teamAScore += 1;
        displayScoreForTeamA(teamAScore);
    }

    public void add2ForTeamA(View view) {
        teamAScore += 2;
        displayScoreForTeamA(teamAScore);
    }

    public void add3ForTeamA(View view) {
        teamAScore += 3;
        displayScoreForTeamA(teamAScore);

    }

    public void add1ForTeamB(View view) {
        teamBScore += 1;
        displayScoreForTeamB(teamBScore);
    }

    public void add2ForTeamB(View view) {
        teamBScore += 2;
        displayScoreForTeamB(teamBScore);
    }


    public void add3ForTeamB(View view) {
        teamBScore += 3;
        displayScoreForTeamB(teamBScore);

    }

    public void displayScoreForTeamA(int score) {
        textViewTeamA.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score) {
        textViewTeamB.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayScoreForTeamA(teamAScore);
        displayScoreForTeamB(teamBScore);

    }
}
