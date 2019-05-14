package com.example.user.doctorpoc;

import android.support.v7.app.AppCompatActivity ;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Toast;

public  class Carta extends AppCompatActivity implements View.OnClickListener {

    Button btnSave, btnLoad;


    EditText tVozr;

    EditText tRost;
    EditText tVes;
    EditText tCcal;
    EditText tSon;

    SharedPreferences sPref;
    SharedPreferences sPref1;

    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT1 = "saved_text";


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
        switch (v.getId()) {
            case R.id.SAVEb:
                saveText();
                break;
            case R.id.LOADb:
                loadText();
                break;
            default:
                break;
        }
    }


    private void saveText() {
     sPref = getPreferences(MODE_PRIVATE);
     SharedPreferences.Editor ed = sPref.edit();
     ed.putString(SAVED_TEXT, tVozr.getText().toString());
     ed.putString(SAVED_TEXT1, tRost.getText().toString());
     ed.commit();
    }
    private void saveText1() {
        sPref1 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed1 = sPref1.edit();
        ed1.putString(SAVED_TEXT1, tRost.getText().toString());
        ed1.commit();
    }


    private void loadText() {
    sPref = getPreferences(MODE_PRIVATE);
    String saved_Text = sPref.getString(SAVED_TEXT,"");
    tVozr.setText(saved_Text);
    String saved_Text1 = sPref.getString(SAVED_TEXT1,"");
    tRost.setText(saved_Text1);
    }



    @Override
    protected  void  onDestroy(){
        super.onDestroy();
        saveText();


    }






}