package com.reppad.barbu.model;

public class Regle {
	private String nom;
	private String detail;
	
	
	public Regle(String nom, String detail) {
		super();
		this.nom = nom;
		this.detail = detail;
	}

	public String getNom() {
		return nom;
	}

	public String getDetail() {
		return detail;
	}
}
