package exception;

import java.util.*;

public class TryCatchExemple {
	public static void main( String[] args) throws Exception
	{
		/*
		 * Décommentez l'une des lignes suivantes pour voir l'effet
		 */
		// exceptionCatchee();
		// exceptionNonCatchee();
		// exceptionNonCatcheeWithFinally();
	}

	private static void exceptionCatchee() throws Exception {
		List<Integer> liste = new ArrayList();
		try
		{
			Integer un = liste.get(0);
		}
		catch( IndexOutOfBoundsException ex )
		{
			System.err.println( "Oups, quelque chose n'a pas marché" );
			System.err.println( ex.getLocalizedMessage() );
			ex.printStackTrace(System.err);
		}
		finally
		{
			System.out.println("Je suis toujours exécuté");
		}
		System.out.println("Mais on survit quand même");
	}
	
	private static void exceptionNonCatchee() {
		List<Integer> liste = new ArrayList();
		try
		{
			Integer un = liste.get(0);
		}
		catch( ArithmeticException ex )
		{
			System.out.println("Tout va bien");
		}
		System.out.println("Mais on survit quand même");
	}
	
	private static void exceptionNonCatcheeWithFinally() {
		List<Integer> liste = new ArrayList();
		try
		{
			Integer un = liste.get(0);
		}
		finally
		{
			System.out.println("Je suis toujours exécuté");
		}
		System.out.println("Moi, je ne serai pas exécuté.");
	}
}
