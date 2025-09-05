package com.example.ascii_p1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Actividad principal encargada de mostrar un ASCII
 */
public class ASCII extends Activity {

    /**
     * Función que se acciona al crear la actividad
     * @param saveInstanceState Datos de importancia a guardar
     */
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main_layout);
    }
}
