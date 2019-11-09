package com.review2;

public class NestedIfStatement {
	
	public static void main(String[] args) {
		
		boolean hasMoney=true;
		boolean isRestNear=false;
								// EXAMPLE
		if(hasMoney==true) { // First condition (Person has money = true)
			if(isRestNear) { // Second condition (Restaurant is near = false = Wont Print Line 12)
				System.out.println("I will eat in the restaurant");
			} // (Nested area. you can apply condition EXAMPLE: else if)
		}else {
			System.out.println("I dont have money");
		}
		
		
	}

}
