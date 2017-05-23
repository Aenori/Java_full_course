package ClassesEtHeritage;

public class TerreNeuve extends Chien
{
	private static final double tauxTVA = 20;
	
	
    private int nbDePersonnesSauvees;

    public TerreNeuve(String nom)
    {   
    	super(nom);
    	this.nom = "Mon roudoudou";
    }

    public void afficherTaille()
    {   
        System.out.println("Je suis très grand");
    }

    public void sauverDeLaNoyade()
    {   
        nbDePersonnesSauvees++;
    }   
}
