package com.example.hopitalmanagement;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class patientDetailScreen extends AppCompatActivity {

    Button addButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_details);

        addButton = findViewById(R.id.buttonAdd);

        addButton.setOnClickListener(view ->
        {
            Toast.makeText(patientDetailScreen.this, "Student Added Successfully", Toast.LENGTH_SHORT).show();
        });
    }
}
