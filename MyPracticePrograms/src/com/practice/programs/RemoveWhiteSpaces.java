/**https://java2blog.com/remove-all-white-spaces-from-string-in-java/
 * 
How to remove all white spaces from String in java
 * 
 */
package com.practice.programs;

public class RemoveWhiteSpaces {

	
	public static void main(String[] args) {
		
		String input = "Hello to the jungle     !!! ! .";
		
		StringBuilder sb = new StringBuilder() ;
		for(int i = 0; i < input.length() ; i++){
		
			if(input.charAt(i) != ' '){
				sb.append(input.charAt(i));
			}
		}
		
		
		System.out.println(sb.toString());
	}
	
	
	
}