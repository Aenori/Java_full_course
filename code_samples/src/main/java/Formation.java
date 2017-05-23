
public class Formation {
	private OrganismeFormation organismeFormation;
	
	public Formation(
			OrganismeFormation organismeFormation
			)
	{
		this.organismeFormation = organismeFormation;
		organismeFormation.getListeFormation().add(this);
	}
}
