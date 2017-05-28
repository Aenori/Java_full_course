package Iterator;

public class Chien extends Animal implements Achetable {
	private String name;
	
	public Chien(String name) {
		this.name = name;
	}

	@Override
	public int getPrix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNbDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString()
	{
		return "Chien " + name;
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return name;
	}
}
