package fr.eseo.poo.projet.artiste.modele.formes;

import fr.eseo.poo.projet.artiste.modele.*;

public abstract class Forme {
	public static final double LARGEUR_PAR_DEFAUT=20;
	public static final double HAUTEUR_PAR_DEFAUT=20;
	
	// Variable
	protected double largeur;
	protected double hauteur;
	private Coordonnees position;
	
	// Constructeur
	public Forme(Coordonnees c, double l, double h) {
		this.position = c;
		this.largeur = l;
		this.hauteur = h;
	}
	public Forme(Coordonnees c) {
		this(c,LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}
	public Forme(double l, double h) {
		this.position = new Coordonnees();
		this.largeur = l;
		this.hauteur = h;
	}
	public Forme() {
		this(new Coordonnees());
	}
	
	// ACCESSEUR
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
	
	// Methodes 
	public double getCadreMinY() {
		return this.getPosition().getOrdonnee();
	}
	public double getCadreMinX() {
		return this.getPosition().getAbscisse();
	}
	public double getCadreMaxY() {
		return this.getCadreMinY() + this.getHauteur();
	}
	public double getCadreMaxX() {
		return this.getCadreMinX()+this.getLargeur();
	}
	
	public Coordonnees getCentre() {
		double h = this.getHauteur();
		double l = this.getLargeur();
		Coordonnees c = this.getPosition();
		c.deplacerDe(l/2, h/2);
		
		return new Coordonnees(c);
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		Coordonnees c = this.getPosition();
		c.deplacerDe(deltaX, deltaY);
		this.setPosition(c);
	}
	
	public void deplacerVers(double newX,double newY) {
		this.setPosition(new Coordonnees(newX,newY));
	}
	
	public abstract double aire();
	
	public abstract double perimetre();
	
	public abstract boolean contient(Coordonnees c);
	
}
