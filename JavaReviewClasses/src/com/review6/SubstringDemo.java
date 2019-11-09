package com.review6;

public class SubstringDemo {

	public static void main(String[] args) {
		String longStr ="I am very  happy today, because today is not Monday";
		
		// 1 parameter
		String anotherStr=longStr.substring(10); // starts from "h"
		System.out.println(anotherStr);
		
		// 2 parameters
		anotherStr=longStr.substring(10, 16); // starts at 10 and end before 16. 5 letters
		System.out.println(anotherStr);
		
		// Print the length
		System.out.println(longStr.length()); // 51 - this is the max parameter
		
		

	}

}
