/**
How to determine if a string has all unique characters in Java?

Read more: http://www.java67.com/search/label/Coding%20Problems?&max-results=3
 * 
 */
package com.practice.programs;

import java.util.StringTokenizer;

public class StringWordsCount {

	
	public static void main(String[] args) {
		
		String input = "1. Arsenal         38    26   9   3    79  -  36    87";
		
		//Counting word using String.split() method
		if (input == null || input.isEmpty()) 
		{ System.out.println("Invalid input");
		System.exit(1);}

		System.out.println(input.split("\\s+").length);
		
		// Counting word in String using StringTokenizer
		 StringTokenizer tokens = new StringTokenizer(input, " ");
		 
		 System.out.println(tokens.countTokens());
		 
		 while(tokens.hasMoreTokens()){
			 System.out.println(tokens.nextToken());
		 }
		 
		//Counting word in String without using library method

		int count = 1;
		for(int i = 0 ; i < input.length() ; i++){
			
			if(input.charAt(i) == ' ' && input.charAt(i+1) != ' ')
				count++;
		}
		
		System.out.println(count);
	}
	
	
}