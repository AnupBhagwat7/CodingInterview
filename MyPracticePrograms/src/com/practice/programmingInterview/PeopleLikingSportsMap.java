/**
 * Max likes football very much. In order to check the popuplarity of the game, he decided to talk to random people and ask them about their favourite game and note it down in a list.

Given a list of name of people and their favourite sport, help Max in finding the sport liked by most of the people, and also how many people like football.

He could have met same people more than once, he will only count response of his first meet with any person.

Note : Name of person as well as sport is a single string in lowercase. Length of name of people as well as sport is less than 11.

Input :: First line will contain no of entries in the list. i.e. N Next N lines will contain two strings, person's name and sports he like.

Output :: In first line, name of sport liked by most no of people (In case of more than one games is liked by highest no of people, output the first one in lexicographical order). In second line, no of people having football as their favourite game.

Constraints: 1<=N<=100000 1<=Name of person<=10 1<=Name of sport<=10
 */
package com.practice.programmingInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author anup
 *
 */
public class PeopleLikingSportsMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
		
        
        int n = Integer.parseInt(name);
        
        HashMap<String, Integer> sportsMap = new HashMap<>();
        Set<String> players = new HashSet<>();
        
        for(int i=0; i < n ; i++){
        	
        	String value = s.nextLine();
        	
        	String[] split = value.split("\\s");
        	
        	if(split[0].trim().length() < 11 && split[1].trim().length() < 11){
        		
        	
        	
        	if(players.add(split[0])){
        		//Integer val = sportsMap.get(split[0] ) + 1;
        		
        		if(sportsMap.containsKey(split[1])){
        			int val = sportsMap.get(split[1] ) + 1;
        			sportsMap.put(split[1], val);	
        		}        			
        		else
        			sportsMap.put(split[1], 1);
        	}
        	
        	}
        	
        	
        }
        
        
       // System.out.println(sportsMap);
        
        Set<Map.Entry<String, Integer>> set = sportsMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				
				if(o1.getValue() > o2.getValue())
				return 1;
				else if(o1.getValue() < o2.getValue())
					return -1;
				else
					return 0;
			}
        	
        	
		});
        
        
        System.out.println(list.get(list.size() - 1).getKey() +"\n"+list.get(list.size() - 1).getValue());
        
        
	}

}
