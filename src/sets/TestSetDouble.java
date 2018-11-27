package sets;
import java.util.*;

public class TestSetDouble {

	public static void main(String[] args) {
		
		Set<Double> set = new HashSet<Double>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);

//		for (Double double1 : set) {
//			System.out.print(double1+" ");
//		}

		System.out.println("Voici les éléments de la liste SET");
		for (Double double1 : set) {
			System.out.print(double1+" ");
		}
		System.out.println();
		System.out.println("Nombre sans négatif");
				
		Iterator<Double> li = set.iterator();{
			Set<Double> settempo = new HashSet<Double>();
			while (li.hasNext()) {
				double monNombre = li.next();
				if(monNombre < 0) {
					settempo.add(-monNombre);
				}
				else {
					settempo.add(monNombre);
				}	
			}
			set = settempo;
		}

		for (Double double1 : set) {
			System.out.print(double1+" ");
		}
		System.out.println();
		System.out.println("Nombre le plus grand "+	Collections.max(set));

		set.remove(Collections.min(set));
		
//		Iterator<Double> supprimer = set.iterator();{
//			double min = Integer.MAX_VALUE;
//			while (supprimer.hasNext()) {
//				double monNombre = supprimer.next();
//				if(monNombre < min) {
//					min = monNombre;
//				}
//			}
//			set.remove(min);
//			System.out.println("Sans la plus petite valeur "+ min);
//		}

			for (Double double1 : set) {
				System.out.print(double1+" ");
		}
	}

}
