package com.danon.radiorecordingapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // This connects to XML layout

        // Init UI components
        TextView titleText = findViewById(R.id.titleText);
        Button testButton = findViewById(R.id.recordButton);

        // Set up button click listener
        testButton.setOnClickListener(view -> {
            titleText.setText("Recoring...");
            testButton.setText("Stop Recording");
        });
    }
}
