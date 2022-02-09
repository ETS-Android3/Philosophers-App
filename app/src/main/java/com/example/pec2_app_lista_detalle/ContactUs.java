//Asociamos el paquete a la clase
package com.example.pec2_app_lista_detalle;

//Importamos las librerias necesarias
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

//Declaramos la clase y heredamos
public class ContactUs extends AppCompatActivity {

    //Declaramos los textview que vamos a utilizar
    private TextView contactFacebook;
    private TextView contactTwitter;
    private TextView contactPhone;
    private TextView contactEmail;

    //Declaramos el metodo que se llama al iniciar la activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Asociamos el layout con la activity
        setContentView(R.layout.activity_contact_us);

    }

}