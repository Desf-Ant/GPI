package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.controleur.actions.ActionEffacerTest;
import fr.eseo.poo.projet.artiste.controleur.outils.OutilLigne;

public class PanneauBarreOutilsTest {
	
	public PanneauBarreOutilsTest() {
		this.testAllButton();
	}
	
	public void testAllButton() {
		JFrame f = new JFrame("be an artist");
		PanneauDessin p = new PanneauDessin(50,500,Color.WHITE);
		PanneauBarreOutils po = new PanneauBarreOutils(p);
		OutilLigne ol = new OutilLigne();
		
		p.associerOutil(ol);
		f.add(po);
		
		po.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setPreferredSize(new Dimension(600,600));
		f.setVisible(true);
		f.pack();
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable	()
				{
			@Override
			public void run() {
				PanneauBarreOutilsTest pbot = new PanneauBarreOutilsTest();
			}
				});
		
	}
}
