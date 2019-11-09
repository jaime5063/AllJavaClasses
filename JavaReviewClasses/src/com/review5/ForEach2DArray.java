package com.review5;

public class ForEach2DArray {
	public static void main(String[] args) {
		
		// 1d array
		
//		int [] a = new int[4]; // create the size of an array [0,1,2,3]
//		
//		for(int i=0; i< a.length; i++) {
//			System.out.println(a[i]);
//		}
//---------------------------------------------------------------------------

		//  2D ARRAYS
		
		// first one is always ROW (side) , second is always COLUMN (down)	
		int [][] a = new int[3][4];
		
		a[1][2] = 3; // Row 1, Column 2
		a[2][1] = 5; // Row 2, Column 1
		
		for(int row =0; row< a.length; row++) { 
			System.out.print("row " + row + "-->");
			for(int col = 0; col <a[row].length; col++) {
				int value = a[row][col];
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
