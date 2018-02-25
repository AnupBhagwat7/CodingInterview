/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.collections;

import java.util.HashMap;
import java.util.Stack;

public class HashMapDemo {
	
	{
		System.out.println("I am in IIB");
	}
	
	static{
		System.out.println("I am in static initialization");
	}

	public static void main(String[] args) {
		
	HashMap< Integer, String> myMap = new HashMap<>();
	
	myMap.put(null, null);
	myMap.put(1, "aaa");
	myMap.put(2, "bb");
	myMap.put(3, "cc");
	myMap.put(4, "dd");
	myMap.put(5, "ee");

	myMap.put(6, "aaa");
	myMap.put(7, "bb");
	myMap.put(8, "cc");
	myMap.put(1, "dd");
	myMap.put(9, "ee");

	myMap.put(10, "aaa");
	myMap.put(11, "bb");
	myMap.put(12, "cc");
	myMap.put(13, "dd");
	myMap.put(14, "ee");

	myMap.put(2, "aaa");
	myMap.put(15, "bb");
	myMap.put(16, "cc");
	myMap.put(17, "dd");
	myMap.put(18, "ee");
	myMap.put(null, "I am null 0");
	myMap.put(2, "aaa");
	myMap.put(159, "bb");
	myMap.put(16, "cc");
	myMap.put(171, "dd");
	myMap.put(138, "ee");
	myMap.put(null, "I am null");
	
		
		System.out.println(myMap);
		
		HashMapDemo ad = new HashMapDemo();
		
	}
}