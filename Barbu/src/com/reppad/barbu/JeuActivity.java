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
	Carte cartePiochee;

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
		Carte nouvelleCarte = partie.piocher();
		if (nouvelleCarte == null) {
			// partie terminee
			Toast toast = Toast.makeText(this, getString(R.string.partie_terminee), Toast.LENGTH_LONG);
			toast.show();
		} else {
			cartePiochee = nouvelleCarte;
			//animation lors du changement de carte
			//http://developer.android.com/guide/topics/graphics/view-animation.html
			//http://developer.android.com/guide/topics/resources/animation-resource.html#Tween
			TextView nomRegle = (TextView) findViewById(R.id.titre);
			ImageView imagecarte = (ImageView) findViewById(R.id.imageCarte);
			nomRegle.setText(cartePiochee.getRegle().getNom());
			imagecarte.setImageResource(cartePiochee.getIdRessource());
		}
	}

	public void afficherRegle(View view) {
		if (cartePiochee != null) {
			Toast toast = Toast.makeText(this, cartePiochee.getRegle().getDetail(), Toast.LENGTH_LONG);
			toast.show();
		}
	}

}
