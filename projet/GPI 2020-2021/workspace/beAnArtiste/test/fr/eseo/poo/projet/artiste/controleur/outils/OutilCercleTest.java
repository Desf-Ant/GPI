package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilCercleTest {

	public OutilCercleTest() {
		this.testCercle();
	}
	
	public void testCercle() {
		JFrame f = new JFrame("be an artist");
		PanneauDessin p = new PanneauDessin(400,400,Color.WHITE);
		OutilCercle ol = new OutilCercle();
		
		p.associerOutil(ol);
		f.add(p);
		
		p.setVisible(true);
		p.setPreferredSize(new Dimension(500,500));
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.pack();
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable	()
				{
			@Override
			public void run() {
				OutilCercleTest olt = new OutilCercleTest();
			}
				});
	}
	
}
