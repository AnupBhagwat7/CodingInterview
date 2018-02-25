/**
How to determine if a string has all unique characters in Java?

Read more: http://www.java67.com/search/label/Coding%20Problems?&max-results=3
 * 
 */
package com.practice.programs;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseArray {

	
	public static void main(String[] args) {
		
		int[] array = {1, 3, 2, 7, 4};
		
		System.out.println(reverseArray(array));
		
		reverseArrayUtil(array);
	}
	
	//1) reverese array
	public static int[] reverseArray(int[] input){
		
		if(input == null ){
			return null; 
		}
		
		for(int i=0 ; i < input.length / 2 ; i++){
			
			int temp = input[i];
			input[i] = input[input.length - 1 - i];
			input[input.length - 1 - i] = temp;
			
		}
		
		return input;			
	}
	
	//Utility
	public static void reverseArrayUtil(int[] input) {
		
		System.out.println(Arrays.asList(input));
		 
		
	}
	
	
	@Test
	public void testArrayReverse() {
		int[] array = {1, 3, 2};
		Assert.assertEquals(array , reverseArray(array)    );
	}
	
}
	
	
