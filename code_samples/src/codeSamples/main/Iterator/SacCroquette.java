package Iterator;

public class SacCroquette implements Achetable {
	private String name;
	
	public SacCroquette(String name) {
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
		return "SacCroquette " + name;
	}

}
