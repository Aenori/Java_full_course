package Classes_ExercicesDebugger;

import java.util.*;

public class Exercice01_valeursIntermediaires {
	/*
	 * Pour chacune des fonctions ci-dessous, trouvez la valeur de la
	 * variable valeur_intermediaire et notez en commentaire son type
	 * et sa valeur (ou ses valeurs pour le cas d'un tableau).
	 * 
	 * Question bonus : comment est implémenté le TreeSet de la fonction 
	 * fonction5 en Java ?
	 */
	
	public static void main(String[] args)
	{
		fonction1();
		fonction2();
		fonction3();
		fonction4();
		fonction5();
	}

	private static void fonction1() {
		int a = 123;
		int b = 645;
		int valeur_intermediaire = a*b;
		int c = valeur_intermediaire*2;
		System.out.println(c);
		
	}
	
	private static void fonction2() {
		int valeur_intermediaire = 1;
		for(int i = 1; i < 50; ++i)
		{
			if( i % valeur_intermediaire == 0 )
			{
				valeur_intermediaire *= i;
			}
		}
		System.out.println( "valeur_intermediaire != 0 ? " + (valeur_intermediaire != 0));
	}
	
	private static void fonction3() {
		int[] valeur_intermediaire = new int[5];
		valeur_intermediaire[0] = 1;
		int somme = 0;
		for(int i = 1; i < valeur_intermediaire.length; ++i)
		{
			valeur_intermediaire[i] = 2*valeur_intermediaire[i-1] + 1;
			somme += valeur_intermediaire[i];
		}
		System.out.println("Somme : " + somme);
	}
	
	private static void fonction4() {
		
		
	}
	
	private static void fonction5() {
		int n = 30;
		Set<Integer> valeur_intermediaire = new TreeSet<Integer>();
		for(int i = 2; i < n; ++i)
		{
			int j = 2;
			for(j = 2; j < i; ++j)
			{
				if( (i % j == 0) )
				{
					break;
				}
			}
			valeur_intermediaire.add(j);
		}
		System.out.println("Nb trouvés : " + valeur_intermediaire);
		
	}
}
