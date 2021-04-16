package fr.eseo.poo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.util.Locale;

import fr.eseo.poo.projet.artiste.modele.*;

public class Cercle extends Ellipse{
	
	public Cercle() {
		super();
	}
	public Cercle(Coordonnees c) {
		super(c);
	}
	public Cercle(double t) {
		super(t,t);
	}
	public Cercle(Coordonnees c, double t) {
		super(c,t,t);
	}
	public Cercle(Coordonnees c ,double l, double h) {
		super(c,l,h);
			
	}
	
	@Override
	public double perimetre() {
		return 2*Math.PI*this.a;
	}
	
	@Override
	public double aire() {
		return Math.PI*Math.pow(this.a, 2);
	}
	
	@Override
	public void setHauteur(double t) {
		if (t<0) 
			throw new IllegalArgumentException("You can't put negative input");		
		this.hauteur = t;
		this.largeur = t;
	}
	
	@Override
	public void setLargeur(double t) {
		if (t<0) 
			throw new IllegalArgumentException("You can't put negative input");
		this.hauteur = t;
		this.largeur = t;
	}
	
	@Override
	public String toString() {
		String s = new String();
		DecimalFormat df = new DecimalFormat("0.0#");
		
		String h = df.format(this.getHauteur());
		String l = df.format(this.getLargeur());
		String p = df.format(this.perimetre());
		String aire = df.format(this.aire());
		
		int r = this.getCouleur().getRed();
		int g = this.getCouleur().getGreen();
		int b = this.getCouleur().getBlue();
		String couleur = "R"+r+",G"+g+",B"+b;
		
		String formeRemplie = new String();
		
		if (this.estRempli()) {
			formeRemplie = "-Rempli";
		}

		Locale langue = Locale.getDefault();
		if (langue.getLanguage().equals(new Locale("fr").getLanguage())) {
			couleur = couleur.replace('G', 'V');
		}
		
		
		s += "[Cercle"+formeRemplie+"] : pos ";
		s += this.getPosition().toString();
		s += " dim ";
		s += l;
		s += " x ";
		s += h;
		s += " périmètre : ";
		s += p;
		s += " aire : ";
		s += aire;
		s += " couleur = ";
		s += couleur;
		
		return s;
	}
	
	
}
