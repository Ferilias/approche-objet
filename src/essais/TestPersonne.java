package essais;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne();
		p1.nom = "Durand";
		p1.prenom = "Jean";
		p1.adresse = "22 rue des glands";
		
		Personne p2 = new Personne();
		p2.nom = "dupont";
		p2.prenom = "jeannot";
		p2.adresse = "22 rue des cons";
		
		p1.affichage();
		p2.affichage();
	}

}
