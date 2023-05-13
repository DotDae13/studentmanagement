package com.example.hopitalmanagement;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//Inheriting Property from AppCompatActivity library
public class MainActivity extends AppCompatActivity {
    //Type variableName
    EditText username;
    EditText password;
    Button loginButton;
    Button signUpButton;
    //Initialize when app will start
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking frontend and backend
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        ///loginButton function
        loginButton.setOnClickListener(view -> {
            if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                //intent object declaration
                Intent i =   new Intent(getApplicationContext(), DoctorActivityMain.class);
                startActivity(i);
            } else {
                Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}