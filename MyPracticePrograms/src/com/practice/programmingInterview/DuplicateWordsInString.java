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
public class DuplicateWordsInString {

	/**
	 * @param args
	 */
	
	public static void getNumberOfDuplicateWords(String input) {
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] split = input.trim().split("\\s+");
		
		for (String s : split){
			System.out.println(s.toLowerCase());
			
			if(map.containsKey(s.toLowerCase())){
				map.put(s.toLowerCase(), map.get(s)+1);
			}else{
			map.put(s.toLowerCase(), 1);
			}
		}
			
		
		System.out.println(map);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		getNumberOfDuplicateWords(" asdasd asdasd  asdasd  asdasd");
		
		
		getNumberOfDuplicateWords("Bread    .butter and          . bread");
	}

}
