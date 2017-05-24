package interfaces;

import java.util.*;

public class RouletteRusse implements Iterable<Object>, JeuDangeureux {

	private static class RouletteRusseIterator implements Iterator<Object>
	{
		private int position;
		
		private RouletteRusseIterator()
		{
			position = (new Random()).nextInt(6);
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return position >= 0;
		}

		@Override
		public Object next() {
			if( position == 0 )
			{
				System.out.println("Pan t'es mort !");
			}
			else
			{
				System.out.println("Ouf ...");
			}
			position--;
			return null;
		}
		
	}

	public static void main(String[] args) {
		RouletteRusse rouletteRusse = new RouletteRusse();
		jouerDanger(rouletteRusse);
		for(Object o : rouletteRusse)
		{
			
		}

	}

	public static void jouerDanger(JeuDangeureux jeu) {
		jeu.jouer();
	}
	
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new RouletteRusseIterator();
	}

	
	@Override
	public void jouer() {
		// TODO Auto-generated method stub
		
	}

}
