package exceptions;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exercice2_readAndCheckFiles {
	/*
	 * Complétez cette fonction pour qu'elle lise les fichiers données en paramètres,
	 * et :
	 * 		- affiche un message lorsque le fichier n'existe pas
	 * 		- en affiche un autre si l'en tête n'est pas :
	 * 			id;numeroSecuriteSociale;nom;prenom
	 * 		
	 * Elle renverra l'ensemble des lignes lues sur les fichiers valides
	 */
	public static List<String> lirePlusieursFichiers(List<String> listeFichiers)
	{
		return null;
	}
	
	public static void main(String[] args) throws IOException
	{
		// Pour lire un fichier 
		// readFileAllLines("ressources_exception/fichier1.csv");
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("ressources_exception/fichier1.csv");
		liste1.add("ressources_exception/fichier2.csv");
		liste1.add("ressources_exception/fichier3.csv");
		liste1.add("ressources_exception/fichier4.csv");
		
		lirePlusieursFichiers( liste1 );
		
		List<String> liste2 = new ArrayList<String>();
		liste2.add("ressources_exception/fichier1.csv");
		liste2.add("ressources_exception/fichier2.csv");
		liste2.add("ressources_exception/fichier3.csv");
		liste2.add("ressources_exception/fichier6.csv");
		
		lirePlusieursFichiers( liste2 );
		
		List<String> liste3 = new ArrayList<String>();
		liste3.add("ressources_exception/fichier1.csv");
		liste3.add("ressources_exception/fichier2.csv");
		liste3.add("ressources_exception/fichier7.csv");
		liste3.add("ressources_exception/fichier9.csv");
		
		lirePlusieursFichiers( liste3 );
	}
	
	public static List<String> readFileAllLines(String filename) throws IOException 
	{
		Path path = FileSystems.getDefault().getPath(filename);
		
		List<String> result = new ArrayList<String>();

		Files.lines(path).forEach(new Consumer<String>(){
			@Override
			public void accept(String line) {
				result.add(line);
			}});
		return result;

	}
}
