package fr.eseo.poo.projet.artiste.controleur.outils;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.*;
import fr.eseo.poo.projet.artiste.vue.formes.*;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class OutilSelectionner extends Outil {
	
	public static final String NOM_ACTION = "Select";

	private Forme formeSelectionnee;
	
	public OutilSelectionner() {
		super();
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		
		// On regarde dans toutes les vue formes contenues
		// en partant de la plus récentes si le point clické est contenue dans la forme
		for (int i = this.getPanneauDessin().getVueFormes().size()-1;i >= 0; i--) {
			
			VueForme vf = this.getPanneauDessin().getVueFormes().get(i);
			if (vf.getForme().contient(new Coordonnees(x,y))) {
				formeSelectionnee = vf.getForme();
				JOptionPane.showMessageDialog(this.getPanneauDessin(),
						this.formeSelectionnee.toString(),
						NOM_ACTION,
						JOptionPane.OK_OPTION);
				
				break;
			}
		}
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		
	}
	
	@Override
	public void mouseReleased(MouseEvent event) {
	
	}
		
	public VueForme creerVueForme() {
		return null;
	}
}
