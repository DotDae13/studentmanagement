package com.example.hopitalmanagement;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class DoctorActivityMain  extends AppCompatActivity {

    //Variable Declaration
    Button addPatient;
    Button addAppointment;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_main);

        //Linking frontend and backend
        addPatient = findViewById(R.id.add_patient_button);
        addAppointment = findViewById(R.id.add_appointment_button);

        //Add patient button
        addPatient.setOnClickListener(view ->
        {
            Intent i = new Intent(getApplicationContext(), patientDetailScreen.class);
            startActivity(i);
        });

        addAppointment.setOnClickListener(view ->
        {
            Intent i = new Intent(getApplicationContext(), appointmentScreen.class);
            startActivity(i);
        });
    }
}


