package com.example.curi.ejercicio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goToFirstButton;
    private Button goToSecondButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToFirstButton= (Button) findViewById(R.id.button2);
        goToSecondButton = (Button) findViewById(R.id.button);
        goToFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Codigo
                startActivity(new Intent(MainActivity.this, ListView.class));
            }
        });
        goToSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Codigo
                startActivity(new Intent(MainActivity.this, Captura.class));

            }
        });





    }
}
