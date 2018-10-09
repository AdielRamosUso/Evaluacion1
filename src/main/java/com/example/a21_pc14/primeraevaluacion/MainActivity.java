package com.example.a21_pc14.primeraevaluacion;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button btagregar, btn2;
public static int GUARDADO =47;
    private ArrayList<Estudiante> estudianteArrayList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imicializar los botones
this.btagregar= findViewById(R.id.btnagregar);
this.btn2= findViewById(R.id.btnmostrar);



this.btagregar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,Agregar.class);
        //inicio el activitiy y quiero como mensaje un RESULT_OK
        startActivityForResult(intent,GUARDADO);

    }
});


  this.btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent= new Intent(MainActivity.this,Mostrar.class);
          intent.putExtra("listado",estudianteArrayList);
          startActivity(intent);
      }
  });







    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==GUARDADO){
            if(data==null) return;
            //recibo los datos
            Estudiante e = new Estudiante(data.getStringExtra("NOMBRE"),
                    data.getStringExtra("CODIGO"),
                    data.getStringExtra("MATERIA"),5.0,5.0,5.0,5.0);
            //TODO agrego a la lista y luego actualizo el adaptador, de lo contrario no se mostraria el cambio
            estudianteArrayList.add(e);
            Toast.makeText(this,data.getStringExtra("CODIGO"),Toast.LENGTH_LONG).show();

        }
    }
}
