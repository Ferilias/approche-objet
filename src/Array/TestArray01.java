package Array;

public class TestArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialisation des valeurs
		int maximum = 0;
		int minimum = 0;
		
		// affiche le résultat
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
		// affiche l'inverse
		for (int i = 1; i <= array.length; i++) {
			System.out.print(array[array.length - i]+" ");
		}
		System.out.println(" ");
		// affcihe les supérieur à 3
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println(" ");
		// affcihe les nombres pairs
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0) {
				System.out.print(array[i]+" ");
	}
		}
		System.out.println(" ");
		// affcihe le minimum et maximum
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimum) {
				minimum = array[i];
			if (array[i] > maximum) {
				maximum = array[i];
	}
		}
		}
			System.out.println("Le maximum : "+maximum);
			System.out.println("Le minimum : "+minimum);

}
}