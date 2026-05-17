package com.example.a4thprogram; 
import android.os.Bundle; 
import androidx.appcompat.app.AppCompatActivity; 
import android.widget.RelativeLayout; 
import com.example.a4thprogram.R; 
public class MainActivity extends AppCompatActivity { 
private RelativeLayout containerRL; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
// Initialize the RelativeLayout container 
containerRL = findViewById(R.id.idRLContainer); 
// Set background for the RelativeLayout using the drawable resource 
containerRL.setBackground(getResources().getDrawable(R.drawable.back_drawable));      
} 
} 