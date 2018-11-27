package listes;
import listes.Ville;
import java.util.*;

public class TestListeString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");


		int max = Integer.MIN_VALUE;
		String valeur = null;
		
		for (String string : list) {
			if (string.length() > max) {
			max = string.length();
			valeur = string;}
		}
		System.out.println("La ville --> "+ valeur+" avec un nom de : "+max+" lettres");
	
		for (int k = 0 ;k < list.size(); k++) {
				list.set(k, list.get(k).toUpperCase());
			}
	
		for (int i = 0; i < list.size();i++) {
			if (list.get(i).charAt(0) == 'N') {
				System.out.println(list.get(i)+" va être supprimer");
				list.remove(i);
			}
		}
		for (String string : list) {
			System.out.println(string);
		}
		
		List<Ville> ville = new ArrayList<Ville>();

		ville.add(new Ville ("Nice", 343000));
		ville.add(new Ville ("Carcassonne", 47800));
		ville.add(new Ville ("Narbonne", 53400));
		ville.add(new Ville ("Lyon", 484000));
		ville.add(new Ville ("Foix", 9700));
		ville.add(new Ville ("Pau", 77200));
		ville.add(new Ville ("Marseille", 850700));
		ville.add(new Ville ("Tarbes", 40600));

		for (Ville ville2 : ville) {
			if (ville2.getNbHabitants() > max) {
				max = ville2.getNbHabitants();
				valeur = ville2.getNom();
		}
}
		int index = 0;
		int mini = Integer.MAX_VALUE;
		for (Ville ville2 : ville) {
			if (ville2.getNbHabitants() < mini) {
				mini = ville2.getNbHabitants();
				index = ville.indexOf(ville2);
			}	
		}
		ville.remove(index);
		
		
//		for (Ville ville2 : ville) {
//			System.out.println(ville2.toString());
//			}
		for (Ville ville2 : ville) {
			if (ville2.getNbHabitants() > 100000){
				ville2.setNom(ville2.getNom().toUpperCase());
		}
		}
		for (Ville ville2 : ville) {
			System.out.println(ville2.toString());
			}
		
	}

}
