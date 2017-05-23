package ClassesEtHeritage;
import java.util.*;


public abstract	class Chien
{
	private	int nbPattes	=	4;
	protected	String	nom;
	
	public	Chien(String	nom)
	{
		this.nom	=	nom;
	}
	public	void	aboyer()
	{
		System.out.println("Wouaf	wouaf");
	}
	public abstract void afficherTaille();
	public int getNbPattes() {
		return nbPattes;
	}
	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}



