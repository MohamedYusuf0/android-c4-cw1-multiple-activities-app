package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle B = getIntent().getExtras();
        TextView PersonName = findViewById(R.id.PersonName);
        String Name = B.getString("Name");
        PersonName.setText(Name);

        Bundle B1 = getIntent().getExtras();
        TextView PersonAge = findViewById(R.id.PersonAge);
        String Age = B1.getString("Age");
        PersonAge.setText(Age);
    }
}