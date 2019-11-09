package com.review2;

import java.util.Scanner;

public class BetterCalculator {
	
	public static void main(String[] args) {
		
		
//		int a;
//		int b;
//		String name1="John";
//		String name2="John";
//		
//		System.out.println(name1.equals(name2));
		Scanner calc=new Scanner(System.in);
		System.out.print("Enter in First number: ");
		int num1=calc.nextInt();
		System.out.print("Enter an Operator: ");
		String operator=calc.next();
		System.out.print("Enter second number: ");
		int num2=calc.nextInt();
		
		if(operator.equals("+")) {
			System.out.println(num1+num2);
		}else if(operator.equals("-")) {
			System.out.println(num1-num2);
		}else if(operator.equals("/")) {
			System.out.println(num1/num2);
		}else if(operator.equals("*")) {
			System.out.println(num1*num2);
		}else {
			System.out.println("Invalid entry");
		}
		
	}

}
