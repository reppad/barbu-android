package com.reppad.barbu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
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

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.jeu, menu);
//		return true;
//	}

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
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
			alertDialogBuilder.setTitle(getString(R.string.detail_regle));
			alertDialogBuilder
			.setMessage(cartePiochee.getRegle().getDetail())
			.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					dialog.cancel();
				}
			});
			AlertDialog alertDialog = alertDialogBuilder.create();
			alertDialog.show();
		} else {
			Toast toast = Toast.makeText(this, getString(R.string.piocher_carte), Toast.LENGTH_SHORT);
			toast.show();
		}
	}

	@Override
	public void onBackPressed() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(R.string.message_quitter)
				.setCancelable(false)
				.setPositiveButton(R.string.quitter,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								finish();
								dialog.cancel();
							}
						})
				.setNegativeButton(R.string.rester,
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						});
		AlertDialog alert = builder.create();
		alert.show();
	}

}
