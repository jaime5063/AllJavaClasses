package introduction;

public class StringDemo {
	
	public static void main(String[] args) {
		//String is Not a primitive data type
		//We can define a String in 2 different ways
		
		
		//String literal - String constant pool
		//Encouraged to use String Literals because they will save memory if
		//You are utilizing the same memory if you need EXAMPLE two "welcome" 
		//Meaning it'll refer back to the same "welcome" you have created
		//not create another instance. Therefore you'll save memory
		String str1 ="Hello One";
		
		
		//String Object - Heap
		//Not encouraged as it will create a new instance every time even if you are 
		//using the same word. 
		//Will use up more memory than a LITERAL STRING from STRING CONSTANT POOL
		String str2 = new String("Hello One 2");
		
		
		//Strings are always going to stay in your memory they cannot be changed
		//on the memory of your device
		str1 = new String ("Hello One AGAIN");
		//As above example, it will change what it says but it still will not remove
		//the first "Hello One" from the memory.
		
		
		
	}

}
