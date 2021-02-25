package GPI.exercices.pile;

import GPI.exercices.pile.PileDeRectangle;
import GPI.projet.geom.Rectangle;
import GPI.projet.geom.Coordonnees;

public class PileDeRectangleEssai {
  public static void main (String args[]){
      PileDeRectangle pile = new PileDeRectangle();
      Rectangle r1 = new Rectangle(10,100,new Coordonnees(1,1));
      Rectangle r2 = new Rectangle(20,200,new Coordonnees(2,2));
      Rectangle r3 = new Rectangle(30,300,new Coordonnees(3,3));
      Rectangle r4 = new Rectangle(40,400,new Coordonnees(4,4));
      Rectangle r5 = new Rectangle(50,500,new Coordonnees(5,5));

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
