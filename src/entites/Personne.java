package entites;
import java.util.*;
public class Personne {

	String nom;
	String prenom;
	String adresse;
	int anneeNaissance;

	public Personne(String nom, String prenom, String adresse, int anneeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.anneeNaissance = anneeNaissance;
	}

	public void affichage() {
		System.out.println("nom : " + this.nom + ", prenom : " + this.prenom + " " + this.adresse);
	}

// Getter & Setter
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getAge() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year - this.anneeNaissance;
		
	}
}
