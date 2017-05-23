package collectionsListSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class AttentionALaGenericiteDesCollections {
	private static Collection getCollection(boolean b, int n) {
		Collection collection = b ? new HashSet() : new ArrayList();
		for(int i = 0; i < n ; ++i)
		{
			collection.add(i);
		}
		return collection;
	}
	
	public static boolean doTest(boolean Coll1isSet, boolean Coll2isSet, int n)
	{
		Collection<Integer> collection1 = getCollection(Coll1isSet,n);
		Collection<Integer> collection2 = getCollection(Coll2isSet,n);
		return collection1.containsAll(collection2);
	}
}
