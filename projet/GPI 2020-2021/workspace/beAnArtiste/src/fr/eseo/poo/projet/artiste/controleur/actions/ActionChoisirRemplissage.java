package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirRemplissage extends javax.swing.AbstractAction {

	public static final String NOM_ACTION = "Remplissage";
	
	private PanneauDessin panneauDessin;
	
	public ActionChoisirRemplissage(PanneauDessin pd) {
		super(NOM_ACTION);
		this.panneauDessin = pd;
	}
	
	
	public void actionPerformed(ActionEvent event) {
		boolean mode = this.panneauDessin.getModeRemplissage();
		this.panneauDessin.setModeRemplissage(!mode);
	}
	
}
