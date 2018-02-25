/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.oveloading;

public class OverloadingProgram {

	Object name;

	public void setName(String s) {
		name = s;
		System.out.println("In string");
	}

	public void setName(Object s) {
		name = s;
		System.out.println("In object");
	}

	public void setName(Integer s) {
		name = s;
		System.out.println("In Integer");
	}

	public static void main(String[] args) {
		OverloadingProgram op = new OverloadingProgram();

		op.setName(new String());
		op.setName("anup");
		op.setName(new Object());
		op.setName(10);
	}
}