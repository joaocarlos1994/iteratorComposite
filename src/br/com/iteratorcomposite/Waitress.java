package br.com.iteratorcomposite;

import java.util.Iterator;

public class Waitress {
	
	private final Menu pancakeHouseMenu;
	private final Menu dinnerMenu;
	
	public Waitress(final Menu pancakeHouseMenu, final Menu dinnerMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		final Iterator<MenuItem> pacakeIterator = pancakeHouseMenu.createIterator();
		final Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
		
		System.out.println("MENU\n ----\nBREAKFAST");
		printMenu(pacakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinnerIterator);
	}

	/**
	 * Teste se ainda ha outros: iterator.hasNext()
	 * Recupera o proximo:  iterator.next();
	 * */
	private void printMenu(final Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			final MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescripton());
		}
	}
	
}
