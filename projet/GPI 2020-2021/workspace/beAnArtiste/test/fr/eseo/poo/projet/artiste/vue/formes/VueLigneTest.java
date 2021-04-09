package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import fr.eseo.poo.projet.artiste.modele.formes.*;
import fr.eseo.poo.projet.artiste.vue.ihm.*;
import fr.eseo.poo.projet.artiste.modele.*;

public class VueLigneTest {
	
	public VueLigneTest() {
		testConstructeur();
	}
	
	private void testConstructeur() {
		JFrame f = new JFrame("Test Dessin Trait");
		PanneauDessin p = new PanneauDessin(400,400,Color.WHITE);
		
		f.add(p);
		p.setVisible(true);
		p.setPreferredSize(new Dimension(500,500));
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		Ligne l = new Ligne(new Coordonnees(100,100),100,100);
		Ligne l2 = new Ligne(new Coordonnees(200,100),-100,100);
		VueLigne vf = new VueLigne(l);
		VueLigne vf2 = new VueLigne(l2);
		p.ajouterVueForme(vf);
		p.ajouterVueForme(vf2);
		
		f.pack();
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable	()
				{
			@Override
			public void run() {
				VueLigneTest vlt = new VueLigneTest();
			}
				});
		
	}
	
}
