package com.example.curi.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Captura extends AppCompatActivity {

    private Button Botoncap;
    private TextView Textcap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captura);
        Botoncap = (Button) findViewById(R.id.botonCap);
        Textcap = (TextView) findViewById(R.id.textView3);

        Botoncap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Textcap.setText(R.string.mostar_dato);

            }
        });




    }
}
