/**
 * 
 */
package com.practice.wolterklower;

import java.util.Arrays;

/**
 * @author anup
 *
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] array ={1, 3, 6, 4, 1, 2};
		
		//System.out.println("\n"+solution("(())"));
		//System.out.println(solution(""));
		System.out.println(solution("(())))("));
	}
	
	 public static int solution(String S) {
	        // write your code in Java SE 8
		 
		 if(S.isEmpty() || S == null || S.length() == 0){
			 return 0;
		 }
		 
		 int length = S.length();
		 int[] openBrackets = new int[length+1];
		 int[] closeBrackets = new int[length+1];
		 int k = 0;
		 
		 
		 openBrackets[0] = 0;
		 closeBrackets[length] = 0;
		 
		 if(S.charAt(0) == '('){
			 openBrackets[1] = 1;
		 }
		 if(S.charAt(length-1) == ')'){
			 closeBrackets[length-1] = 1;
		 }
		 
		 
		 for(int i=1 ; i< length ; i++){
			 
			 if(S.charAt(i) == '('){
				 openBrackets[i+1] = openBrackets[i] + 1;
			 }else{
				 openBrackets[i+1] = openBrackets[i];
			 }
		 }
		 

		 for(int i=length -2 ; i>= 0; i--){
			 
			 if(S.charAt(i) == ')'){
				 closeBrackets[i] = closeBrackets[i+1] + 1;
			 }else{
				 closeBrackets[i] = closeBrackets[i+1];
			 }
		 }
		 
		 for(int i=0 ; i< length ; i++){
		 System.out.print(openBrackets[i] +" ,");
		 //System.out.println(closeBrackets[i]);
		 }
		 System.out.println();
		 for(int i=0 ; i< length ; i++){
			 
			 System.out.print(closeBrackets[i]+" ,");
		 }
		 
		 if(openBrackets[length] == 0)
			 return closeBrackets[0];
		 
		 if(closeBrackets[0] == 0)
			 return openBrackets[length];
		 
		 
		 for(int i= 0 ;i < length ; i++){
			 
			 if(openBrackets[i] == closeBrackets[i]){
				 k = i;
			 }
		 }
		 
		 return k;
	    }

	 
	 void getLeaders(int array[], int size) 
	    {
	        for (int i = 0; i < size; i++) 
	        {
	            int j;
	            for (j = i + 1; j < size; j++) 
	            {
	                if (array[i] <= array[j])
	                    break;
	            }
	            if (j == size) // the loop didn't break
	                System.out.print(array[i] + " ");
	        }
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