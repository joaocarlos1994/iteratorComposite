package br.com.iteratorcomposite;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {
	
	private final MenuItem[] items;
	int position = 0;

	public DinnerMenuIterator(final MenuItem[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		final MenuItem menuItem = items[position];
		position += 1;
		return menuItem;
	}
	
	@Override
	public void remove() {
		if (position <= 0)
			throw new IllegalArgumentException
					("You can't remove an item untin you've done at least one next()");
		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i+1];
			}
			items[items.length - 1] = null;
		}		
	}

}
