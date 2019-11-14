package com.HomeworkTests;

public class PrintingSymbols {

	public static void main(String[] args) {
		
		//printing symbols pattern
		  System.out.println("*");
		  System.out.println("**");
		  System.out.println("***");
		  System.out.println("##");
		  System.out.println("#");

		
//        Create a String variable called "name" and set it to "Chen"
//		  Create an integer variable called "age" and set it to 50
//		  Create an integer variable called "iq" and set it to the value of age (do NOT use ' = 50')
//		  Print the value of name
//		  Print the value of age and the value of iq on same line.  
//		  Output:
//		  Chen
//		  5050		  
		  String name="Chen";
		  int age=50;
		  int iq=age;
		  	System.out.println(name);
		  		System.out.println(iq+""+age);
		  

//		Initialize First variable and name it FirstName. Have FirstName contain "John".
//		Initialize Second variable and name it LastName, Have last name contain "Smith".
//		Output:John Smith		
		String firstName="John";
		String secondName="Smith";
		System.out.println(firstName+" "+secondName);
		  

//		Declare the first String and give it a value "Java"
//		Declare the second String and give it a value "programming language". 
//		Concatenate both Strings and output should look like as below.
//		Output:
//		"Java is #1 programming language"		
		String firstString="Java";
		String secondString="programming language";
		System.out.println(firstString+" is #1 "+secondString);
		
		
//		Create 2 Strings
//		Use the concatenation operation to make the following output
//		Output:
//		syntaxsolutions.com				
		String compName="syntax";
		String compName2="solutions.com";
		String companyWeb=compName+compName2;
			System.out.println(companyWeb);
		
		
//		Create a float data type variable name is ed, and assign the value of  8.2.
//		Multiply the value by itself and print the result.
//		Output: “The multiplication of ___ value with itself is equal to ___”		
		float ed=8.2f;
		String firstSentence="The multiplication of ";
		String secondSentence=" value with itself is equal to ";
		System.out.println(firstSentence+ed+secondSentence+ed*ed);

		
//		1. Write a Java program and declare 2 numbers and assign values 200 and 100.
//		2. First add, second subtract, third multiply, forth divide. 
//		4. 200 is the first initialized variable you must use to do this arithmetic assignment.
//		5. Please use variables to print values of each operation result on a separate line.
//		Output:
//		300
//		100
//		20000
//		2
		int number1=200+100;
		int number2=200-100;
		int number3=200*100;
		int number4=200/100;
			System.out.println(number1);
			System.out.println(number2);
			System.out.println(number3);
			System.out.println(number4);
		
		
//		Write a program to print the perimeter and area of a rectangle with width = 5 and height = 8. 
//		Output: “The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __”
		int width=5;
		int height=8;		
		int area=width*height;
		int perimeter=2*(width+height);
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+
				" and the area equals to "+area);
		
//		1. Add num1 and num2
//		2. Divide the result by num3
//		3. Subtract num4 from that result
//		Instructions: Please use variables
//		Output: "The result of arithmetic operations is equal to ___"		
//		   int num1 = 3;
//		   int num2 = 7;
//		   int num3 = 5;
//		   int num4 = 1;
//		   
//		   int add=num1+num2;
//		   int divide=add/num3;
//		   int subtract=divide-num4;
//		   	String Operation="The result of arithmetic operations is equal to ";
//		   		System.out.println(Operation+subtract);
		
//		In this project, you will become a magician and write a small program that performs a mathematical magic trick! 
//		It will involve performing arithmetic operations on an integer that you created.
//
//		For you to do:
//
//		Create an int variable called myNumber. Set it equal to any number other than 0.
//		We will refer to myNumber as the original number from now on.
//		Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.
//		Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).
//		Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.
//		Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.
//		Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.
//		Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.
//		Let's print out the value of the last step as: "The magic number is _ !"
//		Now try running your code! What number is printed to the console?
//		Now, go back to your code and change myNumber to any other integer. 
//		Run your program again.
//		Is the output the same? 
//		It's math magic!
//		Output:
//		"The magic number is _!"				   
		int myNumber=3;
		int stepOne=myNumber*myNumber;
		int stepTwo=stepOne+myNumber;
		int stepThree=stepTwo/myNumber;
		int stepFour=stepThree+17;
		int stepFive=stepFour-myNumber;
		int stepSix=stepFive/6;
		String magic="The magic number is ";
			System.out.println(magic+stepSix+"!");
		
		
//		Add the values of num1 and num2 and then subtract num3 from the result and store it in result1
//		Multiply num4 and num5 together and then divide num6 from the result and store it in result2
//		Print following statement:
//		_______ modded by _______ is ______
//		result2           result1    blank3
//		where blank3 is the remainder of result1 into result2
		    int num1 = 5;
		    int num2 = 4;
		    int num3 = 3;
		    
		    int num4 = 7; 
		    int num5 = 10;
		    int num6 = 5;
		    
		    //start coding here
		    int result1=num1+num2-num3;
		    int result2=num4*num5/num6;
		    int modulus=result2%result1;
		    	System.out.println(result2+" modded by "+ result1+" is "+modulus);
		
		
//		Print the results of 14 mod 2.		    
//		output:    
//		0    
		    int mod=14%2;
		    System.out.println(mod);
				
//		Print the result of 29 mod 4 
//		Output: 1
		int myMod=29%4;
		System.out.println(myMod);
				
//		Print result of  -21 mod 4?
//		Output: -1
		int modNum=-21%4;
		System.out.println(modNum);
		
		
		    
		
	}
}
