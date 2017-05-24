package collectionsListSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AttentionALaGenericiteDesListes {
	/* 
	 * Ces deux fonctions renvoient toutes les deux des listes 
	 * Pour tant leur impact sur les fonctions suivantes est
	 * tout à fait significatifs
	 * 
	 * */
	
	/** Prend un paramètre n en entrée et renvoit une liste contenant
	 * n éléments de 0 à n - 1
	 * 
	 * @param liste : la liste à laquelle vous voulez ajouter les éléments
	 * @param n : le nombre d'élements à ajouter
	 * */
	private static void addInteger(List<Integer> liste, int n) {
		for(int i = 0; i < n; ++i)
		{
			liste.add(i);
		}
	}
	
	/** Prend un paramètre n en entrée et renvoit une liste contenant
	 * n éléments de 0 à n - 1
	 * 
	 * @param n : le nombre d'élements à ajouter
	 * */
	public static List<Integer> getListNumero1(int n)
	{
		List<Integer> liste = new LinkedList();
		//Queue<Integer> queue = new LinkedList();
		addInteger(liste, n);
		return liste;
	}
	
	/** Prend un paramètre n en entrée et renvoit une liste contenant
	 * n éléments de 0 à n - 1
	 * 
	 * @param n : le nombre d'élements à ajouter
	 * */
	public static List<Integer> getListNumero2(int n)
	{
		List<Integer> liste = new ArrayList();
		addInteger(liste, n);
		return liste;
	}
	
	/** Fais la somme des éléments d'une liste et mesure le temps pris 
	 * (méthode rudimentaire)
	 * 
	 * @param n : le nombre d'éléments de la liste à créer
	 */
	public static long calculerTempsSommeListe(List<Integer> liste)
	{
		long begin = System.nanoTime();
		long somme = 0;
		for( int i = 0; i < liste.size(); ++i )
		{
			somme += liste.get(i);
		}
		long end = System.nanoTime();
		System.out.println("Temps pris : " + (end - begin)/1000 + " micro-secondes.");
		return somme;
	}
	
	/** Fais la somme des éléments d'une liste et mesure le temps pris 
	 * (méthode rudimentaire)
	 * 
	 * @param n : le nombre d'éléments de la liste à créer
	 */
	public static long calculerTempsSommeListeEnVidant(List<Integer> liste)
	{
		long begin = System.nanoTime();
		long somme = 0;
		while( !liste.isEmpty() )
		{
			somme += liste.get(0);
			liste.remove(0);
		}
		long end = System.nanoTime();
		System.out.println("Temps pris : " + (end - begin)/1000 + " micro-secondes.");
		return somme;
	}

	
}
