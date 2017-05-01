package mx.edu.utng.menu.habitoshigiene;
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

public class Higiene extends AppCompatActivity {
    LinearLayout llTarget1;
    LinearLayout llTarget2;
    LinearLayout llTarget3;
    LinearLayout llTarget4;
    LinearLayout llTarget5;
    LinearLayout llTarget6;

    private MediaPlayer mediaPlayer;


    ImageView ivBano;
    ImageView ivCambioR;
    ImageView ivDientes;
    ImageView ivManos;
    ImageView ivPeinar;
    ImageView ivUnas;

    Button btVolverJugar;
    Button btTarget1;
    Button btTarget2;
    Button btTarget3;
    Button btTarget4;
    Button btTarget5;
    Button btTarget6;


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


        setContentView(R.layout.activity_higiene);
        llTarget1 = (LinearLayout)findViewById(R.id.ll_targert_bano);
        llTarget2 = (LinearLayout)findViewById(R.id.ll_targert_cambio);
        llTarget3 = (LinearLayout)findViewById(R.id.ll_targert_dientes);
        llTarget4 = (LinearLayout)findViewById(R.id.ll_targert_manos);
        llTarget5 = (LinearLayout)findViewById(R.id.ll_targert_peinar);
        llTarget6 = (LinearLayout)findViewById(R.id.ll_targert_unas);


        ivBano =(ImageView)findViewById(R.id.iv_bano);
        ivCambioR =(ImageView)findViewById(R.id.iv_cambio);
        ivDientes =(ImageView)findViewById(R.id.iv_dientes);
        ivManos =(ImageView)findViewById(R.id.iv_manos);
        ivPeinar =(ImageView)findViewById(R.id.iv_peinar);
        ivUnas =(ImageView)findViewById(R.id.iv_unas);


        btTarget1 =(Button)findViewById(R.id.bt_targert_baño);
        btTarget2 =(Button)findViewById(R.id.bt_targert_cambio);
        btTarget3 =(Button)findViewById(R.id.bt_targert_dientes);
        btTarget4 =(Button)findViewById(R.id.bt_targert_manos);
        btTarget5 =(Button)findViewById(R.id.bt_targert_peinar);
        btTarget6 =(Button)findViewById(R.id.bt_targert_unas);

        btVolverJugar =(Button)findViewById(R.id.bt_volver_jugar);

        ivBano.setOnLongClickListener(longClickListener);
        ivCambioR.setOnLongClickListener(longClickListener);
        ivDientes.setOnLongClickListener(longClickListener);
        ivManos.setOnLongClickListener(longClickListener);
        ivPeinar.setOnLongClickListener(longClickListener);
        ivUnas.setOnLongClickListener(longClickListener);

        llTarget1.setOnDragListener(dragListener);
        llTarget2.setOnDragListener(dragListener);
        llTarget3.setOnDragListener(dragListener);
        llTarget4.setOnDragListener(dragListener);
        llTarget5.setOnDragListener(dragListener);
        llTarget6.setOnDragListener(dragListener);

        btVolverJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Higiene.this,Higiene.class));
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
                    if (view.getId() == R.id.iv_bano && v.getId() == R.id.ll_targert_bano) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget1.setVisibility(view.GONE);
                        newParent.addView(view);
                        correcto();
                    }else if (view.getId() == R.id.iv_cambio && v.getId() == R.id.ll_targert_cambio) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget2.setVisibility(view.GONE);
                        newParent.addView(view);
                            correcto();

                    }else  if (view.getId() == R.id.iv_dientes && v.getId() == R.id.ll_targert_dientes) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget3.setVisibility(view.GONE);
                        newParent.addView(view);
                                        correcto();

                    }else if (view.getId() == R.id.iv_manos && v.getId() == R.id.ll_targert_manos) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget4.setVisibility(view.GONE);
                        newParent.addView(view);
                    correcto();


                    }else if (view.getId() == R.id.iv_peinar && v.getId() == R.id.ll_targert_peinar) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget5.setVisibility(view.GONE);
                        newParent.addView(view);

                        correcto();

                    }else  if (view.getId() == R.id.iv_unas && v.getId() == R.id.ll_targert_unas) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget6.setVisibility(view.GONE);
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
                           Higiene.this, R.raw.error);
                   mediaPlayer.start();
               }
           };
        playThread.start();
   }
    public  void correcto(){

        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer = MediaPlayer.create(
                        Higiene.this, R.raw.correcto);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }




}
