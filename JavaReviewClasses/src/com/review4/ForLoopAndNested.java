package com.review4;

public class ForLoopAndNested {
	
	public static void main(String[] args) {
		
		// attempt the hotel rooms
		// 4 floors 6 rooms per floor
		// example print: 
		// Floor 1 --> 1.1  1.2  1.3  1.4  1.5  1.6
		// Floor 2 --> 2.1  2.2  2.3  2.4  2.5  2.6

		
		
		
/*
1
12
123
1234
12345		
 */		
		for(int row=1; row<=5; row++) {
//			System.out.println(row);
			for(int col=1; col<=row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
System.out.println();		

		for(int row=1; row<=5; row++) {
//			System.out.println(row);
			for(int col=1; col<=row; col++) {
				System.out.print(2 * col -1);
			}
			System.out.println();
		}
		System.out.println();		
		
		
		for(int row=1; row<=5; row++) {
//			System.out.println(row);
			for(int col=1; col<=row; col++) {
				System.out.print(col * col +" ");
			}
			System.out.println();
		}
		System.out.println();		
		
	}

}
