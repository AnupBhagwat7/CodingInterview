/**https://java2blog.com/how-to-swap-two-numbers-without-using-temporary-variables-in-java/
 * 
How to swap two numbers without using temporary variables in java
 * 
 */
package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSorting {

	
	public static void main(String[] args) {
		
		
		Map<Integer, String > map = new HashMap<>();
		
		map.put(1, "Anup");
		map.put(6, "Ram");
		map.put(3, "Sagar");
		map.put(2, "Deepa");
		map.put(4, "Sham");
		map.put(5, "Archu");
		map.put(9, "Soham");
		map.put(7, "Shruti");
		map.put(1, "Reva");
		map.put(11, "Dyani");
		map.put(45, "Gyani");
		map.put(44, "Sham");
		map.put(55, "Archu");
		map.put(91, "Soham");
		map.put(72, "Shruti");
		map.put(13, "Reva");
		map.put(16, "Dyani");
		map.put(49, "Gyani");
		
		System.out.println("Origional Map = "+ map);
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			
			System.out.println("Key = "+ entry.getKey() +" Value = "+ entry.getValue());
		}
		
		System.out.println("Sorting on the basis of Keys");
		TreeMap< Integer, String> tMap = new TreeMap<>(map);
		for(Map.Entry<Integer, String> entry: tMap.entrySet()){
			
			System.out.println("Key = "+ entry.getKey() +" Value = "+ entry.getValue());
		}
		
		System.out.println("Sorting on the basis of Values");
		
		Set set = map.entrySet();
		
		List<Map.Entry<Integer, String>> list = new ArrayList<>(set);
		
		Collections.sort(list , new Comparator<Map.Entry<Integer, String>>(){

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		System.out.println(list);
		
		
		
	}
		
}