package Classes_ExercicesDebugger;

public class Exercice03_algorithme1 {
	/*
	 * Exercice n°3 : on va effectuer 4 appels de la fonction
	 * algorithme1 dans le main de cet classe.
	 * Pour chacun des appels, indiquez les valeurs prises par les
	 * paramètres d'entrée de la fonction a et b.
	 * 
	 * Par exemple pour l'appel 1, vous devez trouver :
	 *     1221 121
	 * 	    121  11
	 * 	     11   0
	 * 
	 * A votre avis, que fait cette fonction ?	
	 */
	public static void main(String[] args) throws Exception
	{
		System.out.println( "1221,      121 => " + algorithme1( 1221, 121 ) );
		System.out.println( "125,      1690 => " + algorithme1( 125   , 1690 ) );
		System.out.println( "20790,   51051 => " + algorithme1( 20790, 51051 ) );
		System.out.println( "624675, 737907 => " + algorithme1( 624675, 737907 ) );
		
	}

	private static int algorithme1(int a, int b) throws Exception {
		if( b < 0 || a < 0 ) 
		{
			throw new Exception("Cet algorithme est prévu pour des valeurs positives");
		}
		if( b > a )
		{
			return algorithme1( b, a );
		}
		if( b == 0 )
		{
			return a;
		}
		int reste = a % b;
		return algorithme1(b, reste);
		
	}
}
