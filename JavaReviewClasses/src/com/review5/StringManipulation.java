package com.review5;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		//.length - find the length of string
		System.out.println(str.length());
		
		//.toLowerCase -  returns a lower case string
		System.out.println(str.toLowerCase());
		//--> will not change str BUT it will print it to lower case
		
		//.toUpperCase - returns value in upper case
		System.out.println(str.toUpperCase());
		//--> will not change str BUT it will print it to upper case
		
		//.equals - compares one string to another (boolean)
		System.out.println(str.equals("hello"));
		
		//.equalsIgnoreCase - compares strings and ignores case (boolean)
		System.out.println(str.equalsIgnoreCase("hello"));
		
		//.contains - does the string contain a specific letter (boolean)
		System.out.println(str.contains("ll"));
		
		//.startsWith - starts with a specific letter Case Sensitive (boolean)
		System.out.println(str.startsWith("H")); 
		
		//.startsWith - starts with specific letter at specific index
		System.out.println(str.startsWith("ll", 2));// start with "ll" at Index (2)
		
		//.endsWith - ends with the specific letters, any letter you want up to the last letter
		System.out.println(str.endsWith("llo"));
		
		//.isEmpty - is the string empty. If you have spaces IT IS NOT EMPTY
		System.out.println(str.isEmpty());
		String test = ""; 
		System.out.println(test.isEmpty()); // true, test is empty
		
		//.concat
		String test2 = " World"; 
		System.out.println(str.concat(test2));
		
		//.charAt - Returns a char at index given
		System.out.println(str.charAt(0));
		
		
		

	}

}
