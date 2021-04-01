package fr.eseo.poo.projet.artiste.modele.ModeleTests;

import static org.junit.Assert.*;
import fr.eseo.poo.projet.artiste.modele.Coordonnees;
import org.junit.Test;


public class CoordonneesTest {

	@Test
	public void testConstructDefault() {
		Coordonnees c = new Coordonnees();
		
		assertEquals(0,c.getAbscisse(),0);
		assertEquals(0,c.getOrdonnee(),0);
	}
	
	@Test
	public void testConstructNormal() {
		Coordonnees c = new Coordonnees(1,1);
		
		assertEquals(1,c.getAbscisse(),0);
		assertEquals(1,c.getOrdonnee(),0);
	}
	
	@Test
	public void testDeplacerDe() {
		Coordonnees c = new Coordonnees();
		
		c.deplacerDe(1, 1);
		assertEquals(1,c.getAbscisse(),0);
		assertEquals(1,c.getOrdonnee(),0);
	}
	
	@Test
	public void testDistanceVers() {
		Coordonnees c1 = new Coordonnees();
		Coordonnees c2 = new Coordonnees(1,1);
		
		assertEquals(1.41,c1.distanceVers(c2),0.01);
	}

}
