/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.binarysearch;

import java.util.Stack;

public class BinaySearchProgram {

	 private static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
	        int low = fromIndex;
	        int high = toIndex - 1;

	        int cnt = 1;
	        while (low <= high) {
	        	System.out.println("Iteration number: "+ cnt++);
	            int mid = (low + high) >>> 1;
	            int midVal = a[mid];

	            if (midVal < key)
	                low = mid + 1;
	            else if (midVal > key)
	                high = mid - 1;
	            else
	                return mid; // key found
	        }
	        return -(low + 1);  // key not found.
	    }

	public static void main(String[] args) {
		
		int[] arr = {1 , 3 , 5 , 7 , 10 , 90} ; //new int[10];
		//arr = {1 , 6 , 3 , 2 , 8 , 0};
		
		System.out.println(binarySearch0(arr, 0, arr.length, 90));
		
	}
}