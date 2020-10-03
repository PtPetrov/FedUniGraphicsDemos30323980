package com.example.fedunigraphicsdemos30323980;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.fedunigraphicsdemos30323980.piano.PianoActivity;
import com.example.fedunigraphicsdemos30323980.smoke.SmokeActivity;
import com.example.fedunigraphicsdemos30323980.snow.SnowActivity;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView _listView;
    private String _itemName;
    private Intent _intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _listView = findViewById(R.id.listView);
        _listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        _itemName = (String) adapterView.getItemAtPosition(i);

        switch (_itemName) {
            case "Snow Activity":
                _intent = new Intent(MainActivity.this, SnowActivity.class);
                startActivity(_intent);
                break;
            case "Smoke Activity":
                _intent = new Intent(MainActivity.this, SmokeActivity.class);
                startActivity(_intent);
                break;
            case "Piano Activity":
                _intent = new Intent(MainActivity.this, PianoActivity.class);
                startActivity(_intent);
                break;
            default:
                return;
        }
    }
}