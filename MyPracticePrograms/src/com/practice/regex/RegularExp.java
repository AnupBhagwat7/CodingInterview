/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.regex;

import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {
		
	Pattern p = Pattern.compile("[A-Z]?");
	
	Matcher m = p.matcher("ANUPA");
	
	System.out.println(m.matches());
		
	}
}