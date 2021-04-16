package fr.eseo.poo.projet.artiste.modele.formes;

import java.awt.Color;
import fr.eseo.poo.projet.artiste.modele.*;

public abstract class Forme implements Coloriable{
	public static final double LARGEUR_PAR_DEFAUT=100;
	public static final double HAUTEUR_PAR_DEFAUT=100;
	public static final Color COULEUR_PAR_DEFAUT = javax.swing.UIManager.getColor("Panel.foreground");
	
	
	// Variable
	protected double largeur;
	protected double hauteur;
	protected Color couleur;
	private Coordonnees position;
	
	// Constructeur
	public Forme(Coordonnees c, double l, double h) {
		this.position = c;
		this.largeur = l;
		this.hauteur = h;
		this.couleur = COULEUR_PAR_DEFAUT;
	}
	public Forme(Coordonnees c) {
		this(c,LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}
	public Forme(double l, double h) {
		this.position = new Coordonnees();
		this.largeur = l;
		this.hauteur = h;
		this.couleur = COULEUR_PAR_DEFAUT;
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
		Coordonnees c = new Coordonnees(this.getPosition());
		c.deplacerDe(l/2, h/2);
		
		return c;
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		Coordonnees c = this.getPosition();
		c.deplacerDe(deltaX, deltaY);
		this.setPosition(c);
	}
	
	public void deplacerVers(double newX,double newY) {
		this.setPosition(new Coordonnees(newX,newY));
	}
	
	public Color getCouleur() {
		return couleur;
	}
	
	public void setCouleur(Color c) {
		this.couleur = c;
	}
	
	public abstract double aire();
	
	public abstract double perimetre();
	
	public abstract boolean contient(Coordonnees c);
	
}
