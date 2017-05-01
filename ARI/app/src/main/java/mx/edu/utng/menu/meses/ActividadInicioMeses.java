package mx.edu.utng.menu.meses;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import mx.edu.utng.menu.R;

public class ActividadInicioMeses extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private GridView gridView;
    private AdaptadorDeMeses adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_inicio_meses);



        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new AdaptadorDeMeses(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Meses item = (Meses) parent.getItemAtPosition(position);

        Intent intent = new Intent(this, ActividadSegundoMeses.class);
        intent.putExtra(ActividadSegundoMeses.EXTRA_PARAM_ID, item.getId());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            new Pair<View, String>(view.findViewById(R.id.imagen_meses),
                                    ActividadSegundoMeses.VIEW_NAME_HEADER_IMAGE)
                    );

            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else
            startActivity(intent);
    }

}
