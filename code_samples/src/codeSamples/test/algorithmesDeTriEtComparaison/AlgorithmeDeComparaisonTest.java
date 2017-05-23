package algorithmesDeTriEtComparaison;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import testUtils.TestsPersonnalises;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AlgorithmeDeComparaisonTest extends TestCase {
	
	
	public void test01FusionnerDeuxTableauxTries()
	{
		int[] tableau1 = new int[]{1,2,3};
		int[] tableau2 = new int[]{4,5,6};
		
		TestsPersonnalises.assertTableauEquals( 
				new int[]{1,2,3,4,5,6},
				AlgorithmeDeComparaison.fusionnerDeuxTableauxTries( 
						tableau1, 
						tableau2 )
				);
		
		TestsPersonnalises.assertTableauEquals( 
				new int[]{1,2,3,4,5,6},
				AlgorithmeDeComparaison.fusionnerDeuxTableauxTries( 
						tableau2, 
						tableau1 )
				);
		
		TestsPersonnalises.assertTableauEquals( 
				new int[]{1,1,2,2,3,3},
				AlgorithmeDeComparaison.fusionnerDeuxTableauxTries( 
						tableau1, 
						tableau1 )
				);
		
	}

	
}
