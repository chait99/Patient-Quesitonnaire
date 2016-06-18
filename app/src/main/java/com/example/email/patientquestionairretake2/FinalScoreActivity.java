package com.example.email.patientquestionairretake2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalScoreActivity extends AppCompatActivity {

    private TextView Name, Score, Description;
    int score;
    private String something = " ";
    private Button NewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_score);

        Name = (TextView) findViewById(R.id.nameTV);
        Score = (TextView) findViewById(R.id.scoreTV);
        Description = (TextView) findViewById(R.id.descriptionTV);
        NewButton = (Button) findViewById(R.id.newB);

        Name.setText(PatientData.Name);

        int Trial = PatientData.Score;

        something = Integer.toString(PatientData.Score);

        Score.setText(something);

        if (Trial < 5) {
            Description.setText("You have Minimal Depression");
        }
        if (Trial >= 5 && Trial <= 9) {
            Description.setText("You have Mild Depression");
        }
        if (Trial >= 10 && Trial <= 14) {
            Description.setText("You have Minor Depression");
        }
        if (Trial >= 15 && Trial <= 19) {
            Description.setText("You have Moderately Severe Depression");
        }
        if (Trial >= 20) {
            Description.setText("You have Severe Depression");
        }

        NewButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        });
    }
    @Override
    public void onBackPressed() {
    }
}
