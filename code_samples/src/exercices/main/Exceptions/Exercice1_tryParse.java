package Exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercice1_tryParse {
	/*
	 * Compléter le code de la fonction ci dessous de 
	 * sorte à ce que la fonction renvoit :
	 *   - un Integer si la chaîne de caractère peut être parsée
	 *   - null sinon
	 */
	public Integer tryParseInteger(String s)
	{
		return null;
	}
	
	@Test
	public void testTryParseInteger()
	{
		String[] aTester = new String[]{
				"1234",
				"aagt",
				"1234e",
				"976",
				"1987656h",
				"123456"
		};
		
		Integer[] expected = new Integer[]{
				1234,
				null,
				null,
				976,
				null,
				123456
		};
		
		for(int i = 0; i < aTester.length; ++i)
		{
			assertEquals( expected[i], tryParseInteger( aTester[i] ) );
		}
	}
}
