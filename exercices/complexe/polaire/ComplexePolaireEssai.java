package GPI.exercices.complexe.polaire;

import GPI.exercices.complexe.polaire.Complexe;

public class ComplexePolaireEssai{
  static Complexe c1;
  static Complexe c2;

  public static void main (String args []){
    c1 = new Complexe(2,.8,true);
    c1.afficheInfo();

    c2 = new Complexe(Math.sqrt(1),1,false);
    c2.afficheInfo();

    Complexe c3 = c1.plus(c2);
    c3.afficheInfo();

    Complexe c4 = c1.fois(c2);
    c4.afficheInfo();
    System.out.println(""+c4.getReelle()+"  i"+c4.getImaginaire());
  }
}
