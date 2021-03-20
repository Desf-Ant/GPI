package fr.eseo.poo.projet.artiste.modele.formes;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ligne {
	
	public static double LARGEUR_PAR_DEFAUT = 2;
	public static double HAUTEUR_PAR_DEFAUT = 2;
	
	private Coordonnees position;
	private double largeur;
	private double hauteur;
	
	
	// Constructeurs
	public Ligne (Coordonnees c, double l, double h) {
		this.position = c;
		this.largeur = l;
		this.hauteur = h;
	}
	
	public Ligne(double l,double h) {
		this(new Coordonnees(),l,h);
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
	
	public void setC1(Coordonnees c) {
		double deltaX = this.getLargeur() - c.getX();
		double deltaY = this.getHauteur() - c.getY();
		this.position = c;
		this.largeur += deltaX;
		this.hauteur += deltaY;
	}
	
	public void setC2(Coordonnees c) {
		Coordonnees c2 = this.getC2();
		double deltaX = c.getX() - c2.getX();
		double deltaY = c.getY() - c2.getY();
		this.largeur += deltaX;
		this.hauteur += deltaY;
	}
	
	public double getCadreMinX() {
		double a = this.getC1().getX();
		double b = this.getC2().getX();
		
		if (a<b)
			return a;
		else 
			return b;
	}
	
	public double getCadreMinY() {
		double a = this.getC1().getY();
		double b = this.getC2().getY();
		
		if (a<b)
			return a;
		else 
			return b;
	}
	
	public double getCadreMaxX() {
		double a = this.getC1().getX();
		double b = this.getC2().getX();
		
		if (a>b)
			return a;
		else 
			return b;
	}
	
	public double getCadreMaxY() {
		double a = this.getC1().getY();
		double b = this.getC2().getY();
		
		if (a>b)
			return a;
		else 
			return b;
	}
	
	public void deplacerVers(Coordonnees c) {
		this.setPosition(c);
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		Coordonnees c = this.getPosition();
		c.deplacerDe(deltaX, deltaY);
		this.deplacerVers(c);
	}
	
	public double aire() {
		return 0;
	}
	
	public double perimetre() {
		return Math.sqrt(Math.pow(this.getC1().getX()-this.getC2().getX(), 2)+Math.pow(this.getC1().getY()-this.getC2().getY(), 2));
	}
	
	
}
