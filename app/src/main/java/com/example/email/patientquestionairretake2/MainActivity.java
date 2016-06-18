package com.example.email.patientquestionairretake2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton NewQ;
    private EditText Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewQ = (ImageButton) findViewById(R.id.startButton);
        Name = (EditText) findViewById(R.id.nameET);
        NewQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), QuestionOne.class));
                PatientData.Name = Name.getText().toString();
            }
        });

    }

}
