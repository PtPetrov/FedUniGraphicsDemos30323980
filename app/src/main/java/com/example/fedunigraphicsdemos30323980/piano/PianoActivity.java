package com.example.fedunigraphicsdemos30323980.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fedunigraphicsdemos30323980.R;

public class PianoActivity extends AppCompatActivity {


     ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        imageView = findViewById(R.id.imageView);




    }
}