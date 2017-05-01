package mx.edu.utng.menu.semana;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import mx.edu.utng.menu.R;

/**
 * Created by ZENAIDO-PC on 16/02/2017.
 */
public class SemanaActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btLunes;
    private Button btMartes;
    private Button btMiercoles;
    private Button btJueves;
    private  Button btViernes;
    private Button btSabado;
    private Button btDomingo;
    private Button btDiasSemana;
    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int  loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_semana);
        btLunes = (Button)findViewById(R.id.bt_lunes);
        btMartes = (Button)findViewById(R.id.bt_martes);
        btMiercoles = (Button)findViewById(R.id.bt_miercoles);
        btJueves = (Button)findViewById(R.id.bt_jueves);
        btViernes = (Button)findViewById(R.id.bt_viernes);
        btSabado = (Button)findViewById(R.id.bt_sabado);
        btDomingo = (Button)findViewById(R.id.bt_domingo);
        btDiasSemana = (Button)findViewById(R.id.bt_todosDias);

        btLunes.setOnClickListener(this);
        btMartes.setOnClickListener(this);
        btMiercoles.setOnClickListener(this);
        btJueves.setOnClickListener(this);
        btViernes.setOnClickListener(this);
        btSabado.setOnClickListener(this);
        btDomingo.setOnClickListener(this);
        btDiasSemana.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.lunes, 1);
        mediaPlayer = new MediaPlayer();

    }
    private void playLunes(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.lunes);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void playMartes(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.martes);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void playMiercoles(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.miercoles);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void playJueves(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.jueves);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void playViernes(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.viernes);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void playSabado(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.sabado1);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void playDomingo(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.domingo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }
    private void playDiasSemana(){
        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(
                        SemanaActivity.this, R.raw.diassemana);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }



    public  void onClick(View v){
        switch (v.getId()){
            case R.id.bt_lunes:
                playLunes();
                break;
            case R.id.bt_martes:
                playMartes();
                break;
            case R.id.bt_miercoles:
                playMiercoles();
                break;
            case R.id.bt_jueves:
                playJueves();
                break;
            case R.id.bt_viernes:
                playViernes();
                break;
            case R.id.bt_sabado:
                playSabado();
                break;
            case R.id.bt_domingo:
                playDomingo();
                break;
            case R.id.bt_todosDias:
                playDiasSemana();
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
