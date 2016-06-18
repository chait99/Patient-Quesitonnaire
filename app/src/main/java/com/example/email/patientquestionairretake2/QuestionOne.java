package com.example.email.patientquestionairretake2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class QuestionOne extends AppCompatActivity {

    private RadioGroup Q1RG;
    private ImageButton NextQ;
    int ScoreNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        Q1RG = (RadioGroup) findViewById(R.id.rgQ1);
        NextQ = (ImageButton) findViewById(R.id.nextQButton);

            Q1RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if (checkedId == R.id.c1rb) {
                        ScoreNumber = 0;
                        NextQ.setVisibility(View.VISIBLE);

                    } else if (checkedId == R.id.c2rb) {
                        ScoreNumber = 1;
                        NextQ.setVisibility(View.VISIBLE);

                    } else if (checkedId == R.id.c3rb) {
                        ScoreNumber = 2;
                        NextQ.setVisibility(View.VISIBLE);

                    } else if (checkedId == R.id.c4rb) {
                        ScoreNumber = 3;
                        NextQ.setVisibility(View.VISIBLE);

                    }
                }

            });

        NextQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (ScoreNumber == 0) {
                    PatientData.Score = 0;
                    startActivity(new Intent(getApplicationContext(), QuestionTwo.class));
                }
                if (ScoreNumber == 1) {
                    PatientData.Score = 1;
                    startActivity(new Intent(getApplicationContext(), QuestionTwo.class));
                }
                if (ScoreNumber == 2) {
                    PatientData.Score = 2;
                    startActivity(new Intent(getApplicationContext(), QuestionTwo.class));
                }
                if (ScoreNumber == 3) {
                    PatientData.Score = 3;
                    startActivity(new Intent(getApplicationContext(), QuestionTwo.class));
                }
            }
        });
    }
    @Override
    public void onBackPressed() {
    }
}
