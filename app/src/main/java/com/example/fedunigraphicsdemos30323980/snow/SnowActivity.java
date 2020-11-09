package com.example.fedunigraphicsdemos30323980.snow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.content.Intent;
import android.os.Bundle;
import com.example.fedunigraphicsdemos30323980.R;
import processing.android.PFragment;


/**
 * @author Petar Petrov
 * @Student ID: 30323980
 *
 * A class that displays a texture loaded
 * from a provided image as a Processing PImage
 */

// SnowActivity class which extends AppCompatActivity
public class SnowActivity extends AppCompatActivity {

    public static SnowSketch snowSketch;
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

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (snowSketch != null) {
            snowSketch.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (snowSketch != null) {
            snowSketch.onNewIntent(intent);
        }
    }
}
