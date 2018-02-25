package com.practice.exceptionhandling;

public class Employee {

	private String name;
	private int age;

	Employee(String name, int age ){
	 this.name = name;
	 this.age=age;
	 }

	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setName(int age) {
		this.age = age;
	}
}