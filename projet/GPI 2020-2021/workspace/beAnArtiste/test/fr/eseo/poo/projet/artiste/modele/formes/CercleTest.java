package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.*;
import fr.eseo.poo.projet.artiste.modele.*;
import org.junit.Test;

public class CercleTest {

	@Test
	public void testConstructeurDefaut() {
		Cercle c = new Cercle();
		
		assertEquals(Forme.HAUTEUR_PAR_DEFAUT,c.getHauteur(),0.001);
		assertEquals(Forme.LARGEUR_PAR_DEFAUT,c.getLargeur(),0.001);
	}

	
	@Test
	public void testConstructeurCoord() {
		Cercle c = new Cercle(new Coordonnees(5,5));
		
		assertEquals(Forme.HAUTEUR_PAR_DEFAUT,c.getHauteur(),0.001);
		assertEquals(Forme.LARGEUR_PAR_DEFAUT,c.getLargeur(),0.001);
		assertEquals(5,c.getPosition().getAbscisse(),0.001);
		assertEquals(5,c.getPosition().getOrdonnee(),0.001);
	}
	
	@Test
	public void testConstructeurCoordDouble() {
		Cercle c = new Cercle(new Coordonnees(5,5),5);
		
		assertEquals(5,c.getHauteur(),0.001);
		assertEquals(5,c.getLargeur(),0.001);
		assertEquals(5,c.getPosition().getAbscisse(),0.001);
		assertEquals(5,c.getPosition().getOrdonnee(),0.001);
	}
	
	@Test
	public void testConstructeurDouble() {
		Cercle c = new Cercle(5);
		
		assertEquals(5,c.getHauteur(),0.001);
		assertEquals(5,c.getLargeur(),0.001);
	}
	
	@Test 
	public void testConstructeurFull() {
		Cercle c = new Cercle(new Coordonnees(4,4),5,10);
		
		assertEquals(10,c.getHauteur(),0.001);
		assertEquals(5,c.getLargeur(),0.001);
		assertEquals(4,c.getPosition().getAbscisse(),0.001);
		assertEquals(4,c.getPosition().getOrdonnee(),0.001);
	}

	@Test 
	public void testPerimetre() {
		Cercle c = new Cercle(5);
		
		assertEquals(15.707,c.perimetre(),0.001);
	}
	
	@Test
	public void testAire() {
		Cercle c = new Cercle(10);
		
		assertEquals(78.539,c.aire(),0.001);
	}
	
	@Test
	public void testSetHauteur() {
		Cercle c = new Cercle(10);
		c.setHauteur(8);
		
		assertEquals(8,c.getHauteur(),0.001);
		assertEquals(8,c.getLargeur(),0.001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetHauteurNegatif() {
		Cercle c = new Cercle(10);
		c.setHauteur(-6);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetLargeurNegatig() {
		Cercle c = new Cercle(10);
		c.setLargeur(-6);
	}
	
	@Test
	public void testSetLargeur() {
		Cercle c = new Cercle();
		c.setLargeur(7);
		
		assertEquals(7,c.getHauteur(),0.001);
		assertEquals(7,c.getLargeur(),0.001);
	}
	
	@Test
	public void testToString() {
		Cercle c = new Cercle(new Coordonnees(5,5),10,10);
		String s = new String();
		
		s += "[Cercle] : pos ";
		s += "(5,0 , 5,0)";
		s += " dim ";
		s += "10,0";
		s += " x ";
		s += "10,0";
		s += " périmètre : ";
		s += "31,42";
		s += " aire : ";
		s += "78,54";
		
		assertEquals(s,c.toString());
	}
}
