/**
 * 
 */
package com.practice.programmingInterview;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author anup
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        int size1 = Integer.parseInt(name);
        
        String arr = s.nextLine();
        String[] array = arr.split(" ");
        
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i < array.length ; i++){
        	
        	set.add(Integer.parseInt(array[i])); 
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        //System.out.println(list);

        String name1 = s.nextLine(); 
        int size2 = Integer.parseInt(name1);
        //ArrayList<Integer> list1 = new ArrayList<>();
        
        for(int i=0; i< size2; i++){
        
        	int count =0;
        	String arr1 = s.nextLine(); 
        	String[] array1 = arr1.split(" ");
            int L = Integer.parseInt(array1[0]);
            int R = Integer.parseInt(array1[1]);
            
            
            for(int j=0; j< size1; j++){
            	
            	if(list.get(j) >= L  && list.get(j) <= R){
            		count++;
            	}
            }
            System.out.println(count);
        }
        
        
	}

}
