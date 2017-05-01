package mx.edu.utng.menu.operaciones;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.DragEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.ViewSwitcher;

import mx.edu.utng.menu.R;

public class Operaciones extends AppCompatActivity {

    static int numeroUno;
    static int numeroDos;

    LinearLayout llTarget1;
    LinearLayout llTarget2;
    LinearLayout llTarget3;
    LinearLayout llTarget4;
    ToggleButton tbOperacion;
    Button btLimpiar;
    Button btTest1;
    Button btTest2;
    Button btTest3;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt10;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    TextView tvResult;
    ViewSwitcher switcher1;
    ViewSwitcher switcher2;


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

        setContentView(R.layout.activity_operaciones);
        llTarget1 = (LinearLayout) findViewById(R.id.ll_targert_1);
        llTarget2 = (LinearLayout) findViewById(R.id.bt_targert_2);
        llTarget3 = (LinearLayout) findViewById(R.id.bt_targert_3);
        //
        tbOperacion =(ToggleButton) findViewById(R.id.tb_operacion);
        //-----------------------------------------------------------------
        btTest1 = (Button) findViewById(R.id.bt_test_1);
        btTest2 = (Button) findViewById(R.id.bt_test_2);
        btTest3 = (Button) findViewById(R.id.bt_test_3);
        btLimpiar =(Button) findViewById(R.id.bt_limpiar);
        tvResult =(TextView)findViewById(R.id.dato);
        //--------------------------------------------------------------------
        btLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroUno = 0;
                numeroDos = 0;
                tvResult.setText("");
                startActivity( new Intent(Operaciones.this,Operaciones.class));
                finish();
            }
        });

        btTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultado;
                if (tbOperacion.getText().toString().equals("+")) {
                    resultado = numeroDos + numeroUno;
                }else {
                    resultado = numeroDos - numeroUno;
                }
                tvResult.setText(String.valueOf(resultado));
            }
        });
        //----------------------------------------
        bt1 = (Button) findViewById(R.id.bt_1);
        bt2 = (Button) findViewById(R.id.bt_2);
        bt3 = (Button) findViewById(R.id.bt_3);
        bt4 = (Button) findViewById(R.id.bt_4);
        bt5 = (Button) findViewById(R.id.bt_5);
        bt6 = (Button) findViewById(R.id.bt_6);
        bt7 = (Button) findViewById(R.id.bt_7);
        bt8 = (Button) findViewById(R.id.bt_8);
        bt9 = (Button) findViewById(R.id.bt_9);
        bt10 = (Button) findViewById(R.id.bt_10);
        //........................................
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btn10 = (Button) findViewById(R.id.btn_10);
        //-------------------------------------------
        llTarget1.setOnDragListener(dragListener);
        llTarget2.setOnDragListener(dragListener2);
        //-------------------------------------------
        bt1.setOnLongClickListener(longClickListener);
        bt2.setOnLongClickListener(longClickListener);
        bt3.setOnLongClickListener(longClickListener);
        bt4.setOnLongClickListener(longClickListener);
        bt5.setOnLongClickListener(longClickListener);
        bt6.setOnLongClickListener(longClickListener);
        bt7.setOnLongClickListener(longClickListener);
        bt8.setOnLongClickListener(longClickListener);
        bt9.setOnLongClickListener(longClickListener);
        bt10.setOnLongClickListener(longClickListener);
        //--------------------------------------------
        btn1.setOnLongClickListener(longClickListener);
        btn2.setOnLongClickListener(longClickListener);
        btn3.setOnLongClickListener(longClickListener);
        btn4.setOnLongClickListener(longClickListener);
        btn5.setOnLongClickListener(longClickListener);
        btn6.setOnLongClickListener(longClickListener);
        btn7.setOnLongClickListener(longClickListener);
        btn8.setOnLongClickListener(longClickListener);
        btn9.setOnLongClickListener(longClickListener);
        btn10.setOnLongClickListener(longClickListener);
        //.............................................
        tvResult = (TextView) findViewById(R.id.dato);
        //ViewSwitcher
        switcher1 = (ViewSwitcher) findViewById(R.id.switcher_1);
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
                    if (view.getId() == R.id.bt_1 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(bt1.getText().toString());
                    } else if (view.getId() == R.id.bt_2 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(bt2.getText().toString());
                    } else if (view.getId() == R.id.bt_3 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(btn3.getText().toString());
                    } else if (view.getId() == R.id.bt_4 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(btn4.getText().toString());
                    }
                    else if (view.getId() == R.id.bt_5 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(btn5.getText().toString());
                    }else if (view.getId() == R.id.bt_6 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher2.showNext();
                        numeroDos = Integer.parseInt(btn6.getText().toString());
                    } else if (view.getId() == R.id.bt_7 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(btn7.getText().toString());
                    }
                    else if (view.getId() == R.id.bt_8 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(btn8.getText().toString());
                    }else if (view.getId() == R.id.bt_9 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(bt9.getText().toString());
                    } else if (view.getId() == R.id.bt_10 && v.getId() == R.id.ll_targert_1) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest1.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroDos = Integer.parseInt(btn10.getText().toString());
                    }
                    break;
            }
            return true;
        }
    };


    View.OnDragListener dragListener2 = new View.OnDragListener() {
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
                    if (view.getId() == R.id.btn_1 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn1.getText().toString());
                    } else if (view.getId() == R.id.btn_2 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn2.getText().toString());
                    } else if (view.getId() == R.id.btn_3 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn3.getText().toString());
                    } else if (view.getId() == R.id.btn_4 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn4.getText().toString());
                    }
                    else if (view.getId() == R.id.btn_5 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn5.getText().toString());
                    }else if (view.getId() == R.id.btn_6 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn6.getText().toString());
                    } else if (view.getId() == R.id.btn_7 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn7.getText().toString());
                    } else if (view.getId() == R.id.btn_8 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn8.getText().toString());
                    }
                    else if (view.getId() == R.id.btn_9 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn9.getText().toString());
                    }else if (view.getId() == R.id.btn_2 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn9.getText().toString());
                    } else if (view.getId() == R.id.btn_10 && v.getId() == R.id.bt_targert_2) {
                        LinearLayout oldPrente = (LinearLayout) view.getParent();
                        oldPrente.removeView(view);
                        LinearLayout newParent = (LinearLayout) v;
                        btTest2.setVisibility(view.GONE);
                        newParent.addView(view);
                        switcher1.showNext();
                        numeroUno = Integer.parseInt(btn10.getText().toString());
                    }

                    break;
            }
            return true;
        }
    };

}
