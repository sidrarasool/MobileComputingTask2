package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class test extends AppCompatActivity {

    String[] alphabets = {"\u0627","\u0628", "\u062A","\u062B","\u062C","\u062D","\u062E","\u062F","\u0630","\u0631","\u0632","\u0633","\u0634","\u0635","\u0636","\u0637", "\u0638","\u0639","\u063A", "\u0641", "\u0642","\u0643","\u0644", "\u0645", "\u0646","\u0647", "\u0648", "\u064A","\u0622","\u0629","\u0649"};
    String[] emissionP= {"Halqiyah_b","Shafaweeyah","Niteeyah", "Lisaveyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Niteeyah", "Lisaveyah", "Thalqeeyah", "Asleeyah", "Asleeyah", "Shajariyah_Haafiyah", "Asleeyah", "Shajariyah_Haafiyah", "Niteeyah", "Lisaveyah", "Halqiyah_b","Halqiyah_b", "Shafaweeyah", "Lahatiyah_b", "Lahatiyah_b", "Tarfiyah", "Ghunna", "Halqiyah_b", "Shafaweeyah", "Shajariyah_Haafiyah", "Halqiyah_b", "Halqiyah_b", "Halqiyah_b"};
    int random_int;
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
    }


    public void next_e(View view) {
        resetColor();
        random_int = (int)Math.floor(Math.random()*(alphabets.length));
//        random_int++;
        TextView text= (TextView)findViewById(R.id.textView2);
        StringBuilder sb = new StringBuilder();
        sb.append(alphabets[random_int]);
        text.setText(sb.toString());
    }

    public void Halqiyah_e(View view) {
        option= "Halqiyah_b";
        result();
    }

    public void Lahatiyah_e(View view) {
        option = "Lahatiyah_b";
        result();
    }

    public void Tarfiyah_e(View view) {
        option="Tarfiyah";
        result();
    }

    public void Niteeyah_e(View view) {
        option= "Niteeyah";
        result();
    }

    public void ShajariyahHaafiyah_e(View view) {
        option = "Shajariyah_Haafiyah";
        result();
    }

    public void Ghunna_e(View view) {
        option="Ghunna";
        result();
    }

    public void Lisaveyah_e(View view) {
        option="Lisaveyah";
        result();
    }

    public void Shafaweeyah_e(View view) {
        option= "Shafaweeyah";
        result();
    }

    public void Asleeyah_e(View view) {
        option= "Asleeyah";
        result();
    }

    public void Thalqeeyah_e(View view) {
        option= "Thalqeeyah";
        result();
    }
}