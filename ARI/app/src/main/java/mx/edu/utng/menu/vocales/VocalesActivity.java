package mx.edu.utng.menu.vocales;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import mx.edu.utng.menu.R;

public class VocalesActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ibA;
    private ImageButton ibE;
    private ImageButton ibI;
    private ImageButton ibO;
    private ImageButton ibU;

    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_vocales);
        ibA = (ImageButton)findViewById(R.id.ib_a);
        ibE = (ImageButton)findViewById(R.id.ib_e);
        ibI = (ImageButton)findViewById(R.id.ib_i);
        ibO = (ImageButton)findViewById(R.id.ib_o);
        ibU = (ImageButton)findViewById(R.id.ib_u);

        ibA.setOnClickListener(this);
        ibE.setOnClickListener(this);
        ibI.setOnClickListener(this);
        ibO.setOnClickListener(this);
        ibU.setOnClickListener(this);

        soundPool= new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader= soundPool.load(this, R.raw.va, 1);
        mediaPlayer = new MediaPlayer();
    }

    private void letraA(){
        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(VocalesActivity.this, R.raw.va);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraE(){

        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(VocalesActivity.this, R.raw.ve);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraI(){

        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(VocalesActivity.this, R.raw.vi);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraO(){

        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(VocalesActivity.this, R.raw.vo);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraU(){

        Thread playThread= new Thread(){
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(VocalesActivity.this, R.raw.vu);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.ib_a:
                letraA();
                break;
            case  R.id.ib_e:
                letraE();
                break;
            case  R.id.ib_i:
                letraI();
                break;
            case  R.id.ib_o:
                letraO();
                break;
            case  R.id.ib_u:
                letraU();
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
