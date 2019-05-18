package com.example.user.doctorpoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity ;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Toast;

public  class Carta extends MainActivity implements View.OnClickListener {

    Button btnSave, btnLoad;


    public EditText tVozr;
    public EditText tRost;
    public EditText tVes;
    public EditText tCcal;
    public EditText tSon;

    SharedPreferences sPref;

    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT1 = "saved_text1";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);

        tVozr = (EditText) findViewById(R.id.Vozr);
        tRost = (EditText) findViewById(R.id.rost_1);
        tVes = (EditText) findViewById(R.id.Ves);
        tCcal = (EditText) findViewById(R.id.ccal);
        tSon = (EditText) findViewById(R.id.son);

        btnSave = (Button) findViewById(R.id.SAVEb);
        btnSave.setOnClickListener(this);

        loadText();





    }




    @Override
    public void onClick(View v) {
        saveText();
        Intent intentCCAL = new Intent(this,Pitan.class);
        intentCCAL.putExtra("ccal", tCcal.getText().toString());

    }


    private void saveText() {
     sPref = getPreferences(MODE_PRIVATE);
     SharedPreferences.Editor ed = sPref.edit();
     ed.putString(SAVED_TEXT, tVozr.getText().toString());
     ed.putString(SAVED_TEXT1, tRost.getText().toString());
     ed.putString(SAVED_TEXT2, tVes.getText().toString());
     ed.putString(SAVED_TEXT3, tCcal.getText().toString());
     ed.putString(SAVED_TEXT4, tSon.getText().toString());
     ed.commit();
    }


    private void loadText() {
    sPref = getPreferences(MODE_PRIVATE);
    String saved_Text = sPref.getString(SAVED_TEXT,"");
    tVozr.setText(saved_Text);
    String saved_Text1 = sPref.getString(SAVED_TEXT1,"");
    tRost.setText(saved_Text1);
    String saved_Text2 = sPref.getString(SAVED_TEXT2,"");
    tVes.setText(saved_Text2);
    String saved_Text3 = sPref.getString(SAVED_TEXT3,"");
    tCcal.setText(saved_Text3);
    String saved_Text4 = sPref.getString(SAVED_TEXT4,"");
    tSon.setText(saved_Text4);
    }

    @Override
    protected  void  onDestroy(){
        super.onDestroy();
        saveText();
        
    }


}