package com.review5;

import java.util.Scanner;

public class Scanner2DArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Buddy, how many rows do you want?");
		int row=scan.nextInt();
		System.out.println("How many columns do you want?");
		int col=scan.nextInt();
		
		System.out.println("Your arrays will have "+row+" rows and "+col+" columns");
		
		String[][] names = new String [row][col]; // whatever the user gives you
		
		for(int i=0; i < names.length; i++) { // whatever value you give in rows will give you the length
			//name.length = rows
			//names[0].length = col
			// ENTERING INTO ARRAY
			for(int j=0; j<names[i].length; j++) {
				System.out.println("Enter a name");
				names[i][j] = scan.next(); 
			}
		}
		System.out.println("Lets print the names!");
		for (int i=0; i< row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}
	}

}
