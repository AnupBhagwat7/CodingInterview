/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.wolterklower;


import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;


public class Problem {

	 
	public static void main(String[] args) {
		
	
		System.out.println("Hello anup. How are you doing?  Its excellent!     .    ?   = "+ solution("Hello anup. How are you doing?  Its excellent!     .    ?"));
		System.out.println("Null = "+solution(null));
		System.out.println(solution("ahksdhaksjhdkahsdjksadhjkaksdhkj           aksjdkahsdkjahsdkjhkasjhdk"));
	}
	
	
	public static int solution(String s) {
		
		if(s == null || s.length() > 100)
			return 0;
		
		//String[] splitStr = s.split("[! | ? | \\. ] +");
		String[] splitStr = s.split("[.?!]+");
		
		
		HashMap map = new HashMap<String , Integer>();
		for(int i=0;i< splitStr.length; i++){
			
			System.out.println(splitStr[i]);
			map.put(splitStr[i], splitStr[i].trim().split("\\s+").length);
		}
		System.out.println(map);
		
		//Set set = map.entrySet();
		//ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(set);
		
		
		Collection c =  map.values();
		TreeSet<Integer> s1 = new TreeSet<Integer>(c);
		System.out.println(  s1.last()  );
		
		return s1.last() ;
	}
}