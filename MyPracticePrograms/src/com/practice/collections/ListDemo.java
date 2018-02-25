/**
 * 
 */
package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anup
 *
 */
public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		
		al.add(2, 3);
		System.out.println(al);
		
		System.out.println(al.stream().filter(a -> a >3));

	}

}
