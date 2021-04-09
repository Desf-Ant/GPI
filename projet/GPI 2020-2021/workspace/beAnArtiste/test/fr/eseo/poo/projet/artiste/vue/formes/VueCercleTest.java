package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Cercle;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class VueCercleTest {
	
	public VueCercleTest() {
		dessinCercle();
	}
	
	public void dessinCercle() {
		JFrame f = new JFrame("Test Dessin Trait");
		PanneauDessin p = new PanneauDessin(400,400,Color.WHITE);
		
		f.add(p);
		p.setVisible(true);
		p.setPreferredSize(new Dimension(500,500));
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		Cercle c = new Cercle(new Coordonnees(100,100),400);
		Cercle c2 = new Cercle(new Coordonnees(100,100),200);
		VueCercle vc = new VueCercle(c);
		VueCercle vc2 = new VueCercle(c2);
		p.ajouterVueForme(vc);
		p.ajouterVueForme(vc2);
		
		f.pack();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable	()
		{
	@Override
	public void run() {
		VueCercleTest vct = new VueCercleTest();
	}
		});

	}

}
