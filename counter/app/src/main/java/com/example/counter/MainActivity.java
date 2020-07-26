package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btnInc,btnReset,btnDec;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv =  findViewById(R.id.conuterText);
        btnInc= findViewById(R.id.incBtn);
        btnDec= findViewById(R.id.decBtn);
        btnReset= findViewById(R.id.resetBtn);

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                tv.setText(""+c);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=0;
                tv.setText(""+c);
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c--;
                tv.setText(""+c);
            }
        });

    }
}
