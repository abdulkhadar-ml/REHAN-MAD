package com.example.all_views; 
import android.annotation.SuppressLint; 
import android.content.Context; 
import android.content.DialogInterface; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.ArrayAdapter; 
import android.widget.Button; 
import android.widget.Spinner; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AlertDialog; 
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity { 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        EdgeToEdge.enable(this); 
        setContentView(R.layout.activity_main); 
        Button button = findViewById(R.id.button); 
        button.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View v) { 
                showAlertDialog(MainActivity.this); 
            } 
        }); 
    } 
    private void showAlertDialog(Context context) { 
        AlertDialog.Builder builder = new AlertDialog.Builder(context); 
        builder.setTitle("Alert Dialog"); 
        builder.setMessage("This is an alert dialog."); 
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialog, int which) { 
                dialog.dismiss(); 
            } 
        }); 
        builder.show(); 
    } 
}
