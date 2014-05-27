package com.reppad.barbu.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.content.Context;

import com.reppad.barbu.R;

public class Partie {
	List<Carte> pioche;

	public Partie(Context context) {
		pioche = new ArrayList<Carte>();

		Regle regleAs		= new Regle(context.getString(R.string.regle_as),		context.getString(R.string.regle_detail_as));
		Regle regle2		= new Regle(context.getString(R.string.regle_2),		context.getString(R.string.regle_detail_2));
		Regle regle3		= new Regle(context.getString(R.string.regle_3),		context.getString(R.string.regle_detail_3));
		Regle regle4		= new Regle(context.getString(R.string.regle_4),		context.getString(R.string.regle_detail_4));
		Regle regle5		= new Regle(context.getString(R.string.regle_5),		context.getString(R.string.regle_detail_5));
		Regle regle6		= new Regle(context.getString(R.string.regle_6),		context.getString(R.string.regle_detail_6));
		Regle regle7		= new Regle(context.getString(R.string.regle_7),		context.getString(R.string.regle_detail_7));
		Regle regle8		= new Regle(context.getString(R.string.regle_8),		context.getString(R.string.regle_detail_8));
		Regle regle9		= new Regle(context.getString(R.string.regle_9),		context.getString(R.string.regle_detail_9));
		Regle regle10		= new Regle(context.getString(R.string.regle_10),		context.getString(R.string.regle_detail_10));
		Regle regleValet	= new Regle(context.getString(R.string.regle_valet),	context.getString(R.string.regle_detail_valet));
		Regle regleDame		= new Regle(context.getString(R.string.regle_dame),		context.getString(R.string.regle_detail_dame));
		Regle regleRoi		= new Regle(context.getString(R.string.regle_roi),		context.getString(R.string.regle_detail_roi));
		
		Carte asDeCoeur			= new Carte(R.drawable.aceofhearts,			regleAs);
		Carte asDeCarreau		= new Carte(R.drawable.aceofdiamonds,		regleAs);
		Carte asDePique			= new Carte(R.drawable.aceofspadestwo,		regleAs);
		Carte asDeTrefle		= new Carte(R.drawable.aceofclubs,			regleAs);
		Carte deuxDeCoeur		= new Carte(R.drawable.twoofhearts,			regle2);
		Carte deuxDeCarreau		= new Carte(R.drawable.twoofdiamonds,		regle2);
		Carte deuxDePique		= new Carte(R.drawable.twoofspades,			regle2);
		Carte deuxDeTrefle		= new Carte(R.drawable.twoofclubs,			regle2);
		Carte troisDeCoeur		= new Carte(R.drawable.threeofhearts,		regle3);
		Carte troisDeCarreau	= new Carte(R.drawable.threeofdiamonds,		regle3);
		Carte troisDePique		= new Carte(R.drawable.threeofspades,		regle3);
		Carte troisDeTrefle		= new Carte(R.drawable.threeofclubs,		regle3);
		Carte quatreDeCoeur		= new Carte(R.drawable.fourofhearts,		regle4);
		Carte quatreDeCarreau	= new Carte(R.drawable.fourofdiamonds,		regle4);
		Carte quatreDePique		= new Carte(R.drawable.fourofspades,		regle4);
		Carte quatreDeTrefle	= new Carte(R.drawable.fourofclubs,			regle4);
		Carte cinqDeCoeur		= new Carte(R.drawable.fiveofhearts,		regle5);
		Carte cinqDeCarreau		= new Carte(R.drawable.fiveofdiamonds,		regle5);
		Carte cinqDePique		= new Carte(R.drawable.fiveofspades,		regle5);
		Carte cinqDeTrefle		= new Carte(R.drawable.fiveofclubs,			regle5);
		Carte sixDeCoeur		= new Carte(R.drawable.sixofhearts,			regle6);
		Carte sixDeCarreau		= new Carte(R.drawable.sixofdiamonds,		regle6);
		Carte sixDePique		= new Carte(R.drawable.sixofspades,			regle6);
		Carte sixDeTrefle		= new Carte(R.drawable.sixofclubs,			regle6);
		Carte septDeCoeur		= new Carte(R.drawable.sevenofhearts,		regle7);
		Carte septDeCarreau		= new Carte(R.drawable.sevenofdiamonds,		regle7);
		Carte septDePique		= new Carte(R.drawable.sevenofspades,		regle7);
		Carte septDeTrefle		= new Carte(R.drawable.sevenofclubs,		regle7);
		Carte huitDeCoeur		= new Carte(R.drawable.heightofhearts,		regle8);
		Carte huitDeCarreau		= new Carte(R.drawable.heightofdiamonds,	regle8);
		Carte huitDePique		= new Carte(R.drawable.heightofspades,		regle8);
		Carte huitDeTrefle		= new Carte(R.drawable.heightofclubs,		regle8);
		Carte neufDeCoeur		= new Carte(R.drawable.nineofhearts,		regle9);
		Carte neufDeCarreau		= new Carte(R.drawable.nineofdiamonds,		regle9);
		Carte neufDePique		= new Carte(R.drawable.nineofspades,		regle9);
		Carte neufDeTrefle		= new Carte(R.drawable.nineofclubs,			regle9);
		Carte dixDeCoeur		= new Carte(R.drawable.tenofhearts,			regle10);
		Carte dixDeCarreau		= new Carte(R.drawable.tenofdiamonds,		regle10);
		Carte dixDePique		= new Carte(R.drawable.tenofspades,			regle10);
		Carte dixDeTrefle		= new Carte(R.drawable.tenofclubs,			regle10);
		Carte valetDeCoeur		= new Carte(R.drawable.jackofheartstwo,		regleValet);
		Carte valetDeCarreau	= new Carte(R.drawable.jackofdiamondstwo,	regleValet);
		Carte valetDePique		= new Carte(R.drawable.jackofspadestwo,		regleValet);
		Carte valetDeTrefle		= new Carte(R.drawable.jackofclubstwo,		regleValet);
		Carte dameDeCoeur		= new Carte(R.drawable.queenofheartstwo,	regleDame);
		Carte dameDeCarreau		= new Carte(R.drawable.queenofdiamondstwo,	regleDame);
		Carte dameDePique		= new Carte(R.drawable.queenofspadestwo,	regleDame);
		Carte dameDeTrefle		= new Carte(R.drawable.queenofclubstwo,		regleDame);
		Carte roiDeeCoeur		= new Carte(R.drawable.kingofheartstwo,		regleRoi);
		Carte roiDeCarreau		= new Carte(R.drawable.kingofdiamondstwo,	regleRoi);
		Carte roiDePique		= new Carte(R.drawable.kingofspadestwo,		regleRoi);
		Carte roiDeTrefle		= new Carte(R.drawable.kingofclubstwo,		regleRoi);
		
		pioche.add(asDeCoeur);
		pioche.add(asDeCarreau);
		pioche.add(asDePique);
		pioche.add(asDeTrefle);
		pioche.add(deuxDeCoeur);
		pioche.add(deuxDeCarreau);
		pioche.add(deuxDePique);
		pioche.add(deuxDeTrefle);
		pioche.add(troisDeCoeur);
		pioche.add(troisDeCarreau);
		pioche.add(troisDePique);
		pioche.add(troisDeTrefle);
		pioche.add(quatreDeCoeur);
		pioche.add(quatreDeCarreau);
		pioche.add(quatreDePique);
		pioche.add(quatreDeTrefle);
		pioche.add(cinqDeCoeur);
		pioche.add(cinqDeCarreau);
		pioche.add(cinqDePique);
		pioche.add(cinqDeTrefle);
		pioche.add(sixDeCoeur);
		pioche.add(sixDeCarreau);
		pioche.add(sixDePique);
		pioche.add(sixDeTrefle);
		pioche.add(septDeCoeur);
		pioche.add(septDeCarreau);
		pioche.add(septDePique);
		pioche.add(septDeTrefle);
		pioche.add(huitDeCoeur);
		pioche.add(huitDeCarreau);
		pioche.add(huitDePique);
		pioche.add(huitDeTrefle);
		pioche.add(neufDeCoeur);
		pioche.add(neufDeCarreau);
		pioche.add(neufDePique);
		pioche.add(neufDeTrefle);
		pioche.add(dixDeCoeur);
		pioche.add(dixDeCarreau);
		pioche.add(dixDePique);
		pioche.add(dixDeTrefle);
		pioche.add(valetDeCoeur);
		pioche.add(valetDeCarreau);
		pioche.add(valetDePique);
		pioche.add(valetDeTrefle);
		pioche.add(dameDeCoeur);
		pioche.add(dameDeCarreau);
		pioche.add(dameDePique);
		pioche.add(dameDeTrefle);
		pioche.add(roiDeeCoeur);
		pioche.add(roiDeCarreau);
		pioche.add(roiDePique);
		pioche.add(roiDeTrefle);
		
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
