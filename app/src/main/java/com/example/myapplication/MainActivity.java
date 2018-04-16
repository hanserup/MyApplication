package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Accelerometer button */
    public void clickedAccelerometer(View v) {
        // Do something in response to button
        Intent intent = new Intent(this, AccelerometerActivity.class);
        startActivity(intent);
    }

    /** Called when the user taps the Compass button */
    public void clickedCompass(View v) {
        // Do something in response to button
        Intent intent = new Intent(this, CompassActivity.class);
        startActivity(intent);
    }

}

