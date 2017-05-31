package classesVilles.correction;

import java.util.List;

import classesVilles.DistanceLatitudeLongitude;

public class Ville {
	/*
	 * # Question 1 :
	 * 	Créez une classe Ville qui possède les attributs suivants :
	 *  - un nom
	 *  - une longitude
	 *  - une latitude
	 *  Quel type allez-vous utiliser ?
	 */
	private String nom;
	private double latitude;
	private double longitude;

	/*
	 * # Question 2 :
	 * Créez les accesseurs (getters et setters) pour ces 3 attributs.
	 * Mettez ces attributs en private.
	 */
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/*
	 * # Question 3 :
	 * Définissez un constructeur qui prennent 3 arguments, dans cet ordre :
	 * - le nom	
	 * - une latitude
	 * - une longitude 
	 */
	public Ville(String nom, double latitude, double longitude)
	{
		this.nom = nom;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	/*
	 * # Question 4 :   
	 * Définissez une méthode estDansLHemisphereNord, qui ne prend pas d'arguments
	 * et renvoit true (un booléen) si la ville est dans l'hémisphère Nord.
	 *
	 * Hint: Comment peut-on savoir à partir de la latitude si une ville est dans
	 * l'hémisphère Nord ?
	 */ 
	public boolean estDansLHemisphereNord() { return latitude > 0; }
	
	/*
	 * # Question 5 : 
	 * Définissez une méthode estPlusAuNordQue, qui prend en argument une autre Ville
	 * et renvoit true si la Ville pour laquelle la méthode est appelée (le this)
	 * est plus au nord que la Ville donnée en argument.
	 */ 
	public boolean estPlusAuNordQue(Ville autreVille) { return latitude > autreVille.latitude; }
	
	/*
	 * # Question 6 : 
	 *
	 * Même question pour une méthode similaire estPlusALEst
	 */
	public boolean estPlusALEstQue(Ville autreVille) { return longitude > autreVille.longitude; }
	
	/*
	 * # Question 7 :
	 * 
	 * En utilisant les méthodes précédentes et sans utiliser les latitude et longitude,
	 * mais en utilisant les opérateurs booléen écrivez des fonctions estPlusALOuest et
	 * estPlusAuSud
	 */
	public boolean estPlusALOuestQue(Ville autreVille) { return autreVille.estPlusALEstQue(this); }
	public boolean estPlusAuSudQue(Ville autreVille)   { return autreVille.estPlusAuNordQue(this); }
	
	/* 
	 * # Question 8 :
	 *
	 * En utilisant le fichier DistanceLatitudeLongitude.java fourni, écrivez une méthode
	 * calculerDistance, qui prend en argument une autre ville et renvoit la distance.
	 */
	public double distance(Ville autreVille)
	{ 
		return DistanceLatitudeLongitude.distanceKilometriqueDepuisDegre(
			latitude, 
			longitude, 
			autreVille.latitude, 
			autreVille.longitude
		);
	}
	
	/*
	 * # Question 9 :
	 * 
	 * En utilisant la méthode précédente, écrivez une méthode trouvezVilleLaPlusProche
	 * qui prend en argument une liste de Ville et renvoit la Ville de la liste qui est
	 * la plus proche de la Ville pour laquelle la méthode est appelée.
	 */
	public Ville trouvezVilleLaPlusProche(List<Ville> listeVille)
	{ 
		Ville villeLaPlusProche = listeVille.get(0);
		for(Ville ville : listeVille)
		{
			if( distance(ville) < distance(villeLaPlusProche) )
			{
				villeLaPlusProche = ville;
			}
		}
		return villeLaPlusProche;
	}
	
	/*
	 * # Question 10 :
	 *
	 * Ecrivez une méthode **static** qui prend en argument une liste de ville et renvoit
	 * un tableau à deux dimensions de double, dont la valeur i, j est la distance de
	 * la ville i ) la ville j dans la liste donnée en entrée.
	 */
	public static double[][] matriceDistance(List<Ville> listeVille)
	{
		double[][] result = new double[listeVille.size()][listeVille.size()];
		for(int i = 0; i < listeVille.size(); ++i )
		{
			result[i][i] = 0;
			for(int j = i + 1; j < listeVille.size(); ++j )
			{
				double dist = listeVille.get(i).distance(listeVille.get(j));
				result[i][j] = result[j][i] = dist;
			}
		}
		return result;
	}

}
