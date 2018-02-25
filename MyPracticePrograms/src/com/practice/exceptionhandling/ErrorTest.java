/**
 * 
 */
package com.practice.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anup
 *
 */
public class ErrorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
		List<Double> list = new ArrayList<>(1000000000); 
		
		
		}catch (Error e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
