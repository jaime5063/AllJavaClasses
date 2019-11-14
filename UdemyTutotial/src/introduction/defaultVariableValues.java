package introduction;

public class defaultVariableValues {
	
	//These Global variable can be left without initializing
	static byte byteVariable;
	static short shortVariable;
	static int integerVariable;
	static long longVariable;
	static float floatVariable;
	static double doubleVariable;
	static boolean booleanVariable;
	static char charVariable;
	
	public static void main(String[] args) {
		//Default Variable Values
		
		
				System.out.println("Byte Value: " + byteVariable);										
				System.out.println("short value: " + shortVariable);									
				System.out.println("Int Value: " + integerVariable);						
				System.out.println("long Value: " + longVariable);				
				System.out.println("float Value: " + floatVariable);				
				System.out.println("Double Value: " + doubleVariable);				
				System.out.println("Boolean Value: " + booleanVariable);				
				System.out.println("Char Value: " + charVariable);
				

	}
	
	public static void oneMoreMethod() {
		System.out.println("Int value: " + integerVariable);
	}

}
