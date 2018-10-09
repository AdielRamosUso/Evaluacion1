package com.example.a21_pc14.primeraevaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class adaptadorestudainte extends ArrayAdapter<Estudiante> {


    public adaptadorestudainte(Context context, List<Estudiante> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    Estudiante estudiante= getItem(position);
    if (convertView== null){
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.itemestuduiante, parent, false);
    }
        TextView nombre= convertView.findViewById(R.id.txtnombre);
        TextView codigo= convertView.findViewById(R.id.txtcodigo);
        TextView materia= convertView.findViewById(R.id.txtmateria);
        TextView p1= convertView.findViewById(R.id.p1);
        TextView p2= convertView.findViewById(R.id.p2);
        TextView p3= convertView.findViewById(R.id.p3);
        //TextView promedio= convertView.findViewById(R.id.promedio);

        nombre.setText(estudiante.nombre);
        codigo.setText(estudiante.materia);
        materia.setText(estudiante.materia);



return convertView;
    }
}
