package com.example.jugandoconaplicaciones22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    public static final String NOMBRE = "NOMBRE";
    Button buttonLanzar;
    EditText editTextNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLanzar = findViewById(R.id.buttonLanzar);
        editTextNombre = findViewById(R.id.editTextTextPersonName);


        buttonLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intento = new Intent(MainActivity.this, SaludoActivity.class);
               intento.putExtra(NOMBRE, editTextNombre.getText().toString() );
               startActivity(intento); //Lanza la actividad
            }
        });
    }
}