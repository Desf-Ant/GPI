package fr.eseo.gpi.exercices.utilisateur;

import java.util.ArrayList;

public class Professeur extends Personne {
	
	private ArrayList<String> lesCours;
	
	public Professeur(String nom, String prenom, String nationalite, int annee) {
		super(nom,prenom,annee);
		this.setNationalite(nationalite);	
		this.lesCours = new ArrayList<>();
	}
	
	public Professeur(String nom, String prenom) {
		super(nom, prenom);
		this.lesCours = new ArrayList<>();
	}
	
	public void ajouterCours(String c) {
		lesCours.add(c);
	}
	
	public ArrayList<String> getCours(){
		return this.lesCours;
	}
}
