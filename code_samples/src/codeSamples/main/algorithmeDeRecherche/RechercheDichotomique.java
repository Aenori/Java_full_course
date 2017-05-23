package algorithmeDeRecherche;

public class RechercheDichotomique {
	public static int PositionParRechercheDichotomique(
			int[] tableau,
			int elementATrouver
			)
	{
		/* Comme souvent en informatique, il est plus simple de
		 * fonctionner avec des intervalles semi-ouvert.
		 * Ici [positionInferieur,positionSuperieure[
		 */
		int positionInferieure = 0;
		int positionSuperieure = tableau.length;
		
		/* Tant que l'intervalle de recherche n'est pas réduit à un
		 * élément.
		 */
		while(positionSuperieure - positionInferieure > 1)
		{
			// On regarde le milieu de l'intervalle de recherche
			int milieu = (positionInferieure + positionSuperieure)/2;
			
			// Si ce milieu est strictement plus grand, l'intervalle
			// de recherche devient [positionInferieure, positionSuperieure [
			if(tableau[milieu] > elementATrouver)
			{
				positionSuperieure = milieu;
			}
			else
			{
				positionInferieure = milieu;
			}
		}
		
		/* Lorsque l'intervalle de recherche est réduit à un élément,
		 * soit c'est le bon, soit on renvoit -1 (convention pour dire
		 * que l'on n'a pas trouvé l'élément)
		 */
		if( tableau[positionInferieure] == elementATrouver )
		{
			return positionInferieure;
		}
		return -1;
	}
}
