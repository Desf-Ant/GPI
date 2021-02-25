public class CoordonneesEssai {
  public static void main (String[] args) {
    Coordonnees p1 = new Coordonnees();
    Coordonnees p2 = new Coordonnees(3,3);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println("distance de P1 vers P2 : "+p1.distanceVers(p2));
    System.out.println("angles de P1 vers P2 : "+p1.angleVers(p2));
    p1.deplacerDe(-1,-2);
    System.out.println("\ndistance de P1 vers P2 : "+p1.distanceVers(p2));
    System.out.println("angles de P1 vers P2 : "+p1.angleVers(p2));
  }
}
