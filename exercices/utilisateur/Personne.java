package GPI.exercices.utilisateur;

public class Personne {
  // constante de la classe
  static final String NATIONALITE_PAR_DEFAUT = "francais";
  // Variables de la classe
  static int nbPersonnes;
  // Variables d'instance
  String nom;
  String prenom;
  int anneeDeNaissance;
  String nationalite;

  // constructeur
  Personne(String n, String p, int annee) {
    this.nom = n;
    this.prenom =p;
    this.anneeDeNaissance = annee;
    this.user_id();
    incrementeNbPersonnes();
  }

  Personne (String n, String p){
    this(n,p,0);
  }

  // Methodes
  // Accesseurs et mutateurs
  String getNom() {
    return this.nom;
  }

  void setNom(String n) {
    // affecte l'argument 'nom' à son attribut nom
    this.nom = n;
  }

  String getPrenom() {
    return this.prenom;
  }

  void setPrenom(String p) {
    // affecte l'argument "prenom" a son attribut prenom
    this.prenom = p;
  }

  int getAnneeDeNaissance(){
    return this.anneeDeNaissance;
  }

  void setAnneeDeNaissance(int annee) {
    this.anneeDeNaissance = annee;
  }

  String getNationalite(){
    return this.nationalite;
  }

  void setNationalite (String n){
    this.nationalite = n;
  }

  String user_id(){
    if (this.getAnneeDeNaissance() != 0)
      if (this.getNom().length() > 5)
        return this.getNom().substring(0,5)+this.getPrenom().substring(0,3)+String.valueOf(this.getAnneeDeNaissance()).substring(2);
      else
      return this.getNom()+this.getPrenom().substring(0,3)+String.valueOf(this.getAnneeDeNaissance()).substring(2);
    else
      return "XX";
  }


  // Autres methodes //
  // Methode de classe

  static int getNbPersonnes(){
    return nbPersonnes;
  }

  static void incrementeNbPersonnes(){
    nbPersonnes++;
  }

  // methode d'instance
  int age(int annee){
    return annee - this.getAnneeDeNaissance();
  }

  String identite() {
    return this.getPrenom() +" "+ this.getNom() + " - Ne(e):" + this.getAnneeDeNaissance() +" Nationalite: "+NATIONALITE_PAR_DEFAUT+" => "+this.user_id() +" " +this.getNbPersonnes();
  }

}
