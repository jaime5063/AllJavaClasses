package com.RandomNotes;

import java.util.Scanner;

public class MonthlyTotals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("First");
		int car1=scan.nextInt();
		System.out.println("Second");
		int rent=scan.nextInt();
		System.out.println("Third");
		int phone1=scan.nextInt();
		System.out.println("Fourth");
		int school=scan.nextInt();
		
		int average=car1+rent+phone1+school;
		System.out.println(average);
		System.out.println(average/4);
		
		
		
	}

}
