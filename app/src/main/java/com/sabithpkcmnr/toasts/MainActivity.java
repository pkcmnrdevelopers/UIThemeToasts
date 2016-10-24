package com.sabithpkcmnr.toasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button normal,ui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normal=(Button)findViewById(R.id.normal);
        ui=(Button)findViewById(R.id.ui);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Normal Toast",Toast.LENGTH_LONG).show();
            }
        });
        ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"UI Toast",Toast.LENGTH_LONG).show();
            }
        });

    }
}
