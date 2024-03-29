package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class practiceActivity extends AppCompatActivity {
    Intent intent;
    String[] alphabets = {"\u0627","\u0628", "\u062A","\u062B","\u062C","\u062D","\u062E","\u062F","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0636","\u0637", "\u0638","\u0639","\u063A", "\u0641", "\u0642","\u0643","\u0644", "\u0645", "\u0646","\u0647", "\u0648", "\u064A","\u0622","\u0629","\u0649"};
    String[] emissionP= {"Halqiyah_b","Shafaweeyah","Niteeyah", "Lisaveyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Niteeyah", "Lisaveyah", "Thalqeeyah", "Asleeyah", "Asleeyah", "Shajariyah_Haafiyah", "Asleeyah", "Shajariyah_Haafiyah", "Niteeyah", "Lisaveyah", "Halqiyah_b","Halqiyah_b", "Shafaweeyah", "Lahatiyah_b", "Lahatiyah_b", "Tarfiyah", "Ghunna", "Halqiyah_b", "Shafaweeyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Halqiyah_b"};
    int random_int, questionCount, correctcount;
    String option;
    void result(){
        int selectedID = getResources().getIdentifier(option,
                "id", getPackageName());
        int correctID = getResources().getIdentifier(emissionP[random_int],
                "id", getPackageName());
        System.out.println(selectedID);
        System.out.println(correctID);
        System.out.println(random_int);
        Button selectedButton = (Button) findViewById(selectedID);
        Button correctButton = (Button) findViewById(correctID);
        if(option.equals(emissionP[random_int])){
            selectedButton.setBackgroundColor(Color.GREEN);
            correctcount++;
        }
        else{
            selectedButton.setBackgroundColor(Color.RED);
            correctButton.setBackgroundColor(Color.GREEN);
        }
    }

    void resetColor(){
        int selectedID = getResources().getIdentifier(option,
                "id", getPackageName());
        int correctID = getResources().getIdentifier(emissionP[random_int],
                "id", getPackageName());
        Button selectedButton = (Button) findViewById(selectedID);
        Button correctButton = (Button) findViewById(correctID);
        selectedButton.setBackgroundColor(0xFF6200EE);
        correctButton.setBackgroundColor(0xFF6200EE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        TextView text= (TextView)findViewById(R.id.textView2);
        StringBuilder sb = new StringBuilder();
        sb.append("\u0627");
        text.setText(sb.toString());
        questionCount=0;
        correctcount=0;
    }

    public void next(View view) {
        resetColor();
        questionCount++;
        random_int = (int)Math.floor(Math.random()*(alphabets.length));
//        random_int++;
        TextView text= (TextView)findViewById(R.id.textView2);
        StringBuilder sb = new StringBuilder();
        sb.append(alphabets[random_int]);
        text.setText(sb.toString());
    }

    public void Halqiyah(View view) {
        option= "Halqiyah_b";
        result();
    }

    public void Lahatiyah(View view) {
        option = "Lahatiyah_b";
        result();
    }

    public void Tarfiyah(View view) {
        option="Tarfiyah";
        result();
    }

    public void Niteeyah(View view) {
        option= "Niteeyah";
        result();
    }

    public void ShajariyahHaafiyah(View view) {
        option = "Shajariyah_Haafiyah";
        result();
    }

    public void Ghunna(View view) {
        option="Ghunna";
        result();
    }

    public void Lisaveyah(View view) {
        option="Lisaveyah";
        result();
    }

    public void Shafaweeyah(View view) {
        option= "Shafaweeyah";
        result();
    }

    public void Asleeyah(View view) {
        option= "Asleeyah";
        result();
    }

    public void Thalqeeyah(View view) {
        option= "Thalqeeyah";
        result();
    }

    public void seeResult(View view) {
        intent = new Intent(practiceActivity.this, Result.class);
        Bundle bundle = new Bundle();
        bundle.putString("tScore", Integer.toString(questionCount));
        bundle.putString("score", Integer.toString(correctcount));
        intent.putExtras(bundle);
        startActivity(intent);
    }
}