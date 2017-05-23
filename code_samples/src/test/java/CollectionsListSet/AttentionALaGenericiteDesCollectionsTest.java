package CollectionsListSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AttentionALaGenericiteDesCollectionsTest extends TestCase {	
	public void test01ContainsAll_List_List()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(false, false, 10000));
	}
	
	public void test02ContainsAll_Set_List()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(true, false, 10000));
	}
	
	public void test03ContainsAll_List_Set()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(false, true, 10000));
	}
	
	public void test04ContainsAll_Set_Set()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(true, true, 10000));
	}
	
	public void test05ContainsAll_List_List()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(false, false, 100000));
	}
	
	public void test06ContainsAll_Set_List()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(true, false, 100000));
	}
	
	public void test07ContainsAll_List_Set()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(false, true, 100000));
	}
	
	public void test08ContainsAll_Set_Set()
	{
		assertTrue(AttentionALaGenericiteDesCollections.doTest(true, true, 100000));
	}

}
