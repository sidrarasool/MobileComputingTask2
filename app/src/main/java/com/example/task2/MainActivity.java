package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void practice(View view) {
        intent = new Intent(MainActivity.this, practiceActivity.class);
        startActivity(intent);
    }

    public void test(View view) {
        intent = new Intent(MainActivity.this, ExamActivity.class);
        startActivity(intent);
    }
}