/**
 * 
 */
package com.practice.wolterklower;

import java.util.Arrays;

/**
 * @author anup
 *
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array ={1, 3, 6, 4, 1, 2};
		
		System.out.println(solution(array));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        
		int smallestInt = 1;
		
		Arrays.sort(A);
		
        for(int i=0 ; i < A.length -1 ; i++){
            
            if(  (A[i+1] - A[i]) != 0  &&  (A[i+1] - A[i]) > 1 ){
            	smallestInt = A[i+1];
            	//return A[i]+1;
            }
        }
        
        return smallestInt;
    }

}



/*

Example test:    [1, 3, 6, 4, 1, 2] 
WRONG ANSWER  (got 6 expected 5) 

Example test:    [1, 2, 3] 
WRONG ANSWER  (got 1 expected 4) 

Example test:    [-1, -3] 
WRONG ANSWER  (got -1 expected 1) 

*/