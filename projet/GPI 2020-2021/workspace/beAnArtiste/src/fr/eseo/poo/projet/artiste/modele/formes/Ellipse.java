package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;

import fr.eseo.poo.projet.artiste.modele.*;

public class Ellipse extends Forme {
	
	protected double a; // le petit rayon
	protected double b; // le grand rayon
	public static final double EPSILON = 0;
	
	// Constructeurs
	public Ellipse() {
		super();
		
		this.a = this.getLargeur()/2;
		this.b = this.getHauteur()/2;

	}
	
	public Ellipse(double l, double h) {
		super(l,h);
		
		if (l<=0 || h<=0) 
			throw new IllegalArgumentException("You can't put negative input");
		
		this.a = l/2;
		this.b = h/2;
	}
	
	public Ellipse(Coordonnees c) {
		super(c);
		
		this.a = this.getLargeur()/2;
		this.b = this.getHauteur()/2;
		
	}
	
	public Ellipse(Coordonnees c, double l, double h) {
		super(c,l,h);
		
		// On vérifie que ce ne sont pas des valeurs négatives
		if (l<=0 || h<=0) 
			throw new IllegalArgumentException("You can't put negative input");
		
		this.a = l/2;
		this.b = h/2;

	}
	
	@Override
	public void setHauteur(double h) {
		
		if (h<0) 
			throw new IllegalArgumentException("You can't put negative input");
		
		this.b = h/2;
		this.hauteur=h;
	}
	
	@Override
	public void setLargeur(double l) {
		
		if (l<0) 
			throw new IllegalArgumentException("You can't put negative input");
		
		this.largeur=l;
		this.a = l/2;
	}
	
	@Override
	public double aire() {
		return Math.PI*this.a*this.b;
	}
	
	@Override
	public double perimetre() {
		double h = Math.pow((this.a-this.b)/(this.a+this.b), 2);
		
		return Math.PI*(this.a+this.b)*(1+(3*h)/(10+Math.sqrt(4-3*h)));	
	}
	
	public boolean contient(Coordonnees c) {
		double x = c.getAbscisse();
		double y = c.getOrdonnee();
		double h = this.getCentre().getAbscisse();
		double k = this.getCentre().getOrdonnee();
				
		double condition1 = Math.pow((x-h)/this.a, 2) + Math.pow((y-k)/this.b,2);
		//double condition2 = Math.pow((x-h)/this.b, 2) + Math.pow((y-k)/this.a,2);

		if (condition1 <= 1+EPSILON)
			return true;
		return false;

	}
	
	@Override
	public String toString() {
		String s = new String();
		DecimalFormat df = new DecimalFormat("0.0#");
		
		String h = df.format(this.getHauteur());
		String l = df.format(this.getLargeur());
		String p = df.format(this.perimetre());
		String aire = df.format(this.aire());
		
		
		s += "[Ellipse] : pos ";
		s += this.getPosition().toString();
		s += " dim ";
		s += l;
		s += " x ";
		s += h;
		s += " périmètre : ";
		s += p;
		s += " aire : ";
		s += aire;
		
		return s;
	}
	
}
