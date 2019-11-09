package com.review2;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.print("Enter in first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter in second number: ");
		int num2=scan.nextInt();
		
		System.out.println(num1+num2);
	}

}
