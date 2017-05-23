package typesElementaires;

public class DifferencesIntegerInt {
	public static void leCoteObscurDeJava()
	{
		{
			Integer a = new Integer(5);
			Integer b = new Integer(5);

			/* Ce test va afficher False, a et b ne sont pas
			 * identiques.
			 */
			System.out.println("a == b : " + (a == b));
			/* Celui-ci va afficher False, a et b ne sont pas
			 * identiques.
			 */
			System.out.println("a.equals(b) : " + a.equals(b));
		}


		/* Ce test va afficher True, a et b sont identiques.
		 */
		{
			Integer a1 = 5;
			Integer b1 = 5;
			System.out.println("a1 == b1 : " + (a1 == b1));
		}


		/* Ce test va afficher False, a et b ne sont pas identiques ...
		 * On a donc un comportement de Java qui dépend de la valeur,
		 * ce qui est normalement proscrit. Il s'agit toutefois d'un cas
		 * très spécifique.
		 * 
		 * Dans les détails il y a une optimisation mémoire pour le 
		 * Integer a1 = 5; qui n'existe pas pour Integer a2 = 500000; 
		 * (Les programmeurs ont supposé que l'on utilise beaucoup plus
		 * souvent les petits nombres que les grands, ce qui fait sens)
		 */
		{
			Integer a2 = 500000;
			Integer b2 = 500000;
			System.out.println("a2 == b2 : " + (a2 == b2));
		}
	}
}
