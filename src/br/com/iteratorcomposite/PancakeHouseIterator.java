package br.com.iteratorcomposite;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseIterator implements Iterator<MenuItem> {

	private final List<MenuItem> listMenu;
	private int position = 0;
	
	public PancakeHouseIterator(final List<MenuItem> listMenu) {
		super();
		this.listMenu = listMenu;
	}

	@Override
	public boolean hasNext() {
		if (position >= listMenu.size() || listMenu.isEmpty() || listMenu == null) {
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		final MenuItem menuItem = listMenu.get(position);
		position += 1;
		return menuItem;
	}

}
