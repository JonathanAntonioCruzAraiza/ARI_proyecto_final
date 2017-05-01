package mx.edu.utng.menu.abecedario;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import mx.edu.utng.menu.R;

public class AbecedarioActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btA;
    private ImageButton btB;
    private ImageButton btC;
    private ImageButton btD;
    private ImageButton btE;
    private ImageButton btF;
    private ImageButton btG;
    private ImageButton btH;
    private ImageButton btI;
    private ImageButton btJ;
    private ImageButton btK;
    private ImageButton btL;
    private ImageButton btM;
    private ImageButton btN;
    private ImageButton btN1;
    private ImageButton btO;
    private ImageButton btP;
    private ImageButton btQ;
    private ImageButton btR;
    private ImageButton btS;
    private ImageButton btT;
    private ImageButton btU;
    private ImageButton btV;
    private ImageButton btW;
    private ImageButton btX;
    private ImageButton btY;
    private ImageButton btZ;


    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int loader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_abecedario);
        btA = (ImageButton) findViewById(R.id.bt_a);
        btB = (ImageButton) findViewById(R.id.bt_b);
        btC = (ImageButton) findViewById(R.id.bt_c);
        btD = (ImageButton) findViewById(R.id.bt_d);
        btE = (ImageButton) findViewById(R.id.bt_e);
        btF = (ImageButton) findViewById(R.id.bt_f);
        btG = (ImageButton) findViewById(R.id.bt_g);
        btH = (ImageButton) findViewById(R.id.bt_h);
        btI = (ImageButton) findViewById(R.id.bt_i);
        btJ = (ImageButton) findViewById(R.id.bt_j);
        btK = (ImageButton) findViewById(R.id.bt_k);
        btL = (ImageButton) findViewById(R.id.bt_l);
        btM = (ImageButton) findViewById(R.id.bt_m);
        btN = (ImageButton) findViewById(R.id.bt_n);
        btN1 = (ImageButton) findViewById(R.id.bt_n1);
        btO = (ImageButton) findViewById(R.id.bt_o);
        btP = (ImageButton) findViewById(R.id.bt_p);
        btQ = (ImageButton) findViewById(R.id.bt_q);
        btR = (ImageButton) findViewById(R.id.bt_r);
        btS = (ImageButton) findViewById(R.id.bt_s);
        btT = (ImageButton) findViewById(R.id.bt_t);
        btU = (ImageButton) findViewById(R.id.bt_u);
        btV = (ImageButton) findViewById(R.id.bt_v);
        btW = (ImageButton) findViewById(R.id.bt_w);
        btX = (ImageButton) findViewById(R.id.bt_x);
        btY = (ImageButton) findViewById(R.id.bt_y);
        btZ = (ImageButton) findViewById(R.id.bt_z);

        btA.setOnClickListener(this);
        btB.setOnClickListener(this);
        btC.setOnClickListener(this);
        btD.setOnClickListener(this);
        btE.setOnClickListener(this);
        btF.setOnClickListener(this);
        btG.setOnClickListener(this);
        btH.setOnClickListener(this);
        btI.setOnClickListener(this);
        btJ.setOnClickListener(this);
        btK.setOnClickListener(this);
        btL.setOnClickListener(this);
        btM.setOnClickListener(this);
        btN.setOnClickListener(this);
        btN1.setOnClickListener(this);
        btO.setOnClickListener(this);
        btP.setOnClickListener(this);
        btQ.setOnClickListener(this);
        btR.setOnClickListener(this);
        btS.setOnClickListener(this);
        btT.setOnClickListener(this);
        btU.setOnClickListener(this);
        btV.setOnClickListener(this);
        btW.setOnClickListener(this);
        btX.setOnClickListener(this);
        btY.setOnClickListener(this);
        btZ.setOnClickListener(this);

        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC, 0);
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);
        loader = soundPool.load(this, R.raw.a, 1);
        mediaPlayer = new MediaPlayer();
    }

    private void letraA() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.a);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraB() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.b);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraC() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.c);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraD() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.d);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraE() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.e);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraF() {

        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.f);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraG() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.g);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraH() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.h);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraI() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.i);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraJ() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.j);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraK() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.k);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraL() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.l);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraM() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.m);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraN() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.n);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraEne() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.n1);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraO() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.o);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraP() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.p);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraQ() {
        mediaPlayer.stop();
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.q);
                mediaPlayer.start();

            }
        };
        playThread.start();
    }

    private void letraR() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.r);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraS() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.s);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraT() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.t);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraU() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.u);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraV() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.v);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraW() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.w);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraX() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.x);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraY() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.y);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    private void letraZ() {
        Thread playThread = new Thread() {
            @Override
            public void run() {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(AbecedarioActivity.this, R.raw.z);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()){
                case  R.id.bt_a:
                    letraA();
                    break;
                case  R.id.bt_b:
                    letraB();
                    break;
                case  R.id.bt_c:
                    letraC();
                    break;
                case  R.id.bt_d:
                    letraD();
                    break;
                case  R.id.bt_e:
                    letraE();
                    break;
                case  R.id.bt_f:
                    letraF();
                    break;
                case  R.id.bt_g:
                    letraG();
                    break;
                case  R.id.bt_h:
                    letraH();
                    break;
                case  R.id.bt_i:
                    letraI();
                    break;
                case  R.id.bt_j:
                    letraJ();
                    break;
                case  R.id.bt_k:
                    letraK();
                    break;
                case  R.id.bt_l:
                    letraL();
                    break;
                case  R.id.bt_m:
                    letraM();
                    break;
                case  R.id.bt_n:
                    letraN();
                    break;
                case  R.id.bt_n1:
                    letraEne();
                    break;
                case  R.id.bt_o:
                    letraO();
                    break;
                case  R.id.bt_p:
                    letraP();
                    break;
                case  R.id.bt_q:
                    letraQ();
                    break;
                case  R.id.bt_r:
                    letraR();
                    break;
                case  R.id.bt_s:
                    letraS();
                    break;
                case  R.id.bt_t:
                    letraT();
                    break;
                case  R.id.bt_u:
                    letraU();
                    break;
                case  R.id.bt_v:
                    letraV();
                    break;
                case  R.id.bt_w:
                    letraW();
                    break;
                case  R.id.bt_x:
                    letraX();
                    break;
                case  R.id.bt_y:
                    letraY();
                    break;
                case  R.id.bt_z:
                    letraZ();
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

