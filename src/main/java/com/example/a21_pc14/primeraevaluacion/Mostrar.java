package com.example.a21_pc14.primeraevaluacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.a21_pc14.primeraevaluacion.R.id.lista;

public class Mostrar extends AppCompatActivity {

    ListView listView;
    public ArrayList<Estudiante> listado;
    adaptadorestudainte adap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_mostrar);

this.listView= findViewById(R.id.lista);
this.listado= (ArrayList<Estudiante>) getIntent().getSerializableExtra("listado");

 adap = new adaptadorestudainte(Mostrar.this, listado);
listView.setAdapter(adap);

    }
}
