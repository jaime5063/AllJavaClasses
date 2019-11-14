package LoopSwitchHw;

import java.util.Scanner;

public class ForLoopAndSwitch {

	public static void main(String[] args) {

/*
 * 	For you to do:
	You should input:
	int end;
	Write a for loop that will print out the numbers starting at 0 and ending at twice of the end variable exclusive.  
	Each number should be on the same line, separated by a space. 
    Sample inputs/outputs:
	Int: 5
	0 1 2 3 4 5 6 7 8 9
	Int: 8
	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
	In: -5
 	(no output) 	
 */
//		Scanner inp = new Scanner(System.in);
//		System.out.print("Int:");
//		int end = inp.nextInt();
//
//		int mul = end * 2;
//		for (int i = 0; i < mul; i++) {
//			System.out.println(i);
//		}
/*
 * Note: You may also place the switch case statement inside a for loop. In each iteration 
of the for loop, the switch case can be executed for each value in the range of for loop. 

The x variable is incremented by 5 in each iteration. In the body of for loop, 
the switch statement with five cases and a default label. For every loop, 
the expression in the switch is matched, and the matched case statement will 
display a message. 

Hint: always watch output mismatch in case of an error while submitting, it will show the difference between your 
and expected answers. 
 */		
//		for (int x = 5; x <= 25; x = x + 5) {
//
//			switch (x) {
//
//			case (5):
//				System.out.println("The case 5 is true");
//				break;
//			case (10):
//				System.out.println("The case 10 is true");
//				break;
//			case (15):
//				System.out.println("The case 15 is true");
//				break;
//			case (20):
//				System.out.println("The case 20 is true");
//				break;
//			case (25):
//				System.out.println("The case 25 is true");
//				break;
//			}
//
//		}
/*
 * Write a program to print out the pattern: 
        1
      22 
    333 
  4444 
55555
Hint: For loop can have more than one loop nested in it. 
 */
//		for (int i = 1; i < 6; i++) {
//
//			for (int b = 0; b < i; b++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

/*
 * 	Write a program to print out the pattern: 
$$$$
$  $
$  $
$$$$	
 */
//		char money = '$';
//		for (int i = 0; i < 4; i++) {
//			System.out.print(money);
//		}
//		System.out.println();
//		for (int i = 1; i <= 1; i++) {
//			for (int b = 1; b <= 2; b++) {
//				System.out.println(money+"  "+money);
//			}
//		}
//		for (int i = 0; i < 4; i++) {
//			System.out.print(money);
//		}

/*
 * Write a program to print out the pattern: 
1 2 3 4 5 6 7 8 9 10 
2 4 6 8 10 12 14 16 18 20 
3 6 9 12 15 18 21 24 27 30 
4 8 12 16 20 24 28 32 36 40 
5 10 15 20 25 30 35 40 45 50		
 */	
//		for (int a = 1; a <=10; a++) {
//			System.out.print(a + " ");
//		}
//		System.out.println();
//		for (int a = 1; a <= 10; a++) {
//			System.out.print(a * 2 + " ");
//		}
//		System.out.println();
//		for (int a = 1; a <= 10; a++) {
//			System.out.print(a * 3 + " ");
//		}
//		System.out.println();
//		for (int a = 1; a <= 10; a++) {
//			System.out.print(a * 4 + " ");
//		}
//		System.out.println();
//		for (int a = 1; a <= 10; a++) {
//			System.out.print(a * 5 + " ");
//		}

/*
 * 	Write a program to print out the pattern: 
syntax 
syntax 
syntax 
syntax 
syntax 
syntax 	
 */
//	for(int i=0; i<=5; i++) {
//		System.out.println("Syntax");
//	}	

		
/*
 * Write a program that creates an array of integers that stores the following values:
 *  45, 78, 12,  67, 55 and then prints all array values.	
 */	
//		int[] numbers = { 45, 78, 12, 67, 55 };
//		for (int i = 0; i < 5; i++) {
//
//			System.out.print(numbers[i] + " ");
//		}

		
/*
 * Write a program that creates an array of integers that stores the following 
 * values: 45,78, 12,  67, 55, 89, 23, 77, 88
   Print only values that stored with even index including 0.
   output: 45 12 55 23 88		
 */
//		for (int i = 0; i <= 8; i += 2) {
//			int[] counts = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
//			System.out.println(counts[i]);
//		}


/*
 * Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x} 
 * and prints the values starting at index 0 and multiple of 2 using a for loop.		
 */
//		char[] name = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };
//		for (int i = 0; i < 11; i += 2) {
//			System.out.print(name[i]);
//		}

		
/*
 * For you to do:
Write a program that creates an array of strings with the following values{"This", "is", "array", "of", "strings"} 
and prints all values in one line.
Output:
This is array of strings		
 */
//		String[] sentence = { "This", "is", "array", "of", "strings" };
//		for (int i = 0; i <= 4; i++) {
//			System.out.print(sentence[i] + " ");
//		}
		
		
/*
 *  Write a program that creates an array of strings with the size being 7. 
	Ask the user to input Days of a week beginning with Sunday using Scanner class.
	Add these inputs to your array and then print all values from that array
Example:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday
	Hint: you will need 2 for loops but it is not nested loops. 		
 */
//		Scanner scan = new Scanner(System.in);
//		String[] days = new String[7];
//		days[0] = "Sunday";
//		days[1] = "Monday";
//		days[2] = "Tuesday";
//		days[3] = "Wednesday";
//		days[4] = "Thursday";
//		days[5] = "Friday";
//		days[6] = "Saturday";
//		for (int i = 0; i <= 6; i++) {
//			if (i == 0)
//				System.out.println("Please enter day 1 of the week");
//			if (i == 1)
//				System.out.println("Please enter day 2 of the week");
//			if (i == 2)
//				System.out.println("Please enter day 3 of the week");
//			if (i == 3)
//				System.out.println("Please enter day 4 of the week");
//			if (i == 4)
//				System.out.println("Please enter day 5 of the week");
//			if (i == 5)
//				System.out.println("Please enter day 6 of the week");
//			if (i == 6)
//				System.out.println("Please enter day 7 of the week");
//			String day = scan.nextLine();
//		}
//		for (int b = 0; b <= 6; b++);
//		System.out.println(days[0]);
//		System.out.println(days[1]);
//		System.out.println(days[2]);
//		System.out.println(days[3]);
//		System.out.println(days[4]);
//		System.out.println(days[5]);
//		System.out.println(days[6]);

		
/*
 * Write an array with size of 5. 
Use a loop to input values to the array (don't print any prompt message for Scanner).
Then print out all the elements you have created in the first loop in reverse order. 
Input: 
1
2
3
4
5
Output:
5
4
3
2
1
 */
//	Scanner val=new Scanner(System.in);
//	
//	int [] nums = {5, 4, 3, 2, 1};
//	
//	for(int i=0; i<=4; i++) {
//		int num=val.nextInt();
//	}
//	System.out.println(nums[0]);
//	System.out.println(nums[1]);
//	System.out.println(nums[2]);
//	System.out.println(nums[3]);
//	System.out.println(nums[4]);


		
/*
 * Write a program that creates an array of integers of size 11. 
 * Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values. 		
 */	
//		int[] years = { 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020 };
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(years[i]);
//		}

		
		
/*
 * Create an int array with the size of 5 and input values with Scanner. 
Create a loop and enter values into one loop (don't print prompt question for Scanner). 
Create the second loop to print the values and it must be multiplied by 10.
Print out each element of the array multiplied by ten, one element per line.
input:
1
2
3
4
5
output:
10
20
30
40
50		
 */

// Scanner ten=new Scanner(System.in);
// 
// int [] Num= new int[5];
// Num[0]=1;
// Num[1]=2;
// Num[2]=3;
// Num[3]=4;
// Num[4]=5;
//
// for(int i=0; i<=4; i++) {
//	 ten.nextInt(); 
//	}
// for(int b=0; b<1; b++) {
//	 System.out.println(Num[0]*10);
//	 System.out.println(Num[1]*10);
//	 System.out.println(Num[2]*10);
//	 System.out.println(Num[3]*10);
//	 System.out.println(Num[4]*10);
//
// }
 
		
/*
 * Write a program that creates an array of integers that stores the 
 * following values{45, 78, 12,  67, 55, 89, 23, 77, 88}. 
	Print the values using a for loop starting at index 1 and increment by 3, and then print value divided by its index.		
 */
 
	int [] last= {45, 78, 12,  67, 55, 89, 23, 77, 88};
	
	for(int i=1; i<=8; i+=3) {
		System.out.println(last[i]);
	}
	System.out.print(78/1 +" ");
	System.out.print(55/4 +" ");
	System.out.print(77/7 +" ");
	
 

		
	
	
	
	}
	}




