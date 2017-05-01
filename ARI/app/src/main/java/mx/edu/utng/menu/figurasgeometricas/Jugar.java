package mx.edu.utng.menu.figurasgeometricas;




import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import mx.edu.utng.menu.R;

/**
 * Created by Jorge on 14/03/2017.
 */
public class Jugar extends ActionBarActivity {

    private String[] nombreFiguras ={"cilindro","circulo","cuadrado","cubo"+
            "cubo","ovalo","piramide","rectangulo","rombo","triangulo"};

    private String[]sombra={"f_cilindro","f_circulo","f_cuadrado","f_cubo"+
            "f_cubo","f_ovalo","f_piramide","f_rectangulo","f_rombo","f_triangulo"};
    private int intentos = 3;
    private Button btAceptar;
    private TextView tvIntentos;
    private TextView tvCuenta;
    private EditText etUsuarioFigura;
    private int numeroGenerado= 0;
    private ImageView ivImagen;

    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_jugar);
        btAceptar =(Button)findViewById(R.id.bt_aceptar);
        tvIntentos = (TextView)findViewById(R.id.iv_intentos);
        tvCuenta = (TextView)findViewById(R.id.tv_cuenta);
        etUsuarioFigura = (EditText)findViewById(R.id.tv_figura);
        ivImagen = (ImageView)findViewById(R.id.iv_mostrar);
        numeroGenerado = generarFiguras();
        establecerSombras(numeroGenerado);
        tvIntentos.setText("Tiene "+intentos+" intentos");
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etUsuarioFigura.getText().toString().toLowerCase();
                if (nombre.equals(nombreFiguras[numeroGenerado])){
                    establecerFigura(numeroGenerado);
                    esperar();
                    Bien();
                }else{
                    Mal();
                    Toast.makeText(getApplicationContext(), "No es la figura", Toast.LENGTH_SHORT).show();
                    intentos= intentos-1;
                    tvIntentos.setText("Tiene "+intentos+" intentos");
                }
                if (intentos==0){
                    finish();
                }
            }
        });

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.mal, 1);
        mediaPlayer = new MediaPlayer();
    }

    public void esperar(){
        new CountDownTimer(5000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                tvCuenta.setText("Generando nuevo en "+(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                numeroGenerado=generarFiguras();
                establecerSombras(numeroGenerado);
                tvCuenta.setText("");
                etUsuarioFigura.setText("");
            }
        }.start();
    }

    private int generarFiguras(){
        return (int)(Math.random()*nombreFiguras.length);
    }

    private void establecerSombras(int numero){
        int fId = getResources().getIdentifier(sombra[numero],"drawable", getPackageName());
        ivImagen.setImageResource(fId);
    }

    private void establecerFigura(int numero){
        int fId = getResources().getIdentifier(nombreFiguras[numero],"drawable", getPackageName());
        ivImagen.setImageResource(fId);
    }

    private void Mal() {
        mediaPlayer.stop();
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Jugar.this, R.raw.mal);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }

    private void Bien() {
        mediaPlayer.stop();
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(Jugar.this, R.raw.terminado);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }
}
