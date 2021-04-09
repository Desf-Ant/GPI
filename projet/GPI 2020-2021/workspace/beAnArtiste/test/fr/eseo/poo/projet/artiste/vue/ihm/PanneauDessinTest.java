package fr.eseo.poo.projet.artiste.vue.ihm;

import javax.swing.*;
import java.awt.Color;

import javax.swing.SwingUtilities;
import java.awt.*;

public class PanneauDessinTest {
	
	public PanneauDessinTest() {
		System.out.println("Effectue test");
		testConstructeur();
		testConstructeurParDefaut();
	}
	
	private void testConstructeur() {
		JFrame f = new JFrame("Blues du Businessman");
		PanneauDessin p = new PanneauDessin(400,400,Color.blue);
		
		f.add(p);
		
		p.setVisible(true);
		p.setPreferredSize(new Dimension(500,500));
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.pack();
	}
	
	private void testConstructeurParDefaut() {
		JFrame f = new JFrame("Etre un Artiste");
		PanneauDessin p = new PanneauDessin();
		
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
				PanneauDessinTest pdt = new PanneauDessinTest();
			}
				});
		
	}
	
}
