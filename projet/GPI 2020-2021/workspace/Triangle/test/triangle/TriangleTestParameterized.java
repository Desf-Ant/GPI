package triangle;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

/**
 * Classe de test paramétrée, via la technique du constructeur, de la classe Triangle.
 * 
 * @author Camille Constant
 * @version 1.0
 *
 */
@RunWith(Parameterized.class)
public class TriangleTestParameterized {

	/**
	 * Paramètres représentant les côtés du triangle.
	 */
	private int a, b, c;

	/**
	 * Paramètre représentant le type attendu du triangle.
	 */
	private TriangleType triangleAttendu;
	
	/**
	 * Constructeur de chaque donnée de test pour le triangle.
	 * 
	 * @param a la longueur du côté A.
	 * @param b la longueur du côté B.
	 * @param c la longueur du côté C.
	 * @param triangleAttendu le type attendu du triangle.
	 */
	public TriangleTestParameterized (int a, int b, int c, TriangleType triangleAttendu){
		this.a = a;
		this.b = b;
		this.c = c;
		this.triangleAttendu = triangleAttendu;
	}
	
	/**
	 * Création du jeu de test. 
	 * 
	 * @return l'ensemble des données de test. 
	 */
	@Parameters(name = "dt[{index}] : {0}, {1}, {2}, {3}") 
    public static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{3, 4, 5, TriangleType.SCALENE},
        	{5, 5, 5, TriangleType.EQUILATERAL},
    		{3, 3, 4, TriangleType.ISOCELE},
    		{4, 3, 3, TriangleType.ISOCELE},
    		{3, 4, 3, TriangleType.ISOCELE},
    		{10, 5, 2, TriangleType.NON_TRIANGLE},
    		{5, 10, 2, TriangleType.NON_TRIANGLE},
    		{2, 5, 10, TriangleType.NON_TRIANGLE},
    		{7, 3, 4, TriangleType.SCALENE},
    		{3, 7, 4, TriangleType.SCALENE},
    		{4, 3, 7, TriangleType.SCALENE},
    		{0, 0, 0, TriangleType.NON_TRIANGLE}
        };
        return Arrays.asList(data);
    }
	
	/**
	 * Test de la méthode getType() de Triangle.
	 */
	@Test
	public void testgetType() {
		Triangle triangle = new Triangle(a, b, c);

		assertEquals("Test du type du triangle", triangleAttendu, triangle.getType());
	}
}
