package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Forme;

public abstract class VueForme {
	
	protected final Forme forme;

	public VueForme(Forme f) {
		this.forme = f;
	}
	
	public Forme getForme() {
		return forme;
	}
	
	public abstract void affiche(Graphics2D g2d);
}
