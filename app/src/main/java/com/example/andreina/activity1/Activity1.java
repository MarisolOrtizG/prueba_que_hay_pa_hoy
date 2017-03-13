package com.example.andreina.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    EditText txtVal1;
    EditText txtVal2;
    Button agregarBoton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);

        txtVal1 = (EditText) findViewById(R.id.editText);
        txtVal2 = (EditText) findViewById(R.id.editText2);
        agregarBoton = (Button) findViewById(R.id.button);
    }


    //Cuando se pulsa el botón, este método será llamado para pasar valores a la segunda Actividad
    public void agregarDatos(View view) {

        //Obtener los valores de Interfaz de Usuario(UI)
        Double v1 = Double.parseDouble(txtVal1.getText().toString());
        Double v2 = Double.parseDouble(txtVal2.getText().toString());

        //Crear intencion de llamar Activity2
        Intent miIntento = new Intent(this, Activity2.class);

        //Proporcionar la intención con datos adicionales para pasar los datos a la segunda Actividad
        miIntento.putExtra("llave1", v1);
        miIntento.putExtra("llave2", v2);

        //Comenzar Actividad por intento
        startActivity(miIntento);

    }
}
