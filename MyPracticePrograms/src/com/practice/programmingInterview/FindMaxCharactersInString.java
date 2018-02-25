/**
 * @author anup
 *You are given a string which comprises of lower case alphabets (a-z), upper case alphabets (A-Z), numbers, (0-9) and special characters like !,-.; etc.

You are supposed to find out which character occurs the maximum number of times and the number of its occurrence, in the given string. If two characters occur equal number of times, you have to output the character with the lower ASCII value.

For example, if your string was: aaaaAAAA, your output would be: A 4, because A has lower ASCII value than a.

Input format:
The input will contain a string.

Output format:
You've to output two things which will be separated by a space:
i) The character which occurs the maximum number of times. 
ii) The number of its occurrence.

Constraints:
The maximum length of the string can be 1000.
 */
package com.practice.programmingInterview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class FindMaxCharactersInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String name = s.nextLine(); // Reading input from STDIN
		System.out.println("Hi, " + name + "."); // Writing output to STDOUT

		HashMap<Character, Integer> map = new HashMap<>();
		
		
		for(int i=0; i < name.length() ; i++){
			
			if(map.containsKey(name.charAt(i))){
				
				int val = map.get(name.charAt(i));
				map.put(name.charAt(i), val +1);
			}
			else
				map.put(name.charAt(i), 1)	;
		}
		
		
		System.out.println(map);
		
		
		Collection<Integer> coll =  map.values();
		TreeSet<Integer> tset = new TreeSet<>(coll);
		System.out.println(tset.last());
		
		
		Set<Map.Entry<Character, Integer> > set = map.entrySet();
		
		ArrayList<Map.Entry<Character, Integer> > list = new ArrayList<>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >(){

			@Override
			public int compare(Entry<Character, Integer> arg0, Entry<Character, Integer> arg1) {
				// TODO Auto-generated method stub
				
				if(arg0.getValue() > arg1.getValue())
				return 1;

				else if(arg0.getValue() < arg1.getValue())
				return -1;
				
				else 
					return 0;
			}
			
			
			
		});
		
		
		
		System.out.println(list);
		
		
		System.out.println(list.get(list.size()-1).getKey() +" "+  list.get(list.size()-1).getValue());
	}

}
