package com.example.user.doctorpoc;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class Pitan extends Carta {

    TextView tvView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitan);

        tvView = (TextView)findViewById(R.id.tvView);
        Intent intent = getIntent();
        String intentCCAL = intent.getStringExtra("ccal");
        tvView.setText("TTT" + intentCCAL);


    }
}
