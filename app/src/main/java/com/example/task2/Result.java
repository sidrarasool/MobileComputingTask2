package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView gained= (TextView)findViewById(R.id.textView3);
        TextView total= (TextView)findViewById(R.id.textView5);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String tScore = bundle.getString("tScore");
            String score = bundle.getString("score");
            total.setText(tScore);
            gained.setText(score);
        }
    }
}