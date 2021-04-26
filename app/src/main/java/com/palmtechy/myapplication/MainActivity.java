package com.palmtechy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button incr;
    TextView txtView;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incr = findViewById(R.id.increment);
        txtView = findViewById(R.id.textView) ;

        incr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                count++ ;
                txtView.setText("Clicks = " + count) ;


            }

        }) ;
    }
}