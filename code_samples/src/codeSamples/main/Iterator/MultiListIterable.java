package Iterator;

import java.util.*;

public class MultiListIterable<T> implements Iterable<T> {
	private List< List< ? extends T > >     listeDeListes;
	
	public MultiListIterable(List< ? extends T >... lists )
	{
		listeDeListes = new ArrayList< List< ? extends T > >();
		for(int i = 0; i < lists.length ; ++i)
		{
			listeDeListes.add(lists[i]);
		}
	}
	
	private class MultiListIterator implements Iterator<T> {	
		private Iterator<List<? extends T>> listeIterator;
		private Iterator< ? extends T >     currentListeIterator;

		private MultiListIterator()
		{
			listeIterator = listeDeListes.iterator();
			currentListeIterator = null;
		}
		
		@Override
		public boolean hasNext() {
			return getCurrentListeIterator().hasNext();
		}

		private Iterator< ? extends T > getCurrentListeIterator() {
			if(currentListeIterator == null) 
			{
				currentListeIterator = listeIterator.next().iterator();
				actuallyGoNext();
			}
			return currentListeIterator;
		}

		@Override
		public T next() {
			
			T current = (T) getCurrentListeIterator().next();
			actuallyGoNext();
			return current;
		}

		private void actuallyGoNext() {
			while( !currentListeIterator.hasNext() && listeIterator.hasNext() )
			{
				currentListeIterator = listeIterator.next().iterator();
			}
			
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new MultiListIterator();
	}
}