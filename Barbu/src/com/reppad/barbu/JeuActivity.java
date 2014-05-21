package com.reppad.barbu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.reppad.barbu.model.Carte;
import com.reppad.barbu.model.Partie;

public class JeuActivity extends Activity {

	Partie partie;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jeu);

		partie = new Partie(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jeu, menu);
		return true;
	}

	public void nouvelleCarte(View view) {
		Carte cartePiochee = partie.piocher();
		if (cartePiochee == null) {
			// partie terminee
			Toast toast = Toast.makeText(this, getString(R.string.partie_terminee), Toast.LENGTH_LONG);
			toast.show();
		} else {
			//animation lors du changement de carte
			//http://developer.android.com/guide/topics/graphics/view-animation.html
			//http://developer.android.com/guide/topics/resources/animation-resource.html#Tween
			TextView nomRegle = (TextView) findViewById(R.id.textView1);
			ImageView imagecarte = (ImageView) findViewById(R.id.imageView1);
			nomRegle.setText(cartePiochee.getRegle().getNom());
			imagecarte.setImageResource(cartePiochee.getIdRessource());
		}
	}

}
