/**
How to determine if a string has all unique characters in Java?

Read more: http://www.java67.com/search/label/Coding%20Problems?&max-results=3
 * 
 */
package com.practice.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String input = null;
		
		System.out.println(reverseString(input));
	}
	
	public static String reverseString(String input){
		
		if(input == null || input.isEmpty() ){
			return input; 
		}/*else{
			if( input.isEmpty())
				return input;
		}*/

		char[] charArray = input.toCharArray();
		
		int i = 0;
		int j = charArray.length - 1;
		
		while(i < j){
			
			swap(i, j, charArray);
			i++;
			j--;
		}
		
		return new String(charArray);
	}
	
	public static void swap(int i, int j, char[] charArray) {
		
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
	}
	
	
	
	
	public static boolean checkForUniquenessOfString(String input){
		
		Set<Character> set = new HashSet<>();
		
		char[] charArray = input.toCharArray();
		
		for(char c: charArray){
			
			if(!set.add(c)){
				return false;
			}
		}
		return true;
	}
}