package introduction;

public class TestYourKnowledge {
	
	public static void main(String[] args) {
		
		String a="This is a string";
		
		// 1. Find the length of a String 
		int length = a.length();
		System.out.println(length);
		
		// 2. Which expression can you use to retrieve the value at index 10 of the string?
		char atIndex = a.charAt(10);
		System.out.println(atIndex);
		
		// 3. Which of the following expressions will give output "Hello World"?
		String b = "Hello";
		String c = "World";
		String d = b+c;
		String e = b.concat(" ")+c;
		
		System.out.println("Testing: "+e); // Wrong Prints: HelloWorld 
		System.out.println("Testing 2: "+b+" "+c); // Correct Prints: Hello World
		System.err.println("Testing 3: "+d); // Correct Prints: Hello World
		
		// 4. Find the output of the following expression
		String z ="This is a test string";
		String one=z.substring(1, 9);
		System.out.println(one);
		
		// 5. Expression will output "Java" from String x = "I love Java"
		String x="I love Java";
		String output=x.substring(7); //GOOD
		System.out.println(output);
		
		String output2=x.substring(7, 11); //GOOD
		System.out.println(output2);
		
		
		
		
	}

}
