package mx.edu.utng.menu.newrepro;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import mx.edu.utng.menu.R;

public class MainActivityReproductor extends Activity {
	MediaPlayer mp;
	Button b1;
	int posicion = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.button5);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.activity_main¿, menu);
		return true;
	}

	public void destruir() {
		if (mp != null)
			mp.release();
	}

	public void iniciar(View v) {
		destruir();
		mp = MediaPlayer.create(this, R.raw.cancion);
		mp.start();
		String op = b1.getText().toString();
		if (op.equals("No reproducir en forma circular"))
			mp.setLooping(false);
		else
			mp.setLooping(true);
	}

	public void pausar(View v) {
		if (mp != null && mp.isPlaying()) {
			posicion = mp.getCurrentPosition();
			mp.pause();
		}
	}

	public void continuar(View v) {
		if (mp != null && mp.isPlaying() == false) {
			mp.seekTo(posicion);
			mp.start();
		}
	}

	public void detener(View v) {
		if (mp != null) {
			mp.stop();
			posicion = 0;
		}
	}

	public void circular(View v) {
		detener(null);
		String op = b1.getText().toString();
		if (op.equals("No reproducir"))
			b1.setText("reproducir");
		else
			b1.setText("No reproducir");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		mp.stop();
		mp.release();
		mp = null;

	}

}
