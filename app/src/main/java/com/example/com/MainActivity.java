package com.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        EditText Name = findViewById(R.id.Name);
        EditText Age = findViewById(R.id.Age);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Name.getText().toString().equals("") || Age.getText().toString().equals("")) {
                    // Do Nothing
                } else {

                    Intent I = new Intent(MainActivity.this,MainActivity2.class);
                    String PersonName = Name.getText().toString();
                    I.putExtra("Name" , PersonName);
                    String PersonAge = Age.getText().toString();
                    I.putExtra("Age" , PersonAge);
                    startActivity(I);
                }
            };

        });
    }
}
