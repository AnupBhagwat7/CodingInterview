/**https://java2blog.com/check-for-balanced-parentheses-in-expression-java/
 * 
In this post, we will see how to check for balanced parentheses in an expression.
Lets say, you have expression as a*(b+c)-(d*e)
If you notice, above expression have balanced parentheses.
Lets take another expression as (a*(b-c)*(d+e)
If you observe, above expression does not have balanced parentheses.
We will use stack data structure to check for balanced parentheses.
Algorithm:

Whenever you encounter current character as ( or { or [, push it into the stack.
Whenever you encounter current character as ) or } or ], retrieve last element from stack and check if current character is in pair with last character retrieved from stack and if it is not in pair then expression is not balanced.
If we have empty stack in the end, it is balanced parentheses, else it is not balanced parentheses.
 * 
 */
package com.practice.programs;

import java.util.Stack;

public class CheckForBalancedExpression {

	
	public static void main(String[] args) {
		
		System.out.println(checkForBalancedParenthesis("(a+b)*(a-b){"));
		
		System.out.println(checkForBalancedParenthesis("(a+b)*(a-b){{{[][][][]}}}"));
	}
	
	
	public static String checkForBalancedParenthesis(String expr) {
		
		if (expr.isEmpty())
			return "Balanced";
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i< expr.length(); i++){
		
			Character current = expr.charAt(i);
			
			if(current.equals('{')  || current.equals('(') || current.equals('[') ){
				stack.push(current);
			}
			
			if(current.equals('}')  || current.equals(')') || current.equals(']') ){
				
				if (stack.isEmpty())
					return "Not Balanced";
				
				Character last = stack.peek();
				if((current.equals(')') && last.equals('(')) || (current.equals(']') && last.equals('['))  || (current.equals('}') && last.equals('{'))   ){				
					stack.pop();
				}else{
					return "Not Balanced";
				}
			}
			
		}
	
		return stack.isEmpty() ? "Balanced" : "Not Balanced";
	}
		
		
		
		
		
		
	
}