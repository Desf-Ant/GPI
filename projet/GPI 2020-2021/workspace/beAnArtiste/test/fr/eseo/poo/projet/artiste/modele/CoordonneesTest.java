package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class CoordonneesTest {

	@Test
	public void testConstructDefault() {
		Coordonnees c = new Coordonnees();
		
		assertEquals(0,c.getX(),0);
		assertEquals(0,c.getY(),0);
	}
	
	@Test
	public void testConstructNormal() {
		Coordonnees c = new Coordonnees(1,1);
		
		assertEquals(1,c.getX(),0);
		assertEquals(1,c.getY(),0);
	}
	
	@Test
	public void testDeplacerDe() {
		Coordonnees c = new Coordonnees();
		
		c.deplacerDe(1, 1);
		assertEquals(1,c.getX(),0);
		assertEquals(1,c.getY(),0);
	}
	
	@Test
	public void testDistanceVers() {
		Coordonnees c1 = new Coordonnees();
		Coordonnees c2 = new Coordonnees(1,1);
		
		assertEquals(1.41,c1.distanceVers(c2),0.01);
	}

}
