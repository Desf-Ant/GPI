package fr.eseo.gpi.exercices.utilisateur;

public class Etudiant extends Personne {
	
	private int numEtudiant;

	// Constructeur
	public Etudiant(String nom, String prenom,String nationalite,int annee,int num) {
		super(nom,prenom,annee);
		this.setNationalite(nationalite);
		this.numEtudiant = num;
	}
	
	public Etudiant(String nom,String prenom,int annee,int num) {
		super(nom,prenom,annee);
		this.numEtudiant=num;
	}
	
	public void setNumEtudiant(int num) {
		this.numEtudiant = num;
	}
	
	public int getNumEtudiant() {
		return this.numEtudiant;
	}
	
	public String toString() {
		String s = new String();
		s += "Etudiant: ";
		s += this.getNom()+" " +this.getPrenom();
		s += ", ne(e) en " + this.getAnneeDeNaissance();
		s += ", nationalite: "+ this.getNationalite();
		s += ", Id: "+ this.user_id();
		s += ", numero Etudiant: "+ this.getNumEtudiant();
		return s;
	}
}
