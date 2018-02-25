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

public class StringUniqueChars {

	
	public static void main(String[] args) {
		
		String input = "java";
		
		System.out.println(checkForUniqueCharacters(input));
		
		System.out.println(checkForUniquenessOfString(input));
	}
	
	public static boolean checkForUniqueCharacters(String input){
		
		Map<Character , Integer > map = new HashMap<>();
		
		for(int i=0; i < input.length() ; i++){
			
			char c = input.charAt(i);
			
			if(c != ' '){
				if(map.containsKey(c)){
					
					//if(map.get(c) > 1)
						return false;
					
				}else{
					map.put(c, 1);
				}
			}
		}
		
		return true;
		
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