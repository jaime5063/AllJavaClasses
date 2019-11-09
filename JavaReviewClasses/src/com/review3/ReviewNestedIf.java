package com.review3;

import java.util.Scanner;

public class ReviewNestedIf {
	
	public static void main(String[] args) {
		
		/* Nested-if Syntax
		 * 
		 * 
		 *  if(condition1)
		 *  {
		 *  //Executes when condition 1 is true
		 *  if(condition2)
		 *  {
		 *   //Executes when condition2 is true
		 *  }
		 * }
		 */
		
		
		
		/*Verify if button is displayed on the page
		 * if button is displayed then we need to verify text on
		 * if text equal to sign in --> Test case pass
		 * otherwise --> Wrong text is displayed */
//		      boolean isDisplayed=true;
//		      String buttonText="Sign In";
//		      if (isDisplayed) {
//		      System.out.println("Button is displayed");
//		           if (buttonText.equals("Sign In")) {
//		             System.out.println("Test case pass");
//		      }else {
//		           System.out.println("Wrong text is displayed");
//		      }
//		} 
//		        else {
//		      System.out.println("Button is not displayed");          
//		}
		
		      
		      
		      /*
		         * Create a Java program that will ask if user has a credit card or 
		        not. If you
		         * user does not have a credit card then offer them. If they do have 
		        one ask
		         * what is balance on the card? If balance of the card is larger than 
		        1000, tell
		         * them to pay off otherwise you can tell them that they can spend more
		         */
		        
//		Scanner input = new Scanner(System.in);
//		System.out.println("Do you have a credit card? true or false");
//		boolean cc = input.nextBoolean();
//		
//		if (cc == true) {
//			System.out.println("What is the balance on your card?");
//			int balance = input.nextInt();
//			if (balance > 1000) {
//				System.out.println("Please pay off your balance");
//			} else {
//				System.out.println("You can spend more money");
//			}
//		} 
//		
//		
//		else {
//			System.out.println("Would you like to apply for credit card");
//		}
		 
		
/*
 * //Write a program with one int value for salary and four String values for different cars
//If you make over 50000 a year, you may buy a brand new car otherwise you should buy a used car. 
 * For those you can afford a new car there are different price ranges
//I want anything under 70k to be Audi A5
//I want anything under 80k to be Mercedes-Benz
//I want anything under 90k to be Jaguar
//I want anything under 100k to be Tesla
// And if you make less than 60k output to read "Save up money and wait until next year"		
 */
	int salary=9000;
	String carModel;
	
	if(salary>50000) {
		System.out.println("You may buy a bran new car");
		if(salary>=90) {
			carModel="Jaguar";
		}else {
			System.out.println("You should buy a used car");
		}
	
	}else {
		carModel="Save your money and wait until next year";
	}	
		
		
		
		      
		      
		
		
	}

}
