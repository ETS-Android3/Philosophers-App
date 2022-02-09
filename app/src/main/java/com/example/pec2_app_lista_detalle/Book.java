//Asociamos la clase con el paquete
package com.example.pec2_app_lista_detalle;

import android.content.Context;

//Declaramos la clase
public class Book {

    //Varibales para guardar informacion
    public static final String EXTRA_NAME = "nameValue";
    public static final String EXTRA_DESCRIPTION = "descriptionValue";

    //Usado para acceder a los recursos de una activity
    public static Context context = null;

    //Declaramos el nombre
    private int name;

    //Declaramos la descripcion
    private int description;

    //Declaramos un int que sera el id de la imagen
    private int imageResourceId;

    //Declaramos todos los libros con sus valores
    public static final Book[] books = new Book[]{

            new Book(R.string.book_1,R.string.description_book_1,
                    R.drawable.aristoteles_1),
            new Book(R.string.book_2, R.string.description_book_2,
                    R.drawable.aristoteles_2),
            new Book(R.string.book_3, R.string.description_book_3,
                    R.drawable.aristoteles_3),
            new Book(R.string.book_4,R.string.description_book_4,
                    R.drawable.aristoteles_4),

            new Book(R.string.book_5,R.string.description_book_5,
                    R.drawable.descartes_1),
            new Book(R.string.book_6, R.string.description_book_6,
                    R.drawable.descartes_2),
            new Book(R.string.book_7, R.string.description_book_7,
                    R.drawable.descartes_3),
            new Book(R.string.book_8,R.string.description_book_8,
                    R.drawable.descartes_4),

            new Book(R.string.book_9,R.string.description_book_9,
                    R.drawable.john_1),
            new Book(R.string.book_10, R.string.description_book_10,
                    R.drawable.john_2),
            new Book(R.string.book_11, R.string.description_book_11,
                    R.drawable.john_3),
            new Book(R.string.book_12,R.string.description_book_12,
                    R.drawable.john_4),

            new Book(R.string.book_13,R.string.description_book_13,
                    R.drawable.kant_1),
            new Book(R.string.book_14, R.string.description_book_14,
                    R.drawable.kant_2),
            new Book(R.string.book_15, R.string.description_book_15,
                    R.drawable.kant_3),
            new Book(R.string.book_16,R.string.description_book_16,
                    R.drawable.kant_4),

            new Book(R.string.book_17,R.string.description_book_17,
                    R.drawable.platon_1),
            new Book(R.string.book_18, R.string.description_book_18,
                    R.drawable.platon_2),
            new Book(R.string.book_19, R.string.description_book_19,
                    R.drawable.platon_3),
            new Book(R.string.book_20,R.string.description_book_20,
                    R.drawable.platon_4)

    };

    //Declaramos un constructor
    public Book(int name, int description, int imageResourceId){

        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;

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
