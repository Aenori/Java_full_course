package Classes_ExercicesDebugger;

import java.util.*;

public class Exercice02_SameObject {
	/*
	 * Exercice n°2 : dans cet exercice, on définit une méthode "inverser"
	 * qui prend en entrée deux tableaux de même longueur, et qui recopie
	 * dans le deuxième tableau les éléments du premier tableau en ordre
	 * inversé.
	 * 
	 * Problème, l'un des tableaux d'origine s'est glissé dans la liste
	 * des tableaux de destinations.
	 * 
	 * Saurez-vous le détecter, en utilisant le debugger, par deux méthodes
	 * différentes ?
	 */
	public static void main(String[] args)
	{
		List<int[]> liste_origine     = new ArrayList();
		List<int[]> liste_destination = new ArrayList();
		List<Integer> order = new ArrayList();
				
		for(int i = 0; i < 5; ++i)
		{
			liste_origine.add(new int[]{1,2,3,4,5});
			order.add(i);
		}
		
		liste_destination.add(liste_origine.get(0));
		for(int i = 0; i < 4; ++i)
		{
			liste_destination.add(new int[]{1,2,3,4,5});
		}
		
		
		Collections.shuffle(order);
		
		for(int i = 0; i < 5; ++i)
		{
			int pos = order.get(i);
			inverserTableau( liste_origine.get(i), liste_destination.get(i) );
		}
	}

	private static void inverserTableau(int[] src, int[] dest) {
		for(int i = 0; i < src.length; ++i)
		{
			src[i] = dest[src.length - i - 1];
		}
		
	}
}
