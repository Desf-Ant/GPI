package fr.eseo.poo.projet.artiste.vue.formes;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import java.awt.Graphics2D;
import java.awt.Color;

public class VueLigne extends VueForme {
	
	private Color couleurSave;
	private Color couleurCourante;
	
	public VueLigne(Ligne l) {
		super(l);
	}
	
	@Override
	public void affiche(Graphics2D g2d) {
		Ligne l = (Ligne)this.getForme();
		
		// Gestion de la couleur
		couleurSave = g2d.getColor();
		couleurCourante = l.getCouleur();
		g2d.setColor(couleurCourante);
		couleurCourante = couleurSave;
		
		
		// Dessin de la ligne	
		int xD = (int)l.getC1().getAbscisse();
		int yD = (int)l.getC1().getOrdonnee();
		int xA = (int)l.getC2().getAbscisse();
		int yA = (int)l.getC2().getOrdonnee();
		g2d.drawLine(xD, yD, xA, yA);
		
	}
}
