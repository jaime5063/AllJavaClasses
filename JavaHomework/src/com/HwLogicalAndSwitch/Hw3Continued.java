package com.HwLogicalAndSwitch;

import java.util.Scanner;

public class Hw3Continued {

	public static void main(String[] args) {
/*
 * 
Initialize a scanner object. 
Create an if condition: if user enters a number and it is even, print that "Value is even". 
If the above mentioned statement is true then create a nested if condition to see if the value is greater than 100. 
If the value is greater than 100, then print "Value is too large", else print "Value is just right". 
For the first if condition create an else and if the value is less than 100 then print "Value is just right and is an odd number", 
else "This is an odd number and value is too high"
RESULT:
If user enters 2  print "Value is even" and print for the nested if "Value is just right"
If user enters 102 "Value is even" and print for the nested if "Value is too large"
Now try and figure out how you would do the else condition for the first if you created
EXAMPLE:
Please enter a number
2
Value is even
Value is just right

 */
//  Scanner eValues=new Scanner(System.in);
//  System.out.println("Please enter number");
//  int nUmber=eValues.nextInt();
//
//  String theValue;
//
//		if (nUmber % 2 == 0) {
//			System.out.println("Value is even");
//			if (nUmber > 100) {
//				System.out.println("Value is too large");
//			} else {
//				System.out.println("Value is just right");
//			}
//		}else {
//			if(nUmber<100) {
//				System.out.println("Value is just right and is an odd number");
//			}else {
//				System.out.println("Value is an odd number and value is too high");
//			}
//		}
//____________________________________________________________________________________________________________________________
/*
 * Initialize an object for Scanner class, condition is if object is greater than 400 
 * create a nested if condition to see if object is less than or equal to 600. 
 * If object is less than or equal to 600 have output say "don't calculate commission", 
 * if object is greater than or equal to 600 then have output say "Value is too large". 
 * For anything less than the value of 400 in the first condition please print "calculate commission".
 * OUTPUT:
 * If i enter 200 output should read "Calculate commission"
   If i enter 400 output should read "Don't calculate commission"
   If i enter 800 output should read "Value is too large"
   EXAMPLE:
   Please enter a number
   400
   Don't calculate commission
		
 */
//	Scanner obj=new Scanner(System.in);
//	System.out.println("Please enter a number");
//	int object=obj.nextInt();
//	
//	String myObj;
//	
//	if(object>400) {
//		if (object<=600) {
//			System.out.println("Don't calculate commission");
//		}else if(object>600){
//			System.out.println("Value is too large");
//		}
//	}else {
//		System.out.println("calculate commission");
//	}
//________________________________________________________________________________________________________________________________
/*
 * Declare boolean variable isSunny, ask user to input boolean value. 
   Declare int temperature and prompt user to input any value. 	  
   	Your program should check:
	if is it sunny weather or not. 
	If the weather is sunny output should be "It is a sunny day, I should go somewhere!"
	If it is not sunny output should be "I stay home and practice Java"
	If the weather is sunny you want to check the temperature. 
	If the temperature is higher than 85 then "I am going to the beach"
	otherwise, "I am going to the park"	
		Instruction: after you run your code, start inputing your values without Prompt question to appear. 
	Hint: your temperature value should not be equal to 85. 
 */
//	Scanner climate=new Scanner(System.in);
//	System.out.println("Is it sunny today?");
//	boolean isSunny=climate.nextBoolean();
//	
//	if(isSunny) {
//		System.out.println("It is a sunny day, I should go somewhere");
//		int temp=climate.nextInt();
//		if(temp>85) {
//			System.out.println("I am going to the beach");
//		}else {
//			System.out.println("I am going to the park");
//		}
//	}else{
//		System.out.println("I stay home and practice Java");
//	}
//_______________________________________________________________________________________________________________________________		
/*
 * Prompt user to input either "M" or "F" as a String "gender" and input any value as int "age".
 * 
 * You have 2 conditions:
	If age is above 25, your inner condition, depending on your gender value, should get either "Woman" or "Man" as an output. 
	If age is below 25, your inner condition, depending on your gender value, should get either "Girl" or "Boy" as an output. 	
		Instruction: after you run your code, start inputing your values without Prompt question to appear.
	Hint: your age should not be equal to 25
 */


			  
		Scanner input = new Scanner(System.in);

		
		char gender = input.next().charAt(0);
		int age = input.nextInt();

		if (age > 25) {

			if (gender == 'M') {
				System.out.println("Man");
			}
			if (gender == 'F') {
				System.out.println("Woman");
			}
		} else {
			if (age <= 25)
				if (gender == 'M') {
					System.out.println("Boy");
				}
			if (gender == 'F') {
				System.out.println("Girl");
			}

		}
		
		
		
/*
 * 			Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println("Enter your Gender");
		char gender = input.next().charAt(0);

		String mGender = "Man";
		String wGender = "Woman";
		String bGender = "Boy";
		String gGender = "Girl";
		
		String myGender; 


		if (age > 25) {

			if (gender == 'M') {
				System.out.println(mGender);
			}
			if (gender == 'F') {
				System.out.println(wGender);
			}
		} else {
			if (gender == 'B') {
				System.out.println(bGender);
			}
			if (gender == 'G') {
				System.out.println(gGender);
			}
		}
		
 * 
 * 
 * 
 * 
 */

	}

}
		




