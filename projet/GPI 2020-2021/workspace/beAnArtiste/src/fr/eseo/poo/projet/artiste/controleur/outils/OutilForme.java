package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import fr.eseo.poo.projet.artiste.vue.formes.*;
import java.awt.Point;


public abstract class OutilForme extends Outil{
	
	public OutilForme() {
		super();
	}

	
	@Override
	public void mousePressed(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		this.setDebut(new Coordonnees(x,y));
	}
	
	@Override
	public void mouseReleased(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		this.setFin(new Coordonnees(x,y));
		if (!(this.getDebut().equals(this.getFin()))) {
			this.getPanneauDessin().ajouterVueForme(this.creerVueForme());
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		int x = event.getX()+(int)Ligne.LARGEUR_PAR_DEFAUT;
		int y = event.getY()+(int)Ligne.HAUTEUR_PAR_DEFAUT;
		this.setFin(new Coordonnees(x,y));
		this.getPanneauDessin().ajouterVueForme(this.creerVueForme());
	}
	
	protected abstract VueForme creerVueForme();
	
}
