package com.example.myapplication4; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import com.example.myapplication4.R; 
public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername,editTextPassword; 
    private Button buttonLogin; 
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        EdgeToEdge.enable(this); 
        setContentView(R.layout.activity_main); 
        editTextUsername=findViewById(R.id.editTextUsername); 
        editTextPassword=findViewById(R.id.editTextPassword); 
        buttonLogin=findViewById(R.id.buttonLogin); 
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override 
            public void onClick(View v) {
                String username=editTextUsername.getText().toString(); 
                String password=editTextPassword.getText().toString(); 
                if(username.equals("admin") && password.equals("password")){ 
                    Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_SHORT).show(); 
                }else{ 
                    Toast.makeText(MainActivity.this,"Invalid username or password",Toast.LENGTH_SHORT).show(); 
                } 
            } 
        });
    } 
}   
