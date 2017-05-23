package designPatterns.autoRegistration;
import java.util.*;

public class ObjetAvecListeStatique {
	private static final List<ObjetAvecListeStatique> listeObjets 
		= new ArrayList();

	private int id;
	
	public static ObjetAvecListeStatique getChatFromId(int id)
	{
		return ObjetAvecListeStatique.getListeChat().get(id);
	}
	
	public static List<ObjetAvecListeStatique> getListeChat()
	{
		return listeObjets;
	}
	
	public ObjetAvecListeStatique()
	{
		id = listeObjets.size();
		listeObjets.add(this);
	}
}
