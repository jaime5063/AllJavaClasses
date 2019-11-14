package introduction;

public class StringMethods {
	
	public static void main(String[] args) {
		
		
		String str = "This is the test String";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "hello";
		String str5 = "";
		String str6 = " Spaces all around    ";
		String str7 = "Hello";
		
		
		//String length - length of a String
		System.out.println(str.length());
		
		//String charAt - returns a char value at the given index number
		//index starts at 0, so on our string above it'll count as: 0=T 1=h 2=i
		//spaces are counted as well
		System.out.println(str.charAt(2)); // 2 will print the letter "i"
		System.out.println(str.charAt(9)); // 9 will print the "u"
		
		//String concat - combines specified string at the end of this string
		System.out.println(str.concat(" and this is added through concat String Method."));
		
		//String contains -  returns true string contains a particular character
		//otherwise it returns false
		System.out.println(str.contains("is")); //true
		System.out.println(str.contains("man")); //false
		
		//String startsWith - checks if this string starts with given prefix
		//if string starts with given prefix it prints true otherwise false
		System.out.println(str.startsWith("This")); //true
		System.out.println(str.startsWith("test")); //false
		
		//String endsWith - checks if this string ends with given suffix
		//Will print true or false if string ends with the exact same prefix 
		System.out.println(str.endsWith("String")); //true 
		System.out.println(str.endsWith("string")); //false - because it is not capital
		
		//String equals - compares the contents of two given strings
		//if contents are equal(same length) it will print true
		//if contents are not equal(same length it will print false
		System.out.println(str1.equals(str2)); //contains a matching prefix
		System.out.println(str1.equals(str3)); //false does not equal to the same prefix
		System.out.println(str1.equals(str4)); //false prefix is not equal due to lower case
		
		//String index - returns the index of given character value or substring
		//prints index of character, if it does not find the character it just prints -1
		System.out.println(str.indexOf('h')); //prints 1 index of "h" is 1 in our string 
		System.out.println(str.indexOf('s')); //print 3 index "s" is 3 in our string. Reads left to right.
		System.out.println(str.indexOf('x')); //prints -1 did not find the character
		
		//String isEmpty - checks if this string is empty
		System.out.println(str.isEmpty()); //prints false, string is no empty
		System.out.println(str5.isEmpty()); //prints true, string is empty. will not happen even if you have spaces
		
		//String trim() - eliminates leading and trailing spaces 
		System.out.println(str6.trim()); //removed all the spaces on the string
		
		//String replace() - returns a string replacing all the old char to new char(character).
		System.out.println(str7.replace('o', 'r')); //replaces "Hello" to "Hellr"
		
		//String substring() - returns a part of the string
		//starts from the beginning index (example 5 which is letter i) and prints till the end
		//2nd example counts 5 and 10, but it eliminates index at number 10
		System.out.println(str.substring(5)); //prints "is our test string".
		System.out.println(str.substring(5, 10)); //beginning and end count.
		
		//String toCharArray() - converts this string into character array
		//will print index of each letter. NEED TO LOOK AT OTHER EXAMPLES, NOT CLEAR! 
		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("index " + i + " is " + charArray[i]);
			
																
			
		} //did not print array of below returns due to this bracket created during toCharArray example
		
		//String toLowerCase() - returns the string in lower-case letter
				System.out.println("All characters in lower case: " + str.toLowerCase());	
				
				//String toUpperCase() - returns the string in upper-case letter
				System.out.println("All characters in upper case: " + str.toUpperCase());	
				
		//StringToCharArray Second Practice
				String myArray="This is my array test";
				char[] conversion=str.toCharArray();
				for (char F : conversion) {
					System.out.println(F);
				
					
		char[] myCharacter= str.toCharArray();
		for (int z = 0; z<myCharacter.length; z++) {
		System.out.println("Index " + z +" is: "+ myCharacter[z]);
		}
		
		/// Testing charToArray 3rd time (Understanding the concept)
		String str11 = "Testing toCharArray";			
		
		char [] testChar = str11.toCharArray();
		for(int test = 0; test<testChar.length; test++) {
			System.out.println("The results of my new toCharArray practice: "+ test + testChar[test]);
		}
					
				}
		
		
	}

}
