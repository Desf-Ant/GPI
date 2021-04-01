package fr.eseo.gpi.exercices.utilisateur;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPersonne {
	
	@Test
	public void testPersonneDefault() {
		Personne p1 = new Personne("Dujardin","Jean");
		
		assertEquals("Dujardin",p1.getNom());
		assertEquals("Jean",p1.getPrenom());
		assertEquals(0,p1.getAnneeDeNaissance());
		assertEquals("francais",p1.getNationalite());
	}
	
	@Test
	public void testPersonneDate() {
		Personne p = new Personne("Dujardin","Jean",1980);
		
		assertEquals(1980,p.getAnneeDeNaissance());
	}
	
	@Test
	public void testPersonneNationalite() {
		Personne p = new Personne("Dujardin","Jean");
		p.setNationalite("espanol");
		
		assertEquals("espanol",p.getNationalite());
	}
	
	@Test
	public void testPersonneIdSansDate() {
		Personne p = new Personne("Vuillemot","Valentin");
		
		assertEquals("vuillvalXX",p.user_id());
	}
	
	@Test
	public void testPersonneIdAvecDate() {
		Personne p = new Personne("Vuillemot","Valentin",2000);
		
		assertEquals("vuillval00",p.user_id());
	}
	
	@Test
	public void testPersonneIdNom() {
		Personne p = new Personne("Neo","TheSwan");
		
		assertEquals("neotheXX", p.user_id());
	}
	
	@Test 
	public void testPersonneIdNome() {
		Personne p = new Personne("Néeeeo","Sèwan");
		
		assertEquals("neeeesewXX",p.user_id());
	}
	
	@Test
	public void testPersonneIdNomEspace() {
		Personne p = new Personne("De fait","Antoine");
		
		assertEquals("defaiantXX",p.user_id());
	}
	
	@Test
	public void testPersonneIdTiret() {
		Personne p = new Personne("De-fait","Antoine");
		
		assertEquals("defaiantXX",p.user_id());
	}
	
	@Test 
	public void testPersonneIdFullMaj() {
		Personne p = new Personne("DESFAITS","ANTOINE",2000);
		
		assertEquals("desfaant00",p.user_id());
	}
	
	@Test
	public void testConstructeur4() {
		Personne p = new Personne("Stallman","Richard",1953);
		p.setNationalite("Americaine");
		
		assertEquals("Stallman",p.getNom());
		assertEquals("Richard",p.getPrenom());
		assertEquals(1953,p.getAnneeDeNaissance());
		assertEquals("Americaine",p.getNationalite());
	}
	
}
