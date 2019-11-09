package com.review6;

public class BasicsForEachLoop {

	public static void main(String[] args) {
		
		
		int [] inArray = {9, 8, 4, 5}; // one dimensional array		
		
		for(int i : inArray) { // i will fetch values from inArray 			
		System.out.println(i); // loop and print i values 
		};
		System.out.println(" ");

		
		
		
		int [][] twoArray = {
			{8,3,5,7},
			{9,4,1,2},
			{7,6,5,3}
		};		
		for(int [] i: twoArray) {
			for(int j : i) {
				System.out.print(j +" ");
			}
			System.out.println();
			
		}

	}

}
