package com.HwLogicalAndSwitch;

import java.util.Scanner;

public class Hw3LogicalAndSwitch {

	public static void main(String[] args) {
		/*
		 * Declare 4 int variables a, b, c and d. Your variable c is the result of
		 * addition of a & b. Variables a & b should be more than d, and c should be
		 * more than d. Result: True True
		 * 
		 * Hint: you have 2 outputs meaning you need to have 2 printing statements
		 */

//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter value of a, b and d");
//		int mathA=scan.nextInt();
//		int mathB=scan.nextInt();
//		int mathD=scan.nextInt();
//
//		boolean math=true;
//		boolean math1=false;
//		
//		int mathC=mathA+mathB;
//		
//		if(mathA>mathD && mathB>mathD) {
//			System.out.println(math);
//			 if (mathC>mathD) {
//				System.out.println(math);
//			}else{
//				System.out.println(math1);		
//			}
//		}		
//		int a=10;
//		int b=20;
//		int c=a+b;
//		int d=8;
//		
//		boolean math=true;
//		boolean math1=false;
//		
//		if(a>d && b>d) {
//			System.out.println(math);
//			if (c>d) {
//				System.out.println(math);
//			}else {
//				System.out.println(math1);
//			}
//		}
//______________________________________________________________________________________________________________________
		/*
		 * Create a program that prompt user with question: "Do you need a loan?" If the
		 * result is true then prompt user with question: "What is your credit score?".
		 * Otherwise eligibility is "Unknown" Based on the score define users
		 * eligibility: if score is below 600 --> eligibility = "Not eligible" if score
		 * is between 600 and 700 inclusive --> eligibility = "Maybe eligible" if score
		 * is between 701 and 800 inclusive --> eligibility = "Eligible" if score is
		 * higher than any other previous values --> eligibility = "Definitely eligible"
		 * . RESULT: "The eligibility is ____"
		 */
//	Scanner scan=new Scanner(System.in);	
//	System.out.println("Do you need a loan?");
//	boolean loan=scan.nextBoolean();
//	
//	int cScore;	
//	String loanAmount;
//	
//	if(!loan) {
//		System.out.println("No");
//	}else {
//		System.out.println("What is your credit score");
//		cScore=scan.nextInt();
//	
//		if (cScore<600) {
//			loanAmount="Not eligible";
//		}else if(cScore>=600 && cScore<=700) {
//			loanAmount="Maybe eligible";
//		}else if(cScore>=701 && cScore<=800) {
//			loanAmount="Eligible";
//		}else if(cScore>800) {
//			loanAmount="Definitely eligible";
//		}else {
//			loanAmount="Not eligble";
//		}	
//		System.out.println("The eligibility is "+loanAmount);
//	}	
//________________________________________________________________________________________________________________________________
		/*
		 * For you to do: Prompt user to input two strings :
		 * "Please enter two strings"and two integers: "Please enter two numbers" and
		 * make the comparisons: if int1 and int2 are equal and word1 and word2 are
		 * equal, output "AND" if int1 and int2 are equal or word1 and word2 are equal,
		 * output "OR" if int1 and int2 are not equal and word1 and word2 are not equal,
		 * output "NONE"
		 */
//		String myWord, secWord;
//		int one, two;
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter two strings");
//		myWord=scan.nextLine();
//		secWord=scan.nextLine();
//		System.out.println("Please enter two numbers");
//		one=scan.nextInt();
//		two=scan.nextInt();
//		
//		String myResult;
//		
//		if(myWord.equals(secWord) && one==two){
//			myResult="AND";				
//			}else if(myWord.equals(secWord) || one==two) {
//				myResult="OR";
//			}else {
//				myResult="NONE";
//			}		
//		System.out.println(myResult);
//_______________________________________________________________________________________________________________________________		
		/*
		 * Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?" "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=Water If user is thirsty and
		 * sleepy--> drink=Coffee If user is not thirsty and sleepy --> drink=Tea
		 * Otherwise drink="Nothing" Output: "Looks like you need ___ "
		 */
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Are you thirsty?");
//		boolean thirsty=scan.nextBoolean();
//		System.out.println("Are you sleepy?");
//		boolean sleepy=scan.nextBoolean();
//		
//		String drink;
//		
//		if(thirsty==true && sleepy==false) {
//			drink="Looks like you need to drink Water";
//		}else if(thirsty==true && sleepy==true) {
//			drink="Looks like you need to drink Coffee";
//		}else if(thirsty==false && sleepy==true) {
//			drink="Looks like you need to drink Tea";
//		}else {
//			drink="Looks like you need to drink Nothing";
//		}
//		System.out.println(drink);
//________________________________________________________________________________________________________________________________
		/*
		 * Prompt user with a question: "Is it weekend?" If it is not a weekend -->
		 * subject="Manual testing" Otherwise --> subject="Java" OUTPUT:
		 * "Today you will be learning ____"
		 */
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("Is it weekend?");		
//		Boolean weekEnd=scan.nextBoolean();
//		
//		String subject;
//		
//		if(weekEnd==true) {
//			subject="Java";
//		}else {
//			subject="Manual testing";
//		}
//		System.out.println("Today you will be learning "+subject);
//________________________________________________________________________________________________________________________________
		/*
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution.
		 * 
		 * First Output: "Enter name of the instructor"
		 * 
		 * case 1: if User provided the name as Shiva as input it should show
		 * "Will take care of Java Assignment" case 2: if User provided the name as
		 * Sandish as input it should show "Will take care of SDLC Assignment" case 3:
		 * if User provided the name as Weqas as input it should show
		 * "Will take care of Selenium Assignment" case 4: if User provided the name as
		 * Asel as input it should show "Will take care of every Assignment"
		 * 
		 * Other than these four names if user provide the name try to give like (James
		 * or John ) " Invalid instructor selected"
		 */
//	Scanner cases=new Scanner(System.in);	
//	
//	System.out.println("Enter name of the instructor");
//	String inName=cases.nextLine();
//	
//	String job;
//	
//	switch(inName){
//		case "Shiva":
//			job="Will take care of Java Assignment";
//			break;
//		case "Sandish":
//			job="Will take care of SDLC Assignment";
//			break;
//		case "Weqas":
//			job="Will take care of Selenium Assignment";
//			break;
//		case "Asel":
//			job="Will take care of every Assignment";
//			break;
//			default:
//			job="Invalid instructor selected";
//	}
//	System.out.println(job);
//_________________________________________________________________________________________________________________________________

		/*
		 * Write a program using the switch statement Let us consider the scenario
		 * regarding the born baby age
		 * 
		 * First Output: "enter the age of the Child"
		 * 
		 * case 1: if age is 1 print as "You can Crawl"
		 * 
		 * case 2 : if age is 2 print as "You can Talk"
		 * 
		 * case 3: If age is 3 print as "You can Dance"
		 * 
		 * case 4: if age is 4 print as "You can get  Trouble"
		 * 
		 * Other than this age (1-4) it should print "I don't know how old you are"
		 */
//		Scanner child=new Scanner(System.in);
//		System.out.println("enter the age of the Child");
//		
//		int age=child.nextInt();
//		
//		String ifAge;
//		
//		switch(age) {
//		case(1):
//			ifAge="You can Crawl";
//			break;
//		case(2):
//			ifAge="You can Talk";
//			break;
//		case(3):
//			ifAge="You can Dance";
//			break;
//		case(4):
//			ifAge="You can get  Trouble";
//			break;
//			default:
//			ifAge="I don't know how old you are";				
//		}
//		System.out.println(ifAge);
//_______________________________________________________________________________________________________________________________

		/*
		 * For you to do: Write a program using the switch statement Let us consider
		 * there are three students in the class with roll number starting from (101 to
		 * 103) if any number other than 101-103 are present display
		 * "Not found Student name: in Class"
		 * 
		 * First Output: "enter the roll number of the Child"
		 * 
		 * case 101: if roll number is 101 print as "Student name: Ramesh "
		 * 
		 * case 102 :if roll number is 102 print as "Student name: Mahesh "
		 * 
		 * case 103:if roll number is 103 print as "Student name: Mukesh "
		 * 
		 * Other than this roll number it should print
		 * "Not found Student name: in Class"
		 */
//		Scanner school=new Scanner(System.in);
//		
//		System.out.println("enter the roll number of the Child");
//		int rollNum=school.nextInt();
//		
//		String studentName;
//		
//		switch(rollNum) {
//		case(101):
//			studentName="Student name: Ramesh ";
//			break;
//		case(102):
//			studentName="Student name: Mahesh ";
//			break;
//		case(103):
//			studentName="Student name: Mukesh ";
//			break;
//			default:
//			studentName="Not found Student name: in Class";
//			break;		
//		}
//		System.out.println(studentName);
//______________________________________________________________________________________________________________________________
		/*
		 * Write a program to input number "Input a number between 1-12" and when you
		 * input a number it should display the month using Scanner and Switch
		 * statement.
		 * 
		 * case: 1 will display January
		 * 
		 * case: 12 will display December
		 * 
		 * Anything outside of 12 will display "Invalid"
		 */
//		Scanner annual = new Scanner(System.in);
//		System.out.println("Input a number between 1-12");
//		int myMonth = annual.nextInt();
//
//		String theMonth;
//
//		switch (myMonth) {
//		case (1):
//			theMonth = "January";
//			break;
//		case (2):
//			theMonth = "February";
//			break;
//		case (3):
//			theMonth = "March";
//			break;
//		case (4):
//			theMonth = "April";
//			break;
//		case (5):
//			theMonth = "May";
//			break;
//		case (6):
//			theMonth = "June";
//			break;
//		case (7):
//			theMonth = "July";
//			break;
//		case (8):
//			theMonth = "August";
//			break;
//		case (9):
//			theMonth = "September";
//			break;
//		case (10):
//			theMonth = "October";
//			break;
//		case (11):
//			theMonth = "Novemeber";
//			break;
//		case (12):
//			theMonth = "December";
//			break;
//			default:
//			theMonth = "Invalid";
//		}
//		System.out.println(theMonth);
//________________________________________________________________________________________________________________________________
		/*
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" 
		 * if user enters Toyota --> carOrigin = " japanese car"
		 * if user enters Maserati --> carOrigin = "italian car"
		 * anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: "Your favorite car is ___"
		 */
//		Scanner hobby = new Scanner(System.in);
//		System.out.println("Please enter your favorite car make");
//		String carMake = hobby.nextLine();
//
//		String carOrigin;
//
//		switch (carMake) {
//		case "BMW":
//			carOrigin = "german car";
//			break;
//		case "Toyota":
//			carOrigin = " japanese car";
//			break;
//		case "Maserati":
//			carOrigin = "italian car";
//			break;
//		default:
//			carOrigin = "unknown";
//		}
//		System.out.println("Your favorite car is " + carOrigin);
//________________________________________________________________________________________________________________________________
/*
 * Step 1: You have variable iSwitch=6;
   Step 2:  Do the switch for the other cases but for your value it should print out "Not in the list"
   	Output:
	"Not in the list"		
 */
		 int iSwitch=6;
		   switch(iSwitch){
		     case 0:
		     System.out.println("ZERO");
		     break;
		     case 1:
		     System.out.println("ONE");
		     break;
		     case 2:
		    System.out.println("TWO");
		    break;
		     case 3:
		    System.out.println("THREE");
		    break;
		     case 4:
		    System.out.println("FOUR");
		    break;
		     case 5:
		    System.out.println("FIVE");
		    break;
		    default:
		    System.out.println("Not in this list");
		    break;
		   }
	}

}
