package com.reppad.barbu.model;

public class Carte {
	private int idRessource;
	private Regle regle;
	
	public Carte(int idRessource, Regle regle) {
		super();
		this.idRessource = idRessource;
		this.regle = regle;
	}

	public int getIdRessource() {
		return idRessource;
	}

	public Regle getRegle() {
		return regle;
	}
	
}
