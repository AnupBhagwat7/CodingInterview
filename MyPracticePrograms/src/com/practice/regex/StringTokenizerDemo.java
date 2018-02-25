/**
 * 
 */
package com.practice.regex;

import java.util.StringTokenizer;

/**
 * @author anup
 *
 */
public class StringTokenizerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer("Hello there. how are!? you ?   ", "[/.?!]+");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
	}

}
