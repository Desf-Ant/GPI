package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class EllipseTest {

	@Test
	public void testConstructeurDefault() {
		Ellipse e1 = new Ellipse();

		assertEquals(Forme.HAUTEUR_PAR_DEFAUT,e1.getHauteur(),0.001);
		assertEquals(Forme.LARGEUR_PAR_DEFAUT,e1.getLargeur(),0.001);
		assertEquals(Coordonnees.ABSCISSE_PAR_DEFAUT,e1.getPosition().getAbscisse(),0.001);
		assertEquals(Coordonnees.ABSCISSE_PAR_DEFAUT,e1.getPosition().getOrdonnee(),0.001);
	}
	
	@Test
	public void testConstructeurDouble() {
		Ellipse e1 = new Ellipse(10,5);
		Ellipse e2 = new Ellipse(5,10);
		
		assertEquals(10,e1.getLargeur(),0.001);
		assertEquals(5,e2.getLargeur(),0.001);
		assertEquals(5,e1.getHauteur(),0.001);
		assertEquals(10,e2.getHauteur(),0.001);
		assertEquals(Coordonnees.ABSCISSE_PAR_DEFAUT,e1.getPosition().getAbscisse(),0.001);
		assertEquals(Coordonnees.ABSCISSE_PAR_DEFAUT,e1.getPosition().getOrdonnee(),0.001);
		assertEquals(Coordonnees.ABSCISSE_PAR_DEFAUT,e2.getPosition().getAbscisse(),0.001);
		assertEquals(Coordonnees.ABSCISSE_PAR_DEFAUT,e2.getPosition().getOrdonnee(),0.001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeurDoubleNegatif() {
		Ellipse e = new Ellipse(-10,-10);
	}
	
	@Test
	public void testConstructeurCoordonnees() {
		Ellipse e = new Ellipse(new Coordonnees(10,30));
		
		assertEquals(Forme.HAUTEUR_PAR_DEFAUT,e.getHauteur(),0.001);
		assertEquals(Forme.LARGEUR_PAR_DEFAUT,e.getLargeur(),0.001);
		assertEquals(10,e.getPosition().getAbscisse(),0.001);
		assertEquals(30,e.getPosition().getOrdonnee(),0.001);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructeurFullNegatif() {
		Ellipse e = new Ellipse(new Coordonnees(),-10,-10);
	}
	
	@Test 
	public void testConstructeurFull() {
		Ellipse e1 = new Ellipse(new Coordonnees(30,20),30,20);
		Ellipse e2 = new Ellipse(new Coordonnees(20,30),20,30);
		
		assertEquals(20,e1.getHauteur(),0.001);
		assertEquals(30,e1.getLargeur(),0.001);
		assertEquals(30,e1.getPosition().getAbscisse(),0.001);
		assertEquals(20,e1.getPosition().getOrdonnee(),0.001);
		assertEquals(30,e2.getHauteur(),0.001);
		assertEquals(20,e2.getLargeur(),0.001);
		assertEquals(20,e2.getPosition().getAbscisse(),0.001);
		assertEquals(30,e2.getPosition().getOrdonnee(),0.001);		
	}

	@Test(expected=IllegalArgumentException.class)
	public void testSetHauteurNegatif() {
		Ellipse e = new Ellipse(new Coordonnees(),10,10);
		e.setHauteur(-6);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetLargeurNegatif() {
		Ellipse e = new Ellipse(new Coordonnees(),10,10);
		e.setLargeur(-6);
	}
	
	@Test
	public void testSetHauteur() {
		Ellipse e = new Ellipse();
		Ellipse e2 = new Ellipse();
		e.setHauteur(50);
		e2.setHauteur(1);
		
		assertEquals(50,e.getHauteur(),0.001);
		assertEquals(Forme.LARGEUR_PAR_DEFAUT,e.getLargeur(),0.001);
		assertEquals(1,e2.getHauteur(),0.001);
		assertEquals(Forme.LARGEUR_PAR_DEFAUT,e2.getLargeur(),0.001);
	}
	
	@Test
	public void testSetLargeur() {
		Ellipse e = new Ellipse();
		Ellipse e2 = new Ellipse();
		e.setLargeur(50);
		e2.setLargeur(1);
		
		assertEquals(Forme.HAUTEUR_PAR_DEFAUT,e.getHauteur(),0.001);
		assertEquals(50,e.getLargeur(),0.001);
		assertEquals(Forme.HAUTEUR_PAR_DEFAUT,e2.getHauteur(),0.001);
		assertEquals(1,e2.getLargeur(),0.001);
	}
	
	@Test
	public void testAire() {
		Ellipse e = new Ellipse(20,30);
		assertEquals(471.238,e.aire(),0.001);
	}
	
	@Test 
	public void testPerimetre() {
		Ellipse e = new Ellipse(20,30);
		assertEquals( 79.3271,e.perimetre(),0.001);
	}
	
	@Test
	public void testToString() {
		String s = new String();
		Ellipse e = new Ellipse(new Coordonnees(20,20),10,30);
		
		s += "[Ellipse] : pos ";
		s += "(20,0 , 20,0)";
		s += " dim ";
		s += "10,0";
		s += " x ";
		s += "30,0";
		s += " périmètre : ";
		s += "66,82";
		s += " aire : ";
		s += "235,62";
		
		assertEquals(s,e.toString());
	}
	
	@Test
	public void testContient() {
		Coordonnees c1 = new Coordonnees(10,10);
		Coordonnees c2 = new Coordonnees(100,100);
		Ellipse e = new Ellipse(new Coordonnees(0,0),30,30);
		
		assertEquals(e.contient(c1),true);
		assertEquals(e.contient(c2),false);
	}
}
