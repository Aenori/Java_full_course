package algorithmesDeTriEtComparaison;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmeDeComparaison {
	/** Fonction qui prend en entrée deux tableaux triés
	 * (on ne vérifie pas qu'ils sont triés, l'utilisateur
	 * doit savoir ce qu'il fait) et renvoit une fusion triée
	 * des deux tableaux.
	 * 
	 * Cette fonction est dotée d'un vrai test unitaire
	 * 
	 * @return
	 */
	public static int[] fusionnerDeuxTableauxTries(int[] tab, int[] tab2)
	{
		int[] resultat = new int[tab.length + tab2.length];
		/* On va iterer simultanément sur les deux tableaux, aussi
		 * on déclare deux variables, pos pour la position courante
		 * dans tab, pos2 pour la position courante dans tab2.
		 * On commence au début des deux tableaux, donc à 0.
		 */
		int pos  = 0, pos2 = 0;
		
		/* On sait que l'on doit définir tous les éléments du
		 * tableau résultats.
		 */
		for(int i = 0; i < resultat.length ; ++i )
		{
			/* Si l'on est arrivé à la fin du tableau 1, on
			 * finit de recopier ceux du tableau 2 */
			if( pos == tab.length )
			{
				/* Cette notation permet de faire en une fois l'assignation
				 * dans le tableau résultat, et de déplacer la position dans 
				 * le tableau 2.
				 * Elle fait sens ici, mais lorsque l'on n'a pas l'habitude,
				 * on préfèrera séparer incrémentation et utilisation de la 
				 * variable.
				 * 
				 * A noter qu'ici remplacer pos2++ par ++pos2 serait une erreur.
				 */
				resultat[i] = tab2[pos2++];
			}
			/* Si l'on est arrivé à la fin du tableau 2, ou
			 * si l'élément courant du tableau 1 est plus petit,
			 * on le recopie */
			else if( pos2 == tab.length 
				  || tab[pos] < tab2[pos2] )
			{
				resultat[i] = tab[pos++];
			}
			/* sinon (on est arrivé au bout d'aucun tableau, et
			 * l'élement du tableau 2 est inférieur ou égal),
			 * on recopie l'élément du tableau 2. */
			else
			{
				resultat[i] = tab2[pos2++];
			}
		}
		
		return resultat;
	}

	public static List<Integer> fusionnerDeuxListesTriees(
			List<Integer> liste1, 
			List<Integer> liste2)
	{
		List<Integer> resultat = new ArrayList(liste1.size() + liste2.size());
		/* On va iterer simultanément sur les deux tableaux, aussi
		 * on déclare deux variables, pos pour la position courante
		 * dans tab, pos2 pour la position courante dans tab2.
		 * On commence au début des deux tableaux, donc à 0.
		 */
		int pos1  = 0, pos2 = 0;
		
		/* On sait que l'on doit définir tous les éléments du
		 * tableau résultats.
		 */
		for(int i = 0; i < liste1.size() + liste2.size() ; ++i )
		{
			/* Si l'on est arrivé à la fin du tableau 1, on
			 * finit de recopier ceux du tableau 2 */
			if( pos1 == liste1.size() )
			{
				/* Cette notation permet de faire en une fois l'assignation
				 * dans le tableau résultat, et de déplacer la position dans 
				 * le tableau 2.
				 * Elle fait sens ici, mais lorsque l'on n'a pas l'habitude,
				 * on préfèrera séparer incrémentation et utilisation de la 
				 * variable.
				 * 
				 * A noter qu'ici remplacer pos2++ par ++pos2 serait une erreur.
				 */
				resultat.add( liste2.get(pos2++) );
			}
			/* Si l'on est arrivé à la fin du tableau 2, ou
			 * si l'élément courant du tableau 1 est plus petit,
			 * on le recopie */
			else if( pos2 == liste2.size() 
				  || liste1.get(pos1) < liste2.get(pos2) )
			{
				resultat.add( liste1.get(pos1++) );
			}
			/* sinon (on est arrivé au bout d'aucun tableau, et
			 * l'élement du tableau 2 est inférieur ou égal),
			 * on recopie l'élément du tableau 2. */
			else
			{
				resultat.add( liste2.get(pos2++) );
			}
		}
		
		return resultat;
	}

}
