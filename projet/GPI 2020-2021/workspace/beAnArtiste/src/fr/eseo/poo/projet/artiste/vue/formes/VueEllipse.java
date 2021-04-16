package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;

public class VueEllipse extends VueForme {
	
	private Color couleurSave;
	private Color couleurCourante;
	
	public VueEllipse(Ellipse e) {
		super(e);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		
		// Gestion de la couleur
		couleurSave = g2d.getColor();
		couleurCourante = this.getForme().getCouleur();
		g2d.setColor(couleurCourante);
		couleurCourante = couleurSave;

		// Dessin de l'Ellipse
		Ellipse e = (Ellipse)this.getForme();
		int x = (int)e.getPosition().getAbscisse();
		int y = (int)e.getPosition().getOrdonnee();
		int w = (int)e.getLargeur();
		int h = (int)e.getHauteur();
		
		
		g2d.draw(new Ellipse2D.Double(x,y,w,h));
	}
}
