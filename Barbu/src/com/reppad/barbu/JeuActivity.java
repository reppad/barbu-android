package com.reppad.barbu;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class JeuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_jeu);
		
		// Create a new ImageView
        ImageView imageView = new ImageView(this);
        // Set the background color to white
        imageView.setBackgroundColor(Color.WHITE);
        // Get a drawable from the parsed SVG and set it as the drawable for the ImageView
        imageView.setImageResource(R.drawable.aceofclubs);
        // Set the ImageView as the content view for the Activity
        setContentView(imageView);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jeu, menu);
		return true;
	}

}
