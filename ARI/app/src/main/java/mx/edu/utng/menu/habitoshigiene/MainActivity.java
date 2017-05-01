package mx.edu.utng.menu.habitoshigiene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mx.edu.utng.menu.R;

public class MainActivity extends AppCompatActivity {

    private Button btJugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_estaciones);

        btJugar =(Button)findViewById(R.id.bt_jugar);

        btJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Higiene.class);
                startActivity(intent);
            }
        });
    }
}
