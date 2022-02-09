//Asociamos el paquete a la clase
package com.example.pec2_app_lista_detalle;

//Importamos las librerias necesarias
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//Declaramos la clase y heredamos
public class BookActivity extends AppCompatActivity {

    //Declaramos la variable para intercambiar informacion con un intent
    public static final String EXTRA_BOOK_ID = "bookID";

    //Declaramos un textview para el nombre
    private TextView name;

    //Declaramos un texview para la descripcion
    private TextView description;

    //Declaramos la imagen del libro
    private ImageView photo;

    //Declaramos el metodo que sera llamado la iniciar la activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Asociamos la activity con el layout
        setContentView(R.layout.activity_book);

        //Asociamos todas la variables con sus ID
        this.name = (TextView) findViewById(R.id.first_textview_book);
        this.description = (TextView) findViewById(R.id.second_textview_book);

        //Asociamos la imagen del libro con su ID
        this.photo = (ImageView) findViewById(R.id.picture_book);

        //If usado para conservar los valores en caso de girar el movil
        if(savedInstanceState != null){

            //Introducimos los valores guardados en el bundle
            this.name.setText(savedInstanceState.getString(Philosopher.EXTRA_NAME));
            this.description.setText(savedInstanceState.getString(Philosopher.EXTRA_DESCRIPTION));
            this.photo.setImageResource(Book.books[savedInstanceState.getInt(EXTRA_BOOK_ID)].getImageResourceId());

        } else {

            //Declaramos el id
            int bookId = (Integer)getIntent().getExtras().get(EXTRA_BOOK_ID);

            //Insertamos el nombre, descripcion, y la imagen
            this.name.setText(Book.books[bookId].getName());
            this.description.setText(Book.books[bookId].getDescription());
            this.photo.setImageResource(Book.books[bookId].getImageResourceId());

        }

    }

}