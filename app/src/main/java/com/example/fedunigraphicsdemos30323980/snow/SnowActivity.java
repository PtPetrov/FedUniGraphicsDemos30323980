package com.example.fedunigraphicsdemos30323980.snow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;

import com.example.fedunigraphicsdemos30323980.R;

import processing.android.PFragment;

public class SnowActivity extends AppCompatActivity {

    SnowSketch snowSketch;
    LinearLayoutCompat linearLayoutCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snow);
        snowSketch = new SnowSketch();
        linearLayoutCompat = findViewById(R.id.snowLinearLayout);
        PFragment fragment = new PFragment(snowSketch);

        fragment.setView(linearLayoutCompat, this);



    }
}
