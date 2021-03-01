package GPI.exercices.complexe;

import GPI.exercices.complexe.cartesien.Complexe;
import GPI.exercices.complexe.polaire.Complexe;

public class ComplexeEssai{
  static Complexe c1;
  static Complexe c2;
  public static void main (String args[]){
    c1 = complexe.cartesien.Complexe();
    c2 = complexe.polaire.Complexe();
    c1.AfficheInfo();
    c2.AfficheInfo();
  }
}
