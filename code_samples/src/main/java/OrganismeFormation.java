import java.util.ArrayList;
import java.util.List;

public class OrganismeFormation {
	private List<Formation> listeFormation;

	public List<Formation> getListeFormation() {
		return listeFormation;
	}
	
	public Formation creerFormation()
	{
		Formation formation = new Formation(this);
		listeFormation.add(formation);
		return formation;
	}
}





