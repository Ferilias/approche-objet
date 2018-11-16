package Array;

public class TestFibonacci {

	public static void recherche(int iteration) {
		int resultat = 0;
		
		if(iteration == 0) {
			resultat = 0;
		}
		else if(iteration == 1) {
			resultat = 1;
		}
		else if (iteration >=2){
	int [] tab = new int[iteration];
	tab[0] = 0;
	tab[1] = 1;
	for (int i = 2; i < tab.length; i++ ) {
		resultat = tab[i-1]+tab[i-2];
		tab[i] = resultat;
	}
	}
	System.out.println("l\'itération numéro : "+iteration+" est égale à : "+resultat);
	}
}