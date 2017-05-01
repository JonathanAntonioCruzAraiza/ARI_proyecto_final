package mx.edu.utng.menu.escriberNombre;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import mx.edu.utng.menu.MenuActivity;
import mx.edu.utng.menu.R;
import mx.edu.utng.menu.model.User;
import mx.edu.utng.menu.sqlite.BaseHelper;
import mx.edu.utng.menu.sqlite.DBOperations;
import mx.edu.utng.menu.sqlite.Session;

/**
 * Created by ANONYMOUS-PC on 16/03/2017.
 */

public class Nombre extends Activity {
    private static BaseHelper db;
    private EditText etNombre;
    private Button btRevisar;
    private Cursor cursor;
    private DBOperations operations;
    private String validName = null;
    private String toastMsg = null;
    private TextView tv_nombre;
    String email="";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre);

        db =  new BaseHelper(this);
        etNombre = (EditText) findViewById(R.id.et_nombre);
        btRevisar = (Button) findViewById(R.id.bt_revisar);
        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        operations = new DBOperations();
        validarNombre(etNombre);
//        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
//        tv_nombre.setText(prefe.getString("nombre",""));
         String nombreUsuario = nombre().toString();
        tv_nombre.setText(nombreUsuario);
        btRevisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                revisar(etNombre.getText().toString(), Nombre.this);
            }
        });
    }
    public void revisar(String nombre, final Context context) {
        if (tv_nombre.getText().toString().equals(nombre.toString())) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Aviso");
            builder.setMessage("Felicidades: "+tv_nombre.getText().toString());
            builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    startActivity(new Intent(context, MenuActivity.class));
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Aviso");
            builder.setMessage("Nombre incorrecto: "+tv_nombre.getText().toString());
            builder.setPositiveButton("Aceptar ",null);
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

    }
    public void validarNombre(EditText edt) {
        if (edt.getText().toString().length() <= 0) {
            edt.setError("Campo vacío");
            validName = null;
        } else if (!edt.getText().toString().matches("a-zA-Z]+")) {
            edt.setError("Solo se acepta el alfabeto");
            validName = null;
        } else {
            validName = edt.getText().toString();
        }
    }

    public String nombre(){
        String nombreUsuario = "";
        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
//        tv_nombre.setText(prefe.getString("nombre",""));
        SQLiteDatabase database = db.getReadableDatabase();
        cursor = database.rawQuery("select firsname,lastname  from user where " + "user='" + prefe.getString("user","").toString() + "' and password='" + prefe.getString("password","").toString() + "'", null);

        if(cursor.moveToFirst()){
            nombreUsuario = cursor.getString(0)+" "+ cursor.getString(1);


        }
        return nombreUsuario;



    }

}
