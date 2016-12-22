package br.com.iteratorcomposite;

/**
 * O Padrao Iterator fornece uma maneira de acessar
 * sequencialmente os elementos de um objeto agregado
 * sem expor a sua representacao subjacente.
 * */
public class MenuTestDrive {

	public static void main(String[] args) {
		
		final Menu pancakeHouseMenu = new PancakeHouseMenu();
		final Menu dinnerMenu = new DinnerMenu();
		
		final Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
		waitress.printMenu();

	}

}
