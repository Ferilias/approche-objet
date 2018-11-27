package sets;
import java.util.*;
import sets.Pays;
public class TestSetObjet {

	public static void main(String[] args) {

		Set<Pays> set = new HashSet<Pays>();
		
		set.add(new Pays("USA", 325_700_000, 59531.66));
		set.add(new Pays("France", 67_120_000, 38476.66));
		set.add(new Pays("Allemagne", 82_790_000, 44469.91));
		set.add(new Pays("UK", 66_020_000, 39720.44));
		set.add(new Pays("Italie", 60_590_000, 31952.98));
		set.add(new Pays("Japon", 136_800_000, 38428.10));
		set.add(new Pays("Chine", 1_386_000_000, 8826.99));
		set.add(new Pays("Russie", 144_500_000, 10743.10));
		set.add(new Pays("Inde", 1_339_000_000, 1939.61));

		
		double max = Double.MIN_VALUE;
		String nomPays = null;
		for (Pays pays : set) {
			if (pays.getPibHab() > max) {
				max = pays.getPibHab();
				nomPays = pays.getNom();			}
		}
		System.out.println(nomPays+" est ou le PIB/hab est le plus elevé : "+max);
		
		
		long maxi = Long.MIN_VALUE;
		nomPays = null;
		for (Pays pays : set) {
			if ((pays.getPibHab()*pays.getNbHabitants()) > maxi) {
				maxi = (long)pays.getPibHab()*pays.getNbHabitants();
				nomPays = pays.getNom();			}
		}
	
		System.out.println(nomPays+" est ou le PIB est le plus elevé : "+maxi);

		long mini = Long.MAX_VALUE;
		nomPays = null;
		for (Pays pays : set) {
			if ((pays.getPibHab()*pays.getNbHabitants()) < mini) {
				mini = (long)pays.getPibHab()*pays.getNbHabitants();
				nomPays = pays.getNom();			}
		}
		System.out.println(nomPays+" est ou le PIB est le plus bas : "+mini);
		
		Set<Pays> settempo = new HashSet<Pays>();
		for (Pays pays : set) {
			if(nomPays.equals(pays.getNom())) {
			}
			else {
				settempo.add(pays);
			}
		}
		set = settempo;
		for (Pays pays : set) {
			System.out.println(pays.toString());
		}

	}

}
