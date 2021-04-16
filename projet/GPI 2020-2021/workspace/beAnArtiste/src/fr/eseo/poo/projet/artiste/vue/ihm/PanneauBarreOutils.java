package fr.eseo.poo.projet.artiste.vue.ihm;

import fr.eseo.poo.projet.artiste.controleur.actions.*;
import javax.swing.ButtonGroup;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Dimension;

public class PanneauBarreOutils extends javax.swing.JPanel {
	
	private PanneauDessin panneauDessin;
	private JButton buttonSupp;
	private ButtonGroup buttonGroup;
	private JToggleButton buttonOutilLigne;
	private JToggleButton buttonOutilEllipse;
	private JToggleButton buttonOutilCercle;
	
	
	public PanneauBarreOutils(PanneauDessin pd) {
		this.panneauDessin = pd;
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setVisible(true);
		
		this.initComponents();
	}
	
	public void initComponents() {
		ActionEffacer actEff = new ActionEffacer(this.panneauDessin);
		
		// Creation du bouton Effacer
		buttonSupp = new JButton(actEff);
		buttonSupp.setName(ActionEffacer.NOM_ACTION);
		
		// Creation du groupe de bouton des Outils
		buttonGroup = new ButtonGroup();
		
		// Creation des ActoinChoisirForme pour les différents boutons outils
		ActionChoisirForme actionLigne = new ActionChoisirForme(this.panneauDessin,this,ActionChoisirForme.NOM_ACTION_LIGNE);
		ActionChoisirForme actionEllipse = new ActionChoisirForme(this.panneauDessin,this,ActionChoisirForme.NOM_ACTION_ELLIPSE);
		ActionChoisirForme actionCercle = new ActionChoisirForme(this.panneauDessin,this,ActionChoisirForme.NOM_ACTION_CERCLE);
		
		// Creation des boutons pour les différents outils
		buttonOutilLigne = new JToggleButton(actionLigne);
		buttonOutilEllipse = new JToggleButton(actionEllipse);
		buttonOutilCercle = new JToggleButton(actionCercle);
		buttonOutilLigne.setName("Ligne");
		buttonOutilEllipse.setName("Ellipse");
		buttonOutilCercle.setName("Cercle");
		
		// Ajout des boutons dans le button group pour qu'un seul ne puisse être activé
		buttonGroup.add(buttonOutilLigne);
		buttonGroup.add(buttonOutilEllipse);
		buttonGroup.add(buttonOutilCercle);
		
		
		this.panneauDessin.setPreferredSize(new Dimension(300,300));
		
		this.add(this.panneauDessin,BorderLayout.CENTER);
		this.add(buttonSupp,BorderLayout.EAST);
		this.add(buttonOutilLigne,BorderLayout.EAST);
		this.add(buttonOutilEllipse,BorderLayout.EAST);
		this.add(buttonOutilCercle,BorderLayout.EAST);
		
	}
	
}
