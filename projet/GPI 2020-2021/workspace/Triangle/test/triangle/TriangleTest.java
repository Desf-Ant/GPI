package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Classe de test de base (avec asserts et non paramétrée) de la classe Triangle.
 * 
 * @author Camille Constant
 * @version 1.0
 *
 */
public class TriangleTest {

	/**
	 * Test du constructeur et du getter.
	 */
	@Test
	public void testConstructeur() {
		Triangle triangle = new Triangle(4,5,6);
		
		assertArrayEquals(new int []{4, 5, 6}, triangle.getCotes());
	}
	
	/**
	 * Vérifie que le triangle scalène est détecté.
	 */
	@Test
	public void testgetTypeScalene() {
		Triangle triangle = new Triangle(3, 4, 5);
		
		assertEquals("Triangle scalène attendu", TriangleType.SCALENE, triangle.getType());
	}

	/**
	 * Vérifie que le triangle équilatéral est détecté.
	 */
	@Test
	public void testgetTypeEquilateral() {
		Triangle triangle = new Triangle(5, 5, 5);
		
		assertEquals("Triangle équilatéral attendu", TriangleType.EQUILATERAL, triangle.getType());
	}
	
	/**
	 * Vérifie que le triangle isocèle est détecté.
	 */
	@Test
	public void testgetTypeIsocele() {
		Triangle triangle = new Triangle(3, 3, 4);
		
		assertEquals("Triangle isocèle attendu", TriangleType.ISOCELE, triangle.getType());
	}
	
	/**
	 * Vérifie que le triangle isocèle est détecté, 
	 * quelque soit l'ordre dans lequel les longueurs égales sont données.
	 */
	@Test
	public void testgetTypeIsoceleOrdre() {
		Triangle triangle = new Triangle(3, 3, 4);
		
		assertEquals("Triangle isocèle ordre 3 3 4", TriangleType.ISOCELE, triangle.getType());
		
		triangle.setCotes(4, 3, 3);
		assertEquals("Triangle isocèle ordre 4 3 3", TriangleType.ISOCELE, triangle.getType());

		triangle.setCotes(3, 4, 3);
		assertEquals("Triangle isocèle ordre 3 4 3", TriangleType.ISOCELE, triangle.getType());
	}
	
	/**
	 * Vérifie que le non triangle est détecté.
	 */
	@Test
	public void testgetTypeNonTriangle() {
		Triangle triangle = new Triangle(10, 5, 2);
		
		assertEquals("Non triangle attendu", TriangleType.NON_TRIANGLE, triangle.getType());
	}
	
	/**
	 * Vérifie que le non triangle est détecté, 
	 * quelque soit l'ordre dans lequel les longueurs égales sont données.
	 */
	@Test
	public void testgetTypeNonTriangleOrdre() {
		Triangle triangle = new Triangle(10, 5, 2);
		
		assertEquals("Non triangle ordre 10 5 2", TriangleType.NON_TRIANGLE, triangle.getType());
		
		triangle.setCotes(5, 10, 2);
		assertEquals("Non triangle attendu ordre 5 10 2", TriangleType.NON_TRIANGLE, triangle.getType());

		triangle.setCotes(2, 5, 10);
		assertEquals("Non triangle attendu ordre 2 5 10", TriangleType.NON_TRIANGLE, triangle.getType());
	}
	
	/**
	 * Vérifie que le triangle scalène est détecté quand il s'agit d'un triangle plat.
	 * Vérification faite pour tout ordre de longueur.
	 */
	@Test
	public void testgetTypePlat() {
		Triangle triangle = new Triangle(7, 3, 4);
		
		assertEquals("Triangle plat 7 3 4", TriangleType.SCALENE, triangle.getType());
		
		triangle.setCotes(3, 7, 4);
		assertEquals("Triangle plat 3 7 4", TriangleType.SCALENE, triangle.getType());

		triangle.setCotes(4, 3, 7);
		assertEquals("Triangle plat 4 3 7", TriangleType.SCALENE, triangle.getType());
	}

	/**
	 * Vérifie que non triangle est détetcé dans le cas du point.
	 */
	@Test
	public void testgetTypePoint() {
		Triangle triangle = new Triangle(0, 0, 0);
		
		assertEquals("Point : Non triangle attendu", TriangleType.NON_TRIANGLE, triangle.getType());
	}
}
