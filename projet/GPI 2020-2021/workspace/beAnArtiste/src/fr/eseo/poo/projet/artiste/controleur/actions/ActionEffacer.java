package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;
import fr.eseo.poo.projet.artiste.vue.ihm.*;
import javax.swing.JOptionPane;

public class ActionEffacer extends javax.swing.AbstractAction{

	public static final	String NOM_ACTION = "Effacer Tout";
	private PanneauDessin panneauDessin;
	
	public ActionEffacer(PanneauDessin p) {
		super(NOM_ACTION);
		this.panneauDessin = p;
	}
	
	public void actionPerformed(ActionEvent actEvent) {
		int r =JOptionPane.showConfirmDialog(this.panneauDessin,"Voulez vous vraiment tout supprimer ?",NOM_ACTION,JOptionPane.YES_NO_OPTION);
		if (r == 0) {
			this.panneauDessin.getVueFormes().clear();
			this.panneauDessin.repaint();
		}
	}
	
}
