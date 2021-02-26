package GPI.exercices.utilisateur;

import GPI.exercices.utilisateur.Personne;
import java.util.ArrayList;


public class Annuaire {
  private ArrayList<Personne> lesPersonnes;

  public Annuaire(){
    this.lesPersonnes = new ArrayList<>();
  }

  public void ajouter (Personne p) {
    this.lesPersonnes.add(p);
  }

  public Personne chercher(String nom){
    for (Personne p : this.lesPersonnes){
      if (nom == p.getNom()){
        System.out.println(p.identite());
        return p;
      }
    }
    return null;
  }

  public Personne supprimer(String nom){
    for (int i=0; i<this.lesPersonnes.size(); i++){
      if (this.lesPersonnes.get(i).getNom() == nom){
        System.out.print(this.lesPersonnes.get(i).identite());
        Personne p = this.lesPersonnes.get(i);
        this.lesPersonnes.remove(i);
        return p;
      }
    }
    return null;
  }

}
