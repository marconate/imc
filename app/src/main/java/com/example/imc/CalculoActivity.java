package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoActivity extends AppCompatActivity {
    EditText edPeso;
    EditText edAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        edPeso = findViewById(R.id.edPeso);
        edAltura = findViewById(R.id.edAltura);
    }

    public void OnClick(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        double peso = Double.parseDouble(edPeso.getText().toString());
        double altura = Double.parseDouble(edAltura.getText().toString());
        double alturaQuadrado = altura * altura;
        double imc = peso / alturaQuadrado;

        Toast toast = Toast.makeText(context, "Seu IMC é " + imc, duration);
        toast.show();
    }
}
