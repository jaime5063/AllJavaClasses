package introduction;

public class Variables {

	public static void main(String[] args) {
		// Variables in Java
		
		/*
		 * Byte 
		 * Min: -128
		 * Max: 127
		 * Default: 0
		 */
		//byte is usually used when I am really concerned about the memory
		//first we give byteVariable the value of 100
		//Then we print the subject with syso "Byte Value: "
		//Lastly with use the + to connect our byte value as the answer and print
		//Will print out: Byte Value: 100
		byte byteVariable = 100;
		System.out.println("Byte Value: " + byteVariable);
				
		
		/*
		 * Short
		 * Min: -32,768
		 * Max: 32,767
		 * Default: 0
		 */
		short shortVariable = 1000;
		System.out.println("short value: " + shortVariable);
						
		
		/*
		 * int:
		 * Min: -2,147,483,684
		 * Max: 2,147,483,684
		 * Default: 0 
		 */
		int integerVariable = 100000;
		System.out.println("Int Value: " + integerVariable);
				
		
		 /*
		 * Long
		 * Min: -2^63
		 * Max: 2^63 -1
		 * Default: 0
		 */
		long longVariable = 100000000L;
		System.out.println("long Value: " + longVariable);
		
		
		/*
		 *Float
		 *default: 0.0f 
		 *Whenever Java sees a dot between the numbers it thinks it is a double type of variable... 
		 *therefore you would add an "f" at the end 
		 */
		float floatVariable = 20.0f;
		System.out.println("float Value: " + floatVariable);
		
		
		/*
		 * double
		 * Default: 0.0d
		 */
		double doubleVariable = 10.10;
		System.out.println("Double Value: " + doubleVariable);
		
		
		/*
		 * boolean
		 * False and True
		 * Default: False
		 */
		boolean booleanVariable = true;
		System.out.println("Boolean Value: " + booleanVariable);
		
		
		/*
		 * char
		 * Min: 0
		 * Max: 65,535
		 * 
		 * char is short for character
		 * only accepts 1 character such as 'a', 'b', 'c' etc 
		 */
		char charVariable = 35;
		System.out.println("Char Value: " + charVariable);
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
