/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.collections;

import java.util.HashMap;
import java.util.Stack;

public class HashMapCustomKeyDemo {

	public static void main(String[] args) {

		HashMap<Employee, String> myMap = new HashMap<>();

		Employee e1 = new Employee(1, "Anup1");
		Employee e2 = new Employee(2, "Anup2");
		Employee e3 = new Employee(3, "Anup3");
		Employee e4 = new Employee(4, "Anup4");
		Employee e5 = new Employee(5, "Anup5");
		Employee e6 = new Employee(6, "Anup6");
		Employee e7 = new Employee(7, "Anup6");
		Employee e8 = e7;
		
		myMap.put(e1, "Anup1");
		myMap.put(e2, "Anup2");
		myMap.put(e3, "Anup3");
		myMap.put(e4, "Anup4");
		myMap.put(e5, "Anup5");
		myMap.put(e6, "Anup6");
		myMap.put(e7, "Anup7");
		myMap.put(e8, "Anup8");
		
		System.out.println(myMap);
	}
}

//Immutable class
final class Employee{
	
	private final int ID;
	private final String name;
	
	public int getID() {
		return ID;
	}
	/*public void setID(int iD) {
		ID = iD;
	}*/
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public Employee(final int iD,final String name) {
		ID = iD;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getID();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getID() == ((Employee) obj).getID();
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + "]";
	}
	
}