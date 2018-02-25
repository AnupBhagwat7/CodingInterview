/**https://java2blog.com/how-to-swap-two-numbers-without-using-temporary-variables-in-java/
 * 
How to swap two numbers without using temporary variables in java
 * 
 */
package com.practice.programs;

import java.util.Stack;

public class SwapTwoNumbers {

	
	public static void main(String[] args) {
		
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Origional a= "+ a +" b="+b);
		
		a = a + b;
		b = a - b;
		
		a = a - b;
		
		System.out.println("Swapped a= "+ a +" b="+b);
		
		
		
	}
		
}