package fr.eseo.poo.projet.artiste.controleur.outils;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilLigneTest {
	
	public OutilLigneTest() {
		this.testLigne();
	}
	
	public void testLigne() {
		JFrame f = new JFrame("be an artist");
		PanneauDessin p = new PanneauDessin(400,400,Color.WHITE);
		OutilLigne ol = new OutilLigne();
		
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
				OutilLigneTest olt = new OutilLigneTest();
			}
				});
		
	}
}
