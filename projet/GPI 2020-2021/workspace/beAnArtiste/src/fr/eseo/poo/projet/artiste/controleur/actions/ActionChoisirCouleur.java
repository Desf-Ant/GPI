package fr.eseo.poo.projet.artiste.controleur.actions;

import fr.eseo.poo.projet.artiste.vue.ihm.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JColorChooser;

public class ActionChoisirCouleur extends javax.swing.AbstractAction {
	
	public static final String NOM_ACTION = "Changer Color";
	
	private PanneauDessin panneauDessin;
	
	public ActionChoisirCouleur(PanneauDessin pd) {
		super(NOM_ACTION);
		this.panneauDessin = pd;
	}
	
	
	public void actionPerformed(ActionEvent event) {
		Color c = JColorChooser.showDialog(this.panneauDessin, 
				NOM_ACTION, 
				this.panneauDessin.getCouleurCourante());
		if (c != null)	
			this.panneauDessin.setCouleurCourante(c);
	}
}
