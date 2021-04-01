package fr.eseo.gpi.exercices.utilisateur;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEtudiant {

	@Test
	public void testConstructorFull() {
		Etudiant e = new Etudiant("Desfaits","Antoine","algerien",2000,21);
		assertEquals("Desfaits",e.getNom());
		assertEquals("Antoine",e.getPrenom());
		assertEquals("algerien",e.getNationalite());
		assertEquals("desfaant00",e.user_id());
		assertEquals(2000,e.getAnneeDeNaissance());
		assertEquals(21,e.getNumEtudiant());
		System.out.println(e);
	}

}
