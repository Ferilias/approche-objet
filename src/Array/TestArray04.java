package Array;

import java.util.Scanner;

public class TestArray04 {
	
	public static void main(String[] args) {
		
	//initialisation des variables
	
	int valeur = 0;
	int tailletab =0;
	int choix = 0;
	int position = 0;
	
	//scanner
	Scanner sc = new Scanner(System.in);
	System.out.println("Veuillez rentrer la taille du tableau");
	tailletab = sc.nextInt();
	
	// création du tableau
	int[] tab = new int[tailletab];

//	// boucle de remplissage
//	for (int i = 0; i < tab.length; i++) {
//			// remplir avec des valeurs aléatoires pour les tests
//			tab[i] = (int)((Math.random() *range)- (min));
//			System.out.println(" Matière " + i + " note  vaut " + tab[i]);
//		}

	
	while (choix < 3) {
		

		// demande option
		System.out.println("Veuillez faire votre choix : ");
		System.out.println("Choix 1 : Ajout d'un nombre au tableau ");
		System.out.println("Choix 2 : Affichage du tableau ");
		System.out.println("Choix 3 : Sortir du tableau ");
		choix = sc.nextInt();
		
		//ajout numéro
		if (choix == 1) {
			if (position == tab.length) {
				tailletab++;
				int[] tab2 = new int[tailletab];
				for (int i = 0; i < tab.length; i++) {
					tab2[i] = tab[i];
				}
				tab = tab2;
			}
			System.out.println("Vous avez fait le choix numéro : 1 ");
			System.out.println("Veuillez ajouter votre nombre ");
			valeur = sc.nextInt();
			tab[position] = valeur;
			position++;
			
		}
		else if (choix == 2) {
			System.out.println("Vous avez fait le choix numéro : 2 ");
			for (int i = 0; i < tab.length; i++) {
				System.out.print(tab[i]+" ");
			}

		}
	}
	sc.close();
}
}


