package com.HwLogicalOperators;

import java.util.Scanner;

public class LogicalOperatorsHW {
	
	public static void main(String[] args) {
		
		
//		    Scanner scan=new Scanner(System.in);
//		    int quiz, midterm, finall,averageScore;
//		    char grade;
//		           System.out.println("enter your quiz,midterm,finall scores,respectively");
//		           quiz=scan.nextInt();
//		           midterm=scan.nextInt();
//		           finall=scan.nextInt();
//		        averageScore=(quiz+midterm+finall)/3;
//		        
//		        if(averageScore>=90 && averageScore<=100) {
//		           grade='A';
//		        }else if (averageScore>=70 && averageScore<90){
//		            grade='B';
//		        }else if(averageScore>=50 && averageScore<70){
//		            grade='C';
//		        }else if(averageScore<50){
//		            grade='F';
//		        }else{  
//		            grade='I';
//		             }
//		        System.out.println(grade);
//		
		
		
		
		
		
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
			if the average score >=90 → grade=A
			if the average score >= 70 and <90 → grade=B
			if the average score>=50 and <70 → grade=C
			if the average score<50 → grade=F
		 */
//		Scanner scan=new Scanner(System.in);
//		
//		int quiz, midTerm, Final, averageScore;
//		char grade;
//		
//		System.out.println("Enter quiz score");		
//		quiz=scan.nextInt();
//		
//		System.out.println("Enter midterm score");
//		midTerm=scan.nextInt();
//		
//		System.out.println("Enter Final score");
//		Final=scan.nextInt();
//		
//		averageScore=(quiz+midTerm+Final)/3;
//		
//		if(averageScore>=90) {
//			grade='A';
//		}else if(averageScore>=70 && averageScore<90) {
//			grade='B';
//		}else if(averageScore>=50 && averageScore<70) {
//			grade='C';
//		}else if(averageScore<50) {
//			grade='F';
//		}else {
//			grade='I';
//		}
//		System.out.println(grade);  
//___________________________________________________________________________________________________________________________
		
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
			if the average score >=90 → grade=A
			if the average score >= 70 and <90 → grade=B
			if the average score>=50 and <70 → grade=C
			if the average score<50 → grade=F
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int quiz, midterm, finalScore, averageScore;
		
		System.out.println("Enter quiz score");
		quiz=scan.nextInt();		
		System.out.println("Enter midterm score");
		midterm=scan.nextInt();		
		System.out.println("Enter finalScore");
		finalScore=scan.nextInt();
		
		averageScore=(quiz+midterm+finalScore)/3;
		String grade;
		
		if(averageScore>=90) {
			grade="Grade A";
		}else if(averageScore>=70 && averageScore<90) {
			grade="Grade B";
		}else if(averageScore>=50 && averageScore<70) {
			grade="Grade C";
		}else if(averageScore<50) {
			grade="Grade F";
		}else {
			grade="Not graded";
		}
		System.out.println(grade);
		

		//Write a program to determine the classMode.
		//If there is no rain → classMode=“In Class”, otherwise classMode → “Online”.
		
//		Scanner inRain=new Scanner(System.in);
//
//		boolean Rain;
//		Rain=inRain.nextBoolean();
//		String classMode;
//		
//		if(!Rain) {
//			classMode="Online";
//		}else {
//			classMode="In Class";
//		}
//		System.out.println(classMode);
		
		
		
		
		
		
		
		
		
		
		
	}

}
