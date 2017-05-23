package ClassesEtHeritage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args)
	{
		List<TerreNeuve> chenilTerreNeuve = new ArrayList();
		
		chenilTerreNeuve.add(new TerreNeuveDeCompetition());
		chenilTerreNeuve.add(new TerreNeuve("Beethoveen"));
		
		// On applique un traitement commun à tous les terre-neuve
		for(TerreNeuve terreNeuveSauveur : chenilTerreNeuve)
		{
			terreNeuveSauveur.sauverDeLaNoyade();
		}
		
		List<Chien> chenil = new ArrayList();
		
		// On ajoute les terre neuve au chenil de Chien
		chenil.addAll( chenilTerreNeuve );
		// On ajoute un Rotteweiller
		chenil.add( new Rottweiller("Bichon") );
		
		// On applique tous les traitements communs aux chiens
		for( Chien monChienQuiVaAboyer : chenil )
		{
		   monChienQuiVaAboyer.afficherTaille();
		   monChienQuiVaAboyer.aboyer();
		}
	}
}
