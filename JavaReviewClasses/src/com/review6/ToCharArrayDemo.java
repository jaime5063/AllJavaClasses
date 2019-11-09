package com.review6;

public class ToCharArrayDemo {

	public static void main(String[] args) {
		
		String longStr ="I am very  happy today, because today is not Monday";
		
		char[] charArray = longStr.toCharArray(); // an array of chars
		
		System.out.println(longStr.length()); //length of string longStr
		System.out.println(charArray.length); // what is the length
		
		for(int i=0; i < charArray.length; i++) { 
			System.out.print(charArray[i]); // print char array starting at index i
		}
		System.out.println();
		
		for(int i = charArray.length-1; i>=0; i--) { // reading backwards (from last to first)
			System.out.print(charArray[i]);
		}
		System.out.println();

		for (char character : charArray) { // easier way
			System.out.print(character); // But you CANNOT do the reverse with this one
		}
		System.out.println();
		
		// add a char to a string
		String anotherStr = "";
		anotherStr += 'A';
		anotherStr += 'B';
		anotherStr += 'C';
		System.out.println(anotherStr);
		
		// add a char to string with a loop
		for(char element : charArray) {
			if (element == 'a') {
				anotherStr += 'e';
			}else {
				anotherStr += element;
			}
		}
		System.out.println(anotherStr);
		
		System.out.println("---------------------------");
	
		
		
	}

}
