package com.example.jugandoconaplicaciones22_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    public static final String NUMERO = "NUMERO";
    TextView saludo;
    EditText editTextNumero;
    Button buttonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludo = findViewById(R.id.textView);
        editTextNumero = findViewById(R.id.editTextNumber);
        buttonVolver = findViewById(R.id.buttonVolver);

        Intent intent = getIntent();

        String nombre = intent.getStringExtra(MainActivity.NOMBRE);

        saludo.setText("Hola " + nombre);

        buttonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero = editTextNumero.getText().toString();

                Intent intento = new Intent();
                intento.putExtra(NUMERO, numero);
                setResult(RESULT_OK, intento);
                finish();
            }
        });

    }
}