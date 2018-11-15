package entites;

public class AdressePostale {

	int departement = 0;
	int numRue = 0;
	String adresse = "";
	String ville = "";
	String pays = "";

	public AdressePostale(int departement, int numRue, String adresse, String ville, String pays) {
		this.departement = departement;
		this.numRue = numRue;
		this.adresse = adresse;
		this.ville = ville;
		this.pays = pays;
	}

	public void affichage() {
		System.out.println("Adresse : " + this.numRue + " " + this.adresse + " " + this.ville + " " + this.departement
				+ " " + this.pays);
	}

	// Getter & Setter
	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
	}

	public int getNumRue() {
		return numRue;
	}

	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}