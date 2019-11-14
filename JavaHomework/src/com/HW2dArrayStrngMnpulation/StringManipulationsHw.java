package com.HW2dArrayStrngMnpulation;

import java.util.Scanner;

public class StringManipulationsHw {

	public static void main(String[] args) {

/*
Create a String named "name" and assign the value "Timmy" to it. 
Find out how many characters are there in the given String.		
 */		
//	String name="Timmy";
//	System.out.println(name.length());
	
/*-------------------------------------------------------------
String s1 = "hello";
String s2 ="";    
System.out.println(s1.isEmpty);
System.out.println(s2.isEmpty); 	
 */
//------------------------------------------------------------
//	 String s1 = "hello";
//	    String s2 ="";	    
//	    System.out.println(s1.isEmpty());
//	    System.out.println(s2.isEmpty());
	    
/*---------------------------------------------------------
 * 	    
 */
//	    String str1 = "syntaxsolutions";
//	    String str2 = "SYNTAXSOLUTIONS";
//	    
//	   System.out.println(str1.toUpperCase());
//	   System.out.println(str2.toLowerCase());
//------------------------------------------------------------
/*
Validate if the string ends with "u" prints the Boolean value accordingly.
Validate if the string ends with "world" prints the Boolean value accordingly.
Validate if the string ends with "are" prints the Boolean value accordingly.
Validate if the string ends with "you" prints the Boolean value accordingly.		
 */
//		String s1="hello how are you"; 	
//	 System.out.println(s1.endsWith("u"));   
//	 System.out.println(s1.endsWith("world"));
//	 System.out.println(s1.endsWith("are"));
//	 System.out.println(s1.endsWith("you"));
//----------------------------------------------------------------------------
/*
Print out the position of the first occurrence of "c".
Print out the position of the first occurrence of " ".
Print out the position of the first occurrence of the variable target1.
Print out the position of the first occurrence of the variable target2.		
 */
//		 String str = "abracadabra alakazam";
//		 String target1 = "dab";
//		 String target2 = "ABRA";
//		 
//		 System.out.println(str.indexOf('c'));
//		 System.out.println(str.indexOf(" "));
//		 System.out.println(target1.concat(target2).indexOf('A', 6));
//		 System.out.println(target1.indexOf("ABRA"));
//---------------------------------------------------------------------------------
/*
Output 1: print str starting at index 5 and going till the end.
Output 2:  print str starting at index 7 and ending at index 10.
Output 3: print "harambe". This must not be a new string, must be from str.
Output 4: print "t f". This must not be a new string, must be from str.
output:
		ps out for harambe
		ou
		harambe
		t f 		
 */
//		String str = "laptops out for harambe";
//		
//		System.out.println(str.substring(5)); // print str starting at index 5 and going till the end.		
//		System.out.println(str.substring(7,10)); // print str starting at index 7 and ending at index 10.
//		System.out.println(str.replace(str, "harambe")); // print "harambe". This must not be a new string, must be from str.
//		
//		System.out.print(str.charAt(3)); // print "t f". This must not be a new string, must be from str.
//		System.out.println(" "+str.charAt(12));
//----------------------------------------------------------------------------------------------------------------------------
/*
Print out the character in the 5th index of the String str.
Print out the character in the 8th index of the String str.
Print out the character in the 1st index of the String str.
Print out the character in the 10th index of the String str.		
 */
//		String str = "boopity bop";
//		System.out.print(str.charAt(5));
//		System.out.print(str.charAt(8));
//		System.out.print(str.charAt(1));
//		System.out.print(str.charAt(10));
//---------------------------------------------------------------------------------------------------------------------------
/*
Using Scanner class input string value. 
Print out the following: "The first 3 letters of ___ is ___"

For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban". 		
 */
//	Scanner scan=new Scanner(System.in);
//	String name=scan.next();
//	name.toCharArray();
//	
//	char last = name.charAt(2);
//	char last1 = name.charAt(1);
//	char last2 = name.charAt(0);
//	
//	System.out.println("The first 3 letters of "+name+" is "+last2+last1+last);

// 		^^^^^^^^^- BELOW IS IF YOU WANT THE LAST 3 LETTERS AND SO ON -^^^^^^^^^^^^^^^^^^^^
//	Scanner scann=new Scanner(System.in);
//	String namea=scann.next();
//	namea.toCharArray();
//	
//	char lasta = namea.charAt(namea.length()-1);
//	char last1b = namea.charAt(namea.length()-2);
//	char last2c = namea.charAt(namea.length()-3);
//	
//	System.out.println("The first 3 letters of "+namea+" is "+last2c+last1b+lasta);
//--------------------------------------------------------------------------------------------------------------------
/*
You have Scanner class to input string value. 

If language is Java it should print the: 
"Java is a programming language".

If language is C it should print the:
"C is a procedural programming language"

If language is C++ it should print the:
"C++ is a middle-level programming language"

If any other should print:
"Doesn't match any programming language"		
 */
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter any programming language");
//	   String language = sc.nextLine();	   	
//	   if(language.equals("Java")) {
//		   System.out.println("Java is a programming language");
//		   }else if(language.equals("C")) {
//			   System.out.println("C is a procedural programming language");
//		   }else if(language.equals("C++")) {
//			   System.out.println("C++ is a middle-level programming language");
//		   }else {
//			   System.out.println("Doesn't match any programming language");
//		   }
//------------------------------------------------------------------------------------------------------------------------	   
/*
If browser is ChRoME it should print the: 
"Proceed with Chrome browser"

If browser is FireFOX it should print the: 
"Proceed with Firefox browser"

If browser is IE it should print the:
"Proceed with IE browser"

If any other browser it should print the:  
"Invalid browser"
 */
//	Scanner sc = new Scanner(System.in); 
//	System.out.println("Enter the browser name to proceed further with execution");
//	String browser = sc.nextLine();
//
//	if(browser.equalsIgnoreCase("ChRoME")) {
//		System.out.println("Proceed with Chrome browser");
//	}else if(browser.equalsIgnoreCase("FireFOX")) {
//		System.out.println("Proceed with Firefox browser");
//	}else if(browser.equalsIgnoreCase("IE")) {
//		System.out.println("Proceed with IE browser");
//	}else {
//		System.out.println("Invalid browser");
//	}
//----------------------------------------------------------------------------------------------------------------------------	
/*
Create a String named "Welcome To Syntax Solutions".
Convert the String into array and using toCharArray method print all values. 
Output should be like :
W
e
l
c
o
m
e
 
T
o
 
S
y
n
t
a
x
 
S
o
l
u
t
i
o
n
s	
 */
//	String str1= "Welcome To Syntax Solutions";
//	char[] name=str1.toCharArray();
//	for(char nameArray: name) {
//		System.out.println(nameArray);
//	}
//--------------------------------------------------------------------------------------------------------
/*
Create a String with value "hello how are you". 
Step 1: Replace the  "h" with "t".
Step 2: Replace "you" with "hi".
Step 3: Replace  "hello how are you"  with  "i am fine".
Print out all three output.		
 */
//	String nm="hello how are you";
//	System.out.println(nm.replace('h', 't'));
//	System.out.println(nm.replace("you", "hi"));
//	System.out.println(nm.replaceAll("hello how are you", "i am fine"));
//---------------------------------------------------------------------------------------------------------	
/*
The code provided in your main method will take in five Strings and save them into an array called arr.  
Print out the first three letters of each element of array, one per line.  
Note: every element of array is at least 3 letters long. 	
 */
//		Scanner input = new Scanner(System.in);
//		String[] arr = new String[5];
//		for (int i = 0; i < 5; i++) {
//			arr[i] = input.nextLine();
//		}	
//		System.out.println(arr[0].substring(0, 3));
//		System.out.println(arr[1].substring(0, 3));
//		System.out.println(arr[2].substring(0, 3));
//		System.out.println(arr[3].substring(0, 3));
//		System.out.println(arr[4].substring(0, 3));
//----------------------------------------------------------------------------------------------------------		
/*
 *Write a for loop that will loop through every character of a word and print out each character, each on a separate line  		
 */
//		Scanner inp = new Scanner(System.in);
//	    System.out.print("In:");
//	    String word = inp.nextLine();
//	    
//		char[] name = word.toCharArray();
//		for (char wordArray : name) {
//			System.out.println(wordArray);
//		}
//------------------------------------------------------------------------------------------------------------------
/*
Write a for loop that will print out every other letter in a String, starting with the first letter.
These letters should be printed all on one line with no space in between.		
 */
//		Scanner inp = new Scanner(System.in);
//	    System.out.print("In:");
//	    String word = inp.nextLine(); 
//	   
//	    String word1 = word.trim();
//	    char[] name = word1.toCharArray();
//	    for(int i=0; i<name.length; i+=2) {
//	    	  	 System.out.print(name[i]);
//	    }

	    
		
		
		
		
	}

}
