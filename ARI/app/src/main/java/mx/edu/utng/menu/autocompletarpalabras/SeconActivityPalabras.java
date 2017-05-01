package mx.edu.utng.menu.autocompletarpalabras;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import mx.edu.utng.menu.R;

/**
 * Created by ANONYMOUS-PC on 26/03/2017.
 */

public class SeconActivityPalabras extends MainActivityPalabras {
    //Declaracion de Variables
    public Spinner SpinnerM;
    private Button btRevisar;
    private String toastMsg;

    //Arreglo para mostrar los valores del spinner.
    String elementos[] = {" ","A", "E", "I", "O", "U"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_madre);

        //Casteo los elementos a utilizar.
        final Spinner spinner= (Spinner) findViewById(R.id.spinner2);
        btRevisar = (Button)findViewById(R.id.bt_revisar_madre);
        SpinnerM = (Spinner)findViewById(R.id.spinner2);


        ///Añado los elementos del Arreglo al Spinnner.
        ///Como 1er Layout le paso el estilo del Spinner.
        ArrayAdapter<String> adapter1=
                new ArrayAdapter<String>(this,R.layout.spinner_item_seletop, elementos);
        spinner.setAdapter(adapter1);


        btRevisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Obtengo el los elementos del Spinner.
                String strPlanet=SpinnerM.getSelectedItem().toString();

                //Verifico si el item seleccionado es diferente de A entonces no
                //Es la letra correcta
                ///Si es = A Pasa a la siguiente Actividad.
                if (strPlanet.equals("E")){
                    startActivity(new Intent(SeconActivityPalabras.this,TercerActivityPalabras.class));
                    showToast("Felicidades la letra correcta es: " + strPlanet);
                    finish();

                }else {
                    toastMsg = "No es la letra correcta: " + strPlanet;
                    showToast(toastMsg);
                }
            }
        });


    }

    public void showToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

}
