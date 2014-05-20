package com.reppad.barbu.model;

public class Carte {
	private String nom;
	private Regle regle;
	
	public Carte(String nom, Regle regle) {
		super();
		this.nom = nom;
		this.regle = regle;
	}
	
	public String getNom() {
		return nom;
	}
	public Regle getRegle() {
		return regle;
	}
	
	
}
