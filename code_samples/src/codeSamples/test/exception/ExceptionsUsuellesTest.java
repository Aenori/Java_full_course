package exception;

import java.io.IOException;
import java.util.ArrayList;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.TestCase;
import testUtils.NullGenericMatcher;

import static org.hamcrest.CoreMatchers.containsString;

public class ExceptionsUsuellesTest {	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testArithmeticException() {
		exception.expect(ArithmeticException.class);
		exception.expectMessage(containsString("/ by zero"));
		ExceptionsUsuelles.divideByZero();
	}
	
	@Test
	public void testNullPointerException() {
		exception.expect(NullPointerException.class);
		exception.expectMessage(new NullGenericMatcher<String>());
		ExceptionsUsuelles.nullPointerException();
	}
	
	@Test
	public void testOutOfBoundExceptionWithList() {
		exception.expect(IndexOutOfBoundsException.class);
		exception.expectMessage(containsString("Index: 100, Size: 100"));
		ExceptionsUsuelles.indexOutOfBondExceptionWithList();
	}
	
	@Test
	public void testOutOfBoundExceptionWithArray() {
		exception.expect(IndexOutOfBoundsException.class);
		exception.expectMessage(containsString("50"));
		ExceptionsUsuelles.indexOutOfBondExceptionWithArray();
	}
	
	@Test
	public void testWrongParseInteger() {
		exception.expect(NumberFormatException.class);
		exception.expectMessage(containsString("For input string: \"aa\""));
		ExceptionsUsuelles.wrongParseInteger();
	}
	
	@Test
	public void testBadConversion() {
		exception.expect(ClassCastException.class);
		exception.expectMessage(containsString("java.lang.Integer cannot be cast to java.lang.String"));
		ExceptionsUsuelles.badConversion();
	}
	
	@Test
	/* C'est un peu idiot puisqu'il s'agit d'une fonction de test, mais
	 * on doit déclarer l'exception car elle n'appartient au package java.lang.
	 */
	 
	public void testFileThatDoesntExist() throws IOException {
		exception.expect(java.nio.file.NoSuchFileException.class);
		// Ce message apparaît parce que c'est le nom du fichier
		exception.expectMessage(containsString("normalement il y a peu de chance que ce fichier existe"));
		ExceptionsUsuelles.fileThatDoesntExist();
	}
}
