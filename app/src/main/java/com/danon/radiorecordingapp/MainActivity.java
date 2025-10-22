package com.danon.radiorecordingapp;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This connects to XML layout

        // TODO: Outsource this into own UI Package
        // Init UI components
        Button testButton = findViewById(R.id.recordButton);
        SwitchCompat timeSwitch = findViewById(R.id.timeSwitch);

        timeSwitch.setOnClickListener(view -> {
            if (timeSwitch.isChecked()) {
                timeSwitch.setText("End");
            } else if (!timeSwitch.isChecked()) {
                timeSwitch.setText("Begin");
            }
        });

        // Set up button click listener
        testButton.setText("Start");
        testButton.setOnClickListener(view -> {
            // TODO: Rethink button logic
            if (testButton.getText().equals("Start")) {
                testButton.setText("Stop");
            } else if (testButton.getText().equals("Stop")) {
                testButton.setText("Start");
            }
        });
    }
}
