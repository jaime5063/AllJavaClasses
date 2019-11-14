package VoidReturnMethods;

public class Food {
	
	// Void =  you are NOT going to return a value
	
	// Return =  you WILL return a value
	
	private String foodA;
	
	
	// Constructor - constructor has to match your class name
	public Food (String A) {
		
		foodA = A; // the letter A is a fake value. The actual value gets assigned in other class
				
	}
	
	public String getFood() {
		
		return foodA; // use return when a value is returned
	}
	
	void systemPrint() { // void only if NOTHING is returned
		
		
		System.out.println(foodA);
	}

}
