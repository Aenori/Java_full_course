package exceptions.correction;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class Exercice2_readAndCheckFiles {
	private static final String expectedHeader = "id;numeroSecuriteSociale;nom;prenom";
	/*
	 * Complétez cette fonction pour qu'elle lise les fichiers données en paramètres,
	 * et :
	 * 		- affiche un message lorsque le fichier n'existe pas
	 * 		- en affiche un autre si l'en tête n'est pas :
	 * 			id;numeroSecuriteSociale;nom;prenom
	 * 		
	 * Elle renverra l'ensemble des lignes lues sur les fichiers valides
	 */
	private static class WrongHeaderException extends Exception {}
	
	public static List<String> lirePlusieursFichiers(List<String> listeFichiers)
	{
		List<String> listeDeToutesLesLignes = new ArrayList<String>();
		for(String nomFichier : listeFichiers)
		{
			try
			{
				listeDeToutesLesLignes.addAll(lireLigneFichier(nomFichier));
			}
			catch( IOException ex )
			{
				System.err.println("File " + nomFichier + " n'existe pas.");
			}
			catch( WrongHeaderException ex )
			{
				System.err.println("Wrong header for file : " + nomFichier);
			}
		}
		return listeDeToutesLesLignes;
	}
	
	private static Collection<? extends String> lireLigneFichier(String nomFichier) throws IOException, WrongHeaderException {
		// TODO Auto-generated method stub
		List<String> lignesFichiers = readFileAllLines(nomFichier);
		if( !lignesFichiers.get(0).equals(expectedHeader))
		{
			throw new WrongHeaderException();
		}
		return lignesFichiers;
	}

	public static void main(String[] args) throws IOException
	{
		// Pour lire un fichier 
		// readFileAllLines("ressources_exception/fichier1.csv");
		
		List<String> liste1 = Arrays.asList(
			"ressources_exception/fichier1.csv",
			"ressources_exception/fichier2.csv",
			"ressources_exception/fichier3.csv",
			"ressources_exception/fichier4.csv");
		
		List<String> listeLignes = lirePlusieursFichiers( liste1 );
		System.out.println( listeLignes.size() );
		
		List<String> liste2 = Arrays.asList(
			"ressources_exception/fichier1.csv",
			"ressources_exception/fichier2.csv",
			"ressources_exception/fichier3.csv",
			"ressources_exception/fichier6.csv");
		
		listeLignes = lirePlusieursFichiers( liste2 );
		System.out.println( listeLignes.size() );
		
		List<String> liste3 = Arrays.asList(
			"ressources_exception/fichier1.csv",
			"ressources_exception/fichier2.csv",
			"ressources_exception/fichier7.csv",
			"ressources_exception/fichier9.csv");
		
		listeLignes = lirePlusieursFichiers( liste3 );
		System.out.println( listeLignes.size() );
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
