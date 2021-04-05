package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.*;

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
	public void testConstructionCoordonnees() {
		Coordonnees c1 = new Coordonnees(1,1);
		Coordonnees c = new Coordonnees(c1);
		
		assertEquals(c.getAbscisse(),1,0.001);
		assertEquals(c.getOrdonnee(),1,0001);
	}
	
	@Test 
	public void testSetAbscisse() {
		Coordonnees c = new Coordonnees();
		c.setAbscisse(0);
		
		assertEquals(c.getAbscisse(),0,0.001);
	}
	
	@Test
	public void testSetOrdonnee() {
		Coordonnees c = new Coordonnees();
		c.setOrdonnee(0);
		
		assertEquals(c.getOrdonnee(),0,0.001);
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
	
	@Test
	public void testToString() {
		Coordonnees c1 = new Coordonnees();
		assertEquals(c1.toString(),"(0,0 , 0,0)");
	}
	
	@Test
	public void testDeplacer() {
		Coordonnees c = new Coordonnees();
		Coordonnees c1 = new Coordonnees(20,30);
		c.deplacer(c1);
		
		assertEquals(c.getAbscisse(),20,0.001);
		assertEquals(c.getOrdonnee(),30,0.001);
	}
	
	@Test
	public void testDeplacerVers() {
		Coordonnees c = new Coordonnees(1,2);
		c.deplacerVers(1, 1);
		
		assertEquals(c.getAbscisse(),1,0.001);
		assertEquals(c.getOrdonnee(),1,0.001);
	}
	
	@Test
	public void testAngleVers() {
		Coordonnees c1 = new Coordonnees(1,1);
		Coordonnees c2 = new Coordonnees(2,2);
		Coordonnees c3 = new Coordonnees(-1,-1);
		
		assertEquals(c1.angleVers(c2),0.7853,0.001);
		assertEquals(c1.angleVers(c3),-2.3561,0.001);
	}
	
}
