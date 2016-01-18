package com.example.luis.vistas_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listajava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tomar el listview object del xml
        listajava = (ListView)findViewById(R.id.listaxml);

        //definir los valores del array para mostrar en el listview
        String[] values = new String[] {"AGRO","ARTES","ELECTRICIDAD","FINANZAS","GASTRONOMÍA","TECNOLOGÍA","IDIOMAS","SALUD"};

        //ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,R.layout.items_list,R.id.textformat,values);

        MyArrayAdapter adaptador = new MyArrayAdapter(this,values);
        //asignar el adaptador al listview
        listajava.setAdapter(adaptador);
    }
}

