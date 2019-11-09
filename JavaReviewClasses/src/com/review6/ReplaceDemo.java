package com.review6;

public class ReplaceDemo {

	public static void main(String[] args) {
		
		
		String longStr ="I am very  happy today, because today is not Monday";
		
		// .replace is the method that works with Strings
		// you can replace any character with another character
		
		String anotherStr=longStr.replace('a','u'); // replace the all the letters
		System.out.println(anotherStr); // 1st print
		
		System.out.println(longStr.replace('v','3')); // 2nd print
		System.out.println("-----------------------");
		
		// Replace the entire word
		anotherStr = longStr.replace("today", "tommorrow");
		System.out.println(anotherStr);
		System.out.println("-----------------------");
		
		//.replace all
		System.out.println(longStr.replaceAll("a", "e"));
		System.out.println("-----------------------");
		
		//.replace all
		anotherStr= longStr.replaceAll("[aA]", "e"); // replace lower or upper case letter with any other letter/letters/nums
		System.out.println("-----------------------");
		
		anotherStr= longStr.replaceAll("[a-z]", "123"); // replace letter a-z lower case with another letter/letters/nums
		System.out.println(anotherStr);
		System.out.println("-----------------------");
		
		anotherStr= longStr.replaceAll("[a-z ]", "1"); // replace letter a-z and space with another letter/letters/nums
		System.out.println(anotherStr);
		System.out.println("-----------------------");
		
		anotherStr= longStr.replaceAll("[a-z ,]", "X"); //replace letter a-z and space and comma with another letter/letters/nums
		System.out.println(anotherStr);
		System.out.println("   ");
			
		longStr= "!test{}th!i@s{co}d!e";
		anotherStr= longStr.replaceAll("[!{}@]", " "); // remove special character with a space. Can also do without space
		System.out.println(anotherStr);
		
		longStr= "My ssn is 999/11/6600";
		anotherStr= longStr.replaceAll("[0-9]", "*"); // replace numbers
		System.out.println(anotherStr);
		
		
		longStr= "I want to learn Java. And I want to leanr more.";
		anotherStr= longStr.replaceAll("[^a-zA-Z]", " ");
		System.out.println(anotherStr);
		System.out.println("     ");
		
		longStr ="I am very  happy today, because today is not Monday";
		System.out.println(longStr); // original 
		System.out.println(longStr.replaceFirst("today", "now")); //. replaceFirst
		System.out.println("     ");
		
		
	}

}
