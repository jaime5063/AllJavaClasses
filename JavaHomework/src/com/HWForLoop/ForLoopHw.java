package com.HWForLoop;

public class ForLoopHw {

	public static void main(String[] args) {

/*
 * Create a for loop that prints out numbers from 0 to 12
Must not include the number 12 in the output 
Increment by 1 example(i++)
 */
//	int a=12;
//	for(int i=0; i<a; i++) {
//		System.out.println(i);
//	}

	
/*
 * Create a for loop that prints out even numbers from 10 to 0
Must not include the number 0 in the output 	
 */
//	int a=10;
//	
//	for(a=10; a>=0; a-=2) {
//		if (a==0) {
//			continue;
//		}
//		System.out.println(a);
//	}
		
		
/*
 * 	Create a for loop that prints out even numbers from 2 to 14
	Increment by 1 ONLY
	Must include the number 14 in the output 
 */
//	for(int a=2; a<=14; a+=1) {
//		if(a==13 || a==11 || a==9 || a==7  || a==5 || a==3 || a==1) {
//			continue;
//		}	
//		System.out.println(a);
//	}

		
		
/*
 * 	Create a for loop that prints out odd numbers from 5 to 22
	Increment by 1 example(i++)
	Must not include the number 22 in the output 	
 */
//	for(int a=5; a<=22; a+=1) {
//		System.out.println(a);
//		a++;
//	}		
/*
 * Write a program that use for loop to prints multiples of 3 between 1 and 20 on one line.
	Must not include the number 20 in the output 		
	
	OUTPUT: 3 6 9 12 15 18
 */
//		int m = 3;
//		for (int i = 1; i < 7; i++) {
//			System.out.println(i * m);
//		}		
/*
 * 		Write a program that greets students in the morning using a for loop.
		Hint: You have 20 students to be greeted (print "Good Morning!" 20 times)
*/ 			
	
//	for(int i=0; i<=20; i++) {
//		System.out.println("Good Morning");
//	}			
/*
 * Write a program that prints the string "It is year: " and the years between 2010 and 2019.
	Must not include year 2019 in the output		
 */
//		int year = 2011;
//
//		for (int i = 0; i < 8; i++) {
//			int years = year++;
//			System.out.println("It is the year " + years);
//		}	

	
/*
 * 	Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019.
	Must include year 2019 in the output:
	
 */	
//		int yr = 2011;
//		for (int i = 0; i < 9; i++) {
//			System.out.println("Hey, it is year ");
//			int years = yr++;
//			System.out.println(years);
//		}

	
/*
 * 	Write a program that prints the count down from 10 up to 1 and string "Happy New Year!".
 */
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i);
//			if (i == 1) {
//				System.out.println("Happy New Year");
//			}
//		}

		

		// BONUS SELF ASSIGNMENTS
// Write a program that prints the count down from 10 up to 1 and string "Happy New Year!".
//   skip even number years 		
	
//		for (int i = 10; i >= 1; i--) {
//			if (i == 2 || i == 4 || i == 6 || i == 8 || i == 10)
//				continue;
//			System.out.println(i);
//			if (i == 1) {
//				System.out.println("Happy new year");
//			}
//			{
//
//			}
//		}


	int sum=0;
	
	for(int i=0; i<=3; i++) {
		sum=sum + i;
		System.out.println(sum);
	}
	// Iterations 
	// i=0 + sum=0 = 0
	// i=1 + sum=0 = 1 ---> increment i to 1 (will carry over 1)
	// i=2 + sum=1 = 3 ---> increment i to 2 and sum to 1 and you get 3
	// i=3 + sum=3 = 6 ---> increment i to 3 and sum to 3 and you get 6


	
	int total=2;
	
	for (int y=1; y<=4; y++) {
		total = total * y;
		System.out.print(total+" ");
	}	
	// y=1 * total=2 = 2 
	// y=2 * total=2 = 4
	// y=3 * total=4 = 12
	// y=4 * total=12 = 48
			// Y will keep increasing due to your condition and as long as this condition is true "y<=4"
			// total increases based on the total from the previous result in your loop 		
/*
 * 		
 */
	
	System.out.println("");
	int even=0;
	
	for(int i=0; i<=20; i+=2) {
		even=even + i;
	}
	System.out.println("Sum of even is "+even);
	
	
	System.out.println("");
	int odd=0;
	
	for(int i=1; i<20; i+=2) {
		odd=odd+i;
	}
	System.out.println("Sum of odd is "+odd);
	
	
	
	// instructor way 
	
	int sumEven=0;
	int sumOdd=0;
	
	for(int i=1; i<=20; i++) {
		if(i %2==0) {
			sumEven = i;
		}else {
			sumOdd = i;
		}
	}
	System.out.println("The sum of even is " + sumEven);
	System.out.println("The sum of odd is "+ sumOdd);
	
	
	
	

}
}
		
		
			
	


