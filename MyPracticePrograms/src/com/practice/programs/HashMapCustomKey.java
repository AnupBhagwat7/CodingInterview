/**https://java2blog.com/how-to-swap-two-numbers-without-using-temporary-variables-in-java/
 * 
How to swap two numbers without using temporary variables in java
 * 
 */
package com.practice.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


class Country{
	
	private String name;
	private int population;
	
	
	
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}


	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}


	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}*/
	
	@Override
	public int hashCode() {

	if(name != null){
		
	
		if(name.length() % 2 == 0){
			return 42;
		}else{
			return 95;
		}
		
	}else{
		return 0;
	}
	
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}
	
	
	
	
}


public class HashMapCustomKey {

	
	public static void main(String[] args) {
		
		
		Map<Country, String > map = new HashMap<>();
		
		map.put(new Country("India", 1111), "Delhi");
		map.put(new Country("Japan", 1111), "Tokyo");
		map.put(new Country("Russia", 1111), "Mosco");
		map.put(new Country("Australia", 1111), "Sydeny");
		
		System.out.println("Map = "+ map);
		
		System.out.println("Iteration using entrySet()");
		Set<Map.Entry<Country, String>> entries = map.entrySet();		
		for(Map.Entry<Country, String> entry: entries){
			System.out.println("Key = "+ entry.getKey() +" Value= "+ entry.getValue());
		}
		
		System.out.println("\nIteration using keySet()");
		Set<Country> keys = map.keySet();
		
		ArrayList<Country> delete = new ArrayList<>();
		for(Country key: keys){
			
			if(key.getName().equalsIgnoreCase("japan")){
				delete.add(key);
			}
			//map.remove(key);
			System.out.println("Key = "+ key +" Value= "+ map.get(key));
		}
		
		System.out.println("Before deletion="+ map);
		for(Country country : delete){
			map.remove(country);
		}
		System.out.println("Before deletion="+ map);
		
		System.out.println("\nIteration using values()");
		Collection<String> values = map.values();
		for( String value : values){
			
			System.out.println(" Value= "+ value);
		}
		
		
		//ConcurrentModificationException
		
		List<Integer> list = new ArrayList<>();
		Collections.synchronizedList(list);
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		for(int i: list){
			//list.remove(i);
			System.out.println(i);
		}
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext() ){
			
			if(itr.next() == 1)
				itr.remove();
			
			System.out.println(itr.next());
		}
		
		
		//list.remove(3);
		
		System.out.println(list);
	}
		
}