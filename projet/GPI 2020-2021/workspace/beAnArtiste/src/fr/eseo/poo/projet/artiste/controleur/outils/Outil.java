package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.modele.*;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;
import fr.eseo.poo.projet.artiste.vue.ihm.*;
import java.awt.event.MouseEvent;

public abstract class Outil implements javax.swing.event.MouseInputListener {
	
	private Coordonnees debut;
	private Coordonnees fin;
	private PanneauDessin panneauDessin;
	
	public Outil() {
		super();
		this.setPanneauDessin(new PanneauDessin());
	}
	
	public Coordonnees getDebut() {
		return this.debut;
	}
	
	public Coordonnees getFin() {
		return this.fin;
	}
	
	public PanneauDessin getPanneauDessin() {
		return this.panneauDessin;
	}
	
	public void setDebut(Coordonnees c) {
		this.debut = c;
	}
	
	public void setFin(Coordonnees c) {
		this.fin = c;
	}
	
	public void setPanneauDessin(PanneauDessin pd) {
		this.panneauDessin = pd;
	}
	
	public void mouseClicked(MouseEvent event) {
		
	}
	
	public void mouseDragged(MouseEvent event) {
		
	}
	
	public void mouseEntered(MouseEvent event) {
		
	}
	
	public void mouseExited(MouseEvent event) {
		
	}
	
	public void mouseMoved(MouseEvent event) {
		
	}
	
	public void mousePressed(MouseEvent event) {
		
	}
	
	public void mouseReleased(MouseEvent event) {
		
	}
	
	protected abstract VueForme creerVueForme();
	
}
