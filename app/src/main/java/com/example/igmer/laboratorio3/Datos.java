package com.example.igmer.laboratorio3;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by igmer on 04-18-18.
 */


public class Datos {
    Context contexto;
    Resources misRecuros;
    ArrayList arrayUsuarios, arrayUsuariosClaves;
    static ArrayList <String> arrayMunicipios;
    ArrayList <String> arrayDeptos;
    ArrayList <String> arrayDetalle;
    static String Depto1,Muni,Detalle1;

    Datos(Context contexto){
        this.contexto = contexto;
        misRecuros = this.contexto.getResources();

        arrayDeptos =
                new ArrayList(Arrays.asList(misRecuros.getStringArray(R.array.departamentos)));
        arrayUsuarios =
                new ArrayList(Arrays.asList(misRecuros.getStringArray(R.array.usuarios)));
        arrayUsuariosClaves =
                new ArrayList(Arrays.asList(misRecuros.getStringArray(R.array.claves)));







    }
    //metodo para validar el  login
    public boolean getUsuario(String usuario, String clave) {
        int indiceUsuario = arrayUsuarios.indexOf(usuario);
        int indiceClave = arrayUsuariosClaves.indexOf(clave);

        if (indiceClave == indiceClave && indiceClave > -1 && indiceUsuario > -10) {
            return true;
        } else {
            return false;
        }

    }
    public  ArrayList<String> getDeptos(){
        return  arrayDeptos;
    }
}
