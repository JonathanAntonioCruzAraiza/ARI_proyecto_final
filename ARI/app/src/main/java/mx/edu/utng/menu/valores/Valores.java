package mx.edu.utng.menu.valores;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import mx.edu.utng.menu.R;

public class Valores extends AppCompatActivity {
    LinearLayout llTarget1;
    LinearLayout llTarget2;
    LinearLayout llTarget3;
    LinearLayout llTarget4;
    LinearLayout llTarget5;
    LinearLayout llTarget6;
    LinearLayout llTarget7;
    LinearLayout llTarget8;
    LinearLayout llTarget9;
    LinearLayout llTarget10;
    private MediaPlayer mediaPlayer;


    ImageView ivRespeto;
    ImageView ivGenerosidad;
    ImageView ivLibertad;
    ImageView ivAmistad;
    ImageView ivDialogo;
    ImageView ivEsfuerzo;
    ImageView ivHonstidad;
    ImageView ivHumiladad;
    ImageView ivJusticia;
    ImageView ivResponsabilidad;



    Button btVolverJugar;
    Button btTarget1;
    Button btTarget2;
    Button btTarget3;
    Button btTarget4;
    Button btTarget5;
    Button btTarget6;
    Button btTarget7;
    Button btTarget8;
    Button btTarget9;
    Button btTarget10;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //hago un case por si en un futuro agrego mas opciones
                Log.i("ActionBar", "Atrás!");
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);


        setContentView(R.layout.activity_valores);
        llTarget1 = (LinearLayout)findViewById(R.id.ll_targert_amistad);
        llTarget2 = (LinearLayout)findViewById(R.id.ll_targert_dialogo);
        llTarget3 = (LinearLayout)findViewById(R.id.ll_targert_esfuerzo);
        llTarget4 = (LinearLayout)findViewById(R.id.ll_targert_generosidad);
        llTarget5 = (LinearLayout)findViewById(R.id.ll_targert_honestidad);
        llTarget6 = (LinearLayout)findViewById(R.id.ll_targert_humildad);
        llTarget7 = (LinearLayout)findViewById(R.id.ll_targert_justicia);
        llTarget8 = (LinearLayout)findViewById(R.id.ll_targert_libertad);
        llTarget9 = (LinearLayout)findViewById(R.id.ll_targert_respeto);
        llTarget10 = (LinearLayout)findViewById(R.id.ll_targert_responsabilidad);

        ivAmistad =(ImageView)findViewById(R.id.iv_amistad);
        ivDialogo =(ImageView)findViewById(R.id.iv_dialogo);
        ivEsfuerzo =(ImageView)findViewById(R.id.iv_esfuerzo);
        ivGenerosidad =(ImageView)findViewById(R.id.iv_generosidad);
        ivHonstidad =(ImageView)findViewById(R.id.iv_honestidad);
        ivHumiladad =(ImageView)findViewById(R.id.iv_humildad);
        ivJusticia =(ImageView)findViewById(R.id.iv_justicia);
        ivLibertad =(ImageView)findViewById(R.id.iv_libertad);
        ivRespeto =(ImageView) findViewById(R.id.iv_respeto);
        ivResponsabilidad =(ImageView)findViewById(R.id.iv_responsabilidad);

        btTarget1 =(Button)findViewById(R.id.bt_target_amistad);
        btTarget2 =(Button)findViewById(R.id.bt_target_dialogo);
        btTarget3 =(Button)findViewById(R.id.bt_target_esfuerzo);
        btTarget4 =(Button)findViewById(R.id.bt_target_generosidad);
        btTarget5 =(Button)findViewById(R.id.bt_target_honestidad);
        btTarget6 =(Button)findViewById(R.id.bt_target_humildad);
        btTarget7 =(Button)findViewById(R.id.bt_target_justicia);
        btTarget8 =(Button)findViewById(R.id.bt_target_libertad);
        btTarget9 =(Button)findViewById(R.id.bt_target_respeto);
        btTarget10 =(Button)findViewById(R.id.bt_target_responsabilidad);
        btVolverJugar =(Button)findViewById(R.id.bt_volver_jugar);

        ivAmistad.setOnLongClickListener(longClickListener);
        ivDialogo.setOnLongClickListener(longClickListener);
        ivEsfuerzo.setOnLongClickListener(longClickListener);
        ivGenerosidad.setOnLongClickListener(longClickListener);
        ivHonstidad.setOnLongClickListener(longClickListener);
        ivHumiladad.setOnLongClickListener(longClickListener);
        ivJusticia.setOnLongClickListener(longClickListener);
        ivLibertad.setOnLongClickListener(longClickListener);
        ivRespeto.setOnLongClickListener(longClickListener);
        ivResponsabilidad.setOnLongClickListener(longClickListener);

        llTarget1.setOnDragListener(dragListener);
        llTarget2.setOnDragListener(dragListener);
        llTarget3.setOnDragListener(dragListener);
        llTarget4.setOnDragListener(dragListener);
        llTarget5.setOnDragListener(dragListener);
        llTarget6.setOnDragListener(dragListener);
        llTarget7.setOnDragListener(dragListener);
        llTarget8.setOnDragListener(dragListener);
        llTarget9.setOnDragListener(dragListener);
        llTarget10.setOnDragListener(dragListener);

        btVolverJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Valores.this,Valores.class));
                finish();
            }
        });
    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myShadowBuilder, v, 0);

            return false;
        }
    };



    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();


            switch (dragEvent) {
                case DragEvent.ACTION_DRAG_ENTERED:

                    break;
                case DragEvent.ACTION_DRAG_EXITED:

                    break;
                case DragEvent.ACTION_DROP:
                    if (view.getId() == R.id.iv_amistad && v.getId() == R.id.ll_targert_amistad) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget1.setVisibility(view.GONE);
                        newParent.addView(view);
                        correcto();
                    }else if (view.getId() == R.id.iv_dialogo && v.getId() == R.id.ll_targert_dialogo) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget2.setVisibility(view.GONE);
                        newParent.addView(view);
                            correcto();

                    }else  if (view.getId() == R.id.iv_esfuerzo && v.getId() == R.id.ll_targert_esfuerzo) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget3.setVisibility(view.GONE);
                        newParent.addView(view);
                                        correcto();

                    }else if (view.getId() == R.id.iv_generosidad && v.getId() == R.id.ll_targert_generosidad) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget4.setVisibility(view.GONE);
                        newParent.addView(view);
                    correcto();


                    }else if (view.getId() == R.id.iv_honestidad && v.getId() == R.id.ll_targert_honestidad) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget5.setVisibility(view.GONE);
                        newParent.addView(view);

                        correcto();

                    }else  if (view.getId() == R.id.iv_humildad && v.getId() == R.id.ll_targert_humildad) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget6.setVisibility(view.GONE);
                        newParent.addView(view);
                    correcto();


                    }else
                    if (view.getId() == R.id.iv_justicia && v.getId() == R.id.ll_targert_justicia) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget7.setVisibility(view.GONE);
                        newParent.addView(view);

                        correcto();

                    }else if (view.getId() == R.id.iv_libertad && v.getId() == R.id.ll_targert_libertad) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget8.setVisibility(view.GONE);
                        newParent.addView(view);
                        correcto();

                    }else
                if (view.getId() == R.id.iv_respeto && v.getId() == R.id.ll_targert_respeto) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget9.setVisibility(view.GONE);
                        newParent.addView(view);
                    correcto();


                    }else
                if (view.getId() == R.id.iv_responsabilidad && v.getId() == R.id.ll_targert_responsabilidad) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget10.setVisibility(view.GONE);
                        newParent.addView(view);
                    correcto();

                    }else {
                    error();
                }
                    break;
            }
            return true;
        }
    };

   public  void error(){

          Thread playThread = new Thread(){
               public  void run(){
                   mediaPlayer = MediaPlayer.create(
                           Valores.this, R.raw.error);
                   mediaPlayer.start();
               }
           };
        playThread.start();
   }
    public  void correcto(){

        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer = MediaPlayer.create(
                        Valores.this, R.raw.correcto);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }




}
