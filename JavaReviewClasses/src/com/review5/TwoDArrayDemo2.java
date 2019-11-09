package com.review5;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int [][] b = {	// 4 ROWS & 3 COLUMS
//		//Column 1 2 3		
//				{7,3,5}, // Row 1
//				{9,4,2}, // Row 2
//				{8,1,0}, // Row 3
//				{3,4,1}	 // Row 4			
//		};
//		
//		for(int i=0; i<b.length; i++) {
//			for(int j=0; j<b[i].length; j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println(); // print new line after each row
//		}
/*
7 3 5 
9 4 2 
8 1 0 
3 4 1 
*/
//---------------------------------------------------------------------------------------------
		int [][] b = {	// 4 ROWS & 3 COLUMS
				//Column 0 1 2		
						{7,3,5}, // Row 0
						{9,4,2,6}, // Row 1
						{8,1,0,3,4}, // Row 2
						{3,4,1}	 // Row 3			
				};
//				System.out.println(b.length);
//				System.out.println(b[0].length); // Row at index 0
//				System.out.println(b[2].length);
		
				for(int i=0; i<b.length; i++) {
					for(int j=0; j<b[i].length; j++) {
						if (j !=1 && (i !=1 && i!=3)) {   //skip column 1, skip row 1, skip row 3
							System.out.print(b[i][j] + " ");
						} 
						
					}
					System.out.println(); // print new line after each row
				}
//-----------------------------------------------------------------------------------------------				

	}

}
