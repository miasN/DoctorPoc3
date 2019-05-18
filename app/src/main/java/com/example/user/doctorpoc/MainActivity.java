package com.example.user.doctorpoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public  class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button BMed,Bzdor,Bactiv,Bpita,Bvred;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();


    }

    public void addListenerOnButton(){
        BMed = (Button)findViewById(R.id.MedC);
        BMed.setOnClickListener(this);

        Bzdor = (Button)findViewById(R.id.ButZdo);
        Bzdor.setOnClickListener(this);

        Bactiv = (Button)findViewById(R.id.ButACT);
        Bactiv.setOnClickListener(this);

        Bpita = (Button)findViewById(R.id.ButPIT);
        Bpita.setOnClickListener(this);

        Bvred = (Button)findViewById(R.id.ButVRE);
        Bvred.setOnClickListener(this);




    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.MedC:
                Intent intent = new Intent(this, Carta.class);
                startActivity(intent);
                break;
            case R.id.ButZdo:
                Intent intent1 = new Intent(this, Zdoro.class);
                startActivity(intent1);
                break;
            case R.id.ButPIT:
                Intent intent2 = new Intent(this, Pitan.class);
                startActivity(intent2);
                break;
            case R.id.ButVRE:
                Intent intent3 = new Intent(this, Vred.class);
                startActivity(intent3);

                break;
            case R.id.ButACT:
                Intent intent4 = new Intent(this, Activ.class);
                startActivity(intent4);
                break;
            default:
                break;

            }

        }
         }




