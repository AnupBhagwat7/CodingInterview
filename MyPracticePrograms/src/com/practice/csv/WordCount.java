/**
 * 
 */
package com.practice.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


/**
 * @author anup
 *
 */
public class WordCount {

	public static void main(String[] args) {
		
		 Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>(); 
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D://DATA//STUDY//anup//Interview//Programs//wordcount.txt"));
			
			String line;
			
			while((line = br.readLine()) != null){
				
				String[] words = line.split(" ");
				
				int count =0;
				while(count < words.length){
					
					if(wordMap.containsKey(words[count])){
						int value = wordMap.get(words[count]) + 1;
						wordMap.put(words[count], value);
					}
					else{ 
						wordMap.put(words[count], 1);
						
					}
					count++;
				}
			}
			
			
			//System.out.println(new TreeMap<>(wordMap));
			
			for(Map.Entry<String,Integer> entry: wordMap.entrySet()){
				
				System.out.println(entry.getKey() +":"+ entry.getValue());
			}
			
			//Sorting map on values
			
			Set<Entry<String, Integer>> set = wordMap.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        
	        System.out.println("Before sorting- "+list);
	        
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	            	if(o2.getValue() <  o1.getValue())
	            		return 1;
	            	else if( o2.getValue() >  o1.getValue() )
	            		return -1;
	            	else
	            		return 0;
	            }
	        } );
	        
	        System.out.println("After sorting- "+list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
