package triangle;


public class TriangleMain {

	private TriangleMain() {
	}

	public static void main(String[] args) {
		if (args.length == 3) {
			Triangle triangle = new Triangle(
					Integer.parseInt(args[0]), 
					Integer.parseInt(args[1]), 
					Integer.parseInt(args[2]));
			System.out.println(triangle);
		}
	}

}
