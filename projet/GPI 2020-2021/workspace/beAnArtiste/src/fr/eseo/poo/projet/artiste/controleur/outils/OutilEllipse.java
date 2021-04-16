package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Cercle;
import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;
import fr.eseo.poo.projet.artiste.vue.formes.VueEllipse;

public class OutilEllipse extends OutilForme {
	
	private int xD;
	private int yD;
	
	public OutilEllipse() {
		super();
	}
	
	@Override
	protected VueForme creerVueForme() {
		double largeur = this.getFin().getAbscisse() - this.getDebut().getAbscisse();
		double longueur = this.getFin().getOrdonnee() - this.getDebut().getOrdonnee();
		Ellipse e = new Ellipse(this.getDebut(),largeur,longueur);
		e.setCouleur(this.getPanneauDessin().getCouleurCourante());
		e.setRempli(this.getPanneauDessin().getModeRemplissage());
		System.out.println(e);
		return new VueEllipse(e);
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			int x = event.getX()+(int)Ellipse.LARGEUR_PAR_DEFAUT;
			int y = event.getY()+(int)Ellipse.HAUTEUR_PAR_DEFAUT;
			this.setFin(new Coordonnees(x,y));
			this.getPanneauDessin().ajouterVueForme(this.creerVueForme());
		}
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		this.xD = event.getX();
		this.yD = event.getY();
		this.setDebut(new Coordonnees(xD,yD));
	}
	
	@Override
	public void mouseReleased(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		
		if(x > xD && y > yD) {
			this.setDebut(new Coordonnees(xD,yD));
			this.setFin(new Coordonnees(x,y));
		}
		else if (x > xD && y < yD) {
			this.setDebut(new Coordonnees(xD,y));
			this.setFin(new Coordonnees(x,yD));
		}
		else if (x < xD && y > yD) {
			this.setDebut(new Coordonnees(x,yD));
			this.setFin(new Coordonnees(xD,y));
		}
		else if (x < xD && y < yD) {
			this.setDebut(new Coordonnees(x,y));
			this.setFin(new Coordonnees(xD,yD));
		}
		
		if (!(this.getDebut().equals(this.getFin()))) {
			this.getPanneauDessin().ajouterVueForme(this.creerVueForme());
		}
		
	}
	
}
