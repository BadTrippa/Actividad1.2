package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    TextView textViewName, textViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewName = findViewById(R.id.textViewName);
        textViewPassword = findViewById(R.id.textViewPassword);

        Intent intent = getIntent();
        String name = intent.getStringExtra("nombre");
        String password = intent.getStringExtra("contraseña");

        textViewName.setText("Nombre: " + name);
        textViewPassword.setText("Contraseña: " + password);
    }
}
