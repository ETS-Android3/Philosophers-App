//Asociamos la clase al paquete
package com.example.pec2_app_lista_detalle;

//Importamos las librerias necesarias
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

//Declaramos la clase y heredamos
public class PhilosopherActivity extends AppCompatActivity {

    //Declaramos la variable para intercambiar informacion con un intent
    public static final String EXTRA_PHILOSOPHER_ID = "philosopherID";

    //Declaramos un textview para el nombre
    private TextView name;

    //Declaramos un texview para la descripcion
    private TextView description;

    //Declaramos la imagen del filosofo
    private ImageView photo;

    //Declaramos los 4 textos para los libros
    private TextView firstBook;
    private TextView secondBook;
    private TextView thirdBook;
    private TextView fourthBook;

    //Declaramos los checkbox que vamos a utilizar
    private CheckBox checkbox_1;
    private CheckBox checkbox_2;
    private CheckBox checkbox_3;
    private CheckBox checkbox_4;

    //Declaramos variables para guardar datos
    private String name_value;
    private String description_value;
    private int idPhoto_value;
    private String first_book_value;
    private String second_book_value;
    private String third_book_value;
    private String fourth_book_value;

    //Declaramos el metodo que sera llamado la iniciar la activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Asociamos la activity con el layout
        setContentView(R.layout.activity_philosopher);

        //Asociamos todas la variables con sus ID
        this.name = (TextView) findViewById(R.id.first_textview);
        this.description = (TextView) findViewById(R.id.second_textview);

        //Asociamos la imagen del filosofo con su ID
        this.photo = (ImageView) findViewById(R.id.picture_pilosopher);

        //Asociamos los libros de cada con sus ID
        this.firstBook = (TextView) findViewById(R.id.first_text_checkbox);
        this.secondBook = (TextView) findViewById(R.id.second_text_checkbox);
        this.thirdBook = (TextView) findViewById(R.id.third_text_checkbox);
        this.fourthBook = (TextView) findViewById(R.id.fourth_text_checkbox);

        //Asociamos los checkbox con sus ID
        this.checkbox_1 = (CheckBox) findViewById(R.id.first_checkbox);
        this.checkbox_2 = (CheckBox) findViewById(R.id.second_checkbox);
        this.checkbox_3 = (CheckBox) findViewById(R.id.third_checkbox);
        this.checkbox_4 = (CheckBox) findViewById(R.id.fourth_checkbox);

        //If usado para conservar los valores en caso de girar el movil
        if(savedInstanceState != null){

            //Introducimos los valores guardados en el bundle
            this.name.setText(savedInstanceState.getString(Philosopher.EXTRA_NAME));
            this.description.setText(savedInstanceState.getString(Philosopher.EXTRA_DESCRIPTION));
            this.photo.setImageResource(Philosopher.philosophers[savedInstanceState.getInt(EXTRA_PHILOSOPHER_ID)].getImageResourceId());
            this.firstBook.setText(savedInstanceState.getString(Philosopher.EXTRA_BOOK_1));
            this.secondBook.setText(savedInstanceState.getString(Philosopher.EXTRA_BOOK_2));
            this.thirdBook.setText(savedInstanceState.getString(Philosopher.EXTRA_BOOK_3));
            this.fourthBook.setText(savedInstanceState.getString(Philosopher.EXTRA_BOOK_4));

        } else {

            //Declaramos el id
            int philosopherId = (Integer)getIntent().getExtras().get(EXTRA_PHILOSOPHER_ID);

            //Insertamos el nombre, descripcion, y la imagen
            this.name.setText(Philosopher.philosophers[philosopherId].getName());
            this.description.setText(Philosopher.philosophers[philosopherId].getDescription());
            this.photo.setImageResource(Philosopher.philosophers[philosopherId].getImageResourceId());

            //Insertamos los libros de cada filosofo en su widget
            this.firstBook.setText(Philosopher.philosophers[philosopherId].books[0]);
            this.secondBook.setText(Philosopher.philosophers[philosopherId].books[1]);
            this.thirdBook.setText(Philosopher.philosophers[philosopherId].books[2]);
            this.fourthBook.setText(Philosopher.philosophers[philosopherId].books[3]);

        }

        //Desactivamos todas las checkbox y les cambiamos los valores a true
        this.checkbox_1.setChecked(true);
        this.checkbox_1.setEnabled(false);
        this.checkbox_2.setChecked(true);
        this.checkbox_2.setEnabled(false);
        this.checkbox_3.setChecked(true);
        this.checkbox_3.setEnabled(false);
        this.checkbox_4.setChecked(true);
        this.checkbox_4.setEnabled(false);

        //Obtenemos todos los datos de los campos y los guardamos en variables
        this.name_value = name.getText().toString();
        this.description_value = description.getText().toString();
        this.idPhoto_value = photo.getId();
        this.first_book_value = firstBook.getText().toString();
        this.second_book_value = secondBook.getText().toString();
        this.third_book_value = thirdBook.getText().toString();
        this.fourth_book_value= fourthBook.getText().toString();

    }

    //Declaramos el metodo para girar la aplicacion y guardar datos
    @Override
    protected void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString(Philosopher.EXTRA_NAME, this.name_value);
        savedInstanceState.putString(Philosopher.EXTRA_DESCRIPTION, this.description_value);
        savedInstanceState.putInt(Philosopher.EXTRA_PHOTO, this.idPhoto_value);
        savedInstanceState.putString(Philosopher.EXTRA_BOOK_1,this.first_book_value);
        savedInstanceState.putString(Philosopher.EXTRA_BOOK_2,this.second_book_value);
        savedInstanceState.putString(Philosopher.EXTRA_BOOK_3,this.third_book_value);
        savedInstanceState.putString(Philosopher.EXTRA_BOOK_4,this.fourth_book_value);

    }

}