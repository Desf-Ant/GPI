package GPI.exercices.complexe.cartesien;

import GPI.exercices.complexe.cartesien.Complexe;

public class ComplexeEssai{
  static Complexe c1;
  static Complexe c2;
  static Complexe c3;

  public static void main(String args[]){
    c1 = new Complexe(1,1,false);
    c1.afficheInfo();
    c1.setModule(3);
    System.out.println("Changement du module a 3");
    c1.afficheInfo();
    c1.setModule(Math.sqrt(2));
    c1.setArgument(1.6);
    System.out.println("Changement de l'argument a 1.6");
    c1.afficheInfo();

    System.out.println("\n\nInfos sur c2");
    c2 = new Complexe();
    c2.afficheInfo();

    System.out.println("\n\nInfos sur c3");
    c3 = new Complexe(Math.sqrt(2),1.7,true);
    c3.afficheInfo();

    System.out.println("\n\nAddition c1 & c2 : ");
    c1.setReelle(1);
    c1.setImaginaire(1);
    Complexe c4 = c1.plus(c2);
    c4.afficheInfo();

    System.out.println("\n\nMultiplication c1 & c3 :");
    Complexe c5 = c1.fois(c3);
    c5.afficheInfo();
  }
}
