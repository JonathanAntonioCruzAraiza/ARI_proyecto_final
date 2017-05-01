package mx.edu.utng.menu.crecimiento;

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

public class Crecimiento extends AppCompatActivity {
    LinearLayout llTarget1;
    LinearLayout llTarget2;
    LinearLayout llTarget3;
    LinearLayout llTarget4;
    LinearLayout llTarget5;


    private MediaPlayer mediaPlayer;


    ImageView ivInfancia;
    ImageView ivNines;
    ImageView ivAdolescencia;
    ImageView ivAdulto;
    ImageView ivViejo;

    Button btVolverJugar;
    Button btTarget1;
    Button btTarget2;
    Button btTarget3;
    Button btTarget4;
    Button btTarget5;



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


        setContentView(R.layout.activity_crecimiento);
        llTarget1 = (LinearLayout)findViewById(R.id.ll_targert_infancia);
        llTarget2 = (LinearLayout)findViewById(R.id.ll_targert_nines);
        llTarget3 = (LinearLayout)findViewById(R.id.ll_targert_adolescencia);
        llTarget4 = (LinearLayout)findViewById(R.id.ll_targert_adultez);
        llTarget5 = (LinearLayout)findViewById(R.id.ll_targert_vejez);



        ivInfancia =(ImageView)findViewById(R.id.iv_infancia);
        ivNines =(ImageView)findViewById(R.id.iv_nines);
        ivAdolescencia =(ImageView)findViewById(R.id.iv_adolescencia);
        ivAdulto =(ImageView)findViewById(R.id.iv_adultez);
        ivViejo =(ImageView)findViewById(R.id.iv_vejez);



        btTarget1 =(Button)findViewById(R.id.bt_targert_infancia);
        btTarget2 =(Button)findViewById(R.id.bt_targert_nines);
        btTarget3 =(Button)findViewById(R.id.bt_targert_adolescencia);
        btTarget4 =(Button)findViewById(R.id.bt_targert_adultez);
        btTarget5 =(Button)findViewById(R.id.bt_targert_vejez);


        btVolverJugar =(Button)findViewById(R.id.bt_volver_jugar);

        ivInfancia.setOnLongClickListener(longClickListener);
        ivNines.setOnLongClickListener(longClickListener);
        ivAdolescencia.setOnLongClickListener(longClickListener);
        ivAdulto.setOnLongClickListener(longClickListener);
        ivViejo.setOnLongClickListener(longClickListener);

        llTarget1.setOnDragListener(dragListener);
        llTarget2.setOnDragListener(dragListener);
        llTarget3.setOnDragListener(dragListener);
        llTarget4.setOnDragListener(dragListener);
        llTarget5.setOnDragListener(dragListener);

        btVolverJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Crecimiento.this,Crecimiento.class));
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
                    if (view.getId() == R.id.iv_infancia && v.getId() == R.id.ll_targert_infancia) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget1.setVisibility(view.GONE);
                        newParent.addView(view);
                        correcto();
                    }else if (view.getId() == R.id.iv_nines && v.getId() == R.id.ll_targert_nines) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget2.setVisibility(view.GONE);
                        newParent.addView(view);
                            correcto();

                    }else  if (view.getId() == R.id.iv_adolescencia && v.getId() == R.id.ll_targert_adolescencia) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget3.setVisibility(view.GONE);
                        newParent.addView(view);
                                        correcto();

                    }else if (view.getId() == R.id.iv_adultez && v.getId() == R.id.ll_targert_adultez) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget4.setVisibility(view.GONE);
                        newParent.addView(view);
                    correcto();


                    }else if (view.getId() == R.id.iv_vejez && v.getId() == R.id.ll_targert_vejez) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTarget5.setVisibility(view.GONE);
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
                           Crecimiento.this, R.raw.error);
                   mediaPlayer.start();
               }
           };
        playThread.start();
   }
    public  void correcto(){

        Thread playThread = new Thread(){
            public  void run(){
                mediaPlayer = MediaPlayer.create(
                        Crecimiento.this, R.raw.correcto);
                mediaPlayer.start();
            }
        };
        playThread.start();
    }

}
