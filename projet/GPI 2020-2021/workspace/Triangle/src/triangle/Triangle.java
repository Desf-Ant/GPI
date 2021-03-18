package triangle;


/**
 * Classe Triangle afin d'illustrer le cours de Test.
 * 
 * @author Camille Constant
 * @version 1.0
 */
public class Triangle {

	/**
	 * Attributs représentant les 3 côtés d'un triangle.
	 */
	private int coteA;
	private int coteB;
	private int coteC;

	/**
	 * Constructeur d'un triangle à partir de 3 longueurs.
	 *  
	 * @param a la première longueur.
	 * @param b la deuxième longueur.
	 * @param c la troisième longueur.
	 */
	public Triangle(int a, int b, int c) {
		this.coteA = a;
		this.coteB = b;
		this.coteC = c;
	}

	/**
	 * Accesseur des 3 côtés du triangle.
	 * 
	 * @return l'ensemble des 3 longueurs des côtés du triangle.
	 */
	public int[] getCotes(){
		return new int[]{this.coteA, this.coteB, this.coteC};
	}
	
	/**
	 * Mutateur des 3 côtés du triangle.
	 * 
	 * @param a le premier côté.
	 * @param b le deuxième côté.
	 * @param c le troisième côté.
	 */
	public void setCotes (int a, int b, int c) {
		this.coteA = a;
		this.coteB = b;
		this.coteC = c;
	}
	
	/**
	 * Méthode permettant de savoir si le triangle est scalène, isocèle, équilatéral ou si ce n'est pas un triangle.
	 * 
	 * @return le type de triangle correspondant.
	 */
	public TriangleType getType() {
		TriangleType triangle = TriangleType.NON_TRIANGLE;

		boolean estTriangle = (coteA <= coteB + coteC) && (coteB <= coteA + coteC) && (coteC <= coteA + coteB);

		if (estTriangle && coteA != 0) {
			if ((coteA == coteB) && (coteA == coteC)) {
				triangle = TriangleType.EQUILATERAL;
			} else if (((coteA == coteB) || (coteA == coteC) || (coteB == coteC))) {
				triangle = TriangleType.ISOCELE;
			} else {
				triangle = TriangleType.SCALENE;
			}
		}

		return triangle;
	}

	@Override
	public String toString() {
		TriangleType triangle = this.getType();
		
		return triangle.equals(TriangleType.NON_TRIANGLE) ? "Ceci n'est pas un triangle." : "Triangle " + triangle;
	}
}
