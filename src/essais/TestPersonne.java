package essais;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("Durand","Jean","22 rue des glands",1969 );
		
		Personne p2 = new Personne("dupont", "jeannot","22 rue des cons", 1975);
		
		p1.affichage();
		p2.affichage();
		System.out.println(p1.getAge());
	}

}
