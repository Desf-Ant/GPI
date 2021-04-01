package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class TestLigne {

	@Test
	public void testNormalConstructeur() {
		Coordonnees c = new Coordonnees();
		Ligne l = new Ligne(c,3,5);
		
		assertEquals(c,l.getPosition());
		assertEquals(3,l.getLargeur(),0.0001);
		assertEquals(5,l.getHauteur(),0.0001);
	}
	
	@Test
	public void testNormalConstructeurNegatif() {
		Ligne l = new Ligne(new Coordonnees(1,1),-6,-7);
		
		assertEquals(1,l.getPosition().getAbscisse(),0.001);
		assertEquals(1,l.getPosition().getOrdonnee(),0.001);
		assertEquals(-6,l.getLargeur(),0.001);
		assertEquals(-7,l.getHauteur(),0.001);
		assertEquals(-5,l.getC2().getAbscisse(),0.001);
		assertEquals(-6,l.getC2().getOrdonnee(),0.001);
		
		Ligne l1 = new Ligne(new Coordonnees(1,2),-2,3);
		assertEquals(1,l1.getPosition().getAbscisse(),0.001);
		assertEquals(2,l1.getPosition().getOrdonnee(),0.001);
		assertEquals(-2,l1.getLargeur(),0.001);
		assertEquals(3,l1.getHauteur(),0.001);
		assertEquals(-1,l1.getC2().getAbscisse(),0.001);
		assertEquals(5,l1.getC2().getOrdonnee(),0.001);
	}
	
	@Test
	public void testSansCoordConstructeur() {
		Ligne l = new Ligne(3,5);
		
		assertEquals(0,l.getPosition().getAbscisse(),0.001);
		assertEquals(0,l.getPosition().getOrdonnee(),0.001);
		assertEquals(3,l.getLargeur(),0.0001);
		assertEquals(5,l.getHauteur(),0.0001);
	}
	
	@Test
	public void testSansLHConstructeur() {
		Coordonnees c = new Coordonnees();
		Ligne l = new Ligne(c);
		
		assertEquals(c,l.getPosition());
		assertEquals(Ligne.LARGEUR_PAR_DEFAUT,l.getLargeur(),0.001);
		assertEquals(Ligne.HAUTEUR_PAR_DEFAUT,l.getHauteur(),0.001);
	}
	
	@Test
	public void testSansRienConstructeur() {
		Ligne l = new Ligne();
		
		assertEquals(Ligne.LARGEUR_PAR_DEFAUT,l.getLargeur(),0.001);
		assertEquals(Ligne.HAUTEUR_PAR_DEFAUT,l.getHauteur(),0.001);
	}
	
	@Test
	public void testGetC1() {
		Coordonnees c = new Coordonnees(1,2);
		Ligne l = new Ligne(c,1,2);
		
		Coordonnees c1 = l.getC1();
		assertEquals(1,c1.getAbscisse(),0.001);
		assertEquals(2,c1.getOrdonnee(),0.001);
	}
	
	@Test
	public void testGetC2() {
		Ligne l = new Ligne(1,2);
		Coordonnees c = l.getC2();
		
		assertEquals(1,c.getAbscisse(),0.001);
		assertEquals(2,c.getOrdonnee(),0.001);
	}
	
	@Test
	public void testGetC2_2() {
		Coordonnees c = new Coordonnees(2,2);
		Ligne l = new Ligne(c,0,2);
		
		Coordonnees c2 = l.getC2();
		assertEquals(2,c2.getAbscisse(),0.001);
		assertEquals(4,c2.getOrdonnee(),0.001);
	}
	
	@Test 
	public void testSetPosition() {
		Ligne l = new Ligne(new Coordonnees(1,1),5,4);
		
		Coordonnees c2 = l.getC2();
		assertEquals(6,c2.getAbscisse(),0.001);
		assertEquals(5,c2.getOrdonnee(),0.001);
		
		Coordonnees c = new Coordonnees(1,0);
		l.setPosition(c);
		assertEquals(c,l.getPosition());
		assertEquals(6,l.getC2().getAbscisse(),0.001);
		assertEquals(4,l.getC2().getOrdonnee(),0.001);
		
		c.deplacer(new Coordonnees(-1,-1));
		l.setPosition(c);
		assertEquals(c,l.getPosition());
		assertEquals(4,l.getC2().getAbscisse(),0.001);
		assertEquals(3,l.getC2().getOrdonnee(),0.001);
	}
	
	@Test
	public void testSetC1() {
		Ligne l = new Ligne(new Coordonnees(1,1),1,1);
		
		l.setC1(new Coordonnees());
		assertEquals(0,l.getC1().getAbscisse(),0.001);
		assertEquals(0,l.getC1().getOrdonnee(),0.001);
		assertEquals(2,l.getC2().getAbscisse(),0.001);
		assertEquals(2,l.getC2().getOrdonnee(),0.001);
		assertEquals(2,l.getLargeur(),0.001);
		assertEquals(2,l.getHauteur(),0.001);
	}
	
	@Test 
	public void testSetC2() {
		Ligne l = new Ligne(new Coordonnees(1,1),1,1);
		
		l.setC2(new Coordonnees(3,2));
		assertEquals(3,l.getC2().getAbscisse(),0.001);
		assertEquals(2,l.getC2().getOrdonnee(),0.001);
		assertEquals(2,l.getLargeur(),0.001);
		assertEquals(1,l.getHauteur(),0.001);
		
		l.setC2(new Coordonnees());
		assertEquals(0,l.getC2().getAbscisse(),0.001);
		assertEquals(0,l.getC2().getOrdonnee(),0.001);
		assertEquals(-1,l.getLargeur(),0.001);
		assertEquals(-1,l.getHauteur(),0.001);
	}
	
	@Test
	public void testGetCadreMinX() {
		Ligne l = new Ligne(1,2);
		assertEquals(0,l.getCadreMinX(),0.001);
		
		Ligne l2 = new Ligne(new Coordonnees(1,2),-2,3);
		assertEquals(-1,l2.getCadreMinX(),0.001);
		
		Ligne l3 = new Ligne(0,3);
		assertEquals(0,l3.getCadreMinX(),0.001);
	}
	
	@Test 
	public void testGetCadreMinY() {
		Ligne l = new Ligne(1,3);
		assertEquals(0,l.getCadreMinY(),0.001);
		
		Ligne l2 = new Ligne(1,-2);
		assertEquals(-2,l2.getCadreMinY(),0.001);
		
		Ligne l3 = new Ligne(3,0);
		assertEquals(0,l3.getCadreMinY(),0.001);
	}
	
	@Test
	public void testGetCadreMaxX() {
		Ligne l = new Ligne(1,2);
		assertEquals(1,l.getCadreMaxX(),0.001);
		
		Ligne l2 = new Ligne(new Coordonnees(1,2),-2,3);
		assertEquals(1,l2.getCadreMaxX(),0.001);
		
		Ligne l3 = new Ligne(0,3);
		assertEquals(0,l3.getCadreMaxX(),0.001);
	}
	
	@Test 
	public void testGetCadreMaxY() {
		Ligne l = new Ligne(1,3);
		assertEquals(3,l.getCadreMaxY(),0.001);
		
		Ligne l2 = new Ligne(1,-2);
		assertEquals(0,l2.getCadreMaxY(),0.001);
		
		Ligne l3 = new Ligne(3,0);
		assertEquals(0,l3.getCadreMaxY(),0.001);
	}
	
	@Test
	public void testDeplacerVers() {
		Ligne l = new Ligne(2,2);
		l.deplacerVers(new Coordonnees(1,2));
		
		assertEquals(1,l.getPosition().getAbscisse(),0.001);
		assertEquals(2,l.getPosition().getOrdonnee(),0.001);
		assertEquals(3,l.getC2().getAbscisse(),0.001);
		assertEquals(4,l.getC2().getOrdonnee(),0.001);
		
		l.deplacerVers(new Coordonnees(-1,-2));
		assertEquals(-1,l.getPosition().getAbscisse(),0.001);
		assertEquals(-2,l.getPosition().getOrdonnee(),0.001);
		assertEquals(1,l.getC2().getAbscisse(),0.001);
		assertEquals(0,l.getC2().getOrdonnee(),0.001);
	}
	
	@Test 
	public void testDeplacerDe() {
		Ligne l = new Ligne(1,2);
		l.deplacerDe(9, 10);
		
		assertEquals(9,l.getPosition().getAbscisse(),0.001);
		assertEquals(10,l.getPosition().getOrdonnee(),0.001);
		assertEquals(10,l.getC2().getAbscisse(),0.001);
		assertEquals(12,l.getC2().getOrdonnee(),0.001);
		
		l.deplacerDe(-4, -1);
		assertEquals(5,l.getPosition().getAbscisse(),0.001);
		assertEquals(9,l.getPosition().getOrdonnee(),0.001);
		assertEquals(6,l.getC2().getAbscisse(),0.001);
		assertEquals(11,l.getC2().getOrdonnee(),0.001);
	}
	
	@Test
	public void testAire() {
		Ligne l = new Ligne();
		assertEquals(0,l.aire(),0.001);
	}
	
	@Test
	public void testPerimetre() {
		Ligne l = new Ligne(1,1);
		assertEquals(1.41,l.perimetre(),0.01);
		
		Ligne l2 = new Ligne(-1,-1);
		assertEquals(1.41,l2.perimetre(),0.01);
		
		Ligne l3 = new Ligne(0,0);
		assertEquals(0,l3.perimetre(),0.001);
	}

}
