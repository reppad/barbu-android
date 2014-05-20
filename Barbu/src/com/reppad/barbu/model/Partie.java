package com.reppad.barbu.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.reppad.barbu.R;

public class Partie {
	List<Carte> pioche;

	public Partie() {
		pioche = new ArrayList<Carte>();
		pioche.add(new Carte(R.drawable.aceofhearts, new Regle("ma regle", "description detaillee de ma regle")));
		pioche.add(new Carte(R.drawable.fourofdiamonds, new Regle("plop", "ploploplo")));
		pioche.add(new Carte(R.drawable.blackjoker, new Regle("toti", "dkljhvlqhbmqvqvdse")));
		pioche.add(new Carte(R.drawable.queenofspades, new Regle("plip", "plipplipplipplip detaillee de ma regle")));
		Collections.shuffle(pioche);
	}
	
	public Carte piocher() {
		Carte cartePiochee = null;
		if(pioche.size() > 0) {
			cartePiochee = pioche.get(0);
			pioche.remove(0);
		}
		return cartePiochee;
	}
}
