package com.practice.collections;

import java.util.*;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Book> set = new HashSet<Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		//Book b4 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		// Adding Books to HashSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		//set.add(b4);
		set.add(b2);
		// Traversing HashSet
		for (Book b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
