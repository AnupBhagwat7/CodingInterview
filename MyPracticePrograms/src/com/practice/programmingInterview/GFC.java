/**
Check if array contains contiguous integers with duplicates allowed
1.7
Given an array of n integers(duplicates allowed). Print “Yes” if it is a set of contiguous integers else print “No”.

Examples:

Input : arr[] = {5, 2, 3, 6, 4, 4, 6, 6}
Output : Yes
The elements form a contiguous set of integers
which is {2, 3, 4, 5, 6}.

Input : arr[] = {10, 14, 10, 12, 12, 13, 15}
Output : No
 * 
 */
package com.practice.programmingInterview;

import java.util.Arrays;

public class GFC {

	public static boolean checkContiguosArray(int[] array) {
		
		Arrays.sort(array);
		
		for(int i=0; i< array.length -1 ; i++){
			
			if(  (array[i+1] - array[i]) > 1)
				return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int[] A = {5, 2, 3, 6, 4, 4, 6, 6}; //
		int[] B = {10, 14, 10, 12, 12, 13, 15} ;//
		System.out.println(checkContiguosArray(A) );
		System.out.println(checkContiguosArray(B) );
	}
}