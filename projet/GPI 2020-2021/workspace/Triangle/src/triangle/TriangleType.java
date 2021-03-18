package triangle;

/**
 * Énumération des 3 types possibles de triangle : 
 * scalène, isocèle et équilatéral ainsi que du cas non triangle.
 * 
 * @author Camille Constant
 * @version 1.0
 */
public enum TriangleType {
	SCALENE ("Scalène"),
	ISOCELE ("Isocèle"),
	EQUILATERAL ("Équilatéral"),
	NON_TRIANGLE ("Non triangle");
	
	private String typeTriangle = "";
	
	TriangleType (String typeTriangle) {
		this.typeTriangle = typeTriangle;
	}
	
	@Override
	public String toString (){
		return this.typeTriangle;
	}
}
