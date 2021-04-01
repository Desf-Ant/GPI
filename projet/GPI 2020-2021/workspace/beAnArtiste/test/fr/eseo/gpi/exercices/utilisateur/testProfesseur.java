package fr.eseo.gpi.exercices.utilisateur;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class testProfesseur {
	private ArrayList<String> lesCours;

	@Test
	public void testConstructeurFull() {
		Professeur p = new Professeur("Morlet","Lucas","francais",1980);
		
		assertEquals("Morlet",p.getNom());
		assertEquals("Lucas",p.getPrenom());
		assertEquals(1980,p.getAnneeDeNaissance());
		assertEquals("francais",p.getNationalite());
	}
	
	@Test
	public void testAjouteCours() {
		this.lesCours = new ArrayList<>();
		Professeur p = new Professeur("Morlet","Lucas");
		p.ajouterCours("Informatique");
		lesCours = p.getCours();
		assertEquals("Informatique",p.getCours().get(0));
	}
	
}
