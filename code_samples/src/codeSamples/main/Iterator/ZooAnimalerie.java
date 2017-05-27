package Iterator;

import java.util.*;

public class ZooAnimalerie {
	private List<Tigre> tigres;
	private List<Chien> chiens;
	private List<SacCroquette> sacCroquettes;
	private List<Animal> animaux;
	private List<Achetable> achetables;
	
	//private Iterable<Achetable> iterableAsAchetable;
	
	public ZooAnimalerie()
	{
		tigres = new ArrayList<Tigre>();
		chiens = new ArrayList();
		sacCroquettes = new ArrayList();
		animaux = new ArrayList();
		achetables = new ArrayList();
		//iterableAsAchetable = new MultiListIterable<Achetable>(chiens, sacCroquettes);
	}
	
	public static void main(String[] args)
	{
		ZooAnimalerie zooA = new ZooAnimalerie();
		zooA.ajouterChien(new Chien("Max"));
		zooA.ajouterSacCroquette(new SacCroquette("Canigou 10 kg"));
		zooA.ajouterSacCroquette(new SacCroquette("Royal Canin 20 kg"));
		zooA.ajouterChien(new Chien("Tobi"));
		zooA.ajouterChien(new Chien("Medor"));
		
		zooA.ajouterTigre(new Tigre());
		zooA.ajouterTigre(new Tigre());
		zooA.ajouterTigre(new Tigre());
		
		for(Achetable achetable : zooA.getChiens())
		{
			
		}
		for(Achetable achetable : zooA.getSacDeCroquettes())
		{
			
		}
		
	}

	private Iterable<Achetable> getSacDeCroquettes() {
		return achetables;
	}

	private void ajouterSacCroquette(SacCroquette sacDeCroquette) {
		sacCroquettes.add(sacDeCroquette);
		achetables.add(sacDeCroquette);
		
	}

	public void ajouterTigre(Tigre tigre)
	{
		animaux.add(tigre);
		tigres.add(tigre);
	}
	
	public void ajouterChien(Chien chien)
	{
		animaux.add(chien);
		achetables.add(chien);
		chiens.add(chien);
	}
	
	public Iterable<Tigre> getTigres() {
		return tigres;
	}
	
	public Iterable<Chien> getChiens() {
		return chiens;
	}

	public Iterable<Achetable> getAchetables() {
		return achetables;
	}
	/*public List<Chien> getChiens() {
		return chiens;
	}

	public List<SacCroquette> getSacCroquettes() {
		return sacCroquettes;
	}*/

	/*public Iterable<Achetable> getIterableAsAchetable() {
		return iterableAsAchetable;
	}*/
}
