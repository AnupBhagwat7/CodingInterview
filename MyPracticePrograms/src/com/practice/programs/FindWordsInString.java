/**
Java program to count number of words in a string

Problem
Find the number of words in a String.

For example:
There are 6 words in below String

welcome to java tutorial on Java2blog
 * 
 */
package com.practice.programs;

public class FindWordsInString {

	
	public static void main(String[] args) {
		
		String input = "welcome to java    tutorial on Java2blog";
		
		//System.out.println(input.split(" ").length);
		
		int count = 1;
		for(int i=0; i<input.length(); i++ ){
			
			if(input.charAt(i) == ' ' && input.charAt(i+1) != ' '){
				count++;
			}
				
		}
		
		System.out.println("Number of words: "+ count);
	}
}