package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;

public class VueEllipse extends VueForme {
	
	public VueEllipse(Ellipse e) {
		super(e);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Ellipse e = (Ellipse)this.getForme();
		int x = (int)e.getPosition().getAbscisse();
		int y = (int)e.getPosition().getOrdonnee();
		int w = (int)e.getLargeur();
		int h = (int)e.getHauteur();
		
		
		g2d.draw(new Ellipse2D.Double(x,y,w,h));
	}
}
