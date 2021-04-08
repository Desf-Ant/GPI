package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.util.Locale;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Ligne extends Forme {
	
	public static double LARGEUR_PAR_DEFAUT = 20;
	public static double HAUTEUR_PAR_DEFAUT = 20;
	public static final double EPSILON = 0.1;
	
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
		this(new Coordonnees(),LARGEUR_PAR_DEFAUT,HAUTEUR_PAR_DEFAUT);
	}
	
	
	// Accesseurs
	@Override
	public Coordonnees getPosition() {
		return this.position;
	}
	@Override
	public double getLargeur() {
		return this.largeur;
	}
	@Override
	public double getHauteur() {
		return this.hauteur;
	}
	@Override
	public void setPosition(Coordonnees c) {
		this.position = c;
	}
	@Override
	public void setLargeur(double l) {
		this.largeur = l;
	}
	@Override
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
		Coordonnees c2 = this.getC2();
		this.position = c;
		this.setC2(c2);
	}
	
	public void setC2(Coordonnees c) {
		Coordonnees c2 = this.getC2();
		double deltaX = c.getAbscisse() - c2.getAbscisse();
		double deltaY = c.getOrdonnee() - c2.getOrdonnee();
		this.largeur += deltaX;
		this.hauteur += deltaY;
	}
	
	@Override
	public double getCadreMinX() {
		double a = this.getC1().getAbscisse();
		double b = this.getC2().getAbscisse();
		
		if (a<b)
			return a;
		else 
			return b;
	}
	@Override
	public double getCadreMinY() {
		double a = this.getC1().getOrdonnee();
		double b = this.getC2().getOrdonnee();
		
		if (a<b)
			return a;
		else 
			return b;
	}
	@Override
	public double getCadreMaxX() {
		double a = this.getC1().getAbscisse();
		double b = this.getC2().getAbscisse();
		
		if (a>b)
			return a;
		else 
			return b;
	}
	@Override
	public double getCadreMaxY() {
		double a = this.getC1().getOrdonnee();
		double b = this.getC2().getOrdonnee();
		
		if (a>b)
			return a;
		else 
			return b;
	}
	
	public void deplacerVers(Coordonnees c) {
		this.setPosition(c);
	}
	@Override
	public void deplacerDe(double deltaX, double deltaY) {
		Coordonnees c = this.getPosition();
		c.deplacerDe(deltaX, deltaY);
		this.deplacerVers(c);
	}
	
	@Override
	public double aire() {
		return 0;
	}
	
	@Override
	public double perimetre() {
		return Math.sqrt(Math.pow(this.getC1().getAbscisse()-this.getC2().getAbscisse(), 2)+Math.pow(this.getC1().getOrdonnee()-this.getC2().getOrdonnee(), 2));
	}
	
	@Override
	public boolean contient (Coordonnees c) {
		double C1C = this.getC1().distanceVers(c);
		double CC2 = c.distanceVers(this.getC2());
		double C1C2 = this.getC1().distanceVers(this.getC2());
		double condition = C1C + CC2 - C1C2;
		
		if (condition <= EPSILON)
			return true;
		return false;
	}
	
	public String toString() {
		String s = new String();
		DecimalFormat df = new DecimalFormat("0.0#");
		
		Coordonnees c2 = this.getC2();
		double lon = Math.sqrt(Math.pow(this.getLargeur(), 2)+Math.pow(this.getHauteur(), 2));
		String longueur = df.format(lon);
		double ang = this.getC1().angleVers(this.getC2())*180/Math.PI;
		if (ang<0)
			ang += 360;
		String angle = df.format(ang);
		
		Locale langue = Locale.getDefault();
		
		if (langue.getLanguage().equals(new Locale("fr").getLanguage())) {
			longueur = longueur.replace('.',',');
			angle = angle.replace('.',',');
		}
		
		s = "[Ligne] c1 : ";
		s += this.getPosition().toString();
		s += " c2 : ";
		s += c2.toString();
		s += " longueur : ";
		s += longueur;
		s += " angle : ";
		s += angle;
		s += "°";
		
		return s;
		
	}
	
}
