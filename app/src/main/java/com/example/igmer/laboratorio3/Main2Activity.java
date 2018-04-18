package com.example.igmer.laboratorio3;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends ListActivity {
Datos objDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        objDatos = new Datos(getApplicationContext());
        ArrayList losDeptos = objDatos.getDeptos();
        setListAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,losDeptos));

    }
    @Override
    public  void onListItemClick(ListView lista, View vista ,int indice ,long id ){
        Intent objMunicipios   = new Intent(getApplicationContext(),Main3Activity.class);
        objMunicipios.putExtra("indiceDepto",indice);
        startActivity(objMunicipios);
    }
}
