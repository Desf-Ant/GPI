package fr.eseo.poo.projet.artiste.controleur.actions;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.controleur.outils.OutilLigne;
import fr.eseo.poo.projet.artiste.vue.ihm.*;

public class ActionEffacerTest {

	public ActionEffacerTest() {
		this.testSupp();
	}
	
	public void testSupp() {
		JFrame f = new JFrame("be an artist");
		PanneauDessin p = new PanneauDessin(700,700,Color.WHITE);
		PanneauBarreOutils po = new PanneauBarreOutils(p);
		OutilLigne ol = new OutilLigne();
		
		p.associerOutil(ol);
		f.add(po);
		
		po.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setPreferredSize(new Dimension(800,800));
		f.setVisible(true);
		f.pack();
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable	()
				{
			@Override
			public void run() {
				ActionEffacerTest aft = new ActionEffacerTest();
			}
				});
		
	}
	
}
