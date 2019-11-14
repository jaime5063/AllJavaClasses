package com.HWscannerIfElseIF;

import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) {
		
		// Write a program to convert double 100.50 into integer
		// Result: 100
//		System.out.println("#1");
//		double hundredFIfty=100.50;
//		int hundred=(int)hundredFIfty;
//		System.out.println(hundred);
		
		
		// Write a program to convert  double 500.4444 into long.
		// Result: 500
//		System.out.println("#2");
//		double fiveHundred=500.444;
//		long fiveHundred2=(long)fiveHundred;
//		System.out.println(fiveHundred2);
		
		
		// Declare 2 int variables and assign their values as 5 and 2. 
		// Perform the division of these variables. 
		// Print the decimal value of the division result.
			// Result: 2.5
		//Hint: This is example of widening typecasting. But if compiler takes care of your widening automatically, 
		//Repl doesn't do that. So you have to take care of it manually ;)
//		int Five=5;
//		int Two=2;
//		double a=Five;
//		double b=Two;
//		System.out.println((double)Five/Two);
		//NOT COMPLETED NEED TO COME BACK
		// WE ARE GETTING 2.5 BUT DOES NOT ACCEPT IT 
		// ON ONLINE HW APP

		
		
		// Write a program to declare 2 int variables and assign their values as 5 and 2. 
		// Perform division of these variables. 
		// Your output should be an int value. 
		// Result: 2
//		System.out.println("4");			//NOT COMPLETED NEED TO COME BACK
											//GETTING CORRECT ANSWER AND FORMULA
//		int cookie=5;						//STILL NOT SAYING ITS CORRECT ON "REPL" APP
//		int kids=2;
//		System.out.println(cookie/kids);
		

		//Write  a program that takes user's first name and surname.
		//First input: "Please Enter First Name" should print first input.
		//Second input:"Please Enter Surname" should print second input.
			//Result:Print both first name and surname on one line. Make sure there is a space between First Name and Surname. 
		
//		Scanner newScanner=new Scanner(System.in);
//		System.out.println("Please Enter First Name");
//		String nAme=newScanner.nextLine();
//		System.out.println("Please Enter Surname");
//		String sUrname=newScanner.nextLine();
//		String resUlt=nAme+" "+sUrname;
//		System.out.println(resUlt);
//		System.out.println("*********************************************************");
		
		
		//Write a program that asks the user's age. Then display it by 
		//adding 10 (i.e age + 10) in your final output.
		//Result: "Your age after 10 years is ". Remember to put the value in your final output with 10 years added to it.
		
//		Scanner newAge=new Scanner(System.in);
//		System.out.println("Enter your age ");
//		int age=newAge.nextInt();
//		int years=10;
//		int teNyears=age+years;
//		System.out.println("Your age after 10 years is "+teNyears);

		
		//Write a program to take user name, age and mobile number in single line.
		//First Output: "Enter your name"
		//Second Output: "Enter your mobile number"
		//Third Output: "Enter your age"
			//Result: "Your name is ___ , your age is ___ and your mobile number is (___)-___-____"		
		
//		Scanner ky = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String name,mobNumber,age;
//		name=ky.next();
//		System.out.println("Enter your mobile number");
//		mobNumber=ky.next();
//		System.out.println("Enter your age");
//		age=ky.next();
//		
//		
//		System.out.println("Your name is "+name +","+" your age is "+ age +" and your mobile number is "+mobNumber);
		

		//Create a program that will take a boolean value from a user. 
		//If the input is True or False, then the output should look like below: 
		//First Output: "Input the boolean value"
		//"The value is __true/false____" 
//		Scanner bOO=new Scanner (System.in);
//		System.out.println("Input the boolean value");
//		boolean vAl=bOO.nextBoolean();
//		
//		if(vAl==true) {
//			System.out.println("The value is "+vAl);
//		}else {
//			System.out.println("The value is "+vAl);
//		}
		
		
	
		
		
		//Write a program that takes a user's name and prints it.
		//"Your name is_"+ any variable name. 
//		Scanner inPut=new Scanner(System.in);
//		String nAMe=inPut.nextLine();
//		System.out.println("Your name is "+nAMe);
		
		
		//Write a program to take a statement input from the user and print it.
		//Hint: by input we mean a sentence (any)
//		Scanner word=new Scanner(System.in);
//	     System.out.println("Enter statement");
//	     String iNput=word.nextLine();

		
		//The variable "num" holds an integer user input
		//Write a conditional statement starting on line 9 that does the following:
			//If num is positive, print "__ is positive"
			//If num is negative, print "__ is negative"
			//If num is equals to 0, then print "Entered number is equals to 0"
			//EXAMPLES:
			//In: 5
			//5 is positive
			//In: -2
			//-2 is negative
			//In: 0
			//Entered number is equals to 0
//		  Scanner inp = new Scanner(System.in);
//		  System.out.print("In:");
//		  int num = inp.nextInt();
//		  										//DO NOT CHANGE ABOVE CODE!  Write your code below
//		  if(num==0) {
//			  System.out.println("Entered number is equals to 0");
//		  }if(num>0) {
//			  System.out.println(num+" is positive");
//		  }else if(num<0){
//			  System.out.println(num+" is negative");
//		  }
		
		
//			The variable "name" holds a String user input 
//			Write a conditional statement starting on line 9 that does the following:
//			If name is equal to "Chen", print "teacher"
//			For any other input, print "student"		
//		  Scanner inp = new Scanner(System.in);
//	  	  System.out.print("In:");
//	  	  String name = inp.nextLine();
//	  	  										//DO NOT CHANGE ABOVE CODE!  Write your code below
//		  if (name.equals("Chen")){
//			  System.out.println("teacher");
//		  }else {
//			  System.out.println("student");
//		  }
		
				
		//Write a Java program to ask the user "Please enter your age". 
		//Then the program will show if the person is eligible to vote. 
		//A person who is eligible to vote must be older than or equal to 18 years old and 
		//the program will show "You are eligible to vote".
		//Otherwise the program will show "You are not eligible to vote".
		//EXAMPLES:
		//Please enter your age 18
		//You are eligible to vote
		//Please enter your age 16
		//You are not eligible to vote
//		Scanner vote=new Scanner(System.in);
//		System.out.println("Please enter your age");
//		int age=vote.nextInt();
//		if(age>=18) {
//			System.out.println("You are eligible to vote");
//		}else {
//			System.out.println("You are not eligible to vote");
//		}
		
		
		//Write a program to take values of length and width from the user and check if the shape 
		//of an object is square or rectangle.
		//EXAMPLES:
			//Please enter the length 18
			//Please enter the width 16
			//The shape of your object is rectangle
				//Please enter the length 16 
				//Please enter the width 16 
				//The shape of your object is square		
//		Scanner obj=new Scanner(System.in);
//		System.out.println("Please enter the length");
//		int length=obj.nextInt();
//		System.out.println("Please enter the width");
//		int width=obj.nextInt();
//		if(length==width) {
//			System.out.println("The shape of your object is square");
//		}else {
//			System.out.println("The shape of your object is rectangle");
//		}
		
		
		//Write a java program that prints out True if ( x * y ) return a positive value. 
		//Else prints out False if  (x * y) return a negative value.
			//Step 1: Your program should ask "Please enter first number" - 
			//for the 1st number and "Please enter second number" - for the 2nd number.
			//Step 2: Create the if condition to check if the multiplication of x and y values is positive or negative.
			//Step 3: If it is a positive value - user will get True, if it is negative value - user will get False.
//			Scanner myMath=new Scanner(System.in);
//
//			System.out.println("Please enter first number");
//			int x=myMath.nextInt();
//			System.out.println("Please enter second number");
//			int y=myMath.nextInt();
//			int number=x*y;
//			
//			if(y*x>0) {	
//					System.out.println("True");
//			}else{
//				if(number<0) {
//					System.out.println("False");
//				}
//			}						
			//		int number=33;
			
			//if (number%2==0) {
			//	System.out.println("Number is even");
			//}else {
			//System.out.println("The number is odd");
			//}
		
		
		//Write a program that shows if you input a number it will display a month with corresponding number, 
		//and if you input a number out of bounds (12) it will display invalid. 
		//Display the months to be displayed on my output.
		/*
		 * Example:
	1 will display January
	2 will display February
	3 will display March
	4 will display April
	5 will display May
	6 will display June
	7 will display July
	8 will display August
	9 will display September
	10 will display October
	11 will display November
	12 will display December
	ANY INPUT outside of 12 should display in output "Invalid"
		 */
		Scanner myMonth = new Scanner(System.in);
		int monthNumber;
		System.out.println("Please enter month number");
		monthNumber = myMonth.nextInt();
		
		if(monthNumber==1)
			System.out.println("January");
		else if (monthNumber == 2)
            System.out.println("February");
      else if (monthNumber == 3)
            System.out.println("March");
      else if (monthNumber == 4)
            System.out.println("April");
      else if (monthNumber == 5)
            System.out.println("May");
      else if (monthNumber == 6)
            System.out.println("June");
      else if (monthNumber == 7)
            System.out.println("July");
      else if (monthNumber == 8)
            System.out.println("August");
      else if (monthNumber == 9)
            System.out.println("September");
      else if (monthNumber == 10)
            System.out.println("October");
      else if (monthNumber == 11)
            System.out.println("November");
      else if (monthNumber == 12)
            System.out.println("December");
      else
            System.out.println("Invalid");
	
			}		
	}

