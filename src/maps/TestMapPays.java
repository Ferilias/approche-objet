package maps;
import sets.Pays;
import java.util.*;

public class TestMapPays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Map<String, Pays> map = new HashMap<String, Pays>();
		map.put("USA", new Pays("USA", 325_700_000, 59531.66));
		map.put("France", new Pays("France", 67_120_000, 38476.66));
		map.put("Allemagne", new Pays("Allemagne", 82_790_000, 44469.91));
		map.put("UK", new Pays("UK", 66_020_000, 39720.44));
		map.put("Italie", new Pays("Italie", 60_590_000, 31952.98));
		map.put("Japon", new Pays("Japon", 136_800_000, 38428.10));
		map.put("Chine", new Pays("Chine", 1_386_000_000, 8826.99));
		map.put("Russie", new Pays("Russie", 144_500_000, 10743.10));
		map.put("Inde", new Pays("Inde", 1_339_000_000, 1939.61));
		
		boolean enter = true;
		int choix = 0;
		
		while (enter) {
			System.out.println("------------------------");
			System.out.println("Veuillez choisir");
			System.out.println("Option 1 : Afficher les informations concernant un pays");
			System.out.println("Option 2 : Supprimer un pays");
			System.out.println("Option 3 : Afficher la liste des pays");
			choix = sc.nextInt();
			sc.nextLine();

			
			if (choix == 1) {
				System.out.println("Veuillez choisir le pays à afficher");
				String pays = sc.nextLine();
				System.out.println(map.get(pays));
			}
		
		
			if (choix ==2) {
				String deleteCountry = null;
				System.out.println("Veuillez choisir un pays à supprimer");
				deleteCountry = sc.nextLine();
				map.remove(deleteCountry);
			}
			
			if (choix == 3) {
				Iterator<Pays> valuesIte = map.values().iterator();
				while (valuesIte.hasNext()) {
					Pays p = (Pays) valuesIte.next();
					System.out.println(p.toString());
			}
		}
		}
		sc.close();
	}

}
