/**
 * Write a function to check whether two given strings are anagram of each other or not. An anagram of a string is another 
 * string that contains same characters, only the order of characters can be different. 
 * For example, “abcd” and “dabc” are anagram of each other.
 */
package com.practice.programmingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author anup
 *
 */
public class CheckForAnagramStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "@abcd!";
		String s2 = "dc!@ba";
		
		
		if(s1.length() != s2.length())
			System.out.println("No Anagrams");
		
		
		TreeSet<Character> set1 = new TreeSet<>();
		TreeSet<Character> set2 = new TreeSet<>();
		char[] c1 = new char[100];
		char[] c2 = new char[100];
		
		
		if(s1.length() == s2.length()){
			
			for(int i=0; i < s1.length() ; i++){
				
				set1.add(s1.charAt(i));
				set2.add(s2.charAt(i));
			}
			
			//Object[] a1 = set1.toArray();
			//Object[] a2 = set2.toArray();
			
			List<Character> l1 = new ArrayList<Character>(set1);
			List<Character> l2 = new ArrayList<Character>(set2);
			
			for(int i=0; i < l1.size(); i++){
				
				c1[i] = l1.get(i);
				c2[i] = l2.get(i);
			}
			
			System.out.println(new String(c1).trim() +" "+ new String(c2).trim());
			
			System.out.println("isAnagram = "+ new String(c1).trim() .equalsIgnoreCase( new String(c2).trim()  ));
		}
		
		
		
		
	}

}
