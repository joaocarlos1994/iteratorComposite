package br.com.iteratorcomposite;

import java.util.Iterator;

public class DinnerMenu implements Menu {
	
	private static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	final MenuItem[] menuItems;
	
	public DinnerMenu() {
		this.menuItems = new MenuItem[MAX_ITEMS];
		
		addItem(MenuItem.valueOf("Vegetarian BLT", 
								 "(Fakin') Bacon with lettuce & tomato on whole wheat", 
								 true, 
								 2.99));
		
		addItem(MenuItem.valueOf("BLT", 
				 				 "Bacon with lettuce & tomato on whole wheat", 
				 				 false, 
				 				 2.99));
		
		addItem(MenuItem.valueOf("Soup of the day", 
								 "Soup of the day, with a side of potato salad", 
								 false, 
								 3.29));
		addItem(MenuItem.valueOf("Hotdog", 
				 				 "A hot dog, with saukraut, relish, onions, topped with cheese", 
				 				 false, 
				 				 3.05));
	}
	
	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinnerMenuIterator(menuItems);
	}

	private void addItem(final MenuItem instance) {
		if (numberOfItems  >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = instance;
			numberOfItems += 1;
		}
	}
	
}
