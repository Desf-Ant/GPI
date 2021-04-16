package fr.eseo.poo.projet.artiste.controleur.actions;

import fr.eseo.poo.projet.artiste.vue.ihm.*;
import java.awt.event.ActionEvent;
import fr.eseo.poo.projet.artiste.controleur.outils.*;

public class ActionChoisirForme extends javax.swing.AbstractAction{
	
	public static final String NOM_ACTION_LIGNE = "Ligne";
	public static final String NOM_ACTION_ELLIPSE = "Ellipse";
	public static final String NOM_ACTION_CERCLE = "Cercle";
	
	private PanneauDessin panneauDessin;
	private PanneauBarreOutils panneauBarreOutils;
	
	public ActionChoisirForme(PanneauDessin pd, PanneauBarreOutils po, String nom) {
		super(nom);
		this.panneauDessin = pd;
		this.panneauBarreOutils = po;
	}
	
	public void actionPerformed(ActionEvent event) {
		String r = event.getActionCommand();
		if (r.equals(NOM_ACTION_LIGNE)) {
			OutilLigne ol = new OutilLigne();
			this.panneauDessin.associerOutil(ol);
		}
		else if (r.equals(NOM_ACTION_ELLIPSE)) {
			OutilEllipse oe = new OutilEllipse();
			this.panneauDessin.associerOutil(oe);
		}
		else if (r.equals(NOM_ACTION_CERCLE)) {
			OutilCercle oc = new OutilCercle();
			this.panneauDessin.associerOutil(oc);
		}
	}

}
