package listes;

public class Ville {

	String nom = null;
	int nbHabitants;
	
	
	public Ville (String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbHabitants() {
		return nbHabitants;
	}


	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}


	@Override
	public String toString() {
		return "La ville de : " + nom + ", contient --> " + nbHabitants + " habitants";
	}
	
	
	
}
