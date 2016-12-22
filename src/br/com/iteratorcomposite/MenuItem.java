package br.com.iteratorcomposite;

public class MenuItem {
	
	private final String name;
	private final String descripton;
	private final boolean vegetarian;
	private final double price;
	
	private MenuItem(final String name, final String descripton, final boolean vegetarian, final double price) {
		super();
		this.name = name;
		this.descripton = descripton;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public static MenuItem valueOf(final String name, final String descripton, final boolean vegetarian, final double price) {
		final MenuItem menuItem = new MenuItem(name, descripton, vegetarian, price);
		return menuItem;
	}

	public String getName() {
		return name;
	}

	public String getDescripton() {
		return descripton;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}
}
