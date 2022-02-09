//Asociamos el paquete con la clase
package com.example.pec2_app_lista_detalle;

//Importamos las librerias necesarias
import android.content.Context;
import android.content.res.Resources;
import com.example.pec2_app_lista_detalle.R;

//Declaramos la clase y heredamos
public class Philosopher {

    //Varibales para guardar informacion
    public static final String EXTRA_NAME = "nameValue";
    public static final String EXTRA_DESCRIPTION = "descriptionValue";
    public static final String EXTRA_BOOK_1 = "book1Value";
    public static final String EXTRA_BOOK_2 = "book2Value";
    public static final String EXTRA_BOOK_3 = "book3Value";
    public static final String EXTRA_BOOK_4 = "book4Value";

    //Usado para acceder a los recursos de una activity
    public static Context context = null;

    //Declaramos el nombre
    private int name;

    //Declaramos la descripcion
    private int description;

    //Declaramos un int que sera el id de la imagen
    private int imageResourceId;

    //Declaramos los libros asociados a los filosofos
    public int[] books;

    //Declaramos un array de filosofos con sus libros
    public static final Philosopher[] philosophers = new Philosopher[]{

            new Philosopher(R.string.first_philopher, R.string.first_description,  R.drawable.aristoteles, new int[]{ Book.books[0].getName(),  Book.books[1].getName(),
                    Book.books[2].getName(), Book.books[3].getName()}),

            new Philosopher(R.string.second_philospher, R.string.second_description,  R.drawable.descartes, new int[]{Book.books[4].getName(), Book.books[5].getName(),
                    Book.books[6].getName(), Book.books[7].getName()}),

            new Philosopher(R.string.third_philosopher,R.string.third_description, R.drawable.john_lockee, new int[]{Book.books[8].getName(), Book.books[9].getName(),
                    Book.books[10].getName(), Book.books[11].getName()}),

            new Philosopher(R.string.fourth_philosopher,R.string.fourth_description, R.drawable.kant, new int[]{Book.books[12].getName(), Book.books[13].getName(),
                    Book.books[14].getName(), Book.books[15].getName()}),

            new Philosopher(R.string.fifth_philosopher,R.string.fifth_description,
                    R.drawable.platonn, new int[]{Book.books[16].getName(), Book.books[17].getName(),  Book.books[18].getName(), Book.books[19].getName()})

    };

    //Declaramos un constructor
    public Philosopher(int name, int description, int imageResourceId, int[] books){

        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.books = books;

    }

    //Declaramos los get
    public int getName() {
        return name;
    }
    public int getDescription() {
        return description;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }

    //Devolvemos el string a traves del contexto de esta clase
    public String toString(){
        return context.getResources().getString(name);
    }

}