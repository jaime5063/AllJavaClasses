package com.HW2dArrayStrngMnpulation;

public class TwoDArrayHw {

	public static void main(String[] args) {
		
		//Write a program to double the values of every element in the array and print it out.
		
//		double[][] a = {
//				{1.4,2.0,3.3,2},
//				{4,1.5,6.1,1},
//				{1.2,3.1,4,1.6}
//			};	
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				System.out.print(a[i][j]*2+" ");		
//			}
//			System.out.println();
//		}
/*
 * ------------------------------------------------------------------------------------------------------------		
 */	
		//Write a program to print the sum of the elements in the third row. 
//		int[][] a = {
//				//0 1 2 3
//				{5,2,3,7},
//				{1,5,2,2},
//				{1,2,3,4}
//			};		
//		int sum=0;		
//		for(int i=0; i<a.length; i++) {
//			sum += a[0][i];
//		}
//		System.out.println(sum);
/*
 * --------------------------------------------------------------------------------------------------------------		
 */
	// Write a program that will print out the largest number from
		// the 2D Array
//		int[][] a = {
//				{5,2,3,7},
//				{1,5,1,1},
//				{8,3,1,2}
//			};	
//	int maxI= 0, maxJ=0;
//	for(int i = 0; i<a.length; i++) {
//		for(int j = 0; j<a[i].length; j++) {
//			if(a[i][j] > a[maxI][maxJ]) {
//				maxI= i;
//				maxJ= j;
//			}
//		}
//	}	
// System.out.println(a[maxI][maxJ]);
/*
 * ---------------------------------------------------------------------------------------------------------------------		
 */
	
//Write a program that checks if a 2-D integer array is a square array, meaning, if its rows and columns are equal.		
//		int[][] a = {
//				{1,1,1},
//				{1,1,1},
//				{1,1,1}
//			};
//		int row=0, column=0;
//		boolean result=true;
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				if(a[i][j]==a[row][column]) {
//				}
//			}
//		}
//		System.out.println(result);
/*
 * -----------------------------------------------------------------------------------------------------------------------
 */
// Write a program that  takes a 2-D array and prints the sums of the rows as an integer array.		
//		int[][] a = {
//				{1,1,2}, //sum = 4
//				{3,1,2}, //sum = 6
//				{3,5,3}, //sum = 11
//				{0,1,2}  //sum = 3
//			};	
//		int sum=0, sum1=0, sum2=0, sum3=0;
//		int totals;
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; i<a[i].length; i++) {
//			sum += a[0][i];
//			sum1 += a[1][i];
//			sum2 += a[2][i];
//			sum3 += a[3][i];
//		}			
//		}
//		System.out.println(sum);
//		System.out.println(sum1);
//		System.out.println(sum2);
//		System.out.println(sum3);
/*
 *-------------------------------------------------------------------------------------------------------------------------- 
 */
	//Write a program that prints the total number of elements that are negative AND odd
//		int[][] a = {
//				{-5,-2,-3,7},
//				{1,-5,-2,2},
//				{1,-2,3,-4}
//			};
//		int total=0;
//		for(int i=0; i<a.length;i++) {
//			for(int j=0; j<a[i].length; ++j) {
//				if(a[i][j]%2==0)
//				total=a[i][i];
//			}
//			}
//		System.out.println(total);
/*
 * ----------------------------------------------------------------------------------------------------		
 */
// Write a program that will print the sum of all elements in column with index 1 in a 2-D int array.
// -9
//		int[][] a = {
//				{-5,-2,-3,7},
//				{1,-5,-2, 2},
//				{1,-2, 3,-4}
//			};
//		int sum=0;
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				sum+=a[i][j];
//			}
//		}
//		System.out.println(sum);
/*
 * ------------------------------------------------------------------------------------------------------		
 */
// Write a program that sums all numbers that are on even index and on even row and prints it out.
//For example, in the following array, the numbers with parentheses would be summed:		
/*   0  1  2  3

0   (4)(6)(3)(2)
1   (4) 1 (2) 3
2   (1)(2)(6)(9) 		
 */
		int[][] a = {
//				  0  1  2 3
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};	
		int sum = 0;
		for (int i = 1; i < a.length; i += 2) {
			for (int j = 1; j < a[i].length; j += 2) {
				sum += a[i][j];
				if (sum % 2 == 0) {
				}
			}
		}
		System.out.println(sum * 2);

	
		
		
		
	}

}
