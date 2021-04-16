package fr.eseo.poo.projet.artiste.vue.ihm;

import fr.eseo.poo.projet.artiste.controleur.actions.*;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.Dimension;

public class PanneauBarreOutils extends javax.swing.JPanel {
	
	private PanneauDessin panneauDessin;
	private JButton buttonSupp;
	private JButton buttonCouleur;
	private JCheckBox buttonRemplissage;
	private ButtonGroup buttonGroup;
	
	private JToggleButton buttonOutilLigne;
	private JToggleButton buttonOutilEllipse;
	private JToggleButton buttonOutilCercle;
	private JToggleButton buttonOutilSelectionner;
	
	
	public PanneauBarreOutils(PanneauDessin pd) {
		this.panneauDessin = pd;
		
		this.setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));	//, BoxLayout.X_AXIS
		this.setVisible(true);
		
		this.initComponents();
	}
	
	public void initComponents() {
		ActionEffacer actEff = new ActionEffacer(this.panneauDessin);
		ActionChoisirCouleur actCouleur = new ActionChoisirCouleur(this.panneauDessin);
		ActionChoisirRemplissage actRemplissage = new ActionChoisirRemplissage(this.panneauDessin);
		
		// Creation du bouton Effacer
		buttonSupp = new JButton(actEff);
		buttonSupp.setName(ActionEffacer.NOM_ACTION);
		
		// Creation du bouton Choisir Couleur
		buttonCouleur = new JButton(actCouleur);
		buttonCouleur.setName(ActionChoisirCouleur.NOM_ACTION);
		
		// Creation du bouton Choisir Remplissage
		buttonRemplissage = new JCheckBox(actRemplissage);
		buttonRemplissage.setName(ActionChoisirRemplissage.NOM_ACTION);
		
		// Creation du groupe de bouton des Outils
		buttonGroup = new ButtonGroup();
		
		// Creation des ActoinChoisirForme pour les différents boutons outils
		ActionChoisirForme actionLigne = new ActionChoisirForme(this.panneauDessin,this,ActionChoisirForme.NOM_ACTION_LIGNE);
		ActionChoisirForme actionEllipse = new ActionChoisirForme(this.panneauDessin,this,ActionChoisirForme.NOM_ACTION_ELLIPSE);
		ActionChoisirForme actionCercle = new ActionChoisirForme(this.panneauDessin,this,ActionChoisirForme.NOM_ACTION_CERCLE);
		ActionSelectionner actionSelectionner = new ActionSelectionner(this.panneauDessin);
		
		// Creation des boutons pour les différents outils
		buttonOutilLigne = new JToggleButton(actionLigne);
		buttonOutilEllipse = new JToggleButton(actionEllipse);
		buttonOutilCercle = new JToggleButton(actionCercle);
		buttonOutilSelectionner = new JToggleButton(actionSelectionner);
		buttonOutilLigne.setName("Ligne");
		buttonOutilEllipse.setName("Ellipse");
		buttonOutilCercle.setName("Cercle");
		buttonOutilSelectionner.setName("Select");
		
		// Ajout des boutons dans le button group pour qu'un seul ne puisse être activé
		buttonGroup.add(buttonOutilLigne);
		buttonGroup.add(buttonOutilEllipse);
		buttonGroup.add(buttonOutilCercle);
		buttonGroup.add(buttonOutilSelectionner);
		
		
		this.panneauDessin.setPreferredSize(new Dimension(300,300));
		
		this.add(this.panneauDessin,BorderLayout.CENTER);
		this.add(buttonSupp,BorderLayout.EAST);
		this.add(buttonCouleur,BorderLayout.EAST);
		this.add(buttonRemplissage,BorderLayout.EAST);
		this.add(buttonOutilSelectionner,BorderLayout.EAST);
		this.add(buttonOutilLigne,BorderLayout.EAST);
		this.add(buttonOutilEllipse,BorderLayout.EAST);
		this.add(buttonOutilCercle,BorderLayout.EAST);
		
	}
	
}
