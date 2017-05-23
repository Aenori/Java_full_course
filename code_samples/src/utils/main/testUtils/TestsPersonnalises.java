package testUtils;

import junit.framework.TestCase;

public class TestsPersonnalises {
	public static void assertTableauEquals(
			int[] tableauReference, 
			int[] tableau) {
		
		// On vérifie que les tableaux sont de même longueur
		TestCase.assertEquals(
				String.format("Les deux tableaux ne sont pas de même " +
						"longueur : Ref {0} vs Resultat {1}",
						tableauReference.length,
						tableau.length
				),
				tableauReference.length,
				tableau.length
				);
		
		// On vérifie que les éléments sont les mêmes
		for(int i = 0; i < tableauReference.length; ++i)
		{
			TestCase.assertEquals(
					String.format("Les éléments à la position {0} sont" +
			"différents : Ref {1} vs Resultat {2}",
							i,
							tableauReference[i],
							tableau[i]
					),
					tableauReference[i],
					tableau[i]
			);
			
		}
		
	}
}
