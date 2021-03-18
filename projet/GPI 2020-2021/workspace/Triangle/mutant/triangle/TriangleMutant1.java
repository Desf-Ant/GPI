package triangle;

import triangle.Triangle;

/**
 * Mutant permettant de vérifier que les tests vérifient que 
 * le constructeur de la classe Triangle affecte bien 
 * les 3 côtés du triangle selon les 3 paramètres.
 * 
 * @author Camille Constant
 *
 */

public class TriangleMutant1 extends Triangle{

	public TriangleMutant1(int a, int b, int c) {
		super(0,0,0);
	}

}