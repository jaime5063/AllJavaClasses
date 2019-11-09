package com.review6;

public class SplitDemo {

	public static void main(String[] args) {
		
		String longStr ="I am very  happy today, because today is not Monday";
		
		//.split returns an array of string
		
		String[] anotherStr=longStr.split("today");
		System.out.println(anotherStr.length); // 3 elements because it splits when it sees "today".
		
		System.out.println(anotherStr[0]); // first string
		System.out.println(anotherStr[1]); // second string 
		System.out.println(anotherStr[2]); // third string 
		System.out.println(".................................................");
		
		//loop to get answer
		
		for(int i=0; i<anotherStr.length; i++) {
			System.out.println(anotherStr[i]);
		}
		
		System.out.println(".................................................");
		
		
		
		

	}

}
