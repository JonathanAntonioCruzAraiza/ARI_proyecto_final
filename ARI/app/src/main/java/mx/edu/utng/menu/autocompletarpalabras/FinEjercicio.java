package mx.edu.utng.menu.autocompletarpalabras;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import mx.edu.utng.menu.MenuActivity;
import mx.edu.utng.menu.R;

/**
 * Created by ANONYMOUS-PC on 10/04/2017.
 */

public class FinEjercicio extends AppCompatActivity {
    private Button btFin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        btFin = (Button)findViewById(R.id.bt_inicio);

        btFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {///MenuActivity
                //startActivity(new Intent(FinEjercicio.this,MainActivityPalabras.class));
                startActivity(new Intent(FinEjercicio.this,MenuActivity.class));
                showToast("Saliendo del ejercicio");
            }
        });

    }
    public void showToast(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}
