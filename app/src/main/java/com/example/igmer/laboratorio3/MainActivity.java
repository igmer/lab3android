package com.example.igmer.laboratorio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsuario, edtClave;
    Button btnValidar;
    Datos objDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario= (EditText) findViewById(R.id.edtUsuario);
        edtClave= (EditText) findViewById(R.id.edtClave);
        btnValidar= (Button) findViewById(R.id.btnValidar);

        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objDatos = new Datos(getApplicationContext());//intancio la clase datos y le paso el contexto actual
                String elUsuario = edtUsuario.getText().toString().trim();
                String laClave = edtClave.getText().toString().trim();

                if(TextUtils.isEmpty(elUsuario)){
                    edtUsuario.setError("Dato Requerido");
                    edtUsuario.requestFocus();
                }else if (TextUtils.isEmpty(laClave)){
                    edtClave.setError("Dato Requerido");
                    edtClave.requestFocus();
                }else{
                    boolean existe = objDatos.getUsuario(elUsuario,laClave);

                    if(!existe){
                        Toast.makeText(getApplicationContext(),"usuario no exixte",Toast.LENGTH_LONG).show();
                    }else{
                        Intent departamentos = new Intent(getApplicationContext(),Main2Activity.class);
                        startActivity(departamentos);
                    }

                }

            }
        });
    }
}
