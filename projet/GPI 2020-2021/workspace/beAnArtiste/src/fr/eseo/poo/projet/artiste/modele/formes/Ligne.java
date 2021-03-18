package fr.eseo.poo.projet.artiste.modele.formes;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ligne {
	
	private static double LARGEUR_PAR_DEFAUT = 2;
	private static double HAUTEUR_PAR_DEFAUT = 2;
	
	private Coordonnees position;
	private double largeur;
	private double hauteur;
	
	
	// Constructeurs
	public Ligne (Coordonnees c, double l, double h) {
		this.position = c;
		this.largeur = l;
		this.hauteur = h;
	}
	
	public Ligne(Coordonnees c) {
		this(c,LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}
	
	public Ligne() {
		this(new Coordonnees());
	}
	
	// Accesseurs
	public Coordonnees getPosition() {
		return this.position;
	}
	
	public double getLargeur() {
		return this.largeur;
	}
	
	public double getHauteur() {
		return this.hauteur;
	}
	
	public void setPosition(Coordonnees c) {
		this.position = c;
	}
	
	public void setLargeur(double l) {
		this.largeur = l;
	}
	
	public void setHauteur(double h) {
		this.hauteur = h;
	}
	
	public Coordonnees getC1() {
		return this.position;
	}
	
	public Coordonnees getC2() {
		Coordonnees c = new Coordonnees(this.getPosition());
		c.deplacerDe(this.largeur, this.hauteur);
		return c;
	}
	
	
}
