
public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe Burger", "Sausage & Bacon", 3.54, "white");
		super.addHamburgerAddition1("chips", 2.75);
		super.addHamburgerAddition2("drinks", 1.81);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot add additional item to Deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add additional item to Deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot add additional item to Deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot add additional item to Deluxe burger");
	}
	
	
	
	
	
	

}
