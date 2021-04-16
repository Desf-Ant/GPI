package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Cercle;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import fr.eseo.poo.projet.artiste.vue.formes.VueCercle;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;
import java.awt.event.MouseEvent;

public class OutilCercle extends OutilForme {
	
	private int xD;
	private int yD;

	public OutilCercle() {
		super();
	}
	
	@Override
	protected VueForme creerVueForme() {
		double largeur = this.getFin().getAbscisse() - this.getDebut().getAbscisse();
		double longueur = this.getFin().getOrdonnee() - this.getDebut().getOrdonnee();
		if (largeur == 0)
			largeur = (int)Cercle.LARGEUR_PAR_DEFAUT;
		if (longueur == 0)
			longueur = (int)Cercle.LARGEUR_PAR_DEFAUT;
		Cercle c = new Cercle(this.getDebut(),largeur,longueur);
		c.setCouleur(this.getPanneauDessin().getCouleurCourante());
		System.out.println(c);
		return new VueCercle(c);
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			int x = event.getX();
			int y = event.getY();
			this.setDebut(new Coordonnees(x,y));
			this.setFin(new Coordonnees(x+(int)Cercle.LARGEUR_PAR_DEFAUT,y+(int)Cercle.LARGEUR_PAR_DEFAUT));
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
		
		int xPos;
		int yPos;
		int dist;
		

		if (Math.abs(x-xD) <Math.abs(yD-y))
			dist = Math.abs(yD-y);
		else 
			dist = Math.abs(x-xD);

		if (x <= xD)
			xPos = xD-dist;
		else 
			xPos = xD;
		
		if (y <= yD)
			yPos = yD-dist;
		else
			yPos = yD;
		
		this.setDebut(new Coordonnees(xPos,yPos));
		this.setFin(new Coordonnees(xPos + dist,yPos + dist));
		
		
		if (!(this.getDebut().equals(this.getFin()))) {
			this.getPanneauDessin().ajouterVueForme(this.creerVueForme());
			}
		}
	
}
