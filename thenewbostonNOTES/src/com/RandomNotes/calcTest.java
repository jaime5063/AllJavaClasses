package com.RandomNotes;

import java.util.Scanner;

public class calcTest {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	
		int num1;
		int num2;
		String operation;

		System.out.println("Enter first number");
		num1 = input.nextInt();
		
		System.out.println("Enter operation");
		Scanner op = new Scanner(System.in);
		operation = op.next();

		System.out.println("Enter second number");
		num2 = input.nextInt();

//		System.out.println("Enter operation");
//		Scanner op = new Scanner(System.in);
//		operation = op.next();

		if (operation.equals("+")) {
			System.out.println(num1 + num2);
		}
		if (operation.equals("*")) {
			System.out.println(num1 * num2);
		}
		if (operation.equals("/")) {
			System.out.println(num1 / num2);
		}
		if (operation.equals("-")) {
			System.out.println(num1 - num2);
		}	
	
		
		
		
	}

}
