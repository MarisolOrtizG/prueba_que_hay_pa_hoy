package com.example.andreina.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity{

    EditText datosRecividos;
    Button botonHecho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        datosRecividos = (EditText) findViewById(R.id.editText3);
        botonHecho = (Button) findViewById(R.id.button2);

        //Escoger la llamada realizada a Actividad2 por intención
        Intent miIntentoLocal = getIntent();
        //Obtener información de extras
        double valor1 = miIntentoLocal.getDoubleExtra("llave1", -1);
        double valor2 = miIntentoLocal.getDoubleExtra("llave2", -1);

        double resultado = valor1 + valor2;

        //Con fines ilustrativos - mostrar los datos recibidos y los resultados
        datosRecividos.setText("Los datos recividos son \n"
                + "valor 1 = " + valor1 + " \n valor2 = " + valor2
                + "\n\n resultado = " + resultado);
    }

    public void onClose(View view) {
        finish();
    }
}
