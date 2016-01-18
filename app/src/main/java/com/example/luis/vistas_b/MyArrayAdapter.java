package com.example.luis.vistas_b;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by luis on 13/01/16.
 */
public class MyArrayAdapter extends ArrayAdapter<String> {
    private final Context contexto;
    private final String[] valores;


    public MyArrayAdapter(Context contex,String[] values){
        super(contex,R.layout.items_list,values);
        this.contexto = contex;
        this.valores = values;
    }

    @Override
    public View getView(int position,View convertview,ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) contexto
        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.items_list,parent,false);
        TextView texto = (TextView) rowView.findViewById(R.id.textformat);
        ImageView imagen = (ImageView) rowView.findViewById(R.id.imformat);
        texto.setText(valores[position]);

        int[] rainbowo = contexto.getResources().getIntArray(R.array.rainbow);

        //cambia el fondo de acuerdo a la posicion
        rowView.setBackgroundColor(rainbowo[position]);

        // Cambia de imagen dependiendo del string
        String s = valores[position];

        if (s.startsWith("AGRO") )
        {
            imagen.setImageResource(R.mipmap.agro);
        }
        else
        if (s.startsWith("ARTES"))
        {
            imagen.setImageResource(R.mipmap.artes);
        }

        else
        if (s.startsWith("ELECTRICIDAD"))
        {
            imagen.setImageResource(R.mipmap.electricidad);
        }
        else
        if (s.startsWith("FINANZAS"))
        {
            imagen.setImageResource(R.mipmap.finanzas);
        }
        else
        if(s.startsWith("GASTRONOMÍA"))
        {
            imagen.setImageResource(R.mipmap.gastronomia);
        }
        else
        if(s.startsWith("TECNOLOGÍA"))
        {
            imagen.setImageResource(R.mipmap.tecnologia);
        }
        else
        if(s.startsWith("IDIOMAS"))
        {
            imagen.setImageResource(R.mipmap.idiomas);
        }
        else
        if(s.startsWith("SALUD"))
        {
            imagen.setImageResource(R.mipmap.salud);
        }

        return rowView;

    }
}


