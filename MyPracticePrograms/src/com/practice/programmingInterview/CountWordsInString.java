/**
 * Write a java program to find the duplicate words and their number of occurrences in a string?
 */
package com.practice.programmingInterview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author anup
 *
 */
public class CountWordsInString {

	/**
	 * @param args
	 */
	
	public static void getNumberOfDuplicateWords(String input) {
		
		
		//HashMap<String, Integer> map = new HashMap<>();
		
		String[] split = input.trim().split("\\s+");
		
		int count = 0;
		for (String s : split){
			count ++;
		}
			
		
		System.out.println(count);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		getNumberOfDuplicateWords(" asdasd asdasd  asdasd  asdasd");
		
		
		getNumberOfDuplicateWords("Bread butter and bread .");
	}

}
