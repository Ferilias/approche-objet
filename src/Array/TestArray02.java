package Array;
import java.util.Arrays;
public class TestArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialisation variablers + tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int somme = 0;
		int position15 = -1;
		int doublon = 0;
		
		// Somme du tableau
		for (int i =0; i<array.length; i++) {
			somme = somme + array[i];
		}
	System.out.println("La somme est : "+somme);
	
		// position du nombre 15
		for (int i = 0; i<array.length; i++) {
			if (array[i] == 15) {
				position15 = i;
			}
		}
		System.out.println("la position du nombre 15 est : "+position15);
		
		// recherche de doublon
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j <array.length-1; j++)
			if (array[i] == array[j]) {
				doublon++;
			}
		}
	System.out.println("Il y a : "+doublon+" de doublons");
	
	// Exercice 3 
	// Méthode Arrays pour trier
	Arrays.sort(array);
	for (int i =0; i < array.length; i++) {
		System.out.print(array[i]+" ");
	}
}
}
