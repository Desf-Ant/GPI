package fr.eseo.gpi.exercices.utilisateur;

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
    this.nationalite = NATIONALITE_PAR_DEFAUT;
    this.user_id();
    this.anneeDeNaissance = annee;
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
	  
	  String nom = this.getNom();
	  String prenom = this.getPrenom();
	  String dateN = String.valueOf(this.getAnneeDeNaissance());
	  
	  // On enleve les majuscules dans le nom
	  for (int i=0; i<nom.length();i++) {
		  int asciiChar = (int)nom.charAt(i);
		  if (asciiChar>=65 && asciiChar<=90) {
			  asciiChar = asciiChar + 32;
			  nom = nom.substring(0,i) + String.valueOf((char)asciiChar) + nom.substring(i+1,nom.length());
		  }
	  }
	  
	  // On enleve les majusucule dans le prenom
	  for (int i=0; i<prenom.length();i++) {
		  int asciiChar = (int)prenom.charAt(i);
		  if (asciiChar>=65 && asciiChar<=90) {
			  asciiChar = asciiChar + 32;
			  prenom = prenom.substring(0,i) + String.valueOf((char)asciiChar) + prenom.substring(i+1,prenom.length());
		  }
	  }
	  
	  // On enleve les caracteres spéciaux
	  for (int i=0; i<nom.length();i++) {
		  // On enleve l'apostrophe et les espaces
		  if (nom.charAt(i)=='\'' || nom.charAt(i)==' '||nom.charAt(i)=='-') {
			  nom = nom.substring(0,i) + nom.substring(i+1,nom.length());
		  }
		  // On enleve les accents sur le 'e'
		  if (nom.charAt(i)=='é' || nom.charAt(i)=='è' || nom.charAt(i)=='ê' || nom.charAt(i)=='ë') {
			  nom = nom.substring(0,i) + String.valueOf('e') + nom.substring(i+1,nom.length());
		  }
		  // On enleve les accents sur le 'o'
		  if(nom.charAt(i)=='ô' || nom.charAt(i)=='ö') {
			  nom = nom.substring(0,i) + String.valueOf('o') + nom.substring(i+1,nom.length());
		  }
		  // On enleve les accents sur le 'u'
		  if(nom.charAt(i)=='û' || nom.charAt(i)=='ü') {
			  nom = nom.substring(0,i) + String.valueOf('u') + nom.substring(i+1,nom.length());
		  }
		  // On enleve les accents sur le 'a'
		  if(nom.charAt(i)=='à' || nom.charAt(i)=='â' || nom.charAt(i)=='ä') {
			  nom = nom.substring(0,i) + String.valueOf('a') + nom.substring(i+1,nom.length());
		  }
		  // On enleve les accents sur le 'i'
		  if(nom.charAt(i)=='î' || nom.charAt(i)=='ï') {
			  nom = nom.substring(0,i) + String.valueOf('i') + nom.substring(i+1,nom.length());
		  }
		  // On enleve le c cédille
		  if(nom.charAt(i)=='ç') {
			  nom = nom.substring(0,i) + String.valueOf('c') + nom.substring(i+1,nom.length());
		  }
	  }
	  
	  for (int i=0; i<prenom.length();i++) {
		  // On enleve l'apostrophe et les espaces
		  if (prenom.charAt(i)=='\'' || prenom.charAt(i)==' '||prenom.charAt(i)=='-') {
			  prenom = prenom.substring(0,i) + prenom.substring(i+1,prenom.length());
		  }
		  // On enleve les accents sur le 'e'
		  if (prenom.charAt(i)=='é' || prenom.charAt(i)=='è' || prenom.charAt(i)=='ê' || prenom.charAt(i)=='ë') {
			  prenom = prenom.substring(0,i) + String.valueOf('e') + prenom.substring(i+1,prenom.length());
		  }
		  // On enleve les accents sur le 'o'
		  if(prenom.charAt(i)=='ô' || prenom.charAt(i)=='ö') {
			  prenom = prenom.substring(0,i) + String.valueOf('o') + prenom.substring(i+1,prenom.length());
		  }
		  // On enleve les accents sur le 'u'
		  if(prenom.charAt(i)=='û' || prenom.charAt(i)=='ü') {
			  prenom = prenom.substring(0,i) + String.valueOf('u') + prenom.substring(i+1,prenom.length());
		  }
		  // On enleve les accents sur le 'a'
		  if(prenom.charAt(i)=='à' || prenom.charAt(i)=='â' || prenom.charAt(i)=='ä') {
			  prenom = prenom.substring(0,i) + String.valueOf('a') + prenom.substring(i+1,prenom.length());
		  }
		  // On enleve les accents sur le 'i'
		  if(prenom.charAt(i)=='î' || prenom.charAt(i)=='ï') {
			  prenom = prenom.substring(0,i) + String.valueOf('i') + prenom.substring(i+1,prenom.length());
		  }
		  // On enleve le c cédille
		  if(prenom.charAt(i)=='ç') {
			  prenom = prenom.substring(0,i) + String.valueOf('c') + prenom.substring(i+1,prenom.length());
		  }
	  }
	  
	  // On formate le nom 
	  if(nom.length()>5) 
		  nom = nom.substring(0,5);
	  
	  //On formate le prenom
	  if(prenom.length()>3)
		  prenom = prenom.substring(0,3);
	  
	  // On formate la date de naissance
	  if (dateN.equals("0"))
		  dateN = "XX";
	  else 
		  dateN = dateN.substring(2);
	  
	  return nom+prenom+dateN;
	  
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
