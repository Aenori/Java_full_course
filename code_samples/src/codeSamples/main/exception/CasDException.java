package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Consumer;

public class CasDException {
	/*
	 * Lance l'exception Arithmetic divide par 0.
	 */
	public static void divideByZero()
	{
		int a = 1;
		int b = 0;
		int c = a/b;
	}

	/*
	 * Lance l'exception null pointer exception.  
	 * Cette exception est lancée dès lors que l'on 
	 * appelle une méthode ou fait une opération
	 * sur une valeur "null" autre que vérifier si
	 * elle est null.
	 */
	public static void nullPointerException()
	{
		Integer a = null;
		++a;
	}

	/*
	 * Lance l'exception indexOutOfBondException.  
	 * Cette exception est provoquée lorsque l'on 
	 * essaie d'accéder, pour une liste ou un tableau, 
	 * à un élément qui n'existe pas (ie un index qui
	 * n'existe pas)
	 */
	public static void indexOutOfBondExceptionWithList() {
		List<Integer> listeDEntier = new ArrayList<Integer>();
		for(int i = 0; i < 100 ; ++i)
		{
			listeDEntier.add(i);
		}
		listeDEntier.get(listeDEntier.size());
	}

	/*
	 * Lance l'exception indexOutOfBondException.  
	 * Cette exception est provoquée lorsque l'on 
	 * essaie d'accéder, pour une liste ou un tableau, 
	 * à un élément qui n'existe pas (ie un index qui
	 * n'existe pas)
	 */
	public static void indexOutOfBondExceptionWithArray() {
		int[] tableauDEntier = new int[50];
		int a = tableauDEntier[50];
	}

	/*
	 * Lance l'exception null pointer exception.  
	 * Cette exception est lancée dès lors que l'on 
	 * appelle une méthode ou fait une opération
	 * sur une valeur "null" autre que vérifier si
	 * elle est null.
	 */
	public static void wrongParseInteger() {
		int a = Integer.parseInt("aa");
	}

	/*
	 * Lance une conversion de type ClassCastException
	 * Il est courant en java de faire des conversions 
	 * de Object vers un type donné, car beaucoup de fonctions
	 * génériques utilisent l'Object comme type de retour.
	 * 
	 * L'inconvénient, c'est que l'on peut, au niveau de la
	 * compilation, convertir n'importe quoi en n'importe quoi
	 */
	public static void badConversion() {
		Integer integer = new Integer(5);
		Object object = integer;
		String string = (String)object;
	}


	/*
	 * Lance une exception de type IOException.
	 * Les exceptions qui ne sont pas "basiques" (ie incluses
	 * dans le package java.lang) doivent être déclarées explicitement.
	 * Cela permet de garantir qu'elles sont prises en compte par
	 * le développeur.
	 */
	public static void fileThatDoesntExist() throws IOException
	{
		Path path = FileSystems.getDefault().getPath("normalement il y a peu de chance que ce fichier existe");
		
		/*
		 * Note : cette syntaxe un peu spécifique est ce que l'on 
		 * appelle une classe anonyme. En gros on déclare la classe 
		 * en même temps que l'on fait le new, en définissant les
		 * méthodes manquantes de l'interface Consumer
		 */
		
		Files.lines(path).forEach(new Consumer<String>(){
			@Override
			public void accept(String arg0) {
				System.out.println(arg0);
			}});
	}
}
