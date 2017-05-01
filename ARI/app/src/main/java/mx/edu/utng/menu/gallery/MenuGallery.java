package mx.edu.utng.menu.gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;

import mx.edu.utng.menu.R;

public class MenuGallery extends AppCompatActivity implements View.OnClickListener {
    private   ImageButton ibAbecedario;
    private Activity activity;
    private ImageView ivAbecedario;
    private ImageView ivFrutas;
    private ImageView ivAnimals;
    private ImageView ivValores;
    private Animation animation;
    private ImageView ivColores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_gallery);
        ivAbecedario = (ImageView)findViewById(R.id.iv_abecedario);
        ivFrutas =(ImageView)findViewById(R.id.iv_frutas);
        ivAnimals =(ImageView)findViewById(R.id.iv_animals);
        ivValores =(ImageView)findViewById(R.id.iv_valores);
        ivColores =(ImageView)findViewById(R.id.iv_colors);

        ivAbecedario.setOnClickListener(this);
        ivFrutas.setOnClickListener(this);
        ivAnimals.setOnClickListener(this);
        ivValores.setOnClickListener(this);
        ivColores.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_abecedario:
                startActivity( new Intent(this,BaseLetters.class));
                break;
            case R.id.iv_frutas:
                startActivity(new Intent(this,BaseFruits.class));
                break;
            case R.id.iv_animals:
                startActivity(new Intent(this,BaseAnimals.class));
                break;
            case R.id.iv_valores:
                startActivity(new Intent(this,BaseValores.class));
                break;
            case R.id.iv_colors:
                startActivity(new Intent(this,BaseColores.class));
                break;

        }
    }
}
