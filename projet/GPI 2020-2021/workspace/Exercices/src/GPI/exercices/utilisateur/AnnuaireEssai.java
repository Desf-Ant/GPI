package GPI.exercices.utilisateur;

import GPI.exercices.utilisateur.Annuaire;
import GPI.exercices.utilisateur.Personne;

public class AnnuaireEssai{

  static Annuaire a;
  static Personne p1;
  static Personne p2;
  static Personne p3;
  static Personne p4;
  static Personne p5;

  public static void main(String args []){
   a = new Annuaire();

   p1 = new Personne("Morin","Leo",2000);
   p2 = new Personne("Vuillemot","Valentin",2000);
   p3 = new Personne("LeCorre","Gael",2000);
   p4 = new Personne("Bavay","Amaury",2000);
   p5 = new Personne("Race","Adrien",2000);

   a.ajouter(p1);
   a.ajouter(p2);
   a.ajouter(p3);
   a.ajouter(p4);
   a.ajouter(p5);

   a.supprimer("Bavay");

   a.ajouter(new Personne("Desfaits","Antoine",2000));

   a.chercher("Morin");
   a.chercher("Morlet");
  }
}
