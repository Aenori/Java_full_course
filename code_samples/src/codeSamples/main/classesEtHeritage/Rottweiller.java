package classesEtHeritage;

public class Rottweiller extends Chien
{
    public Rottweiller(String nom)
    {   
        super(nom);
    }

    public void afficherTaille()
    {   
        System.out.println("Je suis grand");
    }
    
    public void aboyer()
    {   
        System.out.println("WOUAF GRR WOUAFF GRR WOUAFF");
    }
}

