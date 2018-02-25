/**
 * Write a Comparator in Java to compare two employees based upon there name, departments and age?

Read more: http://www.java67.com/2012/08/10-java-coding-interview-questions-and.html#ixzz53tR5NJwL
 */
package com.practice.programmingInterview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author anup
 *
 */
class Employee{
	
	String name;
	String department;
	int age;
	
	public Employee(String name, String department, int age) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}




public class ComparableDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Anup", "CS", 29);
		Employee e2 = new Employee("Archu", "DS", 21);
		Employee e3 = new Employee("Ram", "Mech", 23);
		Employee e4 = new Employee("Sham", "Elec", 90);
		Employee e5 = new Employee("Rahul", "CS", 12);
		
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		
		System.out.println(empList);
		Collections.sort(empList, new Comparator<Employee>(){

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				if(e1.age > e2.age )
				return 1;
				else if(e1.age < e2.age)
					return -1;
				else
					return 0;
			}
		
		
			
			
			
		});
		
		
		System.out.println(empList);
		
	}

}
