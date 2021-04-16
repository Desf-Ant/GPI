package fr.eseo.poo.projet.artiste.modele;

import org.junit.runner.RunWith;
import fr.eseo.poo.projet.artiste.modele.formes.*;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CoordonneesTest.class,CercleTest.class, EllipseTest.class, LigneTest.class })
public class ModeleTests {

}
