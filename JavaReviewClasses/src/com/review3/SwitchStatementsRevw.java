package com.review3;

import java.util.Scanner;

public class SwitchStatementsRevw {
	
	public static void main(String[] args) {
		
//		String country, foodName;
//		  Scanner scan;
//		  scan = new Scanner(System.in);
//		  System.out.println("Please enter your country");
//		  country = scan.nextLine();
//		  switch (country) {
//		  case "Turkey":
//		  foodName = "kebab";
//		  break;
//		  case "Ethiopia":
//		  foodName = "Tibs";
//		  break;
//		  case "Morocco":
//		  foodName = "Tajin";
//		  break;
//		  case "Kazakhstan":
//		  foodName = "Kumis";
//		  break;
//		  case "Pakistan":
//		  foodName = "Beryani";
//		  break;
//		  case "Russia":
//		  foodName = "Caviar";
//		  break;
//		  case "Cuba":
//		  foodName = "Sofrito";
//		  break;
//		  default:
//		  foodName = "Unknown";
//		  }
//		  System.out.println("You are from "+country+" and your favorite food is "+foodName);
//_____________________________________________________________________________________________________________________-
/*
 * Task 1
	Write a program that will use a switch statement to display what month we're in.	
 */
//		Scanner scan;
//		scan=new Scanner(System.in);
//		System.out.println("Enter month number you were born");				
//		int num=scan.nextInt();
//		
//		int dobNumber;
//		String dobMonth;
//		
//		switch(num) {
//		case (1):
//			dobMonth ="January";
//		break;
//		case (2):
//			dobMonth ="February";
//		break;
//		case (3):
//			dobMonth ="March";
//		break;
//		case (4):
//			dobMonth ="April";
//		break;
//		case (5):
//			dobMonth ="May";
//		break;
//		case (6):
//			dobMonth ="June";
//		break;
//		case (7):
//			dobMonth ="July";
//		break;
//		case (8):
//			dobMonth ="August";
//		break;
//		case (9):
//			dobMonth ="September";
//		break;
//		case (10):
//			dobMonth ="October";
//		break;
//		case (11):
//			dobMonth ="November";
//		break;
//		case (12):
//			dobMonth ="December";
//		break;
//		default:
//			dobMonth = "Unknown";		
//		}
//		System.out.println("Your birth month is "+dobMonth);
//___________________________________________________________________________________________________________________________
/*
 * Task 2
/ Write a program to found out the user level of experience 
		        // Must use a switch statement with  a String variable named levelString and a int variable named level 
		        // Beginner level should be 1
		        // Intermediate level should be 2
		        // Expert level should be 3		
 */
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Enter level of experience");
		int user=scan.nextInt();
		
		int level;
		String levelString;
		
		switch(user) {
		case 1:
			levelString="Beginner level";
			break;
		case 2:
			levelString="Intermediate level";
			break;
		case 3:
			levelString="Expert level";
			break;
			default:
				levelString="Unknown4";
		}
		System.out.println("Your experience level is "+levelString);
		
		
		
		
		
		
		
		
		
		
	}

}
