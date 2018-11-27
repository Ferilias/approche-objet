package sets;
import java.util.*;

public class TestSetString {

	public static void main(String[] args) {

		
		Set<String> setString = new HashSet<String>();
		setString.add("USA");
		setString.add("France");
		setString.add("Allemagne");
		setString.add("UK");
		setString.add("Italie");
		setString.add("Japon");
		setString.add("Chine");
		setString.add("Russie");
		setString.add("Inde");

		int max = Integer.MIN_VALUE;
		String pays = null;
		for (String string : setString) {
			if (string.length() > max) {
				max = string.length();
				pays = string;
			}
		}
		System.out.println("Le pays "+pays+" contient : "+max+" de lettres");
		setString.remove(pays);
		

			Iterator<String> it = setString.iterator();{
				Set<String> settempo = new HashSet<String>();
				while (it.hasNext()) {
					String nomPays = it.next();
					if (nomPays != null) {
					settempo.add(nomPays.toUpperCase());
					}
				}
				setString = settempo;
			}
			for (String string : setString) {
				System.out.print(string+" ");
			}
	}

}
