package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.vue.formes.*;
import java.awt.Color;
import fr.eseo.poo.projet.artiste.modele.formes.*;

public class OutilLigne extends OutilForme {
	
	public OutilLigne() {
		super();
	}
	
	protected VueForme creerVueForme() {
		
		// Dessine et retourne la vueLigne
		double largeur = this.getFin().getAbscisse() - this.getDebut().getAbscisse();
		double longueur = this.getFin().getOrdonnee() - this.getDebut().getOrdonnee();
		Ligne l = new Ligne(this.getDebut(),largeur,longueur);
		l.setCouleur(this.getPanneauDessin().getCouleurCourante());
		System.out.println(l);
		return new VueLigne(l);
	}
}
