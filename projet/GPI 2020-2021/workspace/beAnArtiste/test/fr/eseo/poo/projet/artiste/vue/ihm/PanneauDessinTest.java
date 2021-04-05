package fr.eseo.poo.projet.artiste.vue.ihm;

import javax.swing.SwingUtilities;

public class PanneauDessinTest {
	
	public void panneauDessinTest() {
		testPanneaux();
	}
	
	public void testPanneaux() {
		// Mon code de test
	}
	
	public void testConstructeurParDefaut() {
		// d'autres test maybe
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable	()
				{
			@Override
			public void run() {
				new PanneauDessinTest();
			}
				});
		
	}
	
}
