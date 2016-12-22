package br.com.iteratorcomposite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
	
	private final List<MenuItem> listMenu;

	public PancakeHouseMenu() {
		super();
		this.listMenu = new ArrayList<>();
		
		addItem(MenuItem.valueOf("K&B's Pancake Breakfast",
									 "Pancakes with scrambled eggs, and toast", 
									 true,
									 2.99));
		
		addItem(MenuItem.valueOf("Regular Pancake Breakfast",
				 "Pancakes with fried eggs, sausage", 
				 false,
				 2.99));
		
		addItem(MenuItem.valueOf("Blueberry Pancakes",
				 "Pancakes made with fresh blueberries", 
				 true,
				 3.49));
		
		addItem(MenuItem.valueOf("Waffles",
				 "Waffles with your choice of blueberries or straberries", 
				 true,
				 3.59));
		
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return listMenu.iterator();
	}
	
	private void addItem(final MenuItem menuItem) {
		listMenu.add(menuItem);
	}
	
}
