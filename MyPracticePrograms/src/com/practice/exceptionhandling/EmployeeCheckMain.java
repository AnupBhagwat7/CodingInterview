/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.exceptionhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EmployeeCheckMain {


	public static void main(String[] args) {

		  List<Employee> employees = new ArrayList<>();
		  Employee e1 = new Employee("Adam",20);
		  Employee e2 = new Employee("Brain",19);
		  Employee e3 = new Employee("Stuart",22);
		  Employee e4 = new Employee("Paul",21);
		  employees.add(e1);
		  employees.add(e2);
		  employees.add(e3);
		  employees.add(e4);
		  boolean safe;
		  try {
		   safe = checkListOfEmployees(employees);
		   if (safe)
		    System.out.println("We don't have any employee with less than 18");
		   Employee e5 = new Employee("Dev",17);
		   employees.add(e5);
		   checkListOfEmployees(employees);
		  } catch (InvalidAgeException e) {
		   e.printStackTrace();
		  }
		 
		 }
		 
		 public static boolean checkListOfEmployees(List<Employee> employees) throws InvalidAgeException {
		  for (int i = 0; i < employees.size(); i++) {
		   Employee employee = employees.get(i);
		   if (employee.getAge() < 18) {
		    throw new InvalidAgeException("Employee'sAge is less than 18");
		   }  
		  }
		  return true;
		 }
		
	
}