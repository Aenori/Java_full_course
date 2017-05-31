package debugger;

import java.util.*;

public class Exercice02_SameObject {
	/*
	 * Exercice n°2 : dans cet exercice, on définit une méthode "inverser"
	 * qui prend en entrée deux tableaux de même longueur, et qui recopie
	 * dans le deuxième tableau les éléments du premier tableau en ordre
	 * inversé.
	 * 
	 * Problème, l'on devrait obtenir 4 tableaux 5,4,3,2,1, et ce n'est pas
	 * le cas.
	 * 
	 * Saurez-vous le détecter l'itération sur laquelle il y a un problème 
	 * en utilisant le debugger (ce ne sera pas la même à chaque fois)
	 * par deux méthodes différentes ?
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
			inverserTableau( liste_origine.get(pos), liste_destination.get(pos) );
		}
		
		for(int[] tab : liste_origine)
		{
			System.out.println(tabToString(tab));
		}
	}

	private static String tabToString(int[] tab) {
		String res = "[";
		for(int i = 0;i < tab.length; ++i)
		{
			res += " " + tab[i];
		}
		return res + " ]";
	}

	private static void inverserTableau(int[] src, int[] dest) {
		
		for(int i = 0; i < src.length; ++i)
		{
			dest[i] = src[src.length - i - 1];
		}
		
	}
}
