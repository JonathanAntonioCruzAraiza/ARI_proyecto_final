package mx.edu.utng.menu.figurasgeometricas;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import mx.edu.utng.menu.R;

public class FigurasGeometricasActivity extends ActionBarActivity implements View.OnClickListener {

    private ImageButton ibCilindro;
    private ImageButton ibCirculo;
    private ImageButton ibCuadrado;
    private ImageButton ibCubo;
    private ImageButton ibPiramide;
    private ImageButton ibRectangulo;
    private ImageButton ibRombo;
    private ImageButton ibTriangulo;
    private Button btJugar;

    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_figuras_geometricas);
        ibCilindro = (ImageButton)findViewById(R.id.ib_cilindro);
        ibCirculo = (ImageButton)findViewById(R.id.ib_circulo);
        ibCuadrado = (ImageButton)findViewById(R.id.ib_cuadrado);
        ibCubo = (ImageButton)findViewById(R.id.ib_cubo);
        ibPiramide = (ImageButton)findViewById(R.id.ib_piramide);
        ibRectangulo = (ImageButton)findViewById(R.id.ib_rectangulo);
        ibRombo = (ImageButton)findViewById(R.id.ib_rombo);
        ibTriangulo = (ImageButton)findViewById(R.id.ib_triangulo);
        btJugar = (Button)findViewById(R.id.bt_jugar);
        btJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FigurasGeometricasActivity.this, Jugar.class);
                startActivity(intent);
            }
        });

        ibCilindro.setOnClickListener(this);
        ibCirculo.setOnClickListener(this);
        ibCuadrado.setOnClickListener(this);
        ibCubo.setOnClickListener(this);
        ibPiramide.setOnClickListener(this);
        ibRectangulo.setOnClickListener(this);
        ibRombo.setOnClickListener(this);
        ibTriangulo.setOnClickListener(this);

        soundPool= new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader= soundPool.load(this, R.raw.cilindro, 1);
        mediaPlayer = new MediaPlayer();
    }

    private void Cilindro(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.cilindro);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void Circulo(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.circulo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void Cuadrado(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.cuadrado);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void Cubo(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.cubo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void Piramide(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.piramide);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void Rectangulo(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.rectangulo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void Rombo(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.rombo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void Triangulo(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(FigurasGeometricasActivity.this, R.raw.triangulo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.ib_cilindro:
                Cilindro();
                break;
            case  R.id.ib_circulo:
                Circulo();
                break;
            case  R.id.ib_cuadrado:
                Cuadrado();
                break;
            case  R.id.ib_cubo:
                Cubo();
                break;
            case  R.id.ib_piramide:
                Piramide();
                break;
            case  R.id.ib_rectangulo:
                Rectangulo();
                break;
            case  R.id.ib_rombo:
                Rombo();
                break;
            case  R.id.ib_triangulo:
                Triangulo();
                break;
            default:
                break;
        }
    }
}
