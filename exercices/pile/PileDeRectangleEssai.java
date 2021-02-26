package GPI.exercices.pile;

import GPI.exercices.pile.PileDeRectangle;
import GPI.projet.geom.Rectangle;
import GPI.projet.geom.Coordonnees;

public class PileDeRectangleEssai {

  static PileDeRectangle pile;
  static Rectangle r1 ;
  static Rectangle r2 ;
  static Rectangle r3;
  static Rectangle r4 ;
  static Rectangle r5 ;

  public static void main (String args[]){
      pile = new PileDeRectangle();
      r1 = new Rectangle(10,100,new Coordonnees(1,1));
      r2 = new Rectangle(20,200,new Coordonnees(2,2));
      r3 = new Rectangle(30,300,new Coordonnees(3,3));
      r4 = new Rectangle(40,400,new Coordonnees(4,4));
      r5 = new Rectangle(50,500,new Coordonnees(5,5));

      pile.empiler(r1);
      pile.empiler(r2);
      pile.empiler(r3);
      pile.empiler(r4);
      pile.empiler(r5);

      for (int i=0; i<5; i++) {
        Rectangle r = pile.depiler();
        System.out.println(r);
      }

  }
}
