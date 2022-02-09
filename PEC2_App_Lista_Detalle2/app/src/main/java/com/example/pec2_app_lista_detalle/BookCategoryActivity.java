//Asociamos el paquete a la clase
package com.example.pec2_app_lista_detalle;

//Importamos las librerias necesarias
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

//Declaramos la clase y heredamos
public class BookCategoryActivity extends AppCompatActivity {

    //Declaramos la lista que vamos a usar
    private ListView listView;

    //Declaramos el metodo que sera llamado la iniciar la activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Asociamos la activity con el layout
        setContentView(R.layout.activity_book_category);

        //Asociamos la listview con su ID
        this.listView = (ListView) findViewById(R.id.list_books);

        //Asociamos el contexto para los libros
        Book.context = this;

        //Declaramos el adapter
        ArrayAdapter<Book> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Book.books);

        //Añadimos un adapter a la lista
        this.listView.setAdapter(listAdapter);

        //Declaramos el listener
        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {

            //Metodo que detecta a que elemento hemos accedido
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Declaramos un intent
                Intent intent = new Intent(BookCategoryActivity.this, BookActivity.class);

                //Introducimos el ID del elemento al que hemos accedido
                intent.putExtra(BookActivity.EXTRA_BOOK_ID,(int)id);

                //Iniciamos la activity
                startActivity(intent);

            }

        };

        //Asociamos el listview con su listener
        this.listView.setOnItemClickListener(listener);

    }

}