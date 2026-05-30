package com.example.rehan;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtResult = findViewById(R.id.txtResult);
v
        SharedPreferences sp =
                getSharedPreferences("MyData", MODE_PRIVATE);

        String user = sp.getString("username", "");
        String pass = sp.getString("password", "");

        txtResult.setText(
                "User Name : " + user +
                        "\n\nPassword : " + pass
        );
    }
}