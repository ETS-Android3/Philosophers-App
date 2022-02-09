//Asociamos el paquete a la clase
package com.example.pec2_app_lista_detalle;

//Importamos las librerias necesarias
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

//Declaramos la clase y heredamos
public class TopLevelActivity extends AppCompatActivity {

    //Declaramos una listview
    private ListView listView;

    //Metodo que se ejecuta al iniciar la activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Asociamos la activity al layout
        setContentView(R.layout.activity_top_level);

        //Asociamos el id con la lista
        listView = (ListView) findViewById(R.id.list_options);

        //Declaramos el listener
        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {

            //Declaramos el metodo que detecta la posicion donde hemos accededido
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Si la posicion devuelta es 0 accedemos al if
                if(position == 0){

                    //Declaramos un intent
                    Intent intent = new Intent(TopLevelActivity.this, PhilosopherCategoryActivity.class);

                    //Comenzamos la nueva activity
                    startActivity(intent);

                } else if (position == 1){

                    //Declaramos un intent
                    Intent intent = new Intent(TopLevelActivity.this, BookCategoryActivity.class);

                    //Comenzamos la nueva activity
                    startActivity(intent);

                } else if (position == 2){

                    //Declaramos un intent
                    Intent intent = new Intent(TopLevelActivity.this, ContactUs.class);

                    //Comenzamos la nueva activity
                    startActivity(intent);

                }

            }

        };

        //Asociamos la lista al listener
        listView.setOnItemClickListener(listener);

    }

}