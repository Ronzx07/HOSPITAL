package com.example.hms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void staffLogin(View view)
    {
        //Intent provides connection in differnet components and activity to activity
        Intent intent = new Intent(this, StaffLogin.class);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        setContentView(R.layout.activity_staff_login);
    }

    public void patientLogin(View view)
    {
        //Intent intent = new Intent(this, PatientLogin.class);
        //EditText editText = findViewById(R.id.editTextTextPersonName2);
        //setContentView(R.layout.activity_patient_login);
    }
}