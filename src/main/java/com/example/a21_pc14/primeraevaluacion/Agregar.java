package com.example.a21_pc14.primeraevaluacion;

import android.content.Intent;
import android.os.Parcel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Agregar extends AppCompatActivity {

    EditText nombre,codigo, materia,p1,p2,p3,promedio;
Button btnguardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        this.nombre=findViewById(R.id.txtnombre);
        this.codigo=findViewById(R.id.txtcodigo);
        this.materia=findViewById(R.id.txtmateria);
        this.p1=findViewById(R.id.p1);
        this.p2=findViewById(R.id.p2);
        this.p3=findViewById(R.id.p3);

        btnguardar= findViewById(R.id.btnguardar);
         this.btnguardar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
              agragar();
              finish();
             }
         });




    }


    public void agragar(){

        String nom= nombre.getText().toString();
        String codi= codigo.getText().toString();
        String mate= materia.getText().toString();

        Intent resultIntent = new Intent();
        // TODO envio los datos mediante el intent
        resultIntent.putExtra("NOMBRE",nombre.getText().toString());
        resultIntent.putExtra("CODIGO",codigo.getText().toString());
        resultIntent.putExtra("MATERIA",materia.getText().toString());

        setResult(MainActivity.GUARDADO, resultIntent);

    }

}
