package com.example.rehan;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etUser, etPass;
    Button btnSave, btnFetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.etUser);
        etPass = findViewById(R.id.etPass);
        btnSave = findViewById(R.id.btnSave);
        btnFetch = findViewById(R.id.btnFetch);

        btnSave.setOnClickListener(v -> {

            SharedPreferences sp = getSharedPreferences("MyData", MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();

            editor.putString("username", etUser.getText().toString());
            editor.putString("password", etPass.getText().toString());
            editor.apply();

            Toast.makeText(MainActivity.this,
                    "Saved Successfully",
                    Toast.LENGTH_SHORT).show();
        });

        btnFetch.setOnClickListener(v -> {

            Intent i = new Intent(MainActivity.this,
                    MainActivity2.class);

            startActivity(i);
        });
    }
}