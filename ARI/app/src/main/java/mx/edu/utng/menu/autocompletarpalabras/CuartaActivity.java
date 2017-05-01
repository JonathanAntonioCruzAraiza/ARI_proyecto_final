package mx.edu.utng.menu.autocompletarpalabras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import android.widget.Toast;

import mx.edu.utng.menu.R;


public class CuartaActivity extends AppCompatActivity {
    //Declaracion de Variables
    public Spinner Spinner4;
    private Button btRevisar;
    private String toastMensaje;

    //Arreglo para mostrar los valores del spinner.
    String elementos[] = {" ","A", "E", "I", "O", "U"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarta_agua);

        //Casteo los elementos a utilizar.
        final Spinner spinner= (Spinner) findViewById(R.id.spinner4);
        btRevisar = (Button)findViewById(R.id.bt_revisar_agua);
        Spinner4 = (Spinner)findViewById(R.id.spinner4);


        ///Añado los elementos del Arreglo al Spinnner.
        ///Como 1er Layout le paso el estilo del Spinner.
        ArrayAdapter<String> adapter1=
                new ArrayAdapter<String>(this,R.layout.spinner_item_seletop, elementos);
        spinner.setAdapter(adapter1);


        btRevisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                //Obtengo el los elementos del Spinner.
                String strPlanet=Spinner4.getSelectedItem().toString();
                //Verifico si el item seleccionado es diferente de A entonces no
                //Es la letra correcta
                ///Si es = A Pasa a la siguiente Actividad.
                if (strPlanet.equals("U")){
                    startActivity(new Intent(CuartaActivity.this,QuintaActivity.class));
                   showToast("Felicidades la letra correcta es: " + strPlanet);
                    finish();
                }else {
                    showToast("No es la letra correcta: "+ strPlanet);
                }

            }
        });

    }

   public void showToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

}

