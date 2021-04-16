package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;
import fr.eseo.poo.projet.artiste.controleur.outils.OutilSelectionner;
import fr.eseo.poo.projet.artiste.vue.ihm.*;

public class ActionSelectionner extends javax.swing.AbstractAction{
	
	public final static String NOM_ACTION = "Select";
	
	private PanneauDessin panneauDessin;
	
	
	public ActionSelectionner(PanneauDessin pd) {
		super(NOM_ACTION);
		this.panneauDessin = pd;
	}
	
	public void actionPerformed(ActionEvent event) {
		OutilSelectionner os = new OutilSelectionner();
		this.panneauDessin.associerOutil(os);
	}
}
