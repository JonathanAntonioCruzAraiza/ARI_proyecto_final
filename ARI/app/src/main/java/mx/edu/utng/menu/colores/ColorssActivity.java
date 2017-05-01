package mx.edu.utng.menu.colores;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import mx.edu.utng.menu.R;

public class ColorssActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ibRojo;
    private ImageButton ibAmarillo;
    private ImageButton ibAzul;
    private ImageButton ibVerde;
    private ImageButton ibRosa;
    private ImageButton ibMorado;
    private ImageButton ibBlanco;
    private ImageButton ibGris;
    private ImageButton ibCafe;
    private ImageButton ibAnaranjado;


    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_colors);
        ibRojo = (ImageButton) findViewById(R.id.ib_color_rojo);
        ibAmarillo = (ImageButton) findViewById(R.id.ib_color_amarillo);
        ibAzul = (ImageButton) findViewById(R.id.ib_color_azul);
        ibVerde = (ImageButton) findViewById(R.id.ib_color_verde);
        ibRosa = (ImageButton) findViewById(R.id.ib_color_rosa);
        ibMorado = (ImageButton) findViewById(R.id.ib_color_morado);
        ibBlanco = (ImageButton) findViewById(R.id.ib_color_blanco);
        ibGris = (ImageButton) findViewById(R.id.ib_color_gris);
        ibCafe = (ImageButton) findViewById(R.id.ib_color_marron);
        ibAnaranjado = (ImageButton) findViewById(R.id.ib_color_anaranjado);


        ibRojo.setOnClickListener(this);
        ibAmarillo.setOnClickListener(this);
        ibAzul.setOnClickListener(this);
        ibVerde.setOnClickListener(this);
        ibRosa.setOnClickListener(this);
        ibMorado.setOnClickListener(this);
        ibBlanco.setOnClickListener(this);
        ibGris.setOnClickListener(this);
        ibCafe.setOnClickListener(this);
        ibAnaranjado.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.va, 1);

        mediaPlayer = new MediaPlayer();
    }

    private void colorRojo() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.rojo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorAmarillo() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.amarillo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorAzul() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.azul);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorVerde() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.verde);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorRosa() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.rosa);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorMorado() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.morado);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorBlanco() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.blanco);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorGris() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.gris);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorCafe() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.marron);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void colorAnaranjado() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(ColorssActivity.this, R.raw.naranja);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_color_rojo:
                colorRojo();
                break;
            case R.id.ib_color_amarillo:
                colorAmarillo();
                break;
            case R.id.ib_color_azul:
                colorAzul();
                break;
            case R.id.ib_color_verde:
                colorVerde();
                break;
            case R.id.ib_color_rosa:
                colorRosa();
                break;
            case R.id.ib_color_morado:
                colorMorado();
                break;
            case R.id.ib_color_blanco:
                colorBlanco();
                break;
            case R.id.ib_color_gris:
                colorGris();
                break;
            case R.id.ib_color_marron:
                colorCafe();
                break;
            case R.id.ib_color_anaranjado:
                colorAnaranjado();
                break;


            default:
                break;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }
}
