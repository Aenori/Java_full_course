package Classes_ExercicesDebugger;

public class Exercice04_matrice {
	/*
	 * Exercice n°4 : dans cette exercice on cherche à construire une
	 * matrice identité, c'est à dire un tableau n*n dont tous les éléments
	 * sont nuls à part ceux de la diagonale qui sont tous égaux à 1. 
	 *
	 * Cela ne fonctionne pas. Pourquoi ? A noter qu'il s'agit ici moins 
	 * de corriger le problème (certaines idées de correction qui viennent
	 * naturellement fonctionnent très bien) mais de le comprendre.  
	 * 
	 * A quoi ressemble la matrice que l'on obtient ? Qu'est-ce qui ne
	 * fonctionne pas ?  
	 */
	public static void main(String[] args) throws Exception
	{
		int n = 5;
		int[][] matrice = matriceDeZero(n);
		checkMatriceZero( matrice );
		matrice = matriceIdentite(n);
		checkMatriceIdentite( matrice );
	}

	private static int[][] matriceIdentite(int n) {
		int[][] matrice = matriceDeZero(n);
		for(int i = 0; i < n; ++i)
		{
			matrice[i][i] = 1;
		}
		return matrice;
	}

	private static int[][] matriceDeZero(int n) {
		int[]   ligne = new int[n];
		int[][] matrice = new int[n][];
		for(int i = 0; i < n; ++i)
		{
			ligne[i] = 0;
		}

		for(int i = 0; i < n; ++i)
		{
			matrice[i] = ligne;
		}
		return matrice;
	}

	private static void checkMatriceZero(int[][] matrice) throws Exception
	{
		int n = matrice.length;

		checkMatriceEstCarre(matrice);

		// Question subsidiaire : sapristi, que cette boucle est laide ...
		// en utilisant le debugger pour comprendre sont fonctionnement, 
		// pourriez-vous proposer une réécriture un peu plus décente ??
		for(int i = 0, j = 0; i != n ; j = (++j % n), i = (j == 0 ? ++i : i)  )
		{
			if( matrice[i][j] != 0)
			{
				throw new Exception(String.format(
						"Valeur incorrecte hors de la diagonale [%s][%s] : %s", 
						i, j, matrice[i][j] ));
			}
		}
	}

	private static void checkMatriceIdentite(int[][] matrice) throws Exception
	{
		int n = matrice.length;

		checkMatriceEstCarre(matrice);

		for(int i = 0, j = 0; i != n ; j = (++j % n), i = (j == 0 ? ++i : i)  )
		{
			if( (i==j) )
			{
				if( matrice[i][j] != 1 )
				{
					throw new Exception(String.format(
							"Valeur incorrecte sur la diagonale [%s][%s] : %s", 
							i, j, matrice[i][j] ));
				}
			}
			else if( matrice[i][j] != 0)
			{
				throw new Exception(String.format(
						"Valeur incorrecte hors de la diagonale [%s][%s] : %s", 
						i, j, matrice[i][j] ));
			}
		}
	}

	private static void checkMatriceEstCarre(int[][] matrice) throws Exception {
		int n = matrice.length;
		for(int i = 0; i < n; ++i)
		{
			if(matrice[i].length != matrice.length)
			{
				throw new Exception(String.format(
						"La matrice n'est pas carré : nombre de ligne %s, nombre de colonnes " +
								" de la ligne %s  : %s", 
								matrice.length, i, matrice[i].length ));
			}
		}

	}
}
