package fr.eseo.poo.projet.artiste.vue.formes;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import java.awt.Graphics2D;

public class VueLigne extends VueForme {
	
	public VueLigne(Ligne l) {
		super(l);
	}
	
	@Override
	public void affiche(Graphics2D g2d) {
		Ligne l = this.getForme();
		int xD = (int)l.getC1();
		int yD = (int)this.forme;
	}

}
