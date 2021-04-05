package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.*;

public class PanneauDessin extends javax.swing.JPanel{
	public static final int LARGEUR_PAR_DEFAUT = 250;
	public static final int HAUTEUR_PAR_DEFAUT = 500;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.red;
	
	public PanneauDessin() {
		Dimension d = new Dimension(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
		this.setPreferredSize(d);
		this.setBackground(COULEUR_FOND_PAR_DEFAUT);
	}
	
	public PanneauDessin(int l, int h, Color c) {
		Dimension d = new Dimension(l,h);
		this.setPreferredSize(d);
		this.setBackground(c);
	}
}
