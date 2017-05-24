package Iterator;

import java.util.*;

public class ZooAnimalerie {
	private List<Tigre> tigres;
	private List<Chien> chiens;
	private List<SacCroquette> sacCroquettes;
	
	private Iterable<Achetable> iterableAsAchetable;
	
	public ZooAnimalerie()
	{
		tigres = new ArrayList<Tigre>();
		chiens = new ArrayList();
		sacCroquettes = new ArrayList();
		iterableAsAchetable = new MultiListIterable<Achetable>(chiens, sacCroquettes);
	}
	
	public static void main(String[] args)
	{
		ZooAnimalerie zooA = new ZooAnimalerie();
		zooA.getChiens().add(new Chien("Max"));
		zooA.getSacCroquettes().add(new SacCroquette("Canigou 10 kg"));
		zooA.getSacCroquettes().add(new SacCroquette("Royal Canin 20 kg"));
		zooA.getChiens().add(new Chien("Tobi"));
		zooA.getChiens().add(new Chien("Medor"));
		
		zooA.getTigres().add(new Tigre());
		zooA.getTigres().add(new Tigre());
		zooA.getTigres().add(new Tigre());
		zooA.getTigres().add(new Tigre());
		zooA.getTigres().add(new Tigre());
		zooA.getTigres().add(new Tigre());
		zooA.getTigres().add(new Tigre());
		
		for(Achetable achetable : zooA.getIterableAsAchetable())
		{
			System.out.println(achetable);
		}
		
	}

	public List<Tigre> getTigres() {
		return tigres;
	}

	public List<Chien> getChiens() {
		return chiens;
	}

	public List<SacCroquette> getSacCroquettes() {
		return sacCroquettes;
	}

	public Iterable<Achetable> getIterableAsAchetable() {
		return iterableAsAchetable;
	}
}
