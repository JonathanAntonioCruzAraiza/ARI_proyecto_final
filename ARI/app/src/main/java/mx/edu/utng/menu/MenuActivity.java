package mx.edu.utng.menu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import mx.edu.utng.menu.abecedario.AbecedarioActivity;
import mx.edu.utng.menu.autocompletarpalabras.MainActivityPalabras;
import mx.edu.utng.menu.colores.ColorssActivity;
import mx.edu.utng.menu.crecimiento.Crecimiento;
import mx.edu.utng.menu.creditos.MainActivityCreditos;
import mx.edu.utng.menu.escriberNombre.Nombre;
import mx.edu.utng.menu.estaciones.MainActivityEstaciones;
import mx.edu.utng.menu.figurasgeometricas.FigurasGeometricasActivity;
import mx.edu.utng.menu.gallery.MenuGallery;
import mx.edu.utng.menu.habitoshigiene.Higiene;
import mx.edu.utng.menu.login.Login;
import mx.edu.utng.menu.meses.ActividadInicioMeses;
import mx.edu.utng.menu.newrepro.MainActivityReproductor;
import mx.edu.utng.menu.operaciones.Operaciones;
import mx.edu.utng.menu.semana.SemanaActivity;
import mx.edu.utng.menu.sqlite.DBOperations;
import mx.edu.utng.menu.sqlite.Session;
import mx.edu.utng.menu.valores.Valores;
import mx.edu.utng.menu.vocales.VocalesActivity;

public class MenuActivity extends AppCompatActivity{
    FloatingActionButton fabCerrarSession;
    private DBOperations operations;
    private Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_menu);
        session = new Session(this);
        fabCerrarSession = (FloatingActionButton)findViewById(R.id.fab_cerrar);
        if (!session.loggedin()){
            logout();

        }
        fabCerrarSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
                builder.setTitle("Cerrar Sesión");
                builder.setMessage("'¿Esta seguro que desea cerrar sesion?'");
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                 logout();
                    }
                });
                builder.setNegativeButton("Cancelar",null);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

    }
    public void logout(){
        session.setLoggedin(false);
        finish();
        startActivity(new Intent(MenuActivity.this, Login.class));
    }




    public  void irSemana(View view){
        Intent I = new Intent(this, SemanaActivity.class );
        startActivity(I);
    }
    public  void irAbecedario(View view){
        Intent I = new Intent(this, AbecedarioActivity.class );
        startActivity(I);
    }
    public  void irVocales(View view){
        Intent I = new Intent(this, VocalesActivity.class );
        startActivity(I);
    }
  public void irMenuGallery(View view){
        Intent intent = new Intent(this,MenuGallery.class);
        startActivity(intent);
    }

    public void irColors(View view){
        Intent intent = new Intent(this,ColorssActivity.class);
        startActivity(intent);

    }
    public void irEscribrirNombre(View view){
        Intent intent = new Intent(this, Nombre.class);
        startActivity(intent);
    }
    public  void  irMesesAño (View view){
        Intent I = new Intent(this, ActividadInicioMeses.class);
        startActivity(I);
    }
    public  void  irEstaciones (View view){
        Intent I = new Intent(this, MainActivityEstaciones.class);
        startActivity(I);
    }
    public  void  irFiguras (View view){
        Intent I = new Intent(this, FigurasGeometricasActivity.class);
        startActivity(I);
    }
    public void irOperaciones(View view){
        Intent intent = new Intent(this, Operaciones.class);
        startActivity(intent);
    }
    public void irValores(View view){
        Intent intent = new Intent(this, Valores.class);
        startActivity(intent);
    }
    public void irCrecimiento(View view){
        Intent intent = new Intent(this, Crecimiento.class);
        startActivity(intent);
    }

    public void  irHabitosHigiene(View view){
        Intent intent = new Intent(this, Higiene.class);
        startActivity(intent);
    }


    public void  irAcompletarPalabras(View view){
        Intent intent = new Intent(this, MainActivityPalabras.class);
        startActivity(intent);
    }


    public void  irCanciones(View view){
        Intent intent = new Intent(this, MainActivityReproductor.class);
        startActivity(intent);
    }
    public void  irAcerca(View view){
        Intent intent = new Intent(this, MainActivityCreditos.class);
        startActivity(intent);
    }

}