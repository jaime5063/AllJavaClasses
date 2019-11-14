package VoidReturnMethods;

public class HamburgerJoint {
	
	public static void main(String[] args) {
	
	// Declare our object	
	Food servingA = new Food ("Hamburger");
	
	// invoke both methods from FOOD Class
	System.out.println(servingA.getFood());
	
	// calling the method systemPrint from Food class
	servingA.systemPrint();
		// since it was already doing the System.out.println(foodA)
			// .. we only needed to place in the method for it to print
	
	
	}
}
