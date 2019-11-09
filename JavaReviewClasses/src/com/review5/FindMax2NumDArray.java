package com.review5;

public class FindMax2NumDArray {

	public static void main(String[] args) {
		
		//-- FIND THE MAXIMUM NUMBER AND SUM IN A 2D ARRAY --
		
		int [][] b = {	// 4 ROWS & 3 COLUMS
				//Column 0 1 2		
						{7,3,5}, // Row 0
						{2,4,7}, // Row 1
						{8,1,9}, // Row 2
						{3,4,1}	 // Row 3
		};

		int max = b[0][0];
		int sum =0; //--> GET THE SUM OF ARRAY
		
		for(int i=0; i<b.length; i++) {
			for(int k=0; k <b[i].length; k++) {
				sum+= b[i][k];   	//--> GET THE SUM OF ARRAY
				if(b[i][k]> max) { // IF A VALUE OF AN ARRAY IS GREATER THAN MAX GOT TO LINE BELOW
					max = b[i][k]; // AND ASSING THAT VALUE AS NEW MAX NUMBER
				}
			}
		}
		System.out.println("maximum num is "+ max);
		System.out.println("Sum of array is "+ sum); //--> GET THE SUM OF ARRAY
		
		//- CREATE 1-D ARRAY
		//ENTER THE SUM OF EACH INTO ONE ELEMENT OF THE ARRAY
		
		//EXTRA
		//CREATE A 1D ARRAY AND ENTER SUM OF EACH COLUMN INTO ONE ELEMENT OF THE ARRAY
		
		
		
	}

}
