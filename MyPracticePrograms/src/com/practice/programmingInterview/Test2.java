/**
 * 
 */
package com.practice.programmingInterview;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author anup
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        int size = Integer.parseInt(name);
        
        String arr = s.nextLine();
        String[] array = arr.split(" ");
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i < array.length ; i++){
        	
        	list.add(Integer.parseInt(array[i])); 
        }
        
        //System.out.println(list);

        int min = Integer.parseInt(array[0]);
        for(Integer val: list){
        	
        	
        	if(min > val  && val > 0){
        		min = val;
        	}
        }
        
        System.out.println(min);
	}

}
