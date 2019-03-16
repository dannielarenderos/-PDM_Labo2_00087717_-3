package com.example.l2_a2;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout rojo, verde, azul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rojo = findViewById(R.id.Primero);
        verde = findViewById(R.id.Segunda);
        azul = findViewById(R.id.Tercero);
        final Context context = this;
        rojo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                int colorNew = (int) (Math.random() * 420);

                rojo.setBackgroundColor(Color.rgb(colorNew, 0, 0));

            }
        });
        verde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorNew = (int) (Math.random() * 420);

                verde.setBackgroundColor(Color.rgb(0, colorNew, 0));
            }
        });

        azul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorNew = (int) (Math.random() * 420);
                azul.setBackgroundColor(Color.rgb(0, 0, colorNew));

            }
        });

    }

}
