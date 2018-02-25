/**
 * 
 */
package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author anup
 *
 */
public class MapSortingOnValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(6, "Anup");
		map.put(4, "Ram");
		map.put(2, "Sham");
		map.put(9, "Rohit");
		map.put(5, "Gopal");
		map.put(1, "Ram");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			
			System.out.println(entry.getKey()  +":"+entry.getValue());
		}
		
		
		Set<Map.Entry<Integer, String>> set=  map.entrySet();
		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(set);
		System.out.println(list);
		
		//for(Map.Entry<Integer, String> entry : list){
			
			Collections.sort(list, new Comparator<Map.Entry<Integer, String>>(){
				
				public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2){
					return o1.getValue().compareTo(o2.getValue());
				}
			});
		//}
		
		System.out.println(list);
		
	}

}
