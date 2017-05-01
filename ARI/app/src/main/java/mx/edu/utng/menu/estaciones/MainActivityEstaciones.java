package mx.edu.utng.menu.estaciones;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import mx.edu.utng.menu.R;

public class MainActivityEstaciones extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btPrimavera;
    private ImageButton btVerano;
    private ImageButton btOtono;
    private ImageButton btInvierno;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;
    private Button btJugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_estaciones);
        btPrimavera = (ImageButton)findViewById(R.id.bt_primavera);
        btVerano = (ImageButton)findViewById(R.id.bt_verano);
        btOtono = (ImageButton)findViewById(R.id.bt_otono);
        btInvierno = (ImageButton)findViewById(R.id.bt_invierno);
        btJugar = (Button)findViewById(R.id.bt_jugar);

        btJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityEstaciones.this, Memorama.class);
                startActivity(intent);
            }
        });

        btPrimavera.setOnClickListener(this);
        btVerano.setOnClickListener(this);
        btOtono.setOnClickListener(this);
        btInvierno.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.primavera, 1);
        mediaPlayer = new MediaPlayer();
    }

    private void primavera() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(MainActivityEstaciones.this, R.raw.primavera);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void verano() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(MainActivityEstaciones.this, R.raw.verano);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void otono() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(MainActivityEstaciones.this, R.raw.otono);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void invierno() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(MainActivityEstaciones.this, R.raw.invierno);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_primavera:
                primavera();
                break;
            case R.id.bt_verano:
                verano();
                break;
            case R.id.bt_otono:
                otono();
                break;
            case R.id.bt_invierno:
                invierno();
                break;
            default:
                break;
        }
    }

    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }
}
