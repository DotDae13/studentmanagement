package com.example.hopitalmanagement;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class appointmentScreen extends AppCompatActivity {

    Button addAppointment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_details);

        addAppointment = findViewById(R.id.buttonAdd);

        addAppointment.setOnClickListener(view ->
                Toast.makeText(appointmentScreen.this, "Class Scheduled", Toast.LENGTH_SHORT).show());
    }


}
