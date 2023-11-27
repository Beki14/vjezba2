package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHello;

    private EditText editTextInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHello = findViewById(R.id.textViewHello);

        editTextInsert = findViewById(R.id.editTextInsert);
    }
        public void clickButtonPromjena (View view){

            String text="";
            text = editTextInsert.getText().toString();

            textViewHello.setText(text);
    }
}