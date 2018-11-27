package listes;
import java.util.*;
public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> entier = new ArrayList<Integer>();
		entier.add(-1);
		entier.add(5);
		entier.add(7);
		entier.add(3);
		entier.add(-2);
		entier.add(4);
		entier.add(8);
		entier.add(5);
		entier.add(25);
		
		for (Integer integer : entier) {
			System.out.print(integer+" ");
		}
		System.out.println();
		Integer i = Collections.max(entier);
		System.out.println(i);
		
		Integer j = Collections.min(entier);
		entier.remove(j);
		
		for (Integer integer : entier) {
			System.out.print(integer+" ");
		}
		
		for (int k = 0 ;k < entier.size(); k++) {
			if (entier.get(k) < 0) {
				entier.set(k, -entier.get(k));
			}
		}
		
		System.out.println();
		for (Integer integer : entier) {
			System.out.print(integer+" ");
		}
	}
	


}
