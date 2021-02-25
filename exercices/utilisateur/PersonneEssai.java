package GPI.exercices.utilisateur;

import GPI.exercices.utilisateur.Personne;

public class PersonneEssai {
  public static void main(String[] args){

    Personne p1 = new Personne("DESFAITS","Antoine",2000);
    System.out.println(p1.identite());

    Personne p2 = new Personne("LeTocard", "Leom",2001);
    System.out.println(p2.identite());

    Personne p3 = new Personne("Le Con","Valentin",2002);
    System.out.println(p3.identite());
  }
}
