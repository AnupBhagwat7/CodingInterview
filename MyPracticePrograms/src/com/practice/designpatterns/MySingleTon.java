/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.designpatterns;

import java.util.Stack;

public class MySingleTon {

	private MySingleTon() {
		// TODO Auto-generated constructor stub
	} 
	
	private static MySingleTon mySingletonInstance;
	
	String name;
	
	
	public static MySingleTon getInstance() {
		
		if(mySingletonInstance == null){
			
			synchronized (mySingletonInstance) {
			
				mySingletonInstance = new MySingleTon();
			}
			
		}
			
		return mySingletonInstance;
	}
	

	public static void main(String[] args) {
		
		System.out.println(MySingleTon.getInstance().hashCode() +"   "+ MySingleTon.getInstance().hashCode() + "   "+System.identityHashCode(MySingleTon.getInstance()));
		System.out.println(MySingleTon.getInstance().hashCode() == MySingleTon.getInstance().hashCode());
		
		MySingleTon.getInstance().name = "Anup";
		System.out.println(MySingleTon.getInstance().name);
		
		System.out.println(MySingleTon.getInstance().name);
	}
}