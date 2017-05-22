package CollectionsListSet;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttentionALaGenericiteDesListesTest extends TestCase {
	/** Ici le test01 prendra sensiblement plus de temps que le test02
	 * (6000 ms contre 4 ms sur l'ordinateur utilisé pour faire ce 
	 * code).
	 */
	public void test01SommeAvecLinkedList()
	{
		System.out.println("\ntest01SommeAvecLinkedList\n");
		int n = 1000;
		for(int i = 0; i < 3 ; ++i, n*=10 )
		{
			System.out.println("LinkedList with size : " + n);
			AttentionALaGenericiteDesListes.calculerTempsSommeListe(
					AttentionALaGenericiteDesListes.getListNumero1(n));
		}
	}
	
	public void test02SommeAvecArrayList()
	{
		System.out.println("\ntest02SommeAvecArrayList\n");
		int n = 1000;
		for(int i = 0; i < 3 ; ++i, n*=10 )
		{
			System.out.println("LinkedList with size : " + n);
			AttentionALaGenericiteDesListes.calculerTempsSommeListe(
					AttentionALaGenericiteDesListes.getListNumero2(n));
		}
	}
	
	/** Ici le test04 prendra sensiblement plus de temps que le test03
	 * (623 ms contre 10 ms sur l'ordinateur utilisé pour faire ce 
	 * code).
	 * 
	 * En effet, on supprime le premier élément d'une ArrayList, ce
	 * qui est une mauvaise idée, l'objet n'est pas conçu pour cela.
	 */
	public void test03SommeEnVidantAvecLinkedList()
	{
		System.out.println("\ntest03SommeEnVidantAvecLinkedList\n");
		int n = 1000;
		for(int i = 0; i < 3 ; ++i, n*=10 )
		{
			System.out.println("LinkedList with size : " + n);
			AttentionALaGenericiteDesListes.calculerTempsSommeListeEnVidant(
					AttentionALaGenericiteDesListes.getListNumero1(n));
		}
	}
	
	public void test04SommeEnVidantAvecArrayList()
	{
		System.out.println("\ntest04SommeEnVidantAvecArrayList\n");
		int n = 1000;
		for(int i = 0; i < 3 ; ++i, n*=10 )
		{
			System.out.println("LinkedList with size : " + n);
			AttentionALaGenericiteDesListes.calculerTempsSommeListeEnVidant(
					AttentionALaGenericiteDesListes.getListNumero2(n));
		}
	}
}
