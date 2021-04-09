package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.*;
import fr.eseo.poo.projet.artiste.vue.formes.*;
import java.util.ArrayList;
import java.util.List;

public class PanneauDessin extends javax.swing.JPanel{
	public static final int LARGEUR_PAR_DEFAUT = 250;
	public static final int HAUTEUR_PAR_DEFAUT = 500;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.red;
	
	private final List<VueForme> vueFormes;
	
	public PanneauDessin() {
		Dimension d = new Dimension(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
		this.setPreferredSize(d);
		this.setBackground(COULEUR_FOND_PAR_DEFAUT);
		vueFormes = new ArrayList<>();
	}
	
	public PanneauDessin(int l, int h, Color c) {
		Dimension d = new Dimension(l,h);
		this.setPreferredSize(d);
		this.setBackground(c);
		vueFormes = new ArrayList<>();
	}
	
	public List<VueForme> getVueFormes() {
		return this.vueFormes;
	}
	
	public void ajouterVueForme(VueForme vf) {
		this.vueFormes.add(vf);
		this.repaint();
	}
	
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g.create();
		
		for (VueForme vf: this.vueFormes) {
			vf.affiche(g2d);
		}
		
		g2d.dispose();
		
	}
}
