
public class Main {
	
	public static void main(String[] args)
	{
		Hamburger smallBurger = new Hamburger("Regular", "No meat", 2.5, "Garlic Bread");
		
		smallBurger.addHamburgerAddition1("lettus", 1.99);
		smallBurger.addHamburgerAddition2("Tomatoes", .79);
		smallBurger.addHamburgerAddition3("Olives", .99);
		smallBurger.addHamburgerAddition4("onions", 2.99);
		System.out.println("Total Hamburger price is " + smallBurger.itemizHamburger());
		
		
		HealthyBurger Burger = new HealthyBurger("tomatoes", 0.79);
		
		Burger.addHamburgerAddition1("Olive", 0.99);
		System.out.println("Total Hamburger price is " + Burger.itemizHamburger());
		
		
		DeluxeBurger Deluxe = new DeluxeBurger();
		
		System.out.println("Total Hamburger price is " + Deluxe.itemizHamburger());
		
	}	

}
