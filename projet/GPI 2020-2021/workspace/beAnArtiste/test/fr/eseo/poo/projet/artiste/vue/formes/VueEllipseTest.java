package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import fr.eseo.poo.projet.artiste.modele.formes.Ligne;
import fr.eseo.poo.projet.artiste.vue.ihm.PanneauDessin;
import fr.eseo.poo.projet.artiste.modele.formes.Ellipse;

public class VueEllipseTest {
	
	public VueEllipseTest() {
		dessinEllipse();
	}
	
	public void dessinEllipse() {
		JFrame f = new JFrame("Test Dessin Trait");
		PanneauDessin p = new PanneauDessin(400,400,Color.WHITE);
		
		f.add(p);
		p.setVisible(true);
		p.setPreferredSize(new Dimension(500,500));
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		
		Ellipse e = new Ellipse(new Coordonnees(100,100),400,200);
		Ellipse e2 = new Ellipse(new Coordonnees(100,100),200,400);
		e2.setRempli(true);
		VueEllipse ve = new VueEllipse(e);
		VueEllipse ve2 = new VueEllipse(e2);
		p.ajouterVueForme(ve);
		p.ajouterVueForme(ve2);
		
		f.pack();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable	()
		{
	@Override
	public void run() {
		VueEllipseTest vet = new VueEllipseTest();
	}
		});

	}

}
