package com.syntax.datatypes;

public class ArithemeticOperators {
	
	public static void main(String[] args) {
	

	//Arithmetic operators
	//Assignment operators
	
	// + - * %
	
	int firstNum=10;
	int secondNum=5;
		int sum=firstNum+secondNum;
			System.out.println(sum);
	
	int multNum=5;
	int intmultNum2=8;
		int resultOfMult=(multNum*intmultNum2);
			System.out.println(resultOfMult);
			
	int divNum=40;
	int intdivNum1=3;
		int resultOfDiv=(divNum/intdivNum1);
			System.out.println("Result of division using integer: "+resultOfDiv);
			System.out.println(" ");
			
	double divDouble=40;
	double divDouble1=3;
		double resultOfDoubleDiv=(divDouble/divDouble1);
			System.out.println("Result of division using double: "+resultOfDoubleDiv);
			System.out.println(" ");
			
	int divModulus=40;
	int divModulus1=3;
		int resultOfModulus=(divModulus%divModulus1);
			System.out.println("Result of division using modulus(remainder): "+resultOfModulus);
			System.out.println(" ");
	
	
	}
}
