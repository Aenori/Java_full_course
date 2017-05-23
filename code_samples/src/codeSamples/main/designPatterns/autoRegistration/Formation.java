package designPatterns.autoRegistration;

/** 
 * Cette classe fonctionne avec la classe OrganismeFormation.  
 * On fait en sorte que lorsque l'on créé une Formation en lui 
 * donnant un organismeFormation, celle-ci s'ajoute automatiquement
 * à la liste correspondante.
 * 
 * @author Nicolas Rousset
 *
 */

public class Formation {
	private OrganismeFormation organismeFormation;
	
	public Formation(OrganismeFormation organismeFormation)
	{
		this.organismeFormation = organismeFormation;
		if( organismeFormation != null )
		{
			organismeFormation.getListeFormation().add(this);
		}
	}
}
